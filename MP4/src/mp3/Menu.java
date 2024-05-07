package mp3;

import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 * This class creates the main menu text shown in the text field through a series of functions.
 * Subclass of Wagon.
 * @authors Griffin Broge, Elizabeth Burkholder, Yutaka Yamato, Victor Trujillo
 * @version 1.0
 * @date 4/17/2024
 * @filename Menu.java
 */

public class Menu{

	Random rand = new Random();
	CharSequence baseMenuOptions = "12345";

	public Menu() {}

	/*
	 * Sets the text area to the intro menu screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 */
	public void introMenu(JTextArea text) {
		text.setText(" Welcome to Oregon Trail! This is a MVP version of the game, and will only include a short distance "
				+ " with two landmarks. In addition, the wagon is already loaded with food, water, and basic supplies."
				+ "As of now you can only change the travel speed and food consumption in the menus, but this will be "
				+ "updated later on. To continue press enter");
	}

	/*
	 * Sets the text area to the base menu screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 */
	public void baseMenu(JTextArea text, Wagon wagon, Weather weather, Health health) {
		text.setText(" Weather: " + weather.getWeather() + "\n"
				+ " Health: " + health.getHealthStr() + "\n"
				+ " Pace: " + wagon.getPace() + "\n"
				+ " Rations: " + wagon.getRations() + "\n"
				+ " You may:" + "\n \n"
				+ " 1. Continue on trail \n"
				+ " 2. Check supplies \n"
				+ " 3. Change pace \n"
				+ " 4. Change rations \n"
				+ " 6. Trade \n"
				+ " 7. Talk to some \n"
				+ " 8. Open diary");
	}

	/*
	 * Sets the text area to the checkSupplies menu screen
	 * @param text - a JTextArea that determines which text area is changed.
	 * @param food - an integer value based on the current user's food supply.
	 * @param oxen - an integer value containing the number of oxen in the party.
	 * @param money - a double value of the user's money value.
	 */
	public void checkSupplies(JTextArea text, Wagon wagon) {

		text.setText( " Money: $" + wagon.getMoney()
		+ " \n Oxen: " + wagon.getOxen()
		+ " \n Bullets: " + wagon.ammunitionAmt
		+ " \n Sets of Clothes: " + wagon.clothSetNum
		+ " \n Pounds of Food: " + wagon.getFoodNum()
		+ " \n Wagon Wheels: " + wagon.wheelNum
		+ " \n Wagon Tongues: " + wagon.tongueNum
		+ " \n Wagon Axels: " + wagon.axelNum
		+ " \n \n \n \n Enter q to go back");
	}

	/*
	 * Sets the text area to the changePace menu screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 */
	public void changePace(JTextArea text, Wagon wagon) {

		text.setText(" Change Pace. Current Pace: " + wagon.getPace()
		+ "\n 1. A Steady Pace"
		+ "\n 2. A Strenuous Pace"
		+ "\n 3. A Grueling Pace");
	}

	/*
	 * Sets the text area to the changeRations menu screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 */
	public void changeRations(JTextArea text, Wagon wagon) {

		text.setText(" Change Rations. Current Rations: " + wagon.getRations()
		+ "\n 1. Filling"
		+ "\n 2. Meager"
		+ "\n 3. Barebones");
	}

	/*
	 * Sets the text area to the travelling menu screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 * @food - an integer value containing the food value from the current user's wagon.
	 * @currentLoc - a double value that determines the current location of the wagon.
	 * @nextLoc - a double value containing the location of the next landmark.
	 */
	public void travelling(JTextArea text, int food, double currentLoc, double nextLoc) {
		text.setText(" Travelling... Current Location = " + currentLoc
				+ "\n Food: " + food + "\n Press q to stop"
				+ "\n Distance to next location: " + nextLoc);
	}

	/*
	 * Sets the text area to the fort menu screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 * @param name - the String name of the fort being used.
	 */
	public void fortMenu(JTextArea text, String name, Wagon wagon, Weather weather, Health health) {
		text.setText(" Welcome to " + name + "\n"
				+ " Weather: " + weather.getWeather() + "\n"
				+ " Health: " + health.getHealthStr() + "\n"
				+ " Pace: " + wagon.getPace() + "\n"
				+ " Rations: " + wagon.getRations() + "\n"
				+ " \n You may:" + "\n"
				+ " 1. Continue on trail \n"
				+ " 2. Check supplies \n"
				+ " 3. Change pace \n"
				+ " 4. Change rations \n"
				+ " 5. Store \n"
				+ " 6. Trade \n"
				+ " 7. Talk to someone \n"
				+ " 8. Open diary");

	}


