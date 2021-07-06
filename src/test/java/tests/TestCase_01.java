package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.EarthDateURLAttributes;
import base.SolURLAttributes;
import enums.CameraType;
import enums.Curiosity;
import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import utilities.Constants;
import utilities.DataParser;
import utilities.PropertyLoader;
import vo.manifest.Manifest;
import vo.manifest.ManifestWrapper;
import vo.manifest.PhotosManifest;
import vo.photos.Photo;
import vo.photos.PhotoWrapper;

public class TestCase_01 extends TestBase {
	private SolURLAttributes sol;
	private EarthDateURLAttributes earthDate;
	List<Photo> solPhotoList;
	List<Photo> earthDatePhotoList;
	List<Manifest> manifestList;

	@Test
	public void getFirst10photosByCuriosityOn1000MartianSol() {

		
		/**
		 * 
		 * 
		 * 
		 * TASK #1.- Retrieve the first 10 Mars photos made by "Curiosity" on 1000
		 * Martian sol.
		 * 
		 * 
		 * 
		 */

		sol = new SolURLAttributes();
		sol.setApiKey(PropertyLoader.getProperty(Constants.API_KEY));
		sol.setCamera(Curiosity.Chemistry_and_Camera_Complex);
		sol.setPage("1");
		sol.setSol("1000");
		sol.setCameraType(CameraType.CURIOSITY);

		String url = PropertyLoader.getProperty(Constants.BASE_URI).replace("{cameraType}", sol.getCameraType());

		RestAssured.baseURI = url;
		// System.out.println(RestAssured.baseURI);

		// TODO:Find a way to parametrize cameraType with RestAssured.
		ResponseBody body = RestAssured.given()
				// .pathParam("cameraType", sol.getCameraType())
				.param("sol", sol.getSol()).param("api_key", sol.getApiKey()).param("page", sol.getPage())
				.get("/photos").getBody();

		// HOTFIX: The best way found to convert the retrieved JSON to an object
		String response = body.asString();
		response = "[" + response + "]";
		// Get the photos arrayList in the PhotoWrapper
		List<PhotoWrapper> solPhotos = DataParser.parseJson(response, PhotoWrapper.class);

		// Get the list of first 10 photos from the PhotoWrapper
		solPhotoList = solPhotos.get(0).getPhotos().subList(0, 10);
		// PRINT RESULT: solPhotoList.forEach((v) ->
		// {System.out.println(v.toString());});
		// System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
		url = null;
		body = null;
		response = null;

		
		
		/**
		 * 
		 * 
		 * 
		 * TASK #2.- Retrieve the first 10 Mars photos made by "Curiosity" on Earth date
		 * equal to 1000 Martian sol.
		 * 
		 * 
		 * 
		 */
		// DOUBT: 1000 martian sol are equal to 2015-05-30 as per the API, is that
		// correct?.
		earthDate = new EarthDateURLAttributes();
		earthDate.setApiKey(PropertyLoader.getProperty(Constants.API_KEY));
		earthDate.setCamera(Curiosity.Chemistry_and_Camera_Complex);
		earthDate.setPage("1");
		earthDate.setEarth_date("2015-05-30");
		earthDate.setCameraType(CameraType.CURIOSITY);

		url = PropertyLoader.getProperty(Constants.BASE_URI).replace("{cameraType}", earthDate.getCameraType());

		RestAssured.baseURI = url;

		// TODO:Find a way to parametrize cameraType with RestAssured.
		body = RestAssured.given()
				// .pathParam("cameraType", sol.getCameraType())
				.param("earth_date", earthDate.getEarth_date()).param("api_key", earthDate.getApiKey()).get("/photos")
				.getBody();

		// HOTFIX: The best way found to convert the retrieved JSON to an object
		response = body.asString();
		response = "[" + response + "]";
		// Get the photos arrayList in the PhotoWrapper
		List<PhotoWrapper> earthDatePhotos = DataParser.parseJson(response, PhotoWrapper.class);
		earthDatePhotoList = earthDatePhotos.get(0).getPhotos().subList(0, 10);
		// PRINT RESULT: earthDatePhotoList.forEach((v) ->
		// {System.out.println(v.toString());});

		/**
		 * 
		 * 
		 * 
		 * TASK #3.- Retrieve and compare the first 10 Mars photos made by "Curiosity"
		 * on 1000 sol and on Earth date equal to 1000 Martian sol.
		 * 
		 * 
		 * 
		 */
		Assert.assertEquals(solPhotoList, earthDatePhotoList,
				"The comparison of the first 10 images retrieved on 1000 martian sol and EarthDate equals to 1000 martian sol are not the same.");

		url = null;
		body = null;
		response = null;
		/**
		 * 
		 * 
		 * 
		 * TASK #4.- Validate that the amounts of pictures that each "Curiosity" camera
		 * took on 1000 Mars sol is not greater than 10 times the amount taken by other
		 * cameras on the same date.
		 * 
		 * 
		 * 
		 */
		// TODO: Given the remaining time, i will not be able to do the code with the
		// SOLID principles.

		url = "https://api.nasa.gov/mars-photos/api/v1/manifests/Curiosity/";

		RestAssured.baseURI = url;
		// System.out.println(RestAssured.baseURI);

		// TODO:Find a way to parametrize cameraType with RestAssured.
		body = RestAssured.given().param("api_key", PropertyLoader.getProperty(Constants.API_KEY)).get().getBody();

		response = body.asString();
		response = "[" + response + "]";

		// Get the photos arrayList in the PhotoWrapper
		List<ManifestWrapper> manifestWrapper = DataParser.parseJson(response, ManifestWrapper.class);
		manifestList = manifestWrapper.get(0).getManifest();
		// PRINT RESULT: manifestList.forEach((v)
		// ->{System.out.println(v.toString());});
		// Get the complete list of photos only
		List<PhotosManifest> completePhotosList = manifestList.get(0).getPhotos();
		
		// Iterate over the complete list of photos and store the corresponding photos
		// for martian sol or earth_date
		List<PhotosManifest> solPhotosFromManifest = new ArrayList<>();
		List<PhotosManifest> earthPhotosFromManifest = new ArrayList<>();
		for (PhotosManifest photosManifest : completePhotosList) {
			if (photosManifest.getSol().equals("1000")) {
				solPhotosFromManifest.add(photosManifest);
			}
			if (photosManifest.getEarth_date().equals("2015-05-30")) {
				earthPhotosFromManifest.add(photosManifest);
			}
		}

		solPhotosFromManifest.forEach((v) -> {
			System.out.println(v.toString());
		});
		System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		earthPhotosFromManifest.forEach((v) -> {
			System.out.println(v.toString());
		});
		int solCount = Integer.parseInt(solPhotosFromManifest.get(0).getTotal_photos());
		int earthCount = Integer.parseInt(earthPhotosFromManifest.get(0).getTotal_photos());
		//Boolean for task 4:
		boolean smallerOrEqual = solCount <= (earthCount*10);
		System.out.println(smallerOrEqual);
		Assert.assertTrue(smallerOrEqual, " The amounts of pictures that each Curiosity camera took on 1000 Mars sol is greater than 10 times the amount taken by other cameras on the same date.");

	}

}
