package mp3;

/**
 * The class used to construct forts for an implementation of the game Oregon Trail
 * 
 * @author Griffin Broge, Elizabeth Burkholder
 * @version 1.0.0
 * @date April 16th, 2024
 * @filename Fort.java
 */
public class Fort extends Landmarks{

	/*
	 * Assigns the fort a name, location, and tag that determines that the landmark is a fort.
	 * @param newName - A string representing the new name of the fort.
	 * @param newLocation - An integer value representing the location number of where the fort is located.
	 */
	public Fort(String newName, int newLocation) {
		setName(newName);
		setLoc(newLocation);
		setTag("F");

	}

}
