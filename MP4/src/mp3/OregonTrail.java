package mp3;

//Imports
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * The gui implementation of packing a wagon in an implementation of the game Oregon Trail.
 * @authors Griffin Broge, Elizabeth Burkholder, Yutaka Yamato, Victor Trujillo
 * @version 1.0.0
 * @date April 17th, 2024
 * @filename OregonTrail.java
 */
public class OregonTrail {

	private JFrame frmOregontrailv;
	private ImageIcon backgroundImage;
	private JLayeredPane layeredPane;
	private JLabel bgImage;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_7;

	// Initialize variables used for party member calculations & hunger
	int eatAmt = 1;
	int partyMembers = 5;

	// Initialize items before initialized into the wagon.
	Wagon wagon = new Wagon();
	Item appleVinegar = new Item("Apple Vinegar", 25, false);
	Item Bacon = new Item("Bacon", 400, true );
	Item Beans = new Item("Beans", 200, true );
	Item Coffee = new Item("Coffee", 80, true  );
	Item dApples = new Item("Dried Apples", 80, true );
	Item Flour = new Item("Flour", 500, true );
	Item Hardtack = new Item("Hardtack", 200, true );
	Item Lard = new Item("Lard", 200, true );
	Item Salt = new Item("Salt", 50, true );
	Item Sugar = new Item("Sugar", 40, true );
	Item Rice = new Item("Rice", 200, true );
	Item Water = new Item("Water", 100, false );
	Item Whiskey = new Item("Whiskey", 40, true );
	Item Bedroll = new Item("Bedroll", 15, false );
	Item bTools = new Item("Blacksmithing Tools", 200, false );
	Item Books = new Item("Books", 75, false );
	Item Medicine = new Item("Medicine", 10, false );
	Item Stove = new Item("Cast Iron Stove", 300, false );
	Item Chair = new Item("Chair", 20, false );
	Item Cookware = new Item("Cookware & Eating Utensils", 75, false );
	Item Clock = new Item("Granny's Clock", 15, false );
	Item gTools = new Item("Gun Making Tools", 200, false );
	Item Keepsakes = new Item("Keepsakes", 40, false );
	Item leadShot = new Item("Lead Shot", 25, false );
	Item Mirror = new Item("Mirror", 15, false );
	Item Gunpowder = new Item("Gunpowder", 80, false );
	Item Tent = new Item("Tent & Gear", 150, false );
	Item Tools = new Item("Tools", 50, false );
	Item Toys = new Item("Toys", 15, false );
	private JTextField inputField;

	Menu menu = new Menu();
	StoreMenu store = new StoreMenu();

	// Creating trader objects using the trading class.
	Trading trappers = new Trading(0);
	Trading natives = new Trading(1);
	Trading otherTravelers = new Trading(2);

	// Creates array of traders and random trader numbers.
	Trading[] traders = {trappers, natives, otherTravelers};
	Random randomNum = new Random();
	int randTrader;

	// Fort multiplier for trader class.
	double fortMultiplier = 1;

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
	

	// Creating the main timer
	private Timer timer;

	// Declaring the landmarks, landmark array, and location counter.
	
