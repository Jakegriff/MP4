package mp3;


/**
 * Superclass for landmarks for an implementation of the game Oregon Trail
 * 
 * @author Griffin Broge, Yutaka Yamato
 * @version 1.0.0
 * @date April 16th, 2024
 * @filename Landmarks.java
 */
public class Landmarks {

	private String name;
	private int location;
	private String tag;


	/*
	 * Gets the name of the landmark.
	 * @return name - a string containing the name.
	 */
	public String getName() {
		return(name);
	}

	/*
	 * Gets the value of the location.
	 * @return location - an integer value containing the location of the landmark.
	 */
	public int getLocation() {
		return(location);
	}

	/*
	 * Sets the name of the landmark.
	 * @param newName - the string value containing the new name of the landmark.
	 */
	public void setName(String newName) {
		name = newName;
	}

	/*
	 * Sets the location of the landmark.
	 * @param newLoc - an integer containing the number location.
	 */
	public void setLoc(int newLoc) {
		location = newLoc;
	}

	/*
	 * Gets the tag of the landmark.
	 * @return tag - a string containing the tag of a landmark.
	 */
	public String getTag() {
		return(tag);
	}

	/*
	 * Sets the tag of the landmark.
	 * @param newTag - a string containing the tag of a landmark.
	 */
	public void setTag(String newTag) {
		tag = newTag;
	}

}
