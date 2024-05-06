package mp3;

//Imports
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 * The gui implementation of packing a wagon in an implementation of the game Oregon Trail.
 * @authors Griffin Broge, Elizabeth Burkholder, Yutaka Yamato, Victor Trujillo
 * @version 1.0.0
 * @date April 17th, 2024
 * @filename OregonTrail.java
 */
public class OregonTrail {

	private JFrame frmOregontrailv;
	private JLayeredPane layeredPane;
	private JLabel lblOverweight;

	// Initialize variables used for party member calculations & hunger.
	int eatAmt = 1;
	int partyMembers = 5;

	// Initialize items before initialized into the wagon.
	Wagon wagon = new Wagon();
	private JLabel travelOutput;
	private JTextField inputField;

	Menu menu = new Menu();
	StoreMenu store = new StoreMenu();
	Conversations convo = new Conversations();

	//Creates new Persons using the People class.
	People Person1 = new People();
	People Person2 = new People();
	People Person3 = new People();
	People Person4 = new People();
	People Person5 = new People();
	ArrayList<People> Party = new ArrayList<>();
	int nameCount = 0;

	//Creating the Health Value
	Health partyHealth = new Health();
	String healStr;

	// Creating trader objects using the trading class.
	Trading trappers = new Trading(0);
	Trading natives = new Trading(1);
	Trading otherTravelers = new Trading(2);

	// Creates array of traders and random trader numbers.
	Trading[] traders = {trappers, natives, otherTravelers};
	Random randomNum = new Random();
	int randTrader;	

	// Fort multiplier for trader class.
	int fortMultiplier = 1;

	// Creates user input and flag.
	String input = "";
	int inputInt;
	String flagCheck = "";


	// Boolean values for flags.
	Boolean alive = true;
	Boolean end = false;
	Boolean menuFlag = false;
	Boolean supplyFlag = false;
	Boolean paceFlag = false;
	Boolean ratFlag = false;
	Boolean travelFlag = false;
	Boolean fortFlag = true;
	Boolean riverFlag = false;
	Boolean rivSubMenuFlag = false;
	Boolean naturalLFlag = false;
	Boolean storeFlag = false;
	Boolean oxenFlag = false;
	Boolean clothFlag = false;
	Boolean ammunitionFlag = false;
	Boolean sparePartsFlag = false;
	Boolean foodFlag = false;
	Boolean tradeFlag = false;
	Boolean wheelFlag = false;
	Boolean axelFlag = false;
	Boolean tongueFlag = false;
	Boolean rivResults = false;
	Boolean eventFlag = false;
	Boolean diaryFlag = false;
	Boolean convoFlag = false;

	// Creating the main timer.
	private Timer timer;

	// creates the initial prices for items.
	int oxenPrice = 40 * fortMultiplier;
	double foodPrice = .20 * fortMultiplier;
	int clothPrice = 10 * fortMultiplier;
	int ammoPrice = 2 * fortMultiplier;
	int wheelPrice = 10 * fortMultiplier;
	int axelPrice = 10 * fortMultiplier;
	int tonguePrice = 10 * fortMultiplier;

	// Declaring the landmarks, landmark array, and location counter.
	Fort FortI = new Fort("Fort Independence", 0);
	River Kansas = new River("Kansas River Crossing", 200);
	River BBlue = new River("Big Blue River Crossing", 400);
	Fort FortKea = new Fort("Fort Kearny", 600);
	NaturalLandmark Chimney = new NaturalLandmark("Chimney Rock", 800);
	Fort FortL = new Fort("Fort Laramie", 1000);
	NaturalLandmark IRock = new NaturalLandmark("Independence Rock", 1200);
	NaturalLandmark SPass = new NaturalLandmark("South Pass", 1400);
	River GRiver = new River("Green River Crossing", 1600);
	Fort FortB = new Fort("Fort Bridger", 1800);
	NaturalLandmark SSprings = new NaturalLandmark("Soda Springs", 2000);
	Fort FortH = new Fort("Fort Hall", 2200);
	River SRiver = new River("Snake River Crossing", 2400);
	Fort FortBo = new Fort("Fort Boise", 2600);
	NaturalLandmark BMountain = new NaturalLandmark("Blue Mountains", 2800);
	Fort FortWW = new Fort("Fort Walla Walla", 3000);
	NaturalLandmark Dalles = new NaturalLandmark("The Dalles", 2800);
	NaturalLandmark Oregon = new NaturalLandmark("Willamette Valley, Oregon", 3000);
	Landmarks[] Locations = {FortI, Kansas, BBlue, FortKea, Chimney, FortL, IRock, SPass, GRiver, FortB, SSprings, FortH, SRiver, FortBo,
			BMountain, FortWW, Dalles, Oregon};
	int locCounter = 0;