	Fort FortI = new Fort("Fort Independence",0);
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
	Landmarks[] Locations = { FortI , Kansas, BBlue, FortKea, Chimney, FortL, IRock, SPass, GRiver, FortB, SSprings, FortH, SRiver, FortBo,
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


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

		backgroundImage = new ImageIcon(this.getClass().getResource("/Images/mp3img2.JPG"));
	  	JPanel gamePanel = new JPanel();
		gamePanel.setBackground(new Color(0, 0, 0));
		gamePanel.setBounds(0, 0, 736, 556);
		frmOregontrailv.getContentPane().add(gamePanel);
		gamePanel.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 18));
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(0, 128, 0));
		textArea.setBounds(93, 25, 550, 335);
		gamePanel.add(textArea);
		textArea.setEditable(false);

		inputField = new JTextField();
		inputField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Resets user inputs.
				input = "";

				if(end == false && alive == true) //checks if user is alive or dead.
				{
					input = inputField.getText();

					// River or Fort boolean checks
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
					supplyFlag = menu.supplyMenu(textArea, inputField, input, wagon, weather);
					input = "";
				}

				// If the pace flag is true, call the pace menu.
				if(paceFlag == true) {
					paceFlag =  menu.paceMenu(textArea, inputField, input, wagon, weather);
					input = "";
				}

				// If the rations flag is true, call the rations menu.
				if(ratFlag == true) {
					ratFlag = menu.rationsMenu(textArea, inputField, input, wagon, weather);
					input = "";
				}

				// If the travel flag is true, call the travel menu.
				if(travelFlag == true) {
					travelFlag = menu.travelMenu(textArea, inputField, input, timer, wagon, weather);
				}

				// If you reach a fort, show the fort menu.
				if(fortFlag == true) {
					menu.fortMenu(textArea, Locations[locCounter].getName(), wagon, weather);
					menuFlag = true;
				}
				
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
					wagon.calcTotalBill(10, Integer.parseInt(input));
					wagon.calcMoney(10, Integer.parseInt(input));
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
					wagon.calcTotalBill(.20, Integer.parseInt(input));
					wagon.calcMoney(.20, Integer.parseInt(input));
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
					wagon.calcTotalBill(10, Integer.parseInt(input));
					wagon.calcMoney(10, Integer.parseInt(input));
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
					wagon.calcTotalBill(20, Integer.parseInt(input));
					wagon.calcMoney(20, Integer.parseInt(input));
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
					wagon.calcTotalBill(10, Integer.parseInt(input));
					wagon.calcMoney(10, Integer.parseInt(input));
					wheelFlag = false;
					sparePartsFlag = true;
					inputField.setText(null);
					textArea.setText(null);
					storeFlag = true;
					store.sparePartsBase(textArea, 10, 10, 10);
				}
				
				else if(axelFlag == true){
					wagon.setAxelNum(Integer.parseInt(input));
					wagon.calcTotalBill(10, Integer.parseInt(input));
					wagon.calcMoney(10, Integer.parseInt(input));
					axelFlag = false;
					sparePartsFlag = true;
					inputField.setText(null);
					textArea.setText(null);
					storeFlag = true;
					store.sparePartsBase(textArea, 10, 10, 10);
				}
				
				else if(tongueFlag == true) {
					wagon.setTongueNum(Integer.parseInt(input));
					wagon.calcTotalBill(10, Integer.parseInt(input));
					wagon.calcMoney(10, Integer.parseInt(input));
					tongueFlag = false;
					sparePartsFlag = true;
					inputField.setText(null);
					textArea.setText(null);
					storeFlag = true;
					store.sparePartsBase(textArea, 10, 10, 10);
				}
				
				else if (sparePartsFlag == true) {
					if(Integer.parseInt(input) == 1) {
						store.sparePartsMenu(textArea, inputField, input, wagon);
						storeFlag = false;
						wheelFlag = true;
					}

					if(Integer.parseInt(input) == 2) {
						store.sparePartsMenu(textArea, inputField, input, wagon);
						storeFlag = false;
						axelFlag = true;
					}

					if(Integer.parseInt(input) == 3) {
						store.sparePartsMenu(textArea, inputField, input, wagon);
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
					storeFlag = store.storeMenu(textArea, inputField, input, wagon);
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
					randTrader = randomNum.nextInt(3);
					tradeFlag = traders[randTrader].tradeMenu(textArea, inputField, input, wagon, traders[randTrader].getrandOptNum2(), traders[randTrader].gettradeAmt2());
					input = "";
				}

				// If the menu flag is false, then display the base Menu (default)
				if(menuFlag == false && fortFlag == false) {
					menu.baseMenu(textArea, wagon, weather);
				}

				// If the menu flag is false and the user is at a river or fort, calculates and shows the corresponding screen.
				if(menuFlag == false || fortFlag == true && storeFlag == false || riverFlag == true ) {
					switch(input) {

					// Travel
					case "1":
					{
						if(fortFlag == true ) {
							fortFlag = false;
							locCounter++;
							fortMultiplier = fortMultiplier + .25;
						}
						
						if(naturalLFlag == true) {
							naturalLFlag = false;
							locCounter++;
						}


						if(riverFlag == true) {
							River temp = (River) Locations[locCounter];
							if(rivSubMenuFlag == false) {
								menu.riverInfoMenu(textArea, temp.getRiverWidth(), temp.getRiverDepth(), temp.getRiverSpeed());
								rivSubMenuFlag = true;
								riverFlag = false;
							}

							else {
								menu.riverChoices(textArea, temp.getRiverWidth(), temp.getRiverDepth(),wagon, weather);
							}
						}
						
						else {
							inputField.setText(null);
							textArea.setText(null);
							menuFlag = true;
							travelFlag = true;
							menu.travelling(textArea, wagon.getFoodNum(),wagon.getLocation(),wagon.getNextLocation(Locations[locCounter].getLocation()));
							timer = new javax.swing.Timer(100, new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									wagon.travel(evt, textArea, wagon.getFoodNum(), Locations[locCounter].getLocation());
									RandomEvent randomEvent = new RandomEvent();
									randomEvent.travelDay(timer);
									//eventFlag = false;
									System.out.println("event: "+ randomEvent.getEvent());
									if(randomEvent.getEvent() == true) {
										randomEvent.eventtext(evt, textArea);
									}
									flagCheck =	menu.landmarkCheck(evt, textArea, timer,Locations[locCounter].getLocation(), wagon.getLocation(),Locations[locCounter].getName(),Locations[locCounter].getTag(), locCounter, wagon, weather );
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
						menu.checkSupplies(textArea, wagon);
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
						inputField.setText(null);
						textArea.setText(null);
						menuFlag = true;
						storeFlag = true;
						store.baseStoreMenu(textArea, wagon);
						break;
					}

					// Trade
					case "6":{
						inputField.setText(null);
						textArea.setText(null);
						menuFlag = true;
						tradeFlag = true;
						traders[randTrader].initiateTrade(textArea, traders[randTrader], fortMultiplier, wagon);
						break;
					}
					}

					//Clears text field
					System.out.println(menuFlag);
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
					System.out.println(currentZone);
					System.out.println("______________");
					
				}
				inputField.setText("");
			}
			
		});

		inputField.setFont(new Font("Monospaced", Font.BOLD, 18));
		inputField.setBackground(new Color(0, 128, 0));
		inputField.setBounds(93, 399, 550, 40);
		gamePanel.add(inputField);
		inputField.setColumns(10);
		gamePanel.setVisible(false);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 736, 556);
		frmOregontrailv.getContentPane().add(layeredPane);

		JButton btnTravelTest = new JButton("Travel Test");
		btnTravelTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.setVisible(false);
				gamePanel.setVisible(true);

				wagon.clearWagon();
				wagon.addItem(Bacon);
				wagon.addItem(Beans);
				wagon.addItem(Coffee);
				wagon.addItem(dApples);
				wagon.addItem(Flour);
				wagon.addItem(Hardtack);
				wagon.addItem(Lard);
				wagon.addItem(Salt);
				wagon.addItem(Sugar);
				wagon.addItem(Rice);
				wagon.addItem(Whiskey);
				wagon.addItem(Water);
				wagon.addItem(Medicine);
				wagon.addItem(Bedroll);
				wagon.addItem(Tent);
				wagon.addItem(Tools);
				wagon.addItem(Chair);
				wagon.getFoodAmt();

				menu.introMenu(textArea);


			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("Name 1:");
		lblNewLabel_4.setBounds(90, 234, 52, 21);
		layeredPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name 1:");
		lblNewLabel_5.setBounds(90, 263, 52, 21);
		layeredPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Name 1:");
		lblNewLabel_2.setBounds(90, 205, 52, 21);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblName = new JLabel("Name 2:");
		lblName.setBounds(90, 176, 52, 21);
		layeredPane.add(lblName);
		
		JLabel lblPartyMemberNames = new JLabel("Party Member Names");
		lblPartyMemberNames.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPartyMemberNames.setBounds(94, 91, 154, 42);
		layeredPane.add(lblPartyMemberNames);
		
		JLabel lblNewLabel = new JLabel("Name 1:");
		lblNewLabel.setBounds(90, 144, 52, 21);
		layeredPane.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(152, 263, 96, 19);
		layeredPane.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(152, 234, 96, 19);
		layeredPane.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 205, 96, 19);
		layeredPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 176, 96, 19);
		layeredPane.add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(152, 145, 96, 19);
		layeredPane.add(textField);
		textField.setColumns(10);
		btnTravelTest.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnTravelTest.setBounds(282, 398, 85, 21);
		layeredPane.add(btnTravelTest);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBackground(new Color(255, 128, 0));
		lblNewLabel_7.setBounds(18, 24, 700, 522);
		layeredPane.add(lblNewLabel_7);
		lblNewLabel_7.setOpaque(true);

		bgImage = new JLabel("");
		bgImage.setBounds(0, 0, 750, 563);
		layeredPane.add(bgImage);

		bgImage.setIcon(backgroundImage);

		layeredPane.moveToBack(bgImage);		
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmOregontrailv = new JFrame();
		frmOregontrailv.setTitle("OregonTrailV1");


		frmOregontrailv.setBounds(100, 100, 750, 593);
		frmOregontrailv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOregontrailv.getContentPane().setLayout(null);
	}
	
	public String zoneCheck(Wagon wagon) {
		
		
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
}
