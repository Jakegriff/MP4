package mp3;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This class creates the store for the Oregon Trail game
 * 
 * @author Victor Trujillo
 * @version 1.0
 * @date 4/17/2024
 * @filename Store.java
 */


public class Store extends Menu {

	public Store(){

	}
	/**
	 * This method sets the text for the main store menu
	 * 
	 * @param Text - text to display menu
	 * @param totalBill - current bill when in the store
	 * @param money - current amount of money the player has
	 */
	public void baseStoreMenu(JTextArea Text, Wagon wagon) {
		Text.setText(" 1. Oxen" + "\n"
				+" 2. Food" + "\n"
				+" 3. Clothing" +"\n"
				+" 4. Ammunition" +"\n"
				+" 5. Spare Parts" +"\n"
				+" 6. Exit Store" + "\n"
				+" -----------------" +"\n"
				+" Total bill: " + wagon.getTotalBill() +"\n"
				+"\n"
				+" Amount you have:" + wagon.getMoney() + "\n"
				+" What item would you like to buy?");
	}
	/**\
	 * This method gets the player's input while in the store menu.
	 * The correct sub menu method will be called.  
	 * 
	 * @param text - text to display menu
	 * @param in - 
	 * @param input - players input
	 * @return - returns a flag to close the current menu to avoid conflicts 
	 */
	public Boolean storeMenu(JTextArea text, JTextField in, String input, Wagon wagon) {
		if(input.equals("6")) {
			baseMenu(text, wagon);
		}
		if(input.equals("1")) {
			oxenMenu(text, 10);
		}
		if(input.equals("2")) {
			foodMenu(text, .20);
		}
		if(input.equals("3")) {
			clothMenu(text, 20);
		}
		if(input.equals("4")) {
			ammunitionMenu(text, 20);
		}
		if(input.equals("5")) {
			sparePartsMenu(text, 20, 20, 20);
		}
		return false;
	}
	
	public Boolean sparePartsMenu(JTextArea text, JTextField in, String input, Wagon wagon) {
		if(input.equals("q")) {
			baseStoreMenu(text, wagon);
		}
		return false;
	}

	/**
	 * Creates menu for purchasing Oxen
	 * 
	 * @param Text - text to display menu
	 * @param yokePrice - current price of a yoke
	 */
	public void oxenMenu(JTextArea Text, int yokePrice) {
		Text.setText("There are two oxen in a Yoke." + "\n"
				+ "3 Yokes are recomended for the trip" + "\n"
				+ "It is $" + yokePrice + " a Yoke." + "\n"
				+ "How many Yoke do you want?");
	}

	/**
	 * Creates menu for purchasing Food
	 * 
	 * @param Text - text to display menu
	 * @param foodPrice - current price for food
	 */
	public void foodMenu(JTextArea Text, double foodPrice) {
		Text.setText("It is recomend to bring 200 pounds for each person on your trip" + "\n"
				+"The price is " +foodPrice+ " cents per pound" + "\n"
				+"How many pounds of food do you want?");
	}

	/**
	 * Creates menu for purchasing cloth
	 * 
	 * @param Text - text to display menu
	 * @param clothPrice - current price for cloth
	 */
	public void clothMenu(JTextArea Text, int clothPrice) {
		Text.setText("You will need warm cloth for the mountians." + "\n"
				+"Two sets of cloth is recomended per person."+ "\n"
				+"Each set is $" + clothPrice + "." + "\n"
				+"How many sets of cloth do you want?");
	}

	/**
	 * creates menu for purchasing ammo
	 * 
	 * @param Text - text to display menu
	 * @param ammunitionPrice - current price for ammo
	 */
	public void ammunitionMenu(JTextArea Text, int ammunitionPrice) {
		Text.setText("Boxes of ammunition have 20 bullets each" + "\n"
				+"Each box is $" + ammunitionPrice +"." + "\n"
				+"How many boxes do you want?");
	}

	/**
	 * Creates menu for purchasing spare parts
	 * 
	 * @param Text - text to display menu
	 * @param wheelPrice - current price for a wheel
	 * @param axelPrice - current price for an axle
	 * @param tonguePrice - current price for a tongue
	 */
	public void sparePartsMenu(JTextArea Text, int wheelPrice, int axelPrice, int tonguePrice) {
		Text.setText(" 1. Wagon Wheel - $" + wheelPrice + " each" + "\n"
				+" 2. Wagon axel - $" + axelPrice + " each"+ "\n"
				+" 3. Wagon tongue -$" + tonguePrice + " each" + "\n"
				+" q. Back to Store" + "\n"
				+" Make a selection");
	}

}