	final String Zone1 = "Zone 1";
	final String Zone2 = "Zone 2";
	final String Zone3 = "Zone 3";
	final String Zone4 = "Zone 4";
	final String Zone5 = "Zone 5";
	final String Zone6 = "Zone 6";
	String currentZone = Zone1;

	Weather weather = new Weather();
	//Initializes all Labels and 
	private JTextField numOxenTF;
	private JLabel lblNewLabel_62;
	private JLabel lblNewLabel_63;
	private JTextField foodTF;
	private JLabel lblNewLabel_64;
	private JTextField clothTF;
	private JLabel lblNewLabel_65;
	private JTextField ammoTF;
	private JLabel lblNewLabel_69;
	private JLabel totalBillLB;
	private JLabel lblNewLabel_71;
	private JLabel amountLeftLB;
	private JComboBox comboBox;
	private JLabel lblNewLabel_66;
	private JTextField sparePartsTF;
	private JLabel lblNewLabel_68;
	private JLabel lblNewLabel_70;
	private JLabel lblNewLabel_72;
	private JLabel lblNewLabel_73;
	private JLabel lblNewLabel_74;
	private JLabel lblNewLabel_75;
	private JLabel lblNewLabel_76;
	private JLabel lblNewLabel_77;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField member1TF;
	private JTextField member2TF;
	private JTextField member3TF;
	private JTextField member4TF;
	private JTextField member5TF;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OregonTrail window = new OregonTrail();
					window.frmOregontrailv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OregonTrail() {
		initialize();

		// Creates the panel where the game is played
		JPanel gamePanel = new JPanel();
		gamePanel.setBackground(new Color(0, 0, 0));
		gamePanel.setBounds(0, 0, 736, 556);
		frmOregontrailv.getContentPane().add(gamePanel);
		gamePanel.setLayout(null);


		JTextArea textArea = new JTextArea();
		textArea.setBounds(93, 55, 550, 390);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 18));
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(0, 128, 0));
		gamePanel.add(textArea);
		textArea.setEditable(false);


		inputField = new JTextField();
		inputField.setBounds(93, 470, 550, 40);
		inputField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Resets user inputs.
				input = "";

				if(end == false && alive == true) //checks if user is alive or dead.
				{
					input = inputField.getText();

					// River, Fort, and Natural Landmark boolean checks
					if(flagCheck.equals("Fort")) {
						fortFlag = true;
						menuFlag = true;
						travelFlag = false;
						flagCheck = "";
					}

					if(flagCheck.equals("River")) {
						riverFlag = true;
						menuFlag = true;
						travelFlag = false;
						flagCheck = "";
					}

					if(flagCheck.equals("Natural")) {
						naturalLFlag = true;
						menuFlag = true;
						travelFlag = false;
						flagCheck = "";
					}
				}

				// Calculates the food and pace of the wagon
				wagon.calcFood();
				wagon.calcPace();

				// If the supply flag is true, call the supply menu.
				if(supplyFlag == true) {
					supplyFlag = menu.supplyMenu(textArea, inputField, input, wagon, weather, partyHealth);
					input = "";
				}
				
				if(convoFlag == true) {
					convoFlag = false;
					input = "";
				}
				
				if(diaryFlag == true) {
					diaryFlag = false;
					input = "";
				}

				// If the pace flag is true, call the pace menu.
				if(paceFlag == true) {
					paceFlag =  menu.paceMenu(textArea, inputField, input, wagon, weather, partyHealth);
					input = "";
				}

				// If the rations flag is true, call the rations menu.
				if(ratFlag == true) {
					ratFlag = menu.rationsMenu(textArea, inputField, input, wagon, weather, partyHealth);
					input = "";
				}

				// If the travel flag is true, call the travel menu.
				if(travelFlag == true) {
					travelFlag = menu.travelMenu(textArea, inputField, input, timer, wagon, weather, partyHealth);
				}

				// If you reach a fort, show the fort menu.
				if(fortFlag == true) {
					menu.fortMenu(textArea, Locations[locCounter].getName(), wagon, weather, partyHealth);
					menuFlag = true;
				}


				// If in river results set menu flag to false to avoid bringing up base menu
				if(rivResults ==  true) {
					menuFlag = false;
				}

				// If you reach a river, show the river menu.
				if(rivSubMenuFlag == true) {
					menuFlag = true;
					River temp = (River) Locations[locCounter];
					menu.riverChoices(textArea, temp.getRiverWidth(), temp.getRiverDepth(), wagon, weather);
					rivSubMenuFlag = menu.riverActions(textArea, inputField, input, temp.getRiverDepth());

					if(rivSubMenuFlag == false){
						rivResults = true;
						locCounter++;
					}
				}

				// If the oxen flag is true, calculates total bill after user buys oxen.
				if(oxenFlag == true) {
					wagon.setOxen(Integer.parseInt(input));
					wagon.calcTotalBill(oxenPrice, Integer.parseInt(input));
					wagon.calcMoney(oxenPrice, Integer.parseInt(input));
					oxenFlag = false;
					storeFlag = true;
					inputField.setText(null);
					textArea.setText(null);	
					menuFlag = true;
					storeFlag = true;
					store.baseStoreMenu(textArea, wagon); 
				}
				// If the food flag is true, calculates total bill after user buys food.
				else if(foodFlag == true) {
					wagon.setFoodAmt(Integer.parseInt(input));
					wagon.calcTotalBill(foodPrice, Integer.parseInt(input));
					wagon.calcMoney(foodPrice, Integer.parseInt(input));
					foodFlag = false;
					storeFlag = true;
					inputField.setText(null);
					textArea.setText(null);
					menuFlag = true;
					storeFlag = true;
					store.baseStoreMenu(textArea, wagon);	 
				}

				// If the cloth flag is true, calculates total bill after user buys sets of clothing.
				else if(clothFlag == true) {
					wagon.setClothSet(Integer.parseInt(input));
					wagon.calcTotalBill(clothPrice, Integer.parseInt(input));
					wagon.calcMoney(clothPrice, Integer.parseInt(input));
					clothFlag = false;
					storeFlag = true;
					inputField.setText(null);
					textArea.setText(null);
					menuFlag = true;
					storeFlag = true;
					store.baseStoreMenu(textArea, wagon);	 
				}

				// If the ammunition flag is true, calculates total bill after user buys ammunition.
				else if (ammunitionFlag == true) {
					wagon.setAmmo(Integer.parseInt(input));
					wagon.calcTotalBill(ammoPrice, Integer.parseInt(input));
					wagon.calcMoney(ammoPrice, Integer.parseInt(input));
					ammunitionFlag = false;
					storeFlag = true;
					inputField.setText(null);
					textArea.setText(null);
					menuFlag = true;
					storeFlag = true;
					store.baseStoreMenu(textArea, wagon);
				}

				else if (wheelFlag == true) {
					wagon.setWheelNum(Integer.parseInt(input));
					wagon.calcTotalBill(wheelPrice, Integer.parseInt(input));
					wagon.calcMoney(wheelPrice, Integer.parseInt(input));
					wheelFlag = false;
					sparePartsFlag = true;
					inputField.setText(null);
					textArea.setText(null);
					storeFlag = true;
					store.sparePartsBase(textArea, 10, 10, 10);
				}

				else if(axelFlag == true){
					wagon.setAxelNum(Integer.parseInt(input));
					wagon.calcTotalBill(axelPrice, Integer.parseInt(input));
					wagon.calcMoney(axelPrice, Integer.parseInt(input));
					axelFlag = false;
					sparePartsFlag = true;
					inputField.setText(null);
					textArea.setText(null);
					storeFlag = true;
					store.sparePartsBase(textArea, 10, 10, 10);
				}

				else if(tongueFlag == true) {
					wagon.setTongueNum(Integer.parseInt(input));
					wagon.calcTotalBill(tonguePrice, Integer.parseInt(input));
					wagon.calcMoney(tonguePrice, Integer.parseInt(input));
					tongueFlag = false;
					sparePartsFlag = true;
					inputField.setText(null);
					textArea.setText(null);
					storeFlag = true;
					store.sparePartsBase(textArea, 10, 10, 10);
				}

				else if (sparePartsFlag == true) {
					if(Integer.parseInt(input) == 1) {
						store.sparePartsMenu(textArea, inputField, input, wagon, fortMultiplier);
						storeFlag = false;
						wheelFlag = true;
					}

					if(Integer.parseInt(input) == 2) {
						store.sparePartsMenu(textArea, inputField, input, wagon,fortMultiplier);
						storeFlag = false;
						axelFlag = true;
					}

					if(Integer.parseInt(input) == 3) {
						store.sparePartsMenu(textArea, inputField, input, wagon, fortMultiplier);
						storeFlag = false;
						tongueFlag = true;
					}
					if(Integer.parseInt(input) == 4) {
						sparePartsFlag = false;
						storeFlag = true;
						store.baseStoreMenu(textArea, wagon);
						inputField.setText(null);
					}


					sparePartsFlag = false;
					inputField.setText(null);
				}


				// If the store flag is true, asks user which sub-menu to pull.
				else if(storeFlag == true) 
				{
					storeFlag = store.storeMenu(textArea, inputField, input, wagon, fortMultiplier);
					if(Integer.parseInt(input) == 1) {
						oxenFlag = true;
					}

					if(Integer.parseInt(input) == 2) {
						foodFlag = true;
					}

					if(Integer.parseInt(input) == 3) {
						clothFlag = true;
					}
					if(Integer.parseInt(input) == 4) {
						ammunitionFlag = true;
					}
					if(Integer.parseInt(input) == 5) {
						sparePartsFlag = true;
					}
					if(Integer.parseInt(input) == 6) {
						wagon.setTotalBill();
						storeFlag = false;
						menuFlag = false;
					}
					input = "";
					System.out.println(storeFlag);
				}

				// If the trade flag is raised, calls the trading menu. 
				if (tradeFlag == true) {
					tradeFlag = traders[randTrader].tradeMenu(textArea, inputField, input, wagon);
					input = "";
				}

				// If the menu flag is false, then display the base Menu (default)
				if(menuFlag == false && fortFlag == false) {
					menu.baseMenu(textArea, wagon, weather, partyHealth);
				}

				// If the menu flag is false and the user is at a river or fort, calculates and shows the corresponding screen.
				if(menuFlag == false || fortFlag == true && storeFlag == false || riverFlag == true ) {
					switch(input) {

					// Travel
					case "1":
					{
						// If in fort and select travel, player is not longer in fort. Have to increment counter and reset flag.
						if(fortFlag == true ) {
							fortFlag = false;
							locCounter++;
						}
						// If in natural landmark and select travel, player is not longer in natural landmark.
						// Have to increment counter and reset flag.
						if(naturalLFlag == true) {
							naturalLFlag = false;
							locCounter++;
						}

						// If in river have to display river conditions and move on to sub menu.
						if(riverFlag == true) {
							River temp = (River) Locations[locCounter];
							if(rivSubMenuFlag == false) {
								menu.riverInfoMenu(textArea, temp.getRiverWidth(), temp.getRiverDepth(), temp.getRiverSpeed());
								rivSubMenuFlag = true;
								riverFlag = false;
							}
							// After conditions is displayed, show options for traversing.
							else {
								menu.riverChoices(textArea, temp.getRiverWidth(), temp.getRiverDepth(),wagon, weather);
							}
						}
						// If in normal travel mode set travel flag, start random events and weather changes, and checking for landmarks.
						else {
							inputField.setText(null);
							textArea.setText(null);
							menuFlag = true;
							travelFlag = true;
							menu.travelling(textArea, wagon.getFoodNum(),wagon.getLocation(),wagon.getNextLocation(Locations[locCounter].getLocation()));
							timer = new javax.swing.Timer(100, new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									wagon.travel(evt, textArea, wagon.getFoodNum(), Locations[locCounter].getLocation());
									healStr = partyHealth.CheckHealth(Party, wagon, weather, frmOregontrailv, gamePanel);
									RandomEvent randomEvent = new RandomEvent();
									randomEvent.travelDay(timer);
									//eventFlag = false;
									System.out.println("event: "+ randomEvent.getEvent());
									if(randomEvent.getEvent() == true) {
										randomEvent.eventtext(evt, textArea);
									}
									flagCheck =	menu.landmarkCheck(evt, textArea, timer,Locations[locCounter].getLocation(), wagon.getLocation(),Locations[locCounter].getName(),Locations[locCounter].getTag(), locCounter, wagon, weather, partyHealth);
									currentZone = zoneCheck(wagon);
									weather.calcWeather(currentZone);
									if(!flagCheck.equals("0")) {
										travelFlag = false;
									}
								}
							});
							timer.start();
						}
						break;	
					}

					// Supplies
					case "2": 
					{ 
						inputField.setText(null);
						textArea.setText(null);
						menuFlag = true;
						supplyFlag = true;
						menu.checkSupplies(textArea,wagon);
						break;
					}

					// Pace
					case "3":
					{
						inputField.setText(null);
						textArea.setText(null);
						menuFlag = true;
						paceFlag = true;
						menu.changePace(textArea, wagon);
						break;
					}

					// Rations
					case "4":
					{
						inputField.setText(null);
						textArea.setText(null);
						ratFlag = true;
						menuFlag = true;
						menu.changeRations(textArea, wagon);
						break;
					}

					// Store
					case "5":
					{
						if(fortFlag == true)
						{
							inputField.setText(null);
							textArea.setText(null);
							menuFlag = true;
							storeFlag = true;
							store.baseStoreMenu(textArea, wagon);
						}
						break;

					}

					// Trade
					case "6":{
						inputField.setText(null);
						textArea.setText(null);
						randTrader = randomNum.nextInt(3);
						traders[randTrader].initiateTrade(textArea, traders[randTrader], fortMultiplier, wagon);
						menuFlag = true;
						tradeFlag = true;
						//traders[randTrader].initiateTrade(textArea, traders[randTrader], fortMultiplier, 2, 1, wagon.getClothSet(), wagon.getAmmo(), wagon);
						break;
					}
					case "7":{
						inputField.setText(null);
						textArea.setText(null);
						menuFlag = true;
						convoFlag = true;
						convo.showConversation(textArea, Locations[locCounter].getName());
					}
					case "8":{
						inputField.setText(null);
						textArea.setText(null);
						menuFlag = true;
						diaryFlag = true;
						convo.showDiary(textArea);
					}
					}

					inputField.setText(null);

					//Controls sub-menues for Store class
					if(storeFlag == false) {
						menuFlag = false;
					}

					//Relays all flags and their status to the console.
					System.out.println(wagon.getLocation());
					//System.out.println("loccounter: " + locCounter);
					//System.out.println("Oxen num: "+wagon.getOxen());
					//System.out.println("Cloth num: " +wagon.getClothSet());
					//System.out.println("Food num:" + wagon.getFoodNum());
					//System.out.println("Ammo num: " + wagon.getAmmo());
					//System.out.println("SupplyFlag:" + supplyFlag);
					//System.out.println("PaceFlag:" + paceFlag);
					//System.out.println("RatFlag:" + ratFlag);
					//System.out.println("travelFlag:" + travelFlag);
					//System.out.println("fortFlag:" + fortFlag);
					//System.out.println("riverFlag:" + riverFlag);
					//System.out.println("riverSubMenuFlag:" + rivSubMenuFlag);
					//System.out.println("tradeFlag:" + tradeFlag);
					//System.out.println("menuFlag:" + menuFlag);
					//System.out.println("storeFlag: " + storeFlag);
					//System.out.println(wagon.getWheelNum());
					//System.out.println(currentZone);
					System.out.println("______________");

				}
				inputField.setText("");
			}

		});

		inputField.setFont(new Font("Monospaced", Font.BOLD, 18));
		inputField.setBackground(new Color(0, 128, 0));
		gamePanel.add(inputField);
		inputField.setColumns(10);
		gamePanel.setVisible(false);


		// Creates panel for the initial store menu
		JPanel Store = new JPanel();
		Store.setBounds(0, 0, 736, 556);
		frmOregontrailv.getContentPane().add(Store);
		Store.setVisible(false);

		//sets the initial amount of oxen
		numOxenTF = new JTextField();
		numOxenTF.setBounds(33, 129, 96, 20);
		numOxenTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wagon.calcTotalBill(oxenPrice, Integer.parseInt(numOxenTF.getText()));
				wagon.calcMoney(oxenPrice, Integer.parseInt(numOxenTF.getText()));
				wagon.setOxen(Integer.parseInt(numOxenTF.getText()));
				totalBillLB.setText("$"+wagon.getTotalBill());
				amountLeftLB.setText("$"+ wagon.getMoney());
			}
		});
		Store.setLayout(null);
		Store.add(numOxenTF);
		numOxenTF.setColumns(10);

		JLabel lblNewLabel_61 = new JLabel("Number of Yoke:");
		lblNewLabel_61.setBounds(33, 64, 167, 14);
		Store.add(lblNewLabel_61);


		// Hides the store panel and makes the game panel visible, starting the game.
		JButton setButton = new JButton("Start Game");
		setButton.setEnabled(true);
		setButton.setBounds(117, 412, 250, 23);
		setButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wagon.setTotalBill();
				Store.setVisible(false);
				gamePanel.setVisible(true);
			}
		});
		Store.add(setButton);

		lblNewLabel_62 = new JLabel("Load your wagon");
		lblNewLabel_62.setBounds(184, 8, 507, 45);
		lblNewLabel_62.setFont(new Font("Tahoma", Font.BOLD, 20));
		Store.add(lblNewLabel_62);

		lblNewLabel_63 = new JLabel("Pounds of Food:");
		lblNewLabel_63.setBounds(33, 157, 134, 14);
		Store.add(lblNewLabel_63);

		// Sets the amount of food in the initial store.
		foodTF = new JTextField();
		foodTF.setBounds(33, 199, 96, 20);
		foodTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wagon.calcTotalBill(foodPrice, Integer.parseInt(foodTF.getText()));
				wagon.calcMoney(foodPrice, Integer.parseInt(foodTF.getText()));
				wagon.setFoodAmt(Integer.parseInt(foodTF.getText()));
				totalBillLB.setText("$"+wagon.getTotalBill());
				amountLeftLB.setText("$"+ wagon.getMoney());
			}
		});
		Store.add(foodTF);
		foodTF.setColumns(10);

		lblNewLabel_64 = new JLabel("Sets of Cloth:");
		lblNewLabel_64.setBounds(33, 230, 96, 14);
		Store.add(lblNewLabel_64);

		// Sets the amount of cloth in the initial store.
		clothTF = new JTextField();
		clothTF.setBounds(33, 268, 96, 20);
		clothTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wagon.calcTotalBill(clothPrice, Integer.parseInt(clothTF.getText()));
				wagon.calcMoney(clothPrice, Integer.parseInt(clothTF.getText()));
				wagon.setClothSet(Integer.parseInt(clothTF.getText()));
				totalBillLB.setText("$"+wagon.getTotalBill());
				amountLeftLB.setText("$"+ wagon.getMoney());
			}
		});
		Store.add(clothTF);
		clothTF.setColumns(10);

		lblNewLabel_65 = new JLabel("Boxes of Ammunition:");
		lblNewLabel_65.setBounds(253, 64, 154, 14);
		Store.add(lblNewLabel_65);

		// Sets the amount of ammo in the initial store.
		ammoTF = new JTextField();
		ammoTF.setBounds(253, 126, 96, 20);
		ammoTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wagon.calcTotalBill(ammoPrice, Integer.parseInt(ammoTF.getText()));
				wagon.calcMoney(ammoPrice, Integer.parseInt(ammoTF.getText()));
				wagon.setAmmo(Integer.parseInt(ammoTF.getText()));
				totalBillLB.setText("$"+wagon.getTotalBill());
				amountLeftLB.setText("$"+ wagon.getMoney());
			}
		});
		Store.add(ammoTF);
		ammoTF.setColumns(10);

		lblNewLabel_69 = new JLabel("Total Bill:");
		lblNewLabel_69.setBounds(33, 356, 71, 14);
		lblNewLabel_69.setFont(new Font("Tahoma", Font.BOLD, 11));
		Store.add(lblNewLabel_69);

		totalBillLB = new JLabel("0");
		totalBillLB.setBounds(46, 381, 83, 14);
		Store.add(totalBillLB);

		lblNewLabel_71 = new JLabel("Amount Left:");
		lblNewLabel_71.setBounds(124, 356, 76, 14);
		lblNewLabel_71.setFont(new Font("Tahoma", Font.BOLD, 11));
		Store.add(lblNewLabel_71);

		amountLeftLB = new JLabel("0");
		amountLeftLB.setBounds(134, 381, 71, 14);
		Store.add(amountLeftLB);

		comboBox = new JComboBox();
		comboBox.setBounds(253, 263, 134, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a Part", "Wheels", "Axles", "Tongues"}));
		Store.add(comboBox);

		lblNewLabel_66 = new JLabel("Spare Parts:");
		lblNewLabel_66.setBounds(253, 157, 94, 14);
		Store.add(lblNewLabel_66);

		// Sets the amount of spare parts in the initial store
		// depending the the user selection from the combo Box.
		sparePartsTF = new JTextField();
		sparePartsTF.setBounds(253, 296, 96, 20);
		sparePartsTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
				if(comboBox.getSelectedItem() == "Wheels") {
					setInitInventory(wheelPrice);
					wagon.setWheelNum(Integer.parseInt(sparePartsTF.getText()));
					sparePartsTF.setText(null);

				}
				if(comboBox.getSelectedItem() == "Axles") {
					setInitInventory(axelPrice);
					wagon.setAxelNum(Integer.parseInt(sparePartsTF.getText()));
					sparePartsTF.setText(null);
				}
				if(comboBox.getSelectedItem() == "Tongues") {
					setInitInventory(tonguePrice);
					wagon.setTongueNum(Integer.parseInt(sparePartsTF.getText()));
					sparePartsTF.setText(null);
				}
			}});
		Store.add(sparePartsTF);
		sparePartsTF.setColumns(10);

		JLabel lblNewLabel_67 = new JLabel("There is 2 oxen in a yoke.");
		lblNewLabel_67.setBounds(33, 72, 212, 45);
		Store.add(lblNewLabel_67);

		lblNewLabel_68 = new JLabel("Each yoke is $" + oxenPrice);
		lblNewLabel_68.setBounds(33, 104, 123, 14);
		Store.add(lblNewLabel_68);

		lblNewLabel_70 = new JLabel("Food is $"+ foodPrice + "0 per pound");
		lblNewLabel_70.setBounds(33, 171, 167, 14);
		Store.add(lblNewLabel_70);

		lblNewLabel_72 = new JLabel("Each set is $" + clothPrice + " each");
		lblNewLabel_72.setBounds(33, 243, 123, 14);
		Store.add(lblNewLabel_72);

		lblNewLabel_73 = new JLabel("Each box of ammo has 20 bullets");
		lblNewLabel_73.setBounds(253, 87, 271, 14);
		Store.add(lblNewLabel_73);

		lblNewLabel_74 = new JLabel("Each box is $"+ ammoPrice + " each");
		lblNewLabel_74.setBounds(253, 104, 145, 14);
		Store.add(lblNewLabel_74);

		lblNewLabel_75 = new JLabel("Wheels are $" + wheelPrice + " each");
		lblNewLabel_75.setBounds(253, 182, 145, 14);
		Store.add(lblNewLabel_75);

		lblNewLabel_76 = new JLabel("Axles are $" + axelPrice + " each");
		lblNewLabel_76.setBounds(253, 205, 113, 14);
		Store.add(lblNewLabel_76);

		lblNewLabel_77 = new JLabel("Tongues are $" + tonguePrice + " each");
		lblNewLabel_77.setBounds(253, 230, 129, 14);
		Store.add(lblNewLabel_77);

		//Creates Store Image for initial store screen
		ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Store.png"));
		Image newImage = icon.getImage().getScaledInstance(1200,  1800,  Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newImage);

		JLabel StoreImg = new JLabel("New label");
		StoreImg.setBounds(377, 82, 362, 562);
		StoreImg.setHorizontalAlignment(SwingConstants.CENTER);
		Store.add(StoreImg);
		StoreImg.setIcon(newIcon);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 736, 556);
		frmOregontrailv.getContentPane().add(layeredPane);

		// Hides the initial screen where party members are entered. 
		// Makes the store panel visible. 
		JButton btnTravelTest = new JButton("Go to Store");
		btnTravelTest.setEnabled(false);


		btnTravelTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.setVisible(false);
				gamePanel.setVisible(false);
				Store.setVisible(true);
				amountLeftLB.setText("$"+ wagon.getMoney());
				wagon.clearWagon();
				wagon.getFoodAmt();
				menu.introMenu(textArea);
			}
		});

		// The following "member" text fields set the names for the 
		// members of the party. 

		member5TF = new JTextField();
		member5TF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person5.setName(member5TF.getText());
				Party.add(Person5);
				nameCount++;
				System.out.println(nameCount);
				if(nameCount >= 5) {
					btnTravelTest.setEnabled(true);
				}
			}
		});

		member5TF.setBounds(160, 332, 96, 20);
		layeredPane.add(member5TF);
		member5TF.setColumns(10);

		member4TF = new JTextField();
		member4TF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person4.setName(member3TF.getText());
				Party.add(Person4);
				nameCount++;
				System.out.println(nameCount);
				if(nameCount >= 5) {
					btnTravelTest.setEnabled(true);
				}
			}
		});
		member4TF.setBounds(160, 279, 96, 20);
		layeredPane.add(member4TF);
		member4TF.setColumns(10);

		member3TF = new JTextField();
		member3TF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person3.setName(member3TF.getText());
				Party.add(Person3);
				nameCount++;
				System.out.println(nameCount);
				if(nameCount >= 5) {
					btnTravelTest.setEnabled(true);
				}
			}
		});
		member3TF.setBounds(160, 230, 96, 20);
		layeredPane.add(member3TF);
		member3TF.setColumns(10);

		member2TF = new JTextField();
		member2TF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person2.setName(member2TF.getText());
				Party.add(Person2);
				nameCount++;
				System.out.println(nameCount);
				if(nameCount >= 5) {
					btnTravelTest.setEnabled(true);
				}
			}
		});
		member2TF.setBounds(160, 168, 96, 20);
		layeredPane.add(member2TF);
		member2TF.setColumns(10);

		member1TF = new JTextField();
		member1TF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person1.setName(member1TF.getText());
				Party.add(Person1);
				nameCount++;
				System.out.println(nameCount);
				if(nameCount >= 5) {
					btnTravelTest.setEnabled(true);
				}

			}
		});
		member1TF.setBounds(160, 112, 96, 20);
		layeredPane.add(member1TF);
		member1TF.setColumns(10);


		lblNewLabel_6 = new JLabel("Party Member 5:");
		lblNewLabel_6.setBounds(61, 335, 103, 14);
		layeredPane.add(lblNewLabel_6);

		lblNewLabel_5 = new JLabel("Party Member 4:");
		lblNewLabel_5.setBounds(61, 282, 93, 14);
		layeredPane.add(lblNewLabel_5);

		lblNewLabel_4 = new JLabel("Party Member 3:");
		lblNewLabel_4.setBounds(61, 233, 93, 14);
		layeredPane.add(lblNewLabel_4);

		lblNewLabel_2 = new JLabel("Party Member 2:");
		lblNewLabel_2.setBounds(61, 171, 93, 14);
		layeredPane.add(lblNewLabel_2);

		lblNewLabel_1 = new JLabel("Party Member 1:");
		lblNewLabel_1.setBounds(61, 115, 93, 14);
		layeredPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Who's in your party?\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(178, 42, 316, 46);
		layeredPane.add(lblNewLabel);

		//
		btnTravelTest.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnTravelTest.setBounds(282, 398, 85, 21);
		layeredPane.add(btnTravelTest);

		travelOutput = new JLabel("");
		travelOutput.setFont(new Font("Times New Roman", Font.BOLD, 20));
		travelOutput.setBounds(282, 463, 85, 56);
		layeredPane.add(travelOutput);

		lblOverweight = new JLabel("");
		lblOverweight.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblOverweight.setBounds(30, 429, 349, 56);
		layeredPane.add(lblOverweight);

		//Creates Wagon Image for initial screen
		ImageIcon wagonIcon = new ImageIcon(getClass().getResource("/Images/Wagon.png"));
		Image newWagImage = wagonIcon.getImage().getScaledInstance(378,  433,  Image.SCALE_SMOOTH);
		ImageIcon newWagIcon = new ImageIcon(newWagImage);

		JLabel wagonImgLbl = new JLabel("New label");
		wagonImgLbl.setHorizontalAlignment(SwingConstants.CENTER);
		wagonImgLbl.setBounds(402, 47, 309, 353);
		layeredPane.add(wagonImgLbl);
		wagonImgLbl.setIcon(newWagIcon);


			}

	/*
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOregontrailv = new JFrame();
		frmOregontrailv.setTitle("OregonTrailV1");
		frmOregontrailv.setBounds(100, 100, 750, 593);
		frmOregontrailv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOregontrailv.getContentPane().setLayout(null);
	}

	/**
	 * Method to determine what zone the player is currently in. Used for Weather class to determine temp range and weather.
	 * @param wagon: The wagon object, used to determine current location
	 * @return returns the zone the player is currently in
	 */
	public String zoneCheck(Wagon wagon) {

		// If the player is in the range for the zone, then it will return said zone.
		// Zone ranges based on Ch 16 of "You have Died of Dysentery".
		if(wagon.getLocation() >= 600.0 && wagon.getLocation() < 1000.0) {
			return Zone2;
		}
		else if(wagon.getLocation() >= 1000.0 && wagon.getLocation() < 1200.0) {
			return Zone3;
		}
		else if(wagon.getLocation() >= 1200.0 && wagon.getLocation() < 2200.0) {
			return Zone4;
		}
		else if(wagon.getLocation() >= 2200.0 && wagon.getLocation() < 2800.0) {
			return Zone5;
		}
		else if(wagon.getLocation() >= 2800) {
			return Zone6;
		}
		else return Zone1;
	}


	/*
	 * Sets the inventory from the initial store screen and updates the money in the wagon according to the object bought.
	 * @param objPrice - an integer value representing the price of the object bought.
	 */
	private void setInitInventory(int objPrice) {
		wagon.calcTotalBill(objPrice, Integer.parseInt(sparePartsTF.getText()));
		wagon.calcMoney(objPrice, Integer.parseInt(sparePartsTF.getText()));
		totalBillLB.setText("$"+wagon.getTotalBill());
		amountLeftLB.setText("$"+ wagon.getMoney());
	}
}
