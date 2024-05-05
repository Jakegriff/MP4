package mp3;

/**
 * A template for items for an implementation of Oregon Trail
 * 
 * @author Griffin Broge
 * @version 1.0.0
 * @date April 17th 2024
 * @filename Item.java
 * 
 */

public class Item {
	// Variable initialization, need name, weight, and if it is edible.
	String name = "";
	int weight;
	boolean edible;

	//Default Constructor
	public Item() {}

	/* Overloaded constructor to initialize items.
	 * @param nameIn - a string representing the name of the item.
	 * @param weightIn - an integer containing the item's weight.
	 * @param food - a boolean value determining whether the item is food.
	 */
	public Item(String nameIn, int weightIn, boolean food) {
		this.name = nameIn;
		this.weight = weightIn;
		this.edible = food;
	}

	/**
	 * Getter for the name of an item.
	 * @return the name of the item in String form.
	 */
	public String getName() {
		return(name);
	}

	/**
	 * Getter of the weight of an item.
	 * @return the weight of the item in int for (assuming all weights are ints from handout).
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
