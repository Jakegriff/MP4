package mp3;

import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.JTextArea;

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
	private String weather = "Fair";
	private String pace = "Steady";
	private String rations = "Filling";
	private double location = 0;
	private double nextLoc = 220;
	private double numPace = 1;
	private int numOxen = 4;
	private int money = 1000;
	private int consumption;
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
	
	public int getFoodNum() {
		return(foodAmt);
	}
	
	public void clearWagon() {
		supplies.clear();
	}
	public String getWeather() {
		return(weather);
	}
	public String getPace() {
		return(pace);
	}
	public double getNumPace() {
		return(numPace);
	}
	public void calcPace() {
		double temp = 1;
		double temp2 = 1;
		
		if(pace.equals("Steady")) {
			temp = 1;
		}
		else if(pace.equals("Strenuous")) {
			temp = 1.5;
		}
		else if (pace.equals("Grueling")) {
			temp = 2;
		}
		
		if(numOxen < 4) {
			temp2 = numOxen / 4;
		}
		
		numPace = 20 * temp * temp2;
		
	}
	
	public void calcFood() {
		int temp = 1;
		
		if(rations.contains("Bare")) {
			temp = 1;
		}
		if(rations.contains("Mea")) {
			temp = 2;
		}
		if(rations.contains("Fill")) {
			temp = 3;
		}
		
		consumption = 5 * temp;
		
	}
	public void setPace(String newPace) {
		pace = newPace;
	}
	public String getRations() {
		return(rations);
	}
	public void setRations(String newRations) {
		rations = newRations;
	}
	public double getLocation() {
		return(location);
	}
	public void travel(ActionEvent evt, JTextArea text, int food)
	{	
		calcFood();
		eatFood();
		location = location + numPace;	
		text.setText(" Travelling... Current Location = " + getLocation()
		+ "\nFood: " + food + "\n Press q to stop" + "\n Consumption: " + consumption );
	}
	
	public int getOxen() {
		return(numOxen);
	}
	
	public int getMoney() {
		return(money);
	}
	
	public void eatFood() {
		foodAmt -= consumption;
	}
}



