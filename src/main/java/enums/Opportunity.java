package enums;

public enum Opportunity implements ICamera{

	Front_Hazard_Avoidance("FHAZ"),
	Rear_Hazard_Avoidance("RHAZ"),
	Navigation_Camera("NAVCAM"),
	Panoramic_Camera("PANCAM"),
	Miniature_Thermal_Emission_Spectrometer("MINITES");
	
	private final String camera;
	
	Opportunity(final String camera) {
        this.camera = camera;
    }
    
	@Override
	public String toString() {
		return camera;
	}
}
