package mp3;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * This class creates and calculates the health methods for the Oregon Trail game, along with calculating various corresponding health values.
 * 
 * @author Elizabeth Burkholder
 * @version 1.0
 * @date 5/05/2024
 * @filename Health.java
 */

public class Health {
	double genHealth;
	String healthStr;

	//remember we still have to attribute this setting by CALLING THE FUNCTION calcWeatheAdder.
	double stFAdder = 0;
	int illnessRate = 0;
	int weatherAdder;
	int foodAdder;
	int paceAdder;
	int randEvtAdder;
	boolean lacksClothSet;

	/*
	 * Constructs the initial values of the health status.
	 */
	public Health() {
		genHealth = 0;
		healthStr = "Good";
		lacksClothSet = false;
	}

	/*
	 * Checks the health of the player, if the health is more than 200 or everyone is dead, then the player loses; Changes the healthStr to reflect the current health status.
	 * @param Party - an ArrayList of all the members in the current Party.
	 * @param wagon - an object of type Wagon determining the user's wagon and related settings.
	 * @param weather - an object of type Weather to determine the weather.
	 * @return healthStr - a STring value representing the current party's health
	 */
	public String CheckHealth(ArrayList<People> Party, Wagon wagon, Weather weather, JFrame frame, JPanel panel) {
		//removes 10% of health each day.
		genHealth -= (genHealth*.10);

		//calculates adder values.
		weatherAdder = calcWeatherAdder(weather, Party, wagon);
		foodAdder = calcFoodAdder(wagon);
		illnessRate = calcIllness(Party);
		stFAdder = starveOrFreeze(wagon);
		paceAdder = calcPace(wagon);

		//checks player death.
		calcDeath(Party);
		calcHealth();
		
		if (genHealth >= 1200 || Party.size() == 0)
			lose(frame, panel);
		else if (genHealth < 255)
			healthStr = "Good";
		else if (genHealth < 488)
			healthStr = "Fair";
		else if (genHealth < 780)
			healthStr = "Poor";
		else if (genHealth < 1050)
			healthStr = "Critical";
		else
			healthStr = "Dire";
		System.out.println(genHealth);
		return healthStr;
	}

	/*
	 * Calculates the current health of the player.
	 * @return genHealth - a double value representing the accumulation of bad health for the player
	 */
	public double calcHealth() {
		genHealth += weatherAdder + foodAdder + stFAdder + paceAdder + illnessRate;

		//resets the adders
		weatherAdder = 0;
		foodAdder = 0;
		illnessRate = 0;

		return Math.round(genHealth * 100.0) / 100.0;
	}

	/*
	 * Calculates the value of the weather condition adder and returns that value according to the weather and the number of people in the party.
	 * @param weather - an object of t6ype Weather used to determine the value representing the current weather
	 * @param Party - an ArrayList of type People, used to calculate the number of people in the party.
	 * @param wagon - an object of type Wagon, holding all the current player's inventory.
	 * @return weatherAdder - an integer value between 0 and 4, representing the amount of bad health accumulated because of the weather.
	 */
	public int calcWeatherAdder(Weather weather, ArrayList<People> Party, Wagon wagon) {
		String Weather = weather.getWeather();
		switch(Weather) {
		case ("Very Hot"):
			weatherAdder = 2;
		lacksClothSet = false;
		break;
		case ("Hot"):
			lacksClothSet = false;
		weatherAdder = 1;
		break;
		case ("Cold"):
			if (wagon.clothSetNum == 0) {
				lacksClothSet = true;
				weatherAdder = 2;
				break;
			} else if (wagon.clothSetNum < 2*Party.size()) {
				lacksClothSet = true;
				weatherAdder = 1;
				break;
			} else {
				weatherAdder = 0;
				lacksClothSet = false;
				break;
			}
		case ("Very Cold"):
			if (wagon.clothSetNum == 0) {
				lacksClothSet = true;
				weatherAdder = 4;
				lacksClothSet = true;
				break;
			} else if (wagon.clothSetNum < 2*Party.size()) {
				weatherAdder = 2;
				lacksClothSet = true;
				break;
			} else {
				weatherAdder = 0;
				lacksClothSet = false;
				break;
			}
		default:
			weatherAdder = 0;
			lacksClothSet = false;
			break;
		}	
		return weatherAdder;
	}

