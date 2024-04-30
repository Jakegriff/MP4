package mp3;

import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.JTextArea;

/**
 * The wagon for an implement of the game Oregon Trail.
 * A subclass of Item.
 * @author Griffin Broge
 * @version 1.0.0
 * @date March 24th 2024
 * @filename Wagon.java
 */

public class Wagon{
	// Initialize Variables.
	protected int wagonMax = 2400;
	protected int wagonWeight = 0;
	protected int foodAmt = 0;
	private String weather = "Fair";
	private String pace = "Steady";
	private String rations = "Filling";
	private double location = 0;
	private double nextLoc = 0;
	private double numPace = 1;
	protected int numOxen = 4;
	private double money = 1000;
	private int consumption;
	protected int clothSetNum = 0;
	protected int ammunitionAmt = 0;
	private double totalBill = 0;
	protected int wheelNum = 0;
	protected int axelNum = 0;
	protected int tongueNum = 0;

	// Items are stored in an array list.
	ArrayList<Item> supplies = new ArrayList<Item>();
	

	/**
	 * Default Constructor
	 */
	public Wagon() {}
	
	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}
	
	public int getWheelNum() {
		return wheelNum;
	}
	
	public void setAxelNum (int axelNum) {
		this.axelNum = axelNum;
	}
	
	public int getAxelNum() {
		return axelNum;
	}
	
	public void setTongueNum(int tongueNum) {
		this.tongueNum = tongueNum;
	}
	
	public int getTongueNum() {
		return tongueNum;
	}

	/*
	 * Gets the bill value.
	 * @return totalBill - returns a double.
	 */
	
	public  double getTotalBill() {
		return totalBill;
	}

	/*
	 * Sets the ammunition based on bullets/boxes.
	 * @param ammo - an integer value for ammo. 
	 */
	public void setAmmo(int ammo) {
		ammunitionAmt = ammunitionAmt + (20*ammo);
	}

	/*
	 * Gets the ammo amount.
	 * @return ammunitionAmt - an integer for the amount of ammunition.
	 */
	public int getAmmo() {
		return ammunitionAmt;
	}

	/*
	 * Sets the food amount value.
	 * @param food - an integer value containing the amount of food in wagon.
	 */
	public void setFoodAmt(int food) {
		foodAmt = foodAmt + food;
	}

	/*
	 * Adds item to wagon.
	 * @param item - an object of type Item used to determine what to pass to wagon.
	 */
	public void addItem(Item item) {
		supplies.add(item);
	}

	/**
	 * Removes an item from the array list.
	 * @param item The item you want to remove.
	 */
	public void removeItem(Item item) {
		supplies.remove(item);
	}

	/**
	 * Used to update the total weight of the wagon.
	 */
	public void updateWeight() {

		wagonWeight = 0;
		supplies.forEach((n -> {
			wagonWeight += n.getWeight();
		}));
	}

	/**
	 * Getter for the current weight of the class.
	 */
	public int getWeight() {
		return wagonWeight;
	}

	/**
	 * Getter for the maximum weight for the wagon.
	 * @return the max weight for the wagon
	 */
	public int getWagonMax() {
		return wagonMax;
	}

	/**
	 * Calculates the amount of food in the wagon in lbs.
	 * @return the amount of food in the wagon.
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

	/*
	 * Gets the food number as an integer.
	 * @return foodAmt - an integer representing the food in the wagon.
	 */
	public int getFoodNum() {
		return(foodAmt);
	}

	/*
	 * Clears the wagon of all supplies.
	 */
	public void clearWagon() {
		supplies.clear();
	}

	/*
	 * Gets the weather at the point when called.
	 * @return weather - a string representing the current weather.
	 */
	public String getWeather() {
		return(weather);
	}

	/*
	 * Gets the pace of the wagon.
	 * @return pace - the pace of the wagon as a string.
	 */
	public String getPace() {
		return(pace);
	}

	/*
	 * Gets the pace as a double value.
	 * @return numPace - an double value representing the speed of the wagon.
	 */
	public double getNumPace() {
		return(numPace);
	}

	/*
	 * Calculates the pace of the wagon with values and strings.
	 */
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

	/*
	 * Calculates the food usage of certain strings to integers.
	 */
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

	/*
	 * Sets the pace the wagon.
	 * @param newPace - a string containing the pace.
	 */
	public void setPace(String newPace) {
		pace = newPace;
	}

	/*
	 * Gets the ration amount from the wagon.
	 * @return rations - a string containing the rations.
	 */
	public String getRations() {
		return(rations);
	}

	/*
	 * Sets the rations using the new rations string value.
	 * @param newRations - a string containing the description of the ration value. 
	 */
	public void setRations(String newRations) {
		rations = newRations;
	}

	/*
	 * Gets the location on a certain point on the trail.
	 * @return location - a double value containing the user's location.
	 */
	public double getLocation() {
		return(location);
	}

	/*
	 * Decrements the food while traveling and updates the user's location.
	 * @param evt - an actionEvent used to determine when to execute.
	 * @param text - a JTextArea for the user input.
	 * @param food - an integer value containing the amount of food in the wagon.
	 * @param nextLandmark - an integer value to determine how far until the next landmark appears.
	 */
	public void travel(ActionEvent evt, JTextArea text, int food, int nextLandmark)
	{	
		calcFood();
		eatFood();
		location = location + numPace;	
		nextLoc = getNextLocation(nextLandmark);
		text.setText(" Travelling... Current Location = " + getLocation()
		+ "\n Food: " + getFoodNum() + "\n Press q to stop"
		+ "\n Distance to next location: " + nextLoc);
	}

	/*
	 * Sets the number of oxen to the inputted value.
	 * @param Oxen - an integer value containing the desired number of oxen for the party. 
	 */
	public void setOxen(int Oxen) {
		numOxen = numOxen + (2*Oxen);
	}

	/*
	 * Sets the number of clothes to the inputted value.
	 * @param setNum - an integer value containing the desired number of sets of clothes for the party.
	 */
	public void setClothSet(int setnum) {
		clothSetNum = clothSetNum + setnum;
	}

	/*
	 * Gets the number of clothes to the inputted value.
	 * @return clothSetNum - an integer value containing the number of sets of clothes in the wagon. 
	 */
	public int getClothSet() {
		return clothSetNum;
	}

	/*
	 * Gets the number of oxen to the inputted value.
	 * @return numOxen - an integer value containing the number of oxen in the party. 
	 */
	public int getOxen() {
		return(numOxen);
	}

	/*
	 * Calculates the money in the party.
	 * @param price - a double value for the price of an object.
	 * @param input - an integer value for the number of items desired.
	 */
	public void calcMoney(double price, int input) {
		money = money -(price * input);
	}

	/*
	 * Calculates the total bill for the shop.
	 */
	public void setTotalBill() {
		totalBill = 0;
	}

	/*
	 * Calculates the total bill using the price and inputted number.
	 * @param price - a double value representing the price of the total bill
	 * @input - an input presented by the user.
	 */
	public void calcTotalBill(double price, int input) {
		totalBill = totalBill + (price * input);
	}

	/*
	 * Gets the amount of money left over
	 * @return money - a double value containing the current user's total money.
	 */
	public double getMoney() {
		return(money);
	}

	/*
	 * Decrements the food amount by the consumption.
	 */
	public void eatFood() {
		foodAmt -= consumption;
	}

	/*
	 * Gets the locations of the next landmark.
	 * @param nextLandmark - an integer value determining the next landmark.
	 * @return nextLoc - a double value representing the next locations coordinate distance.
	 */
	public double getNextLocation(int nextLandmark) {
		nextLoc = nextLandmark - getLocation();
		return(nextLoc);
	}
}