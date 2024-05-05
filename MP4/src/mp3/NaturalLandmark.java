package mp3;

/**
 * Used to create Natural Landmark object for an implementation of the game Oregon Trail.
 * @author Griffin Broge
 * @version 1.0.0
 * @date May 5th 2024
 * @filename Weather.java
 * 
 */
public class NaturalLandmark extends Landmarks{

	
	/**
	 * Constructor used to create new natural landmarks. 
	 * @param newName: Name for the new landmark
	 * @param newLocation: Location for the landmark.
	 */
	public NaturalLandmark(String newName, int newLocation) {
		setName(newName);
		setLoc(newLocation);
		setTag("Natural");

	}
}
