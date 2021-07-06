package vo.manifest;

import java.util.List;

public class Manifest {

	private String name;
	private String landing_date;
	private String launch_date;
	private String status;
	private String max_sol;
	private String max_date;
	private String total_photos;
	private List<PhotosManifest> photos;

	public Manifest() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanding_date() {
		return landing_date;
	}

	public void setLanding_date(String landing_date) {
		this.landing_date = landing_date;
	}

	public String getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(String launch_date) {
		this.launch_date = launch_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMax_sol() {
		return max_sol;
	}

	public void setMax_sol(String max_sol) {
		this.max_sol = max_sol;
	}

	public String getMax_date() {
		return max_date;
	}

	public void setMax_date(String max_date) {
		this.max_date = max_date;
	}

	public String getTotal_photos() {
		return total_photos;
	}

	public void setTotal_photos(String total_photos) {
		this.total_photos = total_photos;
	}

	public List<PhotosManifest> getPhotos() {
		return photos;
	}

	public void setPhotos(List<PhotosManifest> photos) {
		this.photos = photos;
	}

	
	
	@Override
	public String toString() {
		return "Manifest [name=" + name + ", landing_date=" + landing_date + ", launch_date=" + launch_date
				+ ", status=" + status + ", max_sol=" + max_sol + ", max_date=" + max_date + ", total_photos="
				+ total_photos + ", photos=" + photos.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
