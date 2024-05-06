package mp3;

import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 * The implementation of event in an implementation of the game Oregon Trail.
 * @authors Yutaka Yamato
 * @version 1.0.0
 * @date May 4th, 2024
 * @filename RandomEvent.java
 */

public class RandomEvent extends OregonTrail {
	private Random random;
	Menu menu = new Menu();
	JTextArea textArea = new JTextArea();

	String eventName;    


	// Generate numbers at random.
	public RandomEvent() {
		random = new Random();
	}

	// The method to simulate a day's travel and check for random events
	public void travelDay(Timer timer) {
		// need to write code more
		// how can we get turn on how the event will happen? 
		checkRandomEvents(timer);  
	}

	// The probability of an event occurring depends on the probability of the event.
	// Only one event will be selected.
	private void checkRandomEvents(Timer timer) {
		int eventIndex = random.nextInt(15);
		int randomValue = random.nextInt(100)/15;

		//System.out.println(eventIndex);
		switch(eventIndex){       
		case 0:
			if (indianFindFood()) {
				if(randomValue <= 5){
					wagon.setFoodAmt(30);  
					eventFlag = true;
					timer.stop();
					eventName = "Indians help find food" 
							+ "\n local Indians will"
							+ "\n give you 30 pounds of food.";  
					return;
				}                        
			}
			break;            
		case 1:
			if (thunderstorm()) {
				if(randomValue <= 3){
					eventFlag = true;
					eventName = "A thunderstorm occurred." 
							+ "\n ";
					return;
				}                        
			}
			break;
		case 2:
			if (blizzard()) {
				if(randomValue <= 15){
					eventFlag = true;
					eventName = "A blizzard occurred."
							+ "\n ";
					return;
				}                        
			}
			break;
		case 3:
			if (heavyFog()) {
				if(randomValue <= 6){
					eventFlag = true;
					eventName = "A heavy fog occurred."
							+ "\n ";
					return;
				}                        
			}
			break;
		case 4:
			if (hailStorm()) {
				if(randomValue <= 6){
					eventFlag = true;
					eventName = "A hail storm occurred." 
							+ "\n ";
					return;
				}                        
			}
			break;
		case 5:
			if (isOxInjured()) {
				if(randomValue <= 2){
					//                    	eventFlag = true;
					eventName = "A ox is injured." 
							+ "\n ";
					return;
				}                        
			}
			break;
		case 6:
			if (isMemberInjured()) {
				if(randomValue <= 2){
					//                    	eventFlag = true;
					eventName = "A member is injured." 
							+ "\n ";
					return;
				}                        
			}
			break;
		case 7:
			if (snakeBite()) {
				if(randomValue <= 1){
					eventFlag = true;
					eventName = "A snake bite." 
							+ "\n Someone was bitten by a snake."
							+ "\n The health of the party deteriorated.";
					return;
				}                        
			}
			break;
		case 8:
			if (loseTrail()) {
				if(randomValue <= 2){
					wagon.setFoodAmt(-10);  
					eventFlag = true;
					timer.stop();
					eventName = "You lose trail" 
							+ "\n You lose 10 pound of food";                        
					return;
				}                           
			}
			break;
		case 9:
			if (wrongTrail()) {
				if(randomValue <= 1){
					wagon.setFoodAmt(-20);
					eventFlag = true;
					timer.stop();
					eventName = "You take a wrong trail" 
							+ "\n You lose 20 pound of food";                    	
					return;
				}                        
			}
			break;
		case 10:
			if (findingFruit()) {
				if(randomValue <= 2){
					wagon.setFoodAmt(30);  
					eventFlag = true;
					timer.stop();
					eventName = "Find wild fruits" 
							+ "\n You are Lucky. You find wild fruits!"
							+ "\n You got 30 pounds of food.";  
					return;
				}                        
			}
			break;
		case 11:
			if (wagonFire()) {
				if(randomValue <= 2){
					wagon.setFoodAmt(-30);
					eventFlag = true;
					timer.stop();
					eventName = "Fire in the wagon" 
							+ "\n Unfortunately, the wagon caught fire."
							+ "\n You lose 30 pounds of food.";
					return;
				}                        
			}
			break;
		case 12:
			if (lostMember()) {
				if(randomValue <= 2){
					eventName = "A member is dead." 
							+ "\n ";
					return;
				}                        
			}
			break;
		case 13:
			if (findingWagon()) {
				if(randomValue <= 2){
					wagon.setFoodAmt(30);
					eventFlag = true;
					timer.stop();
					eventName = "Finding an abandoned wagon:" 
							+ "\n Fortunately, you find an abandoned wagon."
							+ "\n You got 30 pounds of food.";
					return;
				}                        
			}
			break;
		case 14:
			if (illness()) {
				// example health
				int health = 0;
				if(health >= 70) {
					if(randomValue <= 20) {
						eventName = "A member's health is good." 
								+ "\n ";
						return;
					}
					else if(health <= 69 ){
						if(randomValue <= 2) {
							eventName = "A member's health is bad." 
									+ "\n ";
							return;         		
						}
					}
				}                              
			}
			break;    

		}
	}


