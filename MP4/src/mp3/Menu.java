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
	public void baseMenu(JTextArea text, Wagon wagon) {
		text.setText(" Weather: " + wagon.getWeather() + "\n"
				+ " Health: " + "Good" + "\n"
				+ " Pace: " + wagon.getPace() + "\n"
				+ " Rations: " + wagon.getRations() + "\n"
				+ " You may:" + "\n \n"
				+ " 1. Continue on trail \n"
				+ " 2. Check supplies \n"
				+ " 3. Change pace \n"
				+ " 4. Change rations \n"
				+ " 5. Store Test \n"
				+ " 6. Trade");
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
				+ " \n Pounds of Food: " + wagon.getFoodAmt()
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
	public void fortMenu(JTextArea text, String name, Wagon wagon) {
		text.setText(" Welcome to " + name + "\n"
				+ " Weather: " + wagon.getWeather() + "\n"
				+ " Health: " + "Good" + "\n"
				+ " Pace: " + wagon.getPace() + "\n"
				+ " Rations: " + wagon.getRations() + "\n"
				+ " \n You may:" + "\n"
				+ " 1. Continue on trail \n"
				+ " 2. Check supplies \n"
				+ " 3. Change pace \n"
				+ " 4. Change rations \n"
				+ " 5. Store \n"
				+ " 6. Trading \n");

	}


	/*
	 * Sets the text area to the river menu screen.
	 * @param text - a JTextArea that determines which text area is changed.
	 * @param name - the name of the current river being implemented.
	 */
	public void riverMenu(JTextArea text, String name, Wagon wagon) {

		text.setText(" Welcome to " + name + "\n"
				+ " Weather: " + wagon.getWeather() + "\n"
				+ " Health: " + "Good" + "\n"
				+ " Pace: " + wagon.getPace() + "\n"
				+ " Rations: " + wagon.getRations() + "\n"
				+ " \n You may:" + "\n \n"
				+ " 1. Continue on trail \n"
				+ " 2. Check supplies \n"
				+ " 3. Change pace \n"
				+ " 4. Change rations \n");
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
	public void riverChoices(JTextArea text, double wid, double dep, Wagon wagon) {

		text.setText(" Weather: " + wagon.getWeather() + "\n"
				+ " River Width: " + wid + "\n" 
				+ " River Depth " + dep + "\n"
				+ " \n You may:" + "\n \n"
				+ " 1. Attempt to ford the river \n"
				+ " 2. Caulk the wagon and float it across \n"
				+ " 3. Take a ferry across ( Costs 10$ ) \n"
				);			
	}

	public boolean riverActions(JTextArea text, JTextField in, String input, double dep) {
		int temp = rand.nextInt(100)+1;

		if(input.equals("1")) {
			if(dep <= 3) {
				if(temp <= 80) {
					text.setText("You passed through the river with no issue");
					return false;
				}
				else {
					text.setText("You passed through the river, but lost some items");
					return false;
				}

			}
			else {
				if(temp <= 40) {
					text.setText("You passed through the river with no issue");
					return false;
				}
				else {
					text.setText("You passed through the river, but lost some items");
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
					text.setText("You passed through the river, but lost some items");
					return false;
				}

			}
			else {
				if(temp <= 25) {
					text.setText("You passed through the river with no issue");
					return false;
				}
				else {
					text.setText("You passed through the river, but lost some items");
					return false;
				}
			}
		}

		if(input.equals("3")) {

			if(temp <= 90) {
				text.setText("You passed through the river with no issue");
				return false;
			}
			else {
				text.setText("You passed through the river, but lost some items");
				return false;
			}
		}
		return true;

	}

	public boolean paceMenu(JTextArea text, JTextField in, String input, Wagon wagon) {

		if(input.equals("1")) {
			wagon.setPace("Steady");
			baseMenu(text, wagon);
			return false;
		}
		else if(input.equals("2")) {
			wagon.setPace("Strenuous");
			baseMenu(text,wagon);
			return false;
		}
		else if(input.equals("3")) {
			wagon.setPace("Grueling");
			baseMenu(text, wagon);
			return false;
		}
		wagon.calcPace();
		return true;
	}

	public boolean rationsMenu(JTextArea text, JTextField in, String input, Wagon wagon) {

		if(input.equals("1")) {
			wagon.setRations("Filling");
			baseMenu(text, wagon);
			return false;
		}
		else if(input.equals("2")) {
			wagon.setRations("Meager");
			baseMenu(text, wagon);
			return false;
		}
		else if(input.equals("3")) {
			wagon.setRations("Barebones");
			baseMenu(text, wagon);
			return false;
		}
		return true;

	}

	public boolean supplyMenu(JTextArea text, JTextField in, String input, Wagon wagon) {


		if(input.equals("q")) {
			baseMenu(text, wagon);	
			return false;
		}
		else return true;
	}

	public boolean travelMenu(JTextArea text, JTextField in, String input, Timer time, Wagon wagon) {
		if(input.equals("q")) {
			time.stop();
			input = "";
			baseMenu(text, wagon);
			return false;
		}
		else {
			return true;

		}
	}


	public int landmarkCheck(ActionEvent evt, JTextArea text, Timer time, int nextLandmark, double currentLoc, String name, String tag, int counter, Wagon wagon) {
		double temp = nextLandmark - currentLoc;

		//	System.out.println("QQEQWEOJQEOI: " + temp);
		if(temp <= 0) {

			time.stop();

			if(tag.equals("F")) {
				fortMenu(text,name, wagon);
				counter++;
				System.out.println("COUNTER: " + counter);
				return 1;
			}

			if(tag.equals("R")) {
				riverMenu(text,name, wagon);
				counter++;
				return 2;
			}
		}
		return 0;
	}

}
