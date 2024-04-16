package mp3;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Store extends Menu {
	
	public Store(){
		
	}
	
	public void baseStoreMenu(JTextArea Text, int totalBill, int money) {
		Text.setText(" 1. Oxen" + "\n"
					+" 2. Food" + "\n"
					+" 3. Clothing" +"\n"
					+" 4. Ammunition" +"\n"
					+" 5. Spare Parts" +"\n"
					+" 6. Exit Store" + "\n"
					+" -----------------" +"\n"
					+" Total bill: " + totalBill +"\n"
					+"\n"
					+" Amount you have:" + money + "\n"
					+" What item would you like to buy?");
	}
	
	public Boolean storeMenu(JTextArea text, JTextField in, String input) {
		if(input.equals("6")) {
			baseMenu(text);
			return false;
			}
		if(input.equals("1")) {
			oxenMenu(text, 10);
			//setOxen(in.getText());		}
		if(input.equals("2")) {
			foodMenu(text, 20);
		}
		if(input.equals("3")) {
			clothMenu(text, 20);
		}
		if(input.equals("4")) {
			ammunitionMenu(text, 20);
		}
		if(input.equals("5")) {
			sparePartsMenu(text, 20, 20, 20);
		}
	}
		return true;
	}
	//public Boolean oxenSetMenu(JTextArea text, JTextField in, String input) {
		//if(input.equals("1")) {
			//oxenMenu(text, 10);
			//setOxen(in.getText());
		//}
		//return false;
	//}
	
	public void oxenMenu(JTextArea Text, int yokePrice) {
		Text.setText("There are two oxen in a Yoke." + "\n"
					+ "3 Yokes are recomended for the trip" + "\n"
					+ "It is $" + yokePrice + " a Yoke." + "\n"
					+ "How many Yoke do you want?");
	}
	
	public void foodMenu(JTextArea Text, int foodPrice) {
		Text.setText("It is recomend to bring 200 pounds for each person on your trip" + "\n"
					+"The price is $" +foodPrice+ " cents per pound" + "\n"
					+"How many pounds of food do you want?");
	}
	public void clothMenu(JTextArea Text, int clothPrice) {
		Text.setText("You will need warm cloth for the mountians." + "\n"
					+"Two sets of cloth is recomended per person."+ "\n"
					+"Each set is $" + clothPrice + "." + "\n"
					+"How many sets of cloth do you want?");
	}
	public void ammunitionMenu(JTextArea Text, int ammunitionPrice) {
		Text.setText("Boxes of ammunition have 20 bullets each" + "\n"
					+"Each box is $" + ammunitionPrice +"." + "\n"
					+"How many boxes do you want?");
	}
	public void sparePartsMenu(JTextArea Text, int wheelPrice, int axelPrice, int tonguePrice) {
		for(int i = 0; i < 3; i++) {
			if(i == 0) {
				Text.setText("wagon wheel  - $" + wheelPrice + " each" + "\n"
						+"wagon axel   - $" + axelPrice + " each" + "\n"
						+"wagon tongue - $" + tonguePrice + "each" + "\n"
						+"How many wagon wheels do you want?");
			}
			if(i == 1) {
				Text.setText("wagon wheel  - $" + wheelPrice + " each" + "\n"
						+"wagon axel   - $" + axelPrice + " each" + "\n"
						+"wagon tongue - $" + tonguePrice + "each" + "\n"
						+"How many wagon axels do you want?");
			}
			if(i == 2) {
				Text.setText("wagon wheel  - $" + wheelPrice + " each" + "\n"
						+"wagon axel   - $" + axelPrice + " each" + "\n"
						+"wagon tongue - $" + tonguePrice + "each" + "\n"
						+"How many wagon tongues do you want?");
			}
			
		}
	}

}
