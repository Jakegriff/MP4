package mp3;

/**
 * The class used to construct forts for an implementation of the game Oregon Trail
 * 
 * @author Griffin Broge
 * @version 1.0.0
 * @date April 16th, 2024
 */
public class Fort extends Landmarks{
	
	public Fort(String newName, int newLocation) {
		 setName(newName);
		 setLoc(newLocation);
		 setTag("F");
				
	}

}
