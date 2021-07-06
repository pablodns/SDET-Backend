package vo.manifest;

import java.util.Arrays;
import java.util.List;

public class PhotosManifest {

	private String sol;
	private String earth_date;
	private String total_photos;
	private List<String> cameras;

	public PhotosManifest() {
		super();
	}

	public String getSol() {
		return sol;
	}

	public void setSol(String sol) {
		this.sol = sol;
	}

	public String getEarth_date() {
		return earth_date;
	}

	public void setEarth_date(String earth_date) {
		this.earth_date = earth_date;
	}

	public String getTotal_photos() {
		return total_photos;
	}

	public void setTotal_photos(String total_photos) {
		this.total_photos = total_photos;
	}

	public List<String> getCameras() {
		return cameras;
	}

	public void setCameras(List<String> cameras) {
		this.cameras = cameras;
	}

	
	
	@Override
	public String toString() {
		return "PhotosManifest [sol=" + sol + ", earth_date=" + earth_date + ", total_photos=" + total_photos
				+ ", cameras=" + Arrays.toString(cameras.toArray()) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
