package mp3;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Menu extends Wagon{
	
	
	CharSequence baseMenuOptions = "1234";
	
	public Menu() {
		
		
		
	}
	
	public void introMenu(JTextArea text) {
		text.setText(" Welcome to Oregon Trail! This is a MVP version of the game, and will only include a short distance "
				+ " with two landmarks. In addition, the wagon is already loaded with food, water, and basic supplies."
				+ "As of now you can only change the travel speed and food consumption in the menus, but this will be "
				+ "updated later on. To continue press any character");
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
	
	public void checkSupplies(JTextArea text) {
		
		text.setText(" Food: " + getFoodAmt() 
				   + "\n Oxen: " + getOxen()
				   + " \n Money:" + getMoney()
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
	
	
	public void paceMenu(JTextArea text, JTextField in, String input, Boolean Flag) {
		
		if(input.equals("1")) {
			setPace("Steady");
			baseMenu(text);
			Flag = false;
		}
		else if(input.equals("2")) {
			setPace("Strenuous");
			baseMenu(text);
			Flag = false;
		}
		else if(input.equals("3")) {
			setPace("Grueling");
			baseMenu(text);
			Flag = false;
		}
		calcPace();
	}

public void rationsMenu(JTextArea text, JTextField in, String input, Boolean Flag) {
		
		if(input.equals("1")) {
			setRations("Filling");
			baseMenu(text);
			Flag = false;
		}
		else if(input.equals("2")) {
			setRations("Meager");
			baseMenu(text);
			Flag = false;
		}
		else if(input.equals("3")) {
			setRations("Barebones");
			baseMenu(text);
			Flag = false;
		}
	}
	
	public void supplyMenu(JTextArea text, JTextField in, String input) {
		
		
		if(input.equals("q")) {
			baseMenu(text);
			
		}
	}
	
	
	public CharSequence getBaseOptions() {
		return(baseMenuOptions);
	}

}
