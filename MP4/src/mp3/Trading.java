package mp3;

import java.util.Random;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This class creates the trade function for the Oregon Trail game, along with calculating the various trading circumstances/values.
 * 
 * @author Elizabeth Burkholder
 * @version 1.0
 * @date 4/17/2024
 * @filename Trading.java
 */

public class Trading extends Menu{
	protected String name;
	String names[] = {"trappers" , "natives" , "other travelers"};
	String tradeOpts[] = {"oxen", "boxes of bullets", "sets of clothes", "pounds of food", "wagon wheels", "wagon tongues", "wagon axels"};
	int tradeAmt1 = 0, tradeAmt2 = 0, randOpt1 = getRandomOpt(), randOpt2 = getRandomOpt(), currentWagNum;

	/*
	 * Constructs an object of type Trading using an indexed number to determine 
	 * what type of trader the player is interacting with.
	 * @param idx - An integer number used to assign the object an index with corresponding attributes.
	 */
	public Trading(int idx) {	
		name = this.names[idx];
	}

	/*
	 * Displays the trade text to the player through a JTextArea and calculates the multiplier based on distance from Oregon.
	 * @param text - the main JTextArea used to communicate with the player.
	 * @param trader - An object of type Trading, used to determine who the player is trading with.
	 * @param multiplier - An integer value which determines how expensive the trade is (based on the wagon's distance).
	 * @param wagon - an object of type Wagon that contains inventory.
	 */
	public void initiateTrade(JTextArea text, Trading trader, int multiplier, Wagon wagon) {
		randOpt1 = getRandomOpt();
		randOpt2 = getRandomOpt();
		tradeAmt1 = getTradeAmount(tradeAmt1, randOpt1);
		tradeAmt2 = getTradeAmount(tradeAmt2, randOpt2);
		text.setText(" Oxen: " + wagon.numOxen + "\n Boxes of Bullets: " + (wagon.ammunitionAmt/20) + "\n Sets of Clothing: " + wagon.clothSetNum + "\n Food: " + wagon.foodAmt 
				+ "\n Wagon Wheels: " + wagon.wheelNum + "\n Wagon Tongues: " + wagon.tongueNum + "\n Wagon Axels: " + wagon.axelNum + "\n\n The " + trader.name + " would like to trade\n " + (multiplier *tradeAmt1) + " " + tradeOpts[randOpt1] + " for " + (multiplier * tradeAmt2) 
				+ " " + tradeOpts[randOpt2] + ".\n\n Would you like to trade? (yes or no)\n");
	}

	/*
	 * A Boolean function to determine whether the player input == "yes", "no", or something else. Updates wagon if "yes".
	 * @param input - A string representing the player's answer to prompt.
	 * @param in - A JTextField that ___.
	 * @param text - The main JTextArea for the game's communication with player.
	 * @param wagon - An object of type Wagon used to determine the player's inventory.
	 * @return - Returns false when the player answers "yes" or "no". Otherwise, returns true.*/
	public Boolean tradeMenu(JTextArea text, JTextField in, String input, Wagon wagon, int randOpt2, int tradeAmt2) {
		// Debugging Purposes - System.out.println(" trading option: " + randOpt2);
		currentWagNum = getCurrentWNum(randOpt2, wagon);
		
		//Debugging Purposes - System.out.println(" number of thing in wagon: " + currentWagNum);
		if(currentWagNum < tradeAmt2) {
			System.out.println("You cannot trade, not enough items.");
			return false;
		}
		else if (input.equals("yes") && currentWagNum >= tradeAmt2) {
			System.out.println("item added.");
			return false;
		}
		else if (input.equals("no")){
			text.setText(" You said no.");
			return false;
		}
		else return true;
	}

	/*
	 * Gets a random object name and a random value using the object name using a switch statement.
	 * @param tradePrice - a temporary integer value to store the final price of the traded value.
	 * @param randOpt - an integer value which determines which object is being traded to help determine trade prices.
	 * @return tradePrice - an integer value describing the amount of the corresponding object will be traded.
	 */
	public int getTradeAmount(int tradePrice, int randOpt){
		//Calculates the range for an object's price without accounting for multipliers.
		switch (randOpt) {
		case 0: 
			tradePrice = (int)(Math.random()*((5-1)+1))+1;
			System.out.println(tradeOpts[randOpt] + " " + tradePrice);
			return tradePrice;
			
		case 1: 
			tradePrice = (int)(Math.random()*((5-1)+1))+1;
			System.out.println(tradeOpts[randOpt] + " " + tradePrice);
			return tradePrice;

		case 2: 
			tradePrice = (int)(Math.random()*((5-1)+1))+1;
			System.out.println(tradeOpts[randOpt] + " " + tradePrice);
			return tradePrice;

		case 3: 
			tradePrice = (int)(Math.random()*((120-1)+1))+1;
			System.out.println(tradeOpts[randOpt] + " " + tradePrice);
			return tradePrice;

		case 4: 
			tradePrice = (int)(Math.random()*((5-1)+1))+1;
			System.out.println(tradeOpts[randOpt] + " " + tradePrice);
			return tradePrice;

		case 5: 
			tradePrice = (int)(Math.random()*((5-1)+1))+1;
			System.out.println(tradeOpts[randOpt] + " " + tradePrice);
			return tradePrice;

		case 6: 
			tradePrice = (int)(Math.random()*((5-1)+1))+1;
			System.out.println(tradeOpts[randOpt] + " " + tradePrice);
			return tradePrice;

		default:
<<<<<<< Updated upstream
			System.out.println("plplplplplplplplplplpl");
=======
			// Debugging Purposes - System.out.println("plplplplplplplplplplpl");
>>>>>>> Stashed changes
			tradePrice = 0;
			return tradePrice;
		}

}

	/*
	 * Gets a random number to use for the tradeOption array.
	 * @return num - an integer value between 0 and 7
	 */
	public int getRandomOpt() {
		Random randomOpt = new Random();
		int num = randomOpt.nextInt(7);
		return num;
	}
	
	/*
	 * Gets the current amount of the object in the user's wagon using an identifier integer.
	 * @param randOption - an integer representing the item to determine how much is within the wagon. 
	 * @param wagon - An object of type Wagon, containing the methods to obtain the inventory.
	 * @return wagon.___ - an integer value that varies depending on which object was counted.
	 */
	public int getCurrentWNum(int randOption, Wagon wagon) {
		switch(randOption) {
		case 0: return wagon.numOxen;
		case 1: return wagon.ammunitionAmt/20;
		case 2: return wagon.clothSetNum;
		case 3: return wagon.foodAmt;
		case 4: return wagon.wheelNum;
		case 5: return wagon.tongueNum;
		case 6: return wagon.axelNum;
		default: return 314159265;
		}
	}

	/*
	 * A value containing the random object the user is offering up.
	 * @return randOpt2 - an integer value containing the current value of the randOpt2.
	 */
	public int getrandOptNum2() {
		return randOpt2;
	}
	
	/*
	 * A value containing the amount of another item that the other party has requested.
	 * @return tradeAmt2 - an integer value determined by previous code within the Trading class.
	 */
	public int gettradeAmt2() {
		return tradeAmt2;
	}

}