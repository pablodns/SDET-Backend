package vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoWrapper {
	@JsonProperty("photos")
	List<Photo> photos;

	public PhotoWrapper() {
		super();
	}

	@JsonIgnore
	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

}
