package mp3;

import java.util.*;

/**
 * A template for items for an implementation of Oregon Trail
 * 
 * @author Griffin Broge
 * @version 1.0.0
 * @date March 24th 2024
 * @filename Item.java
 * 
 */

public class Item {
	// Variable initialization, need name, weight, and if it is edible.
	String name = "";

	int weight;
	
	boolean edible;
	/**
	 * Default Constructor
	 */
	public Item() {
	}
	// Overloaded constructor to initialize items
	public Item(String nameIn, int weightIn, boolean food) {

		name = nameIn;

		weight = weightIn;
		
		edible = food;

	}
	
	/**
	 * Getter for the name of an item
	 * @return the name of the item in String form
	 */
	public String getName() {
		
		return(name);
	}
	/**
	 * Getter of the weight of an item
	 * @return the weight of the item in int for (assuming all weights are ints from handout)
	 */
	public int getWeight() {
		
		return(weight);
	}
	/**
	 * Getter for the edibility of the item
	 * @return the items edibility, true if yes, false if no
	 */
	public boolean getEdibility() {
		return edible;
	}
}