	/*
	 * Sets the text area to the river menu screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 * @param name - the name of the current river being implemented.
	 */
	public void riverMenu(JTextArea text, String name, Wagon wagon, Weather weather, Health health) {

		text.setText(" Welcome to " + name + "\n"
				+ " Weather: " + weather.getWeather() + "\n"
				+ " Health: " + health.getHealthStr() + "\n"
				+ " Pace: " + wagon.getPace() + "\n"
				+ " Rations: " + wagon.getRations() + "\n"
				+ " \n You may:" + "\n \n"
				+ " 1. Continue on trail \n"
				+ " 2. Check supplies \n"
				+ " 3. Change pace \n"
				+ " 4. Change rations \n"
				+ " 7. Talk to someone \n"
				+ " 8. Open Diary");
	}

	public void naturalMenu(JTextArea text, String name, Wagon wagon, Weather weather, Health health) {

		text.setText(" Welcome to " + name + "\n"
				+ " Weather: " + weather.getWeather() + "\n"
				+ " Health: " + health.getHealthStr() + "\n"
				+ " Pace: " + wagon.getPace() + "\n"
				+ " Rations: " + wagon.getRations() + "\n"
				+ " \n You may:" + "\n \n"
				+ " 1. Continue on trail \n"
				+ " 2. Check supplies \n"
				+ " 3. Change pace \n"
				+ " 4. Change rations \n"
				+ " 7. Talk to someone \n"
				+ " 8. Open Diary");
	}

	/*
	 * Sets the text area to the information about the river menu screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 * @param double wid - the double value of the width of the river.
	 * @param dep - the double value of the depth of the river.
	 * @param spd - the double value representing the speed of the river.
	 */
	public void riverInfoMenu(JTextArea text, double wid, double dep, double spd) {

		text.setText(" You must cross the river to continue. The river at this point is " + wid
				+ " feet wide and " + dep + " feet deep in the middle and has " + spd  + " units of flow \n Press enter to continue");
	}

	/*
	 * Sets the text area to the information about the river choice screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 * @param double wid - the double value of the width of the river.
	 * @param dep - the double value of the depth of the river.
	 */
	public void riverChoices(JTextArea text, double wid, double dep, Wagon wagon, Weather weather ) {

		text.setText(" Weather: " + weather.getWeather() + "\n"
				+ " River Width: " + wid + "\n" 
				+ " River Depth " + dep + "\n"
				+ " \n You may:" + "\n \n"
				+ " 1. Attempt to ford the river \n"
				+ " 2. Caulk the wagon and float it across \n"
				+ " 3. Take a ferry across ( Costs 10$ ) \n"
				);			
	}

	/**
	 * Used to check the user input for the riverChoices method. Each 
	 * @param text
	 * @param in
	 * @param input
	 * @param dep
	 * @param wagon
	 * @return
	 */
	public boolean riverActions(JTextArea text, JTextField in, String input, double dep, Wagon wagon) {
		
		int temp = rand.nextInt(100)+1;
		String lostItem = "";

		if(input.equals("1")) {
			if(dep <= 3) {
				if(temp <= 80) {
					text.setText("You passed through the river with no issue");
					return false;
				}
				else {
					lostItem = riverLoseItem(wagon);
					text.setText("You passed through the river, but lost " + lostItem);
					return false;
				}

			}
			else {
				if(temp <= 40) {
					text.setText("You passed through the river with no issue");
					return false;
				}
				else {
					lostItem = riverLoseItem(wagon);
					text.setText("You passed through the river, but lost " + lostItem);
					return false;
				}
			}

		}

		if(input.equals("2")) {
			if(dep <= 5) {
				if(temp <= 85) {
					text.setText("You passed through the river with no issue");
					return false;
				}
				else {
					lostItem = riverLoseItem(wagon);
					text.setText("You passed through the river, but lost " + lostItem);
					return false;
				}

			}
			else {
				if(temp <= 25) {
					text.setText("You passed through the river with no issue");
					return false;
				}
				else {
					lostItem = riverLoseItem(wagon);
					text.setText("You passed through the river, but lost " + lostItem);
					return false;
				}
			}
		}

		if(input.equals("3")) {
			wagon.payToll();
			if(temp <= 90) {
				text.setText("You passed through the river with no issue");
				return false;
			}
			else {
				lostItem = riverLoseItem(wagon);
				text.setText("You passed through the river, but lost " + lostItem);
				return false;
			}
		}
		return true;

	}

