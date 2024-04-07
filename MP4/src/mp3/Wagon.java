package mp3;

import java.util.*;

/**
 * The wagon for an implement of the game Oregon Trail.
 * A subclass of Item
 * 
 * @author Griffin Broge
 * @version 1.0.0
 * @date March 24th 2024
 * @filename Wagon.java
 */

public class Wagon extends Item{
	// Initialize Variables
	private int wagonMax = 2400;
	private int wagonWeight = 0;
	private int foodAmt = 0;
    // Items are stored in an array list
	ArrayList<Item> supplies = new ArrayList<Item>();
	/**
	 * Default Constructor
	 */
	public Wagon() {
	
	}
	/**
	 * Adds an item to the array list
	 * @param item The item you want to add
	 */
	public void addItem(Item item) {
		
		supplies.add(item);
	}
	/**
	 * Removes an item from the array list
	 * @param item The item you want to remove
	 */
	public void removeItem(Item item) {
		
		supplies.remove(item);
	}
	/**
	 * Used to update the total weight of the wagon
	 */
	public void updateWeight() {
		
			wagonWeight = 0;
		supplies.forEach((n -> {
			wagonWeight += n.getWeight();
		}));
	}
	/**
	 * Getter for the current weight of the class
	 */
	public int getWeight() {
		
		return wagonWeight;
	}
	/**
	 * Getter for the maximum weight for the wagon
	 * @return the max weight for the wagon
	 */
	public int getWagonMax() {
		
		return wagonMax;
	}
	/**
	 * Calculates the amount of food in the wagon in lbs
	 * @return the amount of food in the wagon
	 */
	public int getFoodAmt() {
		
		foodAmt = 0;
		supplies.forEach((n -> {
			if(n.getEdibility() == true) {
				foodAmt += n.getWeight();
			}
		}));
		
		return foodAmt;
	}
}



