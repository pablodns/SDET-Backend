package enums;

public enum CameraType {
	CURIOSITY("curiosity"),
	OPPORTUNITY("opportunity"),
	SPIRIT("spirit");
	
	private final String cameraType;
	
	CameraType(final String cameraType) {
        this.cameraType = cameraType;
    }
    
	@Override
	public String toString() {
		return cameraType;
	}
}