	public boolean paceMenu(JTextArea text, JTextField in, String input, Wagon wagon, Weather weather, Health health) {

		if(input.equals("1")) {
			wagon.setPace("Steady");
			baseMenu(text, wagon, weather, health);
			return false;
		}
		else if(input.equals("2")) {
			wagon.setPace("Strenuous");
			baseMenu(text,wagon, weather, health);
			return false;
		}
		else if(input.equals("3")) {
			wagon.setPace("Grueling");
			baseMenu(text, wagon, weather, health);
			return false;
		}
		wagon.calcPace();
		return true;
	}

	public boolean rationsMenu(JTextArea text, JTextField in, String input, Wagon wagon, Weather weather, Health health) {

		if(input.equals("1")) {
			wagon.setRations("Filling");
			baseMenu(text, wagon, weather, health);
			return false;
		}
		else if(input.equals("2")) {
			wagon.setRations("Meager");
			baseMenu(text, wagon, weather, health);
			return false;
		}
		else if(input.equals("3")) {
			wagon.setRations("Barebones");
			baseMenu(text, wagon, weather, health);
			return false;
		}
		return true;

	}

	public boolean supplyMenu(JTextArea text, JTextField in, String input, Wagon wagon, Weather weather, Health health) {


		if(input.equals("q")) {
			baseMenu(text, wagon, weather, health);	
			return false;
		}
		else return true;
	}

	public boolean travelMenu(JTextArea text, JTextField in, String input, Timer time, Wagon wagon, Weather weather, Health health) {
		if(input.equals("q")) {
			time.stop();
			input = "";
			baseMenu(text, wagon, weather, health);
			return false;
		}
		else {
			return true;

		}
	}


	/**
	 * Used to determine if the player has reached a landmark and what type of landmark
	 * @param evt: needed to run every timer tick
	 * @param text: The text box that is changed to that set landmarks menu when is is reached
	 * @param time: Timer that is stopped to stop the player from traveling
	 * @param nextLandmark: the position of the next landmark
	 * @param currentLoc: the players current location, compared to nextLandmark to determine if the player reaches one
	 * @param name: name of the landmark
	 * @param tag: An string that is used to differentiate landmarks
	 * @param counter: Current location in the landmarks array
	 * @param wagon: Players wagon, used for menu displaying
	 * @param weather : Current weather, also used for menu displaying
	 * @param health : Players current health level, also used for menu displaying.
	 * @return
	 */
	public String landmarkCheck(ActionEvent evt, JTextArea text, Timer time, int nextLandmark, double currentLoc, String name, String tag, int counter, Wagon wagon, Weather weather, Health health) {
		// Calculate distance from next landmark
		double temp = nextLandmark - currentLoc;
		// For bug testing purposes
		//	System.out.println("QQEQWEOJQEOI: " + temp);
		// If at or after a landmark (in case the landmark is overshot due to a not standard pace)
		if(temp <= 0) {
			// Stop timer to stop traveling
			time.stop();
			// And then check what kind of landmark, display its menu, update the counter, and return the what type of landmark in string form.
			if(tag.equals("Fort")) {
				fortMenu(text,name, wagon, weather, health);
				counter++;
				// For bug testing purposes
				// System.out.println("COUNTER: " + counter);
				return "Fort";
			}

			if(tag.equals("River")) {
				riverMenu(text,name, wagon, weather, health);
				counter++;
				return "River";
			}

			if(tag.equals("Natural")) {
				naturalMenu(text,name,wagon, weather, health);
				counter++;
				return "Natural";
			}
		}
		return "0";
	}
	
	/**
	 * Helper method to determine what item to lose and how much of it when you fail to pass the river check
	 * @param wagon: The wagon that is used to access the players items
	 * @return returns a string to use for the display text to inform the player of what was lost
	 */
	public String riverLoseItem(Wagon wagon) {
		// Random object to randomize what item is lost
		Random rand = new Random();
		// 5 options
		int whichItem = rand.nextInt(4);
		// Switch to make things cleaner
		switch(whichItem) {
		// Each item loses a set amount.
		case 0:
		{
			wagon.setAmmo(-2);
			return("40 Bullets");
		}
		case 1:
		{
			wagon.setClothSet(-2);
			return("2 Sets of clothing");
		}
		case 2:
		{
			wagon.setFoodAmt(-25);
			return("25 pounds of food");
		}
		case 3:
		{
			wagon.setOxen(-1);
			return("Two oxen");
		}
		default:
		{
			wagon.setAmmo(-2);
			return("40 Bullets");
		}
			
		
		
		}
	}

}
