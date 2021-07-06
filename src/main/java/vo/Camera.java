package vo;

import java.util.Objects;

public class Camera {

	private String id;
	private String name;
	private String rover_id;
	private String full_name;

	public Camera() {
		super();
	}

	public Camera(String id, String name, String rover_id, String full_name) {
		super();
		this.id = id;
		this.name = name;
		this.rover_id = rover_id;
		this.full_name = full_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRover_id() {
		return rover_id;
	}

	public void setRover_id(String rover_id) {
		this.rover_id = rover_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	@Override
	public String toString() {
		return "Camera [id=" + id + ", name=" + name + ", rover_id=" + rover_id + ", full_name=" + full_name + "]";
	}
	
	@Override
	public boolean equals(Object o) {
	    Camera cam = (Camera) o;
	    // field comparison
	    return Objects.equals(id, cam.id) && 
	    		Objects.equals(name, cam.name) && 
	    		Objects.equals(rover_id, cam.rover_id) && 
	    		Objects.equals(full_name, cam.full_name);
	}
	
}