	/*
	 * Calculates the value of the food consumption adder and returns that value according to the consumption rate and the amount of food in the wagon.
	 * @param wagon - an object of type Wagon, holding all the current player's inventory.
	 * @return foodAdder - an integer value between 0 and 6, representing the amount of bad health accumulated because of food consumption.
	 */
	public int calcFoodAdder(Wagon wagon) {
		String tempFoodCons = wagon.getRations();
		if (wagon.getFoodNum() == 0)
			tempFoodCons = "Empty";

		switch(tempFoodCons) {
		case ("Empty"):
			foodAdder = 6; break;
		case ("Meager"):
			foodAdder = 4; break;
		case ("Bare Bones"):
			foodAdder = 2; break;
		default:
			foodAdder = 0; break;
		}	
		return foodAdder;
	}

	/*
	 * Calculates the starve or freeze adder based on whether the player lacks clothing sets or food.
	 * @param wagon - an object of type Wagon containing the user's inventory.
	 * @return stFAdder - a double value representing the amount of bad health accumulated by freezing or starving.
	 */
	public double starveOrFreeze(Wagon wagon) {
		if (wagon.getFoodNum()== 0 || lacksClothSet == true) 
			stFAdder += 0.8;
		else if (stFAdder == 0)
			stFAdder = 0;
		else
			stFAdder /= 2;
		return stFAdder;
	}


	/*
	 * Calculates the value of the pace consumption adder and returns that value according to the pace rate.
	 * @param wagon - an object of type Wagon used to get the pace.
	 * @return foodAdder - an integer value between 0 and 6, representing the amount of bad health accumulated because of pace setting.
	 */
	public int calcPace(Wagon wagon) {
		String paceSet = wagon.getPace();
		switch(paceSet) {
		case ("Resting"):
			paceAdder = 0; break;
		case ("Steady"):
			paceAdder = 2; break;
		case ("Strenuous"):
			paceAdder = 4; break;
		case ("Grueling"):
			paceAdder = 6; break;
		default:
			paceAdder = 0;
			System.out.println("ERROR: DEFAULT CALCPACE");
			break;
		}	
		return paceAdder;
	}

	/*
	 * Calculates the illnesses of those in the party. If any one person has more than one illness, it "kills" them by removing the person from the ArrayList
	 * @param Party - an ArrayList containing all of the members of the party before checking deaths.
	 */
	public void calcDeath(ArrayList<People> Party) {
		int i = 0;
		while (i < Party.size()) {
			if (Party.get(i).numDisease >= 2) {
				JOptionPane.showMessageDialog(null, Party.get(i).getName() + "Has Died.");
				Party.remove(i);
			} else {
				i++;
			}
		}
	}

	/*
	 * Calculates the illness rate by determining how many people have an illness.
	 * @param ArrayList<People> Party - the ArrayList containing all the current party members.
	 * @return illnessRate - the number of people with an illness in the party.
	 */
	public int calcIllness(ArrayList<People> Party) {
		for (int i = 0; i < Party.size(); i++) {
			if (Party.get(i).numDisease != 0) {
				illnessRate++;
			}
		}
		return illnessRate;
	}

	/*
	 * Returns the health as a string.
	 * @return healthStr - the party's health represented by a String value.
	 */
	public String getHealthStr() {
		return healthStr;
	}


	/*
	 * Shows a pop up window saying "You Died" because I don't really understand how the panes are implemented in this code. 
	 */
	private void lose(JFrame frame, JPanel panel) {
		//JOptionPane.showMessageDialog(null, "You Died.", "Warning", JOptionPane.WARNING_MESSAGE);
		System.out.println("YOU DIED");
		JPanel Died_Screen = new JPanel();
		Died_Screen.setBounds(0, 0, 646, 524);
		frame.getContentPane().add(Died_Screen);
		Died_Screen.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("YOU DIED!!!!");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_7.setBounds(167, 131, 366, 187);
		Died_Screen.add(lblNewLabel_7);

		Died_Screen.setVisible(true);
		
		panel.setVisible(false);

	}
}
