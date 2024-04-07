package mp3;

import javax.swing.JTextArea;

public class Menu extends Wagon{
	
	public void introMenu(JTextArea text) {
		text.setText("Welcome to Oregon Trail! This is a MVP version of the game, and will only include a short distance "
				+ " with two landmarks. In addition, the wagon is already loaded with food, water, and basic supplies."
				+ "As of now you can only change the travel speed and food consumption in the menus, but this will be "
				+ "updated later on. To continue press any character");
	}
	
	public void baseMenu(JTextArea text) {
		text.setText("Weather: " + getWeather() + "\n"
				 + "Health: " + "Good" + "\n"
				 + "Pace: " + getPace() + "\n"
				 + "Rations: " + getRations() + "\n"
				 + "You may:" + "\n \n"
				 + "1. Continue on trail \n"
				 + "2. Check supplies \n"
				 + "3. Change pace \n"
				 + "4. Change Rations \n");
	}
	
	public void checkSupplies(JTextArea text) {
		
		text.setText("Food: " + getFoodAmt() );
		
	}

}
