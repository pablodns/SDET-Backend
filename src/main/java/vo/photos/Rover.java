package vo.photos;

import java.util.Objects;

public class Rover {

	private String id;
	private String name;
	private String landing_date;
	private String launch_date;
	private String status;

	public Rover() {
		super();
	}

	public Rover(String id, String name, String landing_date, String launch_date, String status) {
		super();
		this.id = id;
		this.name = name;
		this.landing_date = landing_date;
		this.launch_date = launch_date;
		this.status = status;
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

	@Override
	public String toString() {
		return "Rover [id=" + id + ", name=" + name + ", landing_date=" + landing_date + ", launch_date=" + launch_date
				+ ", status=" + status + "]";
	}
	
	@Override
	public boolean equals(Object o) {
	    Rover rov = (Rover) o;
	    // field comparison
	    return Objects.equals(id, rov.id) && 
	    		Objects.equals(name, rov.name) && 
	    		Objects.equals(landing_date, rov.landing_date) && 
	    		Objects.equals(landing_date, rov.landing_date) && 
	    		Objects.equals(status, rov.status);
	}
	
}
