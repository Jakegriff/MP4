package mp3;

import java.util.Random;

/**
 * The class used to construct Rivers for an implementation of the game Oregon Trail.
 * 
 * @author Griffin Broge
 * @version 1.0.0
 * @date April 16th 2024
 */

public class River extends Landmarks{
	// Initialize random object for later use 
	Random rand = new Random();
	
	private double riverWidth;
	private double riverDepth;
	private double riverSpeed;
	
	/**
	 * Constructor for the rivers. The width, depth, and speed of the river is randomized.
	 * @param newName - The name of the new River being created.
	 * @param newLocation - the location of the river along the trail.
	 */
	public River(String newName, int newLocation) {
		
		double tempWid = rand.nextDouble(50) + 1;
		double tempDep = rand.nextDouble(15) + 1;
		double tempSpd = rand.nextDouble(15) + 1;
		
		tempWid = Math.round(tempWid * 1000) / 1000;
		tempDep = Math.round(tempDep * 1000) / 1000;
		tempSpd = Math.round(tempDep * 1000) / 1000;
	
		setName(newName);
		setLoc(newLocation);
		setTag("R");
		setRiverWidth(tempWid);
		setRiverDepth(tempDep);
		setRiverSpeed(tempSpd);
	}
	
	
	
	
	public double getRiverWidth() {
		return riverWidth;
	}

	public void setRiverWidth(double riverWidth) {
		this.riverWidth = riverWidth;
	}

	public double getRiverDepth() {
		return riverDepth;
	}

	public void setRiverDepth(double riverDepth) {
		this.riverDepth = riverDepth;
	}

	public double getRiverSpeed() {
		return riverSpeed;
	}

	public void setRiverSpeed(double riverSpeed) {
		this.riverSpeed = riverSpeed;
	}
}
