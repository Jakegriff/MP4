package mp3;


import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;


public class Menu extends Wagon{
	
	Random rand = new Random();
	CharSequence baseMenuOptions = "1234";
	
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
				 + " 4. Change rations \n"
				 + " 5. Store Test \n");
	}
	
	public void checkSupplies(JTextArea text, int food, int oxen, double money) {
		
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
	

	public void fortMenu(JTextArea text, String name) {
		text.setText(" Welcome to " + name + "\n"
				 + " Weather: " + getWeather() + "\n"
				 + " Health: " + "Good" + "\n"
				 + " Pace: " + getPace() + "\n"
				 + " Rations: " + getRations() + "\n"
				 + " \n You may:" + "\n \n"
				 + " 1. Continue on trail \n"
				 + " 2. Check supplies \n"
				 + " 3. Change pace \n"
				 + " 4. Change rations \n");
		
	}
	
	
	public void riverMenu(JTextArea text, String name) {
		
		text.setText(" Welcome to " + name + "\n"
				 + " Weather: " + getWeather() + "\n"
				 + " Health: " + "Good" + "\n"
				 + " Pace: " + getPace() + "\n"
				 + " Rations: " + getRations() + "\n"
				 + " \n You may:" + "\n \n"
				 + " 1. Continue on trail \n"
				 + " 2. Check supplies \n"
				 + " 3. Change pace \n"
				 + " 4. Change rations \n");
	}
	
	public void riverInfoMenu(JTextArea text, double wid, double dep, double spd) {
		
		text.setText(" You must cross the river to continue. The river at this point is " + wid
				+ " feet wide and " + dep + " feet deep in the middle and has " + spd  + " units of flow \n Press enter to continue");
	}
	
	public void riverChoices(JTextArea text, double wid, double dep) {
		
		text.setText(" Weather: " + getWeather() + "\n"
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
	
	
		
	public int landmarkCheck(ActionEvent evt, JTextArea text, Timer time, int nextLandmark, double currentLoc, String name, String tag, int counter) {
			
			double temp = nextLandmark - currentLoc;
			
		//	System.out.println("QQEQWEOJQEOI: " + temp);
			if(temp <= 0) {
				
				time.stop();
				
				if(tag.equals("F")) {
					fortMenu(text,name);
					counter++;
					System.out.println("COUNTER: " + counter);
					return 1;
				}
				
				if(tag.equals("R")) {
					riverMenu(text,name);
					counter++;
					return 2;
				}
			}
			return 0;
	}
	
	
	
}
