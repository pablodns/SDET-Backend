package utilities;

public class Constants {
	public static final Constants API_KEY = new Constants("api_key");
	public static final Constants BASE_URI = new Constants("base_uri");
	
	private String name;
	
	public Constants(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name; 
	}

}