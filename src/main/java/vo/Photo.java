package vo;

import java.util.Objects;

public class Photo {

	private String id;
	private String sol;
	private Camera camera;
	private String img_src;
	private String earth_date;
	private Rover rover;

	public Photo() {
		super();
	}

	public Photo(String id, String sol, Camera camera, String img_src, String earth_date, Rover rover) {
		super();
		this.id = id;
		this.sol = sol;
		this.camera = camera;
		this.img_src = img_src;
		this.earth_date = earth_date;
		this.rover = rover;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSol() {
		return sol;
	}

	public void setSol(String sol) {
		this.sol = sol;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public String getImg_src() {
		return img_src;
	}

	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}

	public String getEarth_date() {
		return earth_date;
	}

	public void setEarth_date(String earth_date) {
		this.earth_date = earth_date;
	}

	public Rover getRover() {
		return rover;
	}

	public void setRover(Rover rover) {
		this.rover = rover;
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", sol=" + sol + ", camera=" + camera.toString() + ", img_src=" + img_src + ", earth_date="
				+ earth_date + ", rover=" + rover.toString() + "]";
	}
	
	@Override
	public boolean equals(Object o) {
	    Photo photo = (Photo) o;
	    // field comparison
	    return Objects.equals(id, photo.id) && 
	    		Objects.equals(sol, photo.sol) && 
	    		camera.equals(photo.camera) && 
	    		Objects.equals(img_src, photo.img_src) && 
	    		Objects.equals(earth_date, photo.earth_date) && 
	    		rover.equals(photo.rover);
	}
	
}
