package mp3;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
	 */
	private void CheckHealth(ArrayList<People> Party, Wagon wagon, Weather weather, String evt) {
		//removes 10% of health each day.
		genHealth -= (genHealth*.10);
		
		//calculates adder values.
		weatherAdder = calcWeatherAdder(weather, Party, wagon);
		foodAdder = calcFoodAdder(wagon);
		illnessRate = calcIllness(Party);
		randEvtAdder = randomEventAdder(wagon, evt);
		stFAdder = starveOrFreeze(wagon);
		paceAdder = calcPace(wagon);
		
		//checks player death.
		calcDeath(Party);
		calcHealth();
		
		if (genHealth >= 200 || Party.size() == 0)
			lose();
		else if (genHealth < 34)
			healthStr = "Good";
		else if (genHealth < 65)
			healthStr = "Fair";
		else if (genHealth < 104)
			healthStr = "Poor";
		else if (genHealth < 140)
			healthStr = "critical";
	}

	/*
	 * Calculates the current health of the player.
	 * @return genHealth - a double value representing the accumulation of bad health for the player
	 */
	public double calcHealth() {
		genHealth += weatherAdder + foodAdder + stFAdder + paceAdder + illnessRate + randEvtAdder;
		
		weatherAdder = 0;
		foodAdder = 0;
		illnessRate = 0;
		randEvtAdder = 0;
		
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
		case ("Hot"):
			lacksClothSet = false;
			weatherAdder = 1;
		case ("Cold"):
			if (wagon.clothSetNum == 0) {
				lacksClothSet = true;
				weatherAdder = 2;
			} else if (wagon.clothSetNum < 2*Party.size()) {
				lacksClothSet = true;
				weatherAdder = 1;
			} else {
				weatherAdder = 0;
				lacksClothSet = false;
			}
		case ("Very Cold"):
			if (wagon.clothSetNum == 0) {
				lacksClothSet = true;
				weatherAdder = 4;
				lacksClothSet = true;
			} else if (wagon.clothSetNum < 2*Party.size()) {
				weatherAdder = 2;
				lacksClothSet = true;
			} else {
				weatherAdder = 0;
				lacksClothSet = false;
			}
		default:
			weatherAdder = 0;
			lacksClothSet = false;
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
		if (wagon.getFoodAmt() == 0)
			tempFoodCons = "Empty";
		
		switch(tempFoodCons) {
		case ("Empty"):
			foodAdder = 6;
		case ("Meager"):
			foodAdder = 4;
		case ("Bare Bones"):
			foodAdder = 2;
		default:
			foodAdder = 0;
		}	
		return foodAdder;
	}
	
	/*
	 * Calculates the starve or freeze adder based on whether the player lacks clothing sets or food.
	 * @param wagon - an object of type Wagon containing the user's inventory.
	 * @return stFAdder - a double value representing the amount of bad health accumulated by freezing or starving.
	 */
	public double starveOrFreeze(Wagon wagon) {
		if (wagon.getFoodAmt()== 0 || lacksClothSet == true) 
			stFAdder += 0.8;
		else if (stFAdder == 0)
			stFAdder = 0;
		else
			stFAdder /= 2;
		return stFAdder;
	}
	
	/*
	 * Calculates the starve or freeze adder based on whether the player lacks clothing sets or food.
	 * @param wagon - an object of type Wagon containing the user's inventory.
	 * @param evt - a String determining possible other events.
	 * @return stFAdder - a double value representing the amount of bad health accumulated by freezing or starving.
	 */
	public int randomEventAdder(Wagon wagon, String evt) {
		if (evt == "Bad Water") 
			randEvtAdder += 20;
		else if (evt == "Little Water")
			randEvtAdder += 10;
		else if (evt == "Obtained Disease")
			randEvtAdder += 20;
		else
			randEvtAdder = 0;
		return randEvtAdder;
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
			paceAdder = 0;
		case ("Steady"):
			paceAdder = 2;
		case ("Strenuous"):
			paceAdder = 4;
		case ("Grueling"):
			paceAdder = 6;
		default:
			paceAdder = 0;
			System.out.println("ERROR: DEFAULT CALCPACE");
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
	 * Shows a pop up window saying "You Died" because I don't really understand how the panes are implemented in this code. 
	 */
	private void lose() {
		JOptionPane.showMessageDialog(null, "You Died.", "Warning", JOptionPane.WARNING_MESSAGE);
	}
}
