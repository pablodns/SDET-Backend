package vo.manifest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ManifestWrapper {
	@JsonProperty("photo_manifest")
	List<Manifest> manifest;

	public ManifestWrapper() {
		super();
	}

	@JsonIgnore
	public List<Manifest> getManifest() {
		return manifest;
	}

	public void setManifest(List<Manifest> manifest) {
		this.manifest = manifest;
	}

}
