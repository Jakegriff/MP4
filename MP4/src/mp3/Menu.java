package mp3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;


public class Menu extends Wagon{
	
	
	CharSequence baseMenuOptions = "12345";
	
	public Menu() {
		
	}
	
	public void introMenu(JTextArea text) {
		text.setText(" Welcome to Oregon Trail! This is a MVP version of the game, and will only include a short distance "
				+ " with two landmarks. In addition, the wagon is already loaded with food, water, and basic supplies."
				+ "As of now you can only change the travel speed and food consumption in the menus, but this will be "
				+ "updated later on. To continue press enter");
	}
	
	public void baseMenu(JTextArea text) {
		text.setText(" Weather: " + getWeather() + "\n"
				 + " Health: " + "Good" + "\n"
				 + " Pace: " + getPace() + "\n"
				 + " Rations: " + getRations() + "\n"
				 + " You may:" + "\n \n"
				 + " 1. Continue on trail \n"
				 + " 2. Check supplies \n"
				 + " 3. Change pace \n"
				 + " 4. Change rations \n");
	}
	
	public void baseMenu(JTextArea text, Boolean fort) {
		text.setText(" Weather: " + getWeather() + "\n"
				 + " Health: " + "Good" + "\n"
				 + " Pace: " + getPace() + "\n"
				 + " Rations: " + getRations() + "\n"
				 + " You may:" + "\n \n"
				 + " 1. Continue on trail \n"
				 + " 2. Check supplies \n"
				 + " 3. Change pace \n"
				 + " 4. Change rations \n"
				 + " 5. Trade \n");
	}
	
	public void checkSupplies(JTextArea text, int food, int oxen, int money) {
		
		text.setText(" Food: " + food
				   + "\n Oxen: " + oxen
				   + " \n Money:" + money
				   + "\n \n \n \n Enter q to go back");
	}
	
	public void changePace(JTextArea text) {
		
		text.setText(" Change Pace. Current Pace: " + getPace()
					+ "\n 1. A Steady Pace"
					+ "\n 2. A Strenuous Pace"
					+ "\n 3. A Grueling Pace");
	}
	
	public void changeRations(JTextArea text) {
		
		text.setText(" Change Rations. Current Rations: " + getRations()
					+ "\n 1. Filling"
					+ "\n 2. Meager"
					+ "\n 3. Barebones");
	}
	
	public void travelling(JTextArea text, int food, double currentLoc, double nextLoc) {
		text.setText(" Travelling... Current Location = " + currentLoc
		+ "\n Food: " + food + "\n Press q to stop"
		+ "\n Distance to next location: " + nextLoc);
	}
	
	
	public boolean paceMenu(JTextArea text, JTextField in, String input) {
		
		if(input.equals("1")) {
			setPace("Steady");
			baseMenu(text);
			return false;
		}
		else if(input.equals("2")) {
			setPace("Strenuous");
			baseMenu(text);
			return false;
		}
		else if(input.equals("3")) {
			setPace("Grueling");
			baseMenu(text);
			return false;
		}
		calcPace();
		return true;
	}

public boolean rationsMenu(JTextArea text, JTextField in, String input) {
		
		if(input.equals("1")) {
			setRations("Filling");
			baseMenu(text);
			return false;
		}
		else if(input.equals("2")) {
			setRations("Meager");
			baseMenu(text);
			return false;
		}
		else if(input.equals("3")) {
			setRations("Barebones");
			baseMenu(text);
			return false;
		}
		return true;
	
	}
	
	public boolean supplyMenu(JTextArea text, JTextField in, String input) {
		
		
		if(input.equals("q")) {
			baseMenu(text);	
			return false;
		}
		else return true;
	}
	
	public boolean travelMenu(JTextArea text, JTextField in, String input, Timer time) {
		
		if(input.equals("q")) {
			time.stop();
			input = "";
			baseMenu(text);
			return false;
			}
		else {
			return true;
			
		}
		
	}
	
	
	public CharSequence getBaseOptions() {
		return(baseMenuOptions);
	}

}
