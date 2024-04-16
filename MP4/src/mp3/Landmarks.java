package mp3;


/**
 * Superclass for landmarks for an implementation of the game Oregon Trail
 * 
 * @author Griffin Broge
 * @version 1.0.0
 * @date April 16th, 2024
 * 
 */
public class Landmarks {
	
	private String name;
	private int location;
	private String tag;
	
	
	
	public String getName() {
		return(name);
	}
	
	public int getLocation() {
		return(location);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setLoc(int newLoc) {
		location = newLoc;
	}
	
	public String getTag() {
		return(tag);
	}
	
	public void setTag(String newTag) {
		tag = newTag;
	}
	
}