	/*
	 * A Boolean function to determine whether indianFindFood occured or not
	 * @return - Returns true, if you are completely out of food
	 * */
	private boolean indianFindFood() {
		if(wagon.getFoodNum() <= 0) {
			return true;    		
		}
		else{
			return false;
		}        
	}

	/*
	 * A Boolean function to determine whether thunderstorm occured or not
	 * @return - Returns true.
	 * */
	private boolean thunderstorm() {
		return true;
	}

	/*
	 * A Boolean function to determine whether blizzard occured or not
	 * @return - Returns true, if weather is cold or very cold
	 * */
	private boolean blizzard() {
		if(weather.getWeather() == "Cold") {
			return true;
		}
		else if(weather.getWeather() == "Very Cold") {
			return true;
		}
		else {
			return false;
		}        
	}

	/*
	 * A Boolean function to determine whether heavyFog occured or not
	 * @return - Returns true, if location is after FortHall
	 * */
	private boolean heavyFog() {
		if(locCounter > 10) {
			return true;
		}
		else {
			return false;
		}
	}

	/*
	 * A Boolean function to determine whether hailStorm occured or not
	 * @return - Returns true, if location is before FortHall
	 * */
	private boolean hailStorm() {
		if(locCounter <= 10) {
			return true;
		}
		else {
			return false;
		}
	}

	/*
	 * A Boolean function to determine whether ox is injured or dies or not.
	 * @return - returns true if you have more than a ox. Otherwise false.
	 */
	private boolean isOxInjured(){
		if(wagon.getOxen() > 0){
			return true;
		}
		else{
			return false;
		}
	}  

	/*
	 * A Boolean function to determine whether snakeBite occurred or not
	 * @return - Returns true.
	 * */
	private boolean isMemberInjured() {
		return true;
	}

	/*
	 * A Boolean function to determine whether snakeBite occurred or not
	 * @return - Returns true.
	 * */
	private boolean snakeBite() {
		return true;
	}

	/*
	 * A Boolean function to determine whether loseTrail occurred or not
	 * @return - Returns true.
	 * */
	private boolean loseTrail() {
		return true;
	}

	/*
	 * A Boolean function to determine whether wrongTrail occurred or not
	 * @return - Returns true.
	 * */
	private boolean wrongTrail() {
		return true;
	}   

	/*
	 * A Boolean function to determine whether findingFruit occurred or not
	 * @return - Returns true.
	 * */
	private boolean findingFruit() {
		return true;
	}

	/*
	 * A Boolean function to determine whether wagonFire occurred or not
	 * @return - Returns true.
	 * */
	private boolean wagonFire() {
		return true;
	}

	/*
	 * A Boolean function to determine whether lostMember occurred or not
	 * @return - Returns true.
	 * */
	private boolean lostMember() {
		return true;
	}

	/*
	 * A Boolean function to determine whether findingWagon occurred or not
	 * @return - Returns true.
	 * */
	private boolean findingWagon() {
		return true;
	}

	/*
	 * A Boolean function to determine whether findingWagon occurred or not
	 * @return - Returns true.
	 * */
	private boolean illness() {
		return true;
	}

	/*
	 * Text when the event occurs
	 * @param evt - an actionEvent used to determine when to execute.
	 * @param text - a JTextArea for the user input.
	 */
	public void eventtext(ActionEvent evt, JTextArea text)
	{			
		text.append("\n "
				+ "\n "
				+ eventName
				+ "\n Press 1 to restart");
	}

	/*
	 * Getter for the event occur
	 * @return the eventFlag
	 */
	public boolean getEvent() {		
		return eventFlag;
	}


}
