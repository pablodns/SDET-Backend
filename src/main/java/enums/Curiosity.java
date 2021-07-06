package enums;

public enum Curiosity implements ICamera{
	Front_Hazard_Avoidance("FHAZ"),
	Rear_Hazard_Avoidance("RHAZ"),
	Mast_Camera("MAST"),
	Chemistry_and_Camera_Complex("CHEMCAM"),
	Mars_Hand_Lens_Imager("MAHLI"),
	Mars_Descent_Imager("MARDI"),
	Navigation_Camera("NAVCAM");
	private final String camera;
	
	Curiosity(final String camera) {
        this.camera = camera;
    }
    
	@Override
	public String toString() {
		return camera;
	}
}
