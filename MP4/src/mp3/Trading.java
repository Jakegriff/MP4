package mp3;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Trading extends Menu{
	protected String name;
	String names[] = {"trappers" , "natives" , "other travelers"};
	String suppliesL = displaySupplies(foodAmt, numOxen);

	
	/*
	 * Constructs an object of type Trading using an indexed number to determine 
	 * what type of trader the player is interacting with.
	 * @param idx - An integer number used to assign the object an index with corresponding attributes.
	 */
	public Trading(int idx) {	
		name = this.names[idx];
	}
	
	/*
	 * Displays the trade text to the player through a JTextArea and calculates the multiplier based on distance from Oregon.
	 * @param text - the main JTextArea used to communicate with the player.
	 * @param trader - An object of type Trading, used to determine who the player is trading with.
	 * @param multiplier - An integer value which determines how expensive the trade is (based on the wagon's distance).
	 * @param onjPrice - an integer describing the prices of the given object.
	 * @param obj - an object of type Item, used to determine which objects are being traded.
	 */
	public void initiateTrade(JTextArea text, Trading trader, int multiplier, int objPrice1, int objPrice2, int obj1, int obj2) {
		text.setText(suppliesL + "\n\n The " + trader.name + " would like to trade\n " + (multiplier *objPrice1) + " clothes" + " for " + (multiplier * objPrice2) 
				+ " ammo" + ".\n\n Would you like to trade? (yes or no)\n"); //obj1 and ob2 names
	}
	
	/*
	 * A Boolean function to determine whether the player input == "yes", "no", or something else. Updates wagon if "yes".
	 * @param input - A string representing the player's answer to prompt.
	 * @param in - A JTextField that ___.
	 * @param text - The main JTextArea for the game's communication with player.
	 * @return - Returns false when the player answers "yes" or "no". Otherwise, returns true.*/
	public Boolean tradeMenu(JTextArea text, JTextField in, String input) {
		if (input.equals("yes")) {
			//supplies.addItem(obj); 		//adding the item to the wagon
			System.out.println("item added.");
			text.setText(" Trade complete! Press enter to continue");
			return false;
		}
		else if (input.equals("no")){
			baseMenu(text);
			return false;
		}
		else {return true;}
	}
	
	/*
	 *Returns the supplies to the user as a string for stringL
	 *@param food - an integer value representing the amount of food the player currently has (in lbs).
	 *@param oxen - an integer value representing the number of oxen present in the player's party.
	 *@param (eventually) - int setsClothes, int wagTongues, int wagWheels, int bullets
	 */
	//hopefully/preferably everything except food, text, and oxen are part of a Supplies Array or smt.
	public String displaySupplies(int food, int oxen) {
		String supplies = " Oxen: " + oxen + "\n Boxes of Bullets: " + "\n Sets of Clothing: " + "\n Food: " + food 
				+ "\n Wagon Wheels: " + "\n Wagon Tongues: " + "\n Wagon Axels: ";
		return supplies;
	}
	
}
