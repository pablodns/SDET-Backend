package base;

import enums.CameraType;
import enums.ICamera;
public class BaseURLAttributes {

	private String camera, page, api_key, cameraType;
	
	public BaseURLAttributes() {

	}

	public BaseURLAttributes(ICamera camera, String page, String api_key) {
		this.camera = camera.toString();
		this.page = page;
		this.api_key = api_key;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(ICamera camera) {
		this.camera = camera.toString();
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getApiKey() {
		return api_key;
	}

	public void setApiKey(String api_key) {
		this.api_key = api_key;
	}

	public String getCameraType() {
		return cameraType;
	}
	public void setCameraType(CameraType cameraType) {
		this.cameraType = cameraType.toString();
	}

}
