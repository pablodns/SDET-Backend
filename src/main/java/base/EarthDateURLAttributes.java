package base;

public class EarthDateURLAttributes extends BaseURLAttributes{

	private String earth_date;

	public EarthDateURLAttributes() {
		super();
	}

	public EarthDateURLAttributes(String earth_date) {
		super();
		this.earth_date = earth_date;
	}

	public String getEarth_date() {
		return earth_date;
	}

	public void setEarth_date(String earth_date) {
		this.earth_date = earth_date;
	}

	@Override
	public String toString() {
		return "EarthDateURLAttributes [earth_date=" + earth_date + "]";
	}

	
}
