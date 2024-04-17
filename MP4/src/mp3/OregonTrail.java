package mp3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 * 
 * @author Griffin Broge
 * @version 1.0.0
 * @date March 24th 2024
 * @filename PackWagon.java
 */
public class OregonTrail {

	private JFrame frmOregontrailv;
	private ImageIcon backgroundImage;
	private JLayeredPane layeredPane;
	private JLabel bgImage;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JLabel lblTotalWeight;
	private JLabel lblFoodSupply;
	private JLabel lblItem;
	private JLabel lblWeightinLbs;
	private JLabel lblDryGoodsAnd;
	private JLabel lblWeightinLbs_1;
	private JLabel lblItem_1;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JLabel lblNewLabel_34;
	private JLabel lblNewLabel_35;
	private JLabel lblNewLabel_36;
	private JLabel lblNewLabel_37;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_39;
	private JLabel lblNewLabel_40;
	private JLabel lblNewLabel_41;
	private JLabel lblNewLabel_42;
	private JLabel lblNewLabel_43;
	private JLabel lblNewLabel_44;
	private JLabel lblNewLabel_45;
	private JLabel lblNewLabel_46;
	private JLabel lblTent;
	private JLabel lblNewLabel_48;
	private JLabel lblNewLabel_49;
	private JLabel lblNewLabel_50;
	private JLabel lblNewLabel_51;
	private JLabel lblNewLabel_52;
	private JLabel lblNewLabel_53;
	private JLabel lblNewLabel_54;
	private JLabel lblNewLabel_55;
	private JLabel lblNewLabel_56;
	private JLabel lblNewLabel_57;
	private JLabel lblNewLabel_58;
	private JLabel lblNewLabel_59;
	private JLabel lblNewLabel_60;
	private JCheckBox chcbxBacon;
	private JCheckBox chckbxCoffee;
	private JCheckBox chckbxBeans;
	private JCheckBox chckbxLard;
	private JCheckBox chckbxHardtack;
	private JCheckBox chckbxFlour;
	private JCheckBox chckbxDriedApples;
	private JCheckBox chckbxWater;
	private JCheckBox chckbxRice;
	private JCheckBox chckbxSugar;
	private JCheckBox chckbxSalt;
	private JCheckBox chckbxWhiskey;
	private JCheckBox chckbxGunPwdr;
	private JCheckBox chckbxLeadShot;
	private JCheckBox chckbxMirror;
	private JCheckBox chckbxKeepsake;
	private JCheckBox chckbxGun;
	private JCheckBox chckbxChair;
	private JCheckBox chckbxClock;
	private JCheckBox chckbxCook;
	private JCheckBox chckbxStove;
	private JCheckBox chckbxMeds;
	private JCheckBox chckbxBooks;
	private JCheckBox chckbxBTools;
	private JCheckBox chckbxBedroll;
	private JCheckBox chckbxTentGear;
	private JCheckBox chckbxToys;
	private JCheckBox chckbxTools;
	private JLabel lblOverweight;
	private JSlider slider;
	private JLabel lblNewLabel_47;
	// Initialize variables used for calculations
	int eatAmt = 1;
	int partyMembers = 5;
	// Initialize items. Not in the wagon yet.
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
	private JLabel travelOutput;
	private JTextField inputField;
	
	Menu menu = new Menu();
	//Store store = new Store();
	String input = "";
	int inputInt;
	int flagCheck;
	
	Boolean alive = true;
	Boolean end = false;
	Boolean menuFlag = false;
	Boolean supplyFlag = false;
	Boolean paceFlag = false;
	Boolean ratFlag = false;
	Boolean travelFlag = false;
	Boolean fortFlag = false;
	Boolean riverFlag = false;
	Boolean rivSubMenuFlag = false;
	Boolean storeFlag = false;
	
	private Timer timer;

	Fort FortKea = new Fort("Fort Kearny", 200);
	River Kansas = new River("Kansas River Crossing", 400);
	Fort FortFu = new Fort("Fort Fub", 1000);
	
	Landmarks[] Locations = {FortKea, Kansas, FortFu};
	int locCounter = 0;


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
		textArea.setBounds(93, 54, 550, 314);
		gamePanel.add(textArea);
		textArea.setEditable(false);
		
		inputField = new JTextField();
		inputField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				input = "";
				if(end == false && alive == true) {
					
					
					if(flagCheck == 1) {
						fortFlag = true;
						menuFlag = true;
						travelFlag = false;
						flagCheck = 0;
					}
					
					if(flagCheck == 2) {
						riverFlag = true;
						menuFlag = true;
						travelFlag = false;
						flagCheck = 0;
					}
					
					wagon.calcFood();
					wagon.calcPace();
					input = inputField.getText();
					
					if(supplyFlag == true) {
						supplyFlag = menu.supplyMenu(textArea, inputField, input);
						input = "";
					//	supplyFlag = false;
					}
					
					 if(paceFlag == true) {
						paceFlag =  menu.paceMenu(textArea, inputField, input);
						 input = "";
					//	paceFlag = false;
					 }
					 
					 if(ratFlag == true) {
						 ratFlag = menu.rationsMenu(textArea, inputField, input);
						 input = "";
						//ratFlag = false;
					 }
					 
					 if(travelFlag == true) {
						travelFlag = menu.travelMenu(textArea, inputField, input, timer);
		
					 }
					 
					 if(fortFlag == true) {
						 menu.fortMenu(textArea, Locations[locCounter].getName());
					 }
					
					 if(rivSubMenuFlag == true) {
						 River temp = (River) Locations[locCounter];
						 menu.riverChoices(textArea, temp.getRiverWidth(), temp.getRiverDepth());
						 rivSubMenuFlag = menu.riverActions(textArea, inputField, input, temp.getRiverDepth());
						 
						 if(rivSubMenuFlag == false)
							 locCounter++;
					 }
					 if(storeFlag == true) {
					//	storeFlag = store.storeMenu(textArea, inputField, input);
						input = "";
					 }
					 
					
					if(menuFlag == false)
						menu.baseMenu(textArea);
					
					if(menuFlag == false || fortFlag == true || riverFlag == true ) {
					switch(input) {
					
					case "1":
					{
						
						if(fortFlag == true) {
							fortFlag = false;
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
								menu.riverChoices(textArea, temp.getRiverWidth(), temp.getRiverDepth());
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
								flagCheck =	menu.landmarkCheck(evt, textArea, timer,Locations[locCounter].getLocation(), wagon.getLocation(),Locations[locCounter].getName(),Locations[locCounter].getTag(), locCounter );
								if(flagCheck != 0) {
									travelFlag = false;
								}
								}
								});
							timer.start();
						}
							
							
					}
						break;	
					case "2": 
					{ 
						inputField.setText(null);
						textArea.setText(null);
						menuFlag = true;
						supplyFlag = true;
						menu.checkSupplies(textArea, wagon.getFoodNum(),wagon.getOxen(),wagon.getMoney());
					
							
						}
					
						break;
					case "3":
					{
						inputField.setText(null);
						textArea.setText(null);
						menuFlag = true;
						paceFlag = true;
						menu.changePace(textArea);
						
					}
						break;
					case "4":
					{
						inputField.setText(null);
						textArea.setText(null);
						ratFlag = true;
						menuFlag = true;
						menu.changeRations(textArea);
						
					}
						break;
						
					// Store Test
					case "5":
					{
						inputField.setText(null);
						textArea.setText(null);
						menuFlag = true;
						storeFlag = true;
						//store.baseStoreMenu(textArea, 0 , 800);
					}
						break;
					}
					}
					
				
				//	System.out.println("loc: " + Locations[locCounter].getLocation() + "  Tag: " + Locations[locCounter].getTag() + "  Name: " + Locations[locCounter].getName());
					inputField.setText(null);
					if(supplyFlag == false && paceFlag == false && ratFlag == false && travelFlag == false && rivSubMenuFlag == false && riverFlag == false && storeFlag == false)
						menuFlag = false;
			/*
				System.out.println("loccounter: " + locCounter);
				System.out.println("SupplyFlag:" + supplyFlag);
				System.out.println("PaceFlag:" + paceFlag);
				System.out.println("RatFlag:" + ratFlag);
				System.out.println("travelFlag:" + travelFlag);
				System.out.println("fortFlag:" + fortFlag);
				System.out.println("riverFlag:" + riverFlag);
				System.out.println("riverSubMenuFlag:" + rivSubMenuFlag);
				System.out.println("menuFlag:" + menuFlag);
				System.out.println("storeFlag: " + storeFlag);
				System.out.println("______________");
			*/
				
				}
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
		
		JButton btnMeager_1 = new JButton("Filling");
		btnMeager_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				eatAmt = 3;
			}
		});
		
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
		btnTravelTest.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnTravelTest.setBounds(282, 398, 85, 21);
		layeredPane.add(btnTravelTest);
		btnMeager_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnMeager_1.setBounds(185, 517, 75, 21);
		layeredPane.add(btnMeager_1);
		
		JButton btnMeager = new JButton("Meager");
		btnMeager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				eatAmt = 2;
			}
		});
		btnMeager.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnMeager.setBounds(105, 517, 75, 21);
		layeredPane.add(btnMeager);
		
		JButton btnBareBones = new JButton("Bare Bones");
		btnBareBones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				eatAmt = 1;
			}
		});
		slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(20);
		slider.setMinimum(12);
		slider.setBounds(507, 507, 200, 39);
		layeredPane.add(slider);
		
		int travelSpeed = slider.getValue();
		
		
		btnBareBones.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnBareBones.setBounds(25, 517, 75, 21);
		layeredPane.add(btnBareBones);
		
		travelOutput = new JLabel("");
		travelOutput.setFont(new Font("Times New Roman", Font.BOLD, 20));
		travelOutput.setBounds(282, 463, 85, 56);
		layeredPane.add(travelOutput);
		
		JButton btnNewButton = new JButton("Travel");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int foodPerDay = eatAmt * partyMembers;
				int daysToFinish = 2200 / travelSpeed;
				int foodTotal = wagon.getFoodAmt();
				
				if(foodPerDay * daysToFinish <= foodTotal) {
					
					travelOutput.setText("Success");
					
				}
				else travelOutput.setText("Failure");
				
				
			}
		});
		btnNewButton.setBounds(282, 517, 85, 21);
		layeredPane.add(btnNewButton);
		
		lblNewLabel_47 = new JLabel("Travel Speed (Miles/Day):");
		lblNewLabel_47.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_47.setBounds(377, 507, 120, 40);
		layeredPane.add(lblNewLabel_47);
		
		
		lblOverweight = new JLabel("");
		lblOverweight.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblOverweight.setBounds(30, 429, 349, 56);
		layeredPane.add(lblOverweight);
		
		lblTotalWeight = new JLabel("0");
		lblTotalWeight.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTotalWeight.setBounds(208, 463, 56, 56);
		layeredPane.add(lblTotalWeight);
		
		chckbxTools = new JCheckBox("");
		chckbxTools.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxTools,Tools);
			}
		});
		chckbxTools.setOpaque(true);
		chckbxTools.setBackground(new Color(255, 128, 0));
		chckbxTools.setBounds(599, 452, 93, 21);
		layeredPane.add(chckbxTools);
		
		chckbxToys = new JCheckBox("");
		chckbxToys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxToys,Toys);
			}
		});
		chckbxToys.setOpaque(true);
		chckbxToys.setBackground(new Color(255, 128, 0));
		chckbxToys.setBounds(599, 479, 93, 21);
		layeredPane.add(chckbxToys);
		
		chckbxTentGear = new JCheckBox("");
		chckbxTentGear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxTentGear,Tent);
			}
		});
		chckbxTentGear.setOpaque(true);
		chckbxTentGear.setBackground(new Color(255, 128, 0));
		chckbxTentGear.setBounds(599, 429, 93, 21);
		layeredPane.add(chckbxTentGear);
		
		chckbxLeadShot = new JCheckBox("");
		chckbxLeadShot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxLeadShot,leadShot);
			}
		});
		chckbxLeadShot.setOpaque(true);
		chckbxLeadShot.setBackground(new Color(255, 128, 0));
		chckbxLeadShot.setBounds(599, 354, 93, 21);
		layeredPane.add(chckbxLeadShot);
		
		chckbxCook = new JCheckBox("");
		chckbxCook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				itemCheck(chckbxCook,Cookware);
			}
		});
		chckbxCook.setOpaque(true);
		chckbxCook.setBackground(new Color(255, 128, 0));
		chckbxCook.setBounds(599, 254, 93, 21);
		layeredPane.add(chckbxCook);
		
		chckbxClock = new JCheckBox("");
		chckbxClock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxClock,Clock);
			}
		});
		chckbxClock.setOpaque(true);
		chckbxClock.setBackground(new Color(255, 128, 0));
		chckbxClock.setBounds(599, 277, 93, 21);
		layeredPane.add(chckbxClock);
		
		chckbxChair = new JCheckBox("");
		chckbxChair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxChair,Chair);
			}
		});
		chckbxChair.setOpaque(true);
		chckbxChair.setBackground(new Color(255, 128, 0));
		chckbxChair.setBounds(599, 231, 93, 21);
		layeredPane.add(chckbxChair);
		
		chckbxBedroll = new JCheckBox("");
		chckbxBedroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxBedroll,Bedroll);
			}
		});
		chckbxBedroll.setOpaque(true);
		chckbxBedroll.setBackground(new Color(255, 128, 0));
		chckbxBedroll.setBounds(599, 104, 93, 21);
		layeredPane.add(chckbxBedroll);
		
		chckbxGunPwdr = new JCheckBox("");
		chckbxGunPwdr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxGunPwdr,Gunpowder);
			}
		});
		chckbxGunPwdr.setOpaque(true);
		chckbxGunPwdr.setBackground(new Color(255, 128, 0));
		chckbxGunPwdr.setBounds(599, 404, 93, 21);
		layeredPane.add(chckbxGunPwdr);
		
		chckbxKeepsake = new JCheckBox("");
		chckbxKeepsake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxKeepsake,Keepsakes);
			}
		});
		chckbxKeepsake.setOpaque(true);
		chckbxKeepsake.setBackground(new Color(255, 128, 0));
		chckbxKeepsake.setBounds(599, 331, 93, 21);
		layeredPane.add(chckbxKeepsake);
		
		chckbxMirror = new JCheckBox("");
		chckbxMirror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxMirror,Mirror);
			}
		});
		chckbxMirror.setOpaque(true);
		chckbxMirror.setBackground(new Color(255, 128, 0));
		chckbxMirror.setBounds(599, 377, 93, 21);
		layeredPane.add(chckbxMirror);
		
		chckbxGun = new JCheckBox("");
		chckbxGun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxGun,gTools);
			}
		});
		chckbxGun.setOpaque(true);
		chckbxGun.setBackground(new Color(255, 128, 0));
		chckbxGun.setBounds(599, 304, 93, 21);
		layeredPane.add(chckbxGun);
		
		chckbxBooks = new JCheckBox("");
		chckbxBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxBooks,Books);
			}
		});
		chckbxBooks.setOpaque(true);
		chckbxBooks.setBackground(new Color(255, 128, 0));
		chckbxBooks.setBounds(599, 154, 93, 21);
		layeredPane.add(chckbxBooks);
		
		chckbxStove = new JCheckBox("");
		chckbxStove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxStove,Stove);
			}
		});
		chckbxStove.setOpaque(true);
		chckbxStove.setBackground(new Color(255, 128, 0));
		chckbxStove.setBounds(599, 204, 93, 21);
		layeredPane.add(chckbxStove);
		
		chckbxMeds = new JCheckBox("");
		chckbxMeds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxMeds,Medicine);
			}
		});
		chckbxMeds.setOpaque(true);
		chckbxMeds.setBackground(new Color(255, 128, 0));
		chckbxMeds.setBounds(599, 177, 93, 21);
		layeredPane.add(chckbxMeds);
		
		chckbxBTools = new JCheckBox("");
		chckbxBTools.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxBTools,bTools);
			}
		});
		chckbxBTools.setOpaque(true);
		chckbxBTools.setBackground(new Color(255, 128, 0));
		chckbxBTools.setBounds(599, 131, 93, 21);
		layeredPane.add(chckbxBTools);
		
		chckbxWhiskey = new JCheckBox("");
		chckbxWhiskey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxWhiskey,Whiskey);
			}
		});
		chckbxWhiskey.setOpaque(true);
		chckbxWhiskey.setBackground(new Color(255, 128, 0));
		chckbxWhiskey.setBounds(208, 404, 93, 21);
		layeredPane.add(chckbxWhiskey);
		
		lblNewLabel_33 = new JLabel("40");
		lblNewLabel_33.setOpaque(false);
		lblNewLabel_33.setForeground(Color.BLACK);
		lblNewLabel_33.setBackground(new Color(255, 128, 64));
		lblNewLabel_33.setBounds(187, 403, 75, 25);
		layeredPane.add(lblNewLabel_33);
		
		chckbxRice = new JCheckBox("");
		chckbxRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxRice,Rice);
			}
		});
		chckbxRice.setOpaque(true);
		chckbxRice.setBackground(new Color(255, 128, 0));
		chckbxRice.setBounds(208, 354, 93, 21);
		layeredPane.add(chckbxRice);
		
		chckbxWater = new JCheckBox("");
		chckbxWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxWater,Water);
			}
		});
		chckbxWater.setOpaque(true);
		chckbxWater.setBackground(new Color(255, 128, 0));
		chckbxWater.setBounds(208, 377, 93, 21);
		layeredPane.add(chckbxWater);
		
		chckbxSugar = new JCheckBox("");
		chckbxSugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxSugar,Sugar);
			}
		});
		chckbxSugar.setOpaque(true);
		chckbxSugar.setBackground(new Color(255, 128, 0));
		chckbxSugar.setBounds(208, 331, 93, 21);
		layeredPane.add(chckbxSugar);
		
		chckbxSalt = new JCheckBox("");
		chckbxSalt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxSalt,Salt);
			}
		});
		chckbxSalt.setOpaque(true);
		chckbxSalt.setBackground(new Color(255, 128, 0));
		chckbxSalt.setBounds(208, 304, 93, 21);
		layeredPane.add(chckbxSalt);
		
		chckbxFlour = new JCheckBox("");
		chckbxFlour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemCheck(chckbxFlour,Flour);
			}
		});
		chckbxFlour.setOpaque(true);
		chckbxFlour.setBackground(new Color(255, 128, 0));
		chckbxFlour.setBounds(208, 231, 93, 21);
		layeredPane.add(chckbxFlour);
		
		chckbxLard = new JCheckBox("");
		chckbxLard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxLard,Lard);
			}
		});
		chckbxLard.setOpaque(true);
		chckbxLard.setBackground(new Color(255, 128, 0));
		chckbxLard.setBounds(208, 277, 93, 21);
		layeredPane.add(chckbxLard);
		
		chckbxHardtack = new JCheckBox("");
		chckbxHardtack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxHardtack,Hardtack);
			}
		});
		chckbxHardtack.setOpaque(true);
		chckbxHardtack.setBackground(new Color(255, 128, 0));
		chckbxHardtack.setBounds(208, 254, 93, 21);
		layeredPane.add(chckbxHardtack);
		
		chckbxDriedApples = new JCheckBox("");
		chckbxDriedApples.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxDriedApples,dApples);
			}
		});
		chckbxDriedApples.setOpaque(true);
		chckbxDriedApples.setBackground(new Color(255, 128, 0));
		chckbxDriedApples.setBounds(208, 204, 93, 21);
		layeredPane.add(chckbxDriedApples);
		
		chckbxCoffee = new JCheckBox("");
		chckbxCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxCoffee,Coffee);
			}
		});
		chckbxCoffee.setOpaque(true);
		chckbxCoffee.setBackground(new Color(255, 128, 0));
		chckbxCoffee.setBounds(208, 177, 93, 21);
		layeredPane.add(chckbxCoffee);
		
		chckbxBeans = new JCheckBox("");
		chckbxBeans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemCheck(chckbxBeans,Beans);
			}
		});
		chckbxBeans.setOpaque(true);
		chckbxBeans.setBackground(new Color(255, 128, 0));
		chckbxBeans.setBounds(208, 154, 93, 21);
		layeredPane.add(chckbxBeans);
		
		chcbxBacon = new JCheckBox("");
		chcbxBacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			itemCheck(chcbxBacon,Bacon);
			
			}});
		chcbxBacon.setOpaque(true);
		chcbxBacon.setBackground(new Color(255, 128, 0));
		chcbxBacon.setBounds(208, 131, 93, 21);
		layeredPane.add(chcbxBacon);
		
		JCheckBox chcbxAppleV = new JCheckBox("");
		chcbxAppleV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				itemCheck(chcbxAppleV,appleVinegar);
		}});
		chcbxAppleV.setBackground(new Color(255, 128, 0));
		chcbxAppleV.setBounds(208, 104, 93, 21);
		layeredPane.add(chcbxAppleV);
		chcbxAppleV.setOpaque(true);
		
		lblNewLabel_56 = new JLabel("15");
		lblNewLabel_56.setOpaque(false);
		lblNewLabel_56.setForeground(Color.BLACK);
		lblNewLabel_56.setBackground(new Color(255, 128, 64));
		lblNewLabel_56.setBounds(569, 104, 75, 25);
		layeredPane.add(lblNewLabel_56);
		
		lblNewLabel_52 = new JLabel("15");
		lblNewLabel_52.setOpaque(false);
		lblNewLabel_52.setForeground(Color.BLACK);
		lblNewLabel_52.setBackground(new Color(255, 128, 64));
		lblNewLabel_52.setBounds(569, 279, 106, 25);
		layeredPane.add(lblNewLabel_52);
		
		lblNewLabel_54 = new JLabel("20");
		lblNewLabel_54.setOpaque(false);
		lblNewLabel_54.setForeground(Color.BLACK);
		lblNewLabel_54.setBackground(new Color(255, 128, 64));
		lblNewLabel_54.setBounds(569, 229, 75, 25);
		layeredPane.add(lblNewLabel_54);
		
		lblTent = new JLabel("150");
		lblTent.setOpaque(false);
		lblTent.setForeground(Color.BLACK);
		lblTent.setBackground(new Color(255, 128, 64));
		lblTent.setBounds(569, 429, 75, 25);
		layeredPane.add(lblTent);
		
		lblNewLabel_58 = new JLabel("75");
		lblNewLabel_58.setOpaque(false);
		lblNewLabel_58.setForeground(Color.BLACK);
		lblNewLabel_58.setBackground(new Color(255, 128, 64));
		lblNewLabel_58.setBounds(569, 154, 75, 25);
		layeredPane.add(lblNewLabel_58);
		
		lblNewLabel_46 = new JLabel("50");
		lblNewLabel_46.setOpaque(false);
		lblNewLabel_46.setForeground(Color.BLACK);
		lblNewLabel_46.setBackground(new Color(255, 128, 64));
		lblNewLabel_46.setBounds(569, 454, 75, 25);
		layeredPane.add(lblNewLabel_46);
		
		lblNewLabel_48 = new JLabel("15");
		lblNewLabel_48.setOpaque(false);
		lblNewLabel_48.setForeground(Color.BLACK);
		lblNewLabel_48.setBackground(new Color(255, 128, 64));
		lblNewLabel_48.setBounds(569, 379, 75, 25);
		layeredPane.add(lblNewLabel_48);
		
		lblNewLabel_55 = new JLabel("300");
		lblNewLabel_55.setOpaque(false);
		lblNewLabel_55.setForeground(Color.BLACK);
		lblNewLabel_55.setBackground(new Color(255, 128, 64));
		lblNewLabel_55.setBounds(569, 204, 150, 25);
		layeredPane.add(lblNewLabel_55);
		
		lblNewLabel_45 = new JLabel("15");
		lblNewLabel_45.setOpaque(false);
		lblNewLabel_45.setForeground(Color.BLACK);
		lblNewLabel_45.setBackground(new Color(255, 128, 64));
		lblNewLabel_45.setBounds(569, 479, 75, 25);
		layeredPane.add(lblNewLabel_45);
		
		lblNewLabel_59 = new JLabel("10");
		lblNewLabel_59.setOpaque(false);
		lblNewLabel_59.setForeground(Color.BLACK);
		lblNewLabel_59.setBackground(new Color(255, 128, 64));
		lblNewLabel_59.setBounds(569, 179, 75, 25);
		layeredPane.add(lblNewLabel_59);
		
		lblNewLabel_49 = new JLabel("25");
		lblNewLabel_49.setOpaque(false);
		lblNewLabel_49.setForeground(Color.BLACK);
		lblNewLabel_49.setBackground(new Color(255, 128, 64));
		lblNewLabel_49.setBounds(569, 354, 75, 25);
		layeredPane.add(lblNewLabel_49);
		
		lblNewLabel_53 = new JLabel("75");
		lblNewLabel_53.setOpaque(false);
		lblNewLabel_53.setForeground(Color.BLACK);
		lblNewLabel_53.setBackground(new Color(255, 128, 64));
		lblNewLabel_53.setBounds(569, 254, 150, 25);
		layeredPane.add(lblNewLabel_53);
		
		lblNewLabel_51 = new JLabel("200");
		lblNewLabel_51.setOpaque(false);
		lblNewLabel_51.setForeground(Color.BLACK);
		lblNewLabel_51.setBackground(new Color(255, 128, 64));
		lblNewLabel_51.setBounds(569, 304, 134, 25);
		layeredPane.add(lblNewLabel_51);
		
		lblNewLabel_50 = new JLabel("40");
		lblNewLabel_50.setOpaque(false);
		lblNewLabel_50.setForeground(Color.BLACK);
		lblNewLabel_50.setBackground(new Color(255, 128, 64));
		lblNewLabel_50.setBounds(569, 329, 75, 25);
		layeredPane.add(lblNewLabel_50);
		
		lblNewLabel_57 = new JLabel("200");
		lblNewLabel_57.setOpaque(false);
		lblNewLabel_57.setForeground(Color.BLACK);
		lblNewLabel_57.setBackground(new Color(255, 128, 64));
		lblNewLabel_57.setBounds(569, 129, 150, 25);
		layeredPane.add(lblNewLabel_57);
		
		lblNewLabel_60 = new JLabel("80");
		lblNewLabel_60.setOpaque(false);
		lblNewLabel_60.setForeground(Color.BLACK);
		lblNewLabel_60.setBackground(new Color(255, 128, 64));
		lblNewLabel_60.setBounds(569, 404, 75, 25);
		layeredPane.add(lblNewLabel_60);
		
		lblNewLabel_41 = new JLabel("80");
		lblNewLabel_41.setOpaque(false);
		lblNewLabel_41.setForeground(Color.BLACK);
		lblNewLabel_41.setBackground(new Color(255, 128, 64));
		lblNewLabel_41.setBounds(187, 203, 95, 25);
		layeredPane.add(lblNewLabel_41);
		
		lblNewLabel_43 = new JLabel("200");
		lblNewLabel_43.setOpaque(false);
		lblNewLabel_43.setForeground(Color.BLACK);
		lblNewLabel_43.setBackground(new Color(255, 128, 64));
		lblNewLabel_43.setBounds(187, 153, 75, 25);
		layeredPane.add(lblNewLabel_43);
		
		lblNewLabel_44 = new JLabel("80");
		lblNewLabel_44.setOpaque(false);
		lblNewLabel_44.setForeground(Color.BLACK);
		lblNewLabel_44.setBackground(new Color(255, 128, 64));
		lblNewLabel_44.setBounds(187, 178, 75, 25);
		layeredPane.add(lblNewLabel_44);
		
		lblNewLabel_39 = new JLabel("200");
		lblNewLabel_39.setOpaque(false);
		lblNewLabel_39.setForeground(Color.BLACK);
		lblNewLabel_39.setBackground(new Color(255, 128, 64));
		lblNewLabel_39.setBounds(187, 253, 75, 25);
		layeredPane.add(lblNewLabel_39);
		
		lblNewLabel_35 = new JLabel("200");
		lblNewLabel_35.setOpaque(false);
		lblNewLabel_35.setForeground(Color.BLACK);
		lblNewLabel_35.setBackground(new Color(255, 128, 64));
		lblNewLabel_35.setBounds(187, 353, 75, 25);
		layeredPane.add(lblNewLabel_35);
		
		lblNewLabel_37 = new JLabel("50");
		lblNewLabel_37.setOpaque(false);
		lblNewLabel_37.setForeground(Color.BLACK);
		lblNewLabel_37.setBackground(new Color(255, 128, 64));
		lblNewLabel_37.setBounds(187, 303, 75, 25);
		layeredPane.add(lblNewLabel_37);
		
		lblNewLabel_40 = new JLabel("500");
		lblNewLabel_40.setOpaque(false);
		lblNewLabel_40.setForeground(Color.BLACK);
		lblNewLabel_40.setBackground(new Color(255, 128, 64));
		lblNewLabel_40.setBounds(187, 228, 75, 25);
		layeredPane.add(lblNewLabel_40);
		
		lblNewLabel_42 = new JLabel("400");
		lblNewLabel_42.setOpaque(false);
		lblNewLabel_42.setForeground(Color.BLACK);
		lblNewLabel_42.setBackground(new Color(255, 128, 64));
		lblNewLabel_42.setBounds(187, 128, 75, 25);
		layeredPane.add(lblNewLabel_42);
		
		lblNewLabel_36 = new JLabel("40");
		lblNewLabel_36.setOpaque(false);
		lblNewLabel_36.setForeground(Color.BLACK);
		lblNewLabel_36.setBackground(new Color(255, 128, 64));
		lblNewLabel_36.setBounds(187, 328, 75, 25);
		layeredPane.add(lblNewLabel_36);
		
		lblNewLabel_34 = new JLabel("100");
		lblNewLabel_34.setOpaque(false);
		lblNewLabel_34.setForeground(Color.BLACK);
		lblNewLabel_34.setBackground(new Color(255, 128, 64));
		lblNewLabel_34.setBounds(187, 378, 75, 25);
		layeredPane.add(lblNewLabel_34);
		
		lblNewLabel_38 = new JLabel("200");
		lblNewLabel_38.setOpaque(false);
		lblNewLabel_38.setForeground(Color.BLACK);
		lblNewLabel_38.setBackground(new Color(255, 128, 64));
		lblNewLabel_38.setBounds(187, 278, 75, 25);
		layeredPane.add(lblNewLabel_38);
		
		lblNewLabel_32 = new JLabel("25");
		lblNewLabel_32.setOpaque(false);
		lblNewLabel_32.setForeground(Color.BLACK);
		lblNewLabel_32.setBackground(new Color(255, 128, 64));
		lblNewLabel_32.setBounds(187, 103, 95, 25);
		layeredPane.add(lblNewLabel_32);
		
		lblWeightinLbs_1 = new JLabel("Weight (in lbs)");
		lblWeightinLbs_1.setOpaque(false);
		lblWeightinLbs_1.setForeground(Color.BLACK);
		lblWeightinLbs_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWeightinLbs_1.setBackground(new Color(255, 128, 64));
		lblWeightinLbs_1.setBounds(568, 78, 95, 25);
		layeredPane.add(lblWeightinLbs_1);
		
		lblItem_1 = new JLabel("Item");
		lblItem_1.setOpaque(false);
		lblItem_1.setForeground(Color.BLACK);
		lblItem_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblItem_1.setBackground(new Color(255, 128, 64));
		lblItem_1.setBounds(405, 78, 95, 25);
		layeredPane.add(lblItem_1);
		
		lblDryGoodsAnd = new JLabel("Dry Goods and Sundries");
		lblDryGoodsAnd.setOpaque(false);
		lblDryGoodsAnd.setForeground(Color.BLACK);
		lblDryGoodsAnd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDryGoodsAnd.setBackground(new Color(255, 128, 64));
		lblDryGoodsAnd.setBounds(405, 53, 201, 25);
		layeredPane.add(lblDryGoodsAnd);
		
		lblWeightinLbs = new JLabel("Weight (in lbs)");
		lblWeightinLbs.setOpaque(false);
		lblWeightinLbs.setForeground(Color.BLACK);
		lblWeightinLbs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWeightinLbs.setBackground(new Color(255, 128, 64));
		lblWeightinLbs.setBounds(187, 76, 95, 25);
		layeredPane.add(lblWeightinLbs);
		
		lblItem = new JLabel("Item");
		lblItem.setOpaque(false);
		lblItem.setForeground(Color.BLACK);
		lblItem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblItem.setBackground(new Color(255, 128, 64));
		lblItem.setBounds(65, 78, 95, 25);
		layeredPane.add(lblItem);
		
		lblFoodSupply = new JLabel("Food Supply:");
		lblFoodSupply.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFoodSupply.setOpaque(false);
		lblFoodSupply.setForeground(Color.BLACK);
		lblFoodSupply.setBackground(new Color(255, 128, 64));
		lblFoodSupply.setBounds(65, 53, 95, 25);
		layeredPane.add(lblFoodSupply);
		
		
		lblNewLabel_31 = new JLabel("TOTAL WEIGHT:");
		lblNewLabel_31.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_31.setBounds(30, 463, 168, 56);
		layeredPane.add(lblNewLabel_31);
		
		lblNewLabel_30 = new JLabel("Pack Your Wagon");
		lblNewLabel_30.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
		lblNewLabel_30.setBounds(262, 10, 260, 56);
		layeredPane.add(lblNewLabel_30);
		
		lblNewLabel_29 = new JLabel("Toys");
		lblNewLabel_29.setOpaque(false);
		lblNewLabel_29.setForeground(Color.BLACK);
		lblNewLabel_29.setBackground(new Color(255, 128, 64));
		lblNewLabel_29.setBounds(405, 478, 75, 25);
		layeredPane.add(lblNewLabel_29);
		
		lblNewLabel_28 = new JLabel("Tools");
		lblNewLabel_28.setOpaque(false);
		lblNewLabel_28.setForeground(Color.BLACK);
		lblNewLabel_28.setBackground(new Color(255, 128, 64));
		lblNewLabel_28.setBounds(405, 453, 75, 25);
		layeredPane.add(lblNewLabel_28);
		
		lblNewLabel_27 = new JLabel("Tent & Gear");
		lblNewLabel_27.setOpaque(false);
		lblNewLabel_27.setForeground(Color.BLACK);
		lblNewLabel_27.setBackground(new Color(255, 128, 64));
		lblNewLabel_27.setBounds(405, 428, 75, 25);
		layeredPane.add(lblNewLabel_27);
		
		lblNewLabel_15 = new JLabel("Mirror");
		lblNewLabel_15.setOpaque(false);
		lblNewLabel_15.setForeground(Color.BLACK);
		lblNewLabel_15.setBackground(new Color(255, 128, 64));
		lblNewLabel_15.setBounds(405, 378, 75, 25);
		layeredPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Lead Shot");
		lblNewLabel_16.setOpaque(false);
		lblNewLabel_16.setForeground(Color.BLACK);
		lblNewLabel_16.setBackground(new Color(255, 128, 64));
		lblNewLabel_16.setBounds(405, 353, 75, 25);
		layeredPane.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("Keepsakes");
		lblNewLabel_17.setOpaque(false);
		lblNewLabel_17.setForeground(Color.BLACK);
		lblNewLabel_17.setBackground(new Color(255, 128, 64));
		lblNewLabel_17.setBounds(405, 328, 75, 25);
		layeredPane.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("Gun Making Tools");
		lblNewLabel_18.setOpaque(false);
		lblNewLabel_18.setForeground(Color.BLACK);
		lblNewLabel_18.setBackground(new Color(255, 128, 64));
		lblNewLabel_18.setBounds(405, 303, 134, 25);
		layeredPane.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("Granny's Clock");
		lblNewLabel_19.setOpaque(false);
		lblNewLabel_19.setForeground(Color.BLACK);
		lblNewLabel_19.setBackground(new Color(255, 128, 64));
		lblNewLabel_19.setBounds(405, 278, 106, 25);
		layeredPane.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("Cookware & Eating Utensils");
		lblNewLabel_20.setOpaque(false);
		lblNewLabel_20.setForeground(Color.BLACK);
		lblNewLabel_20.setBackground(new Color(255, 128, 64));
		lblNewLabel_20.setBounds(405, 253, 176, 25);
		layeredPane.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("Chair");
		lblNewLabel_21.setOpaque(false);
		lblNewLabel_21.setForeground(Color.BLACK);
		lblNewLabel_21.setBackground(new Color(255, 128, 64));
		lblNewLabel_21.setBounds(405, 228, 75, 25);
		layeredPane.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("Cast Iron Stove");
		lblNewLabel_22.setOpaque(false);
		lblNewLabel_22.setForeground(Color.BLACK);
		lblNewLabel_22.setBackground(new Color(255, 128, 64));
		lblNewLabel_22.setBounds(405, 203, 150, 25);
		layeredPane.add(lblNewLabel_22);
		
		lblNewLabel_23 = new JLabel("Bedroll");
		lblNewLabel_23.setOpaque(false);
		lblNewLabel_23.setForeground(Color.BLACK);
		lblNewLabel_23.setBackground(new Color(255, 128, 64));
		lblNewLabel_23.setBounds(405, 103, 75, 25);
		layeredPane.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("Blacksmithing Tools");
		lblNewLabel_24.setOpaque(false);
		lblNewLabel_24.setForeground(Color.BLACK);
		lblNewLabel_24.setBackground(new Color(255, 128, 64));
		lblNewLabel_24.setBounds(405, 128, 150, 25);
		layeredPane.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("Books");
		lblNewLabel_25.setOpaque(false);
		lblNewLabel_25.setForeground(Color.BLACK);
		lblNewLabel_25.setBackground(new Color(255, 128, 64));
		lblNewLabel_25.setBounds(405, 153, 75, 25);
		layeredPane.add(lblNewLabel_25);
		
		lblNewLabel_26 = new JLabel("Medicine");
		lblNewLabel_26.setOpaque(false);
		lblNewLabel_26.setForeground(Color.BLACK);
		lblNewLabel_26.setBackground(new Color(255, 128, 64));
		lblNewLabel_26.setBounds(405, 178, 75, 25);
		layeredPane.add(lblNewLabel_26);
		
		lblNewLabel_14 = new JLabel("Gunpowder");
		lblNewLabel_14.setOpaque(false);
		lblNewLabel_14.setForeground(Color.BLACK);
		lblNewLabel_14.setBackground(new Color(255, 128, 64));
		lblNewLabel_14.setBounds(405, 403, 75, 25);
		layeredPane.add(lblNewLabel_14);
		
		lblNewLabel_13 = new JLabel("Whiskey");
		lblNewLabel_13.setOpaque(false);
		lblNewLabel_13.setForeground(Color.BLACK);
		lblNewLabel_13.setBackground(new Color(255, 128, 64));
		lblNewLabel_13.setBounds(65, 403, 75, 25);
		layeredPane.add(lblNewLabel_13);
		
		lblNewLabel_12 = new JLabel("Water");
		lblNewLabel_12.setOpaque(false);
		lblNewLabel_12.setForeground(Color.BLACK);
		lblNewLabel_12.setBackground(new Color(255, 128, 64));
		lblNewLabel_12.setBounds(65, 378, 75, 25);
		layeredPane.add(lblNewLabel_12);
		
		lblNewLabel_11 = new JLabel("Rice");
		lblNewLabel_11.setOpaque(false);
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setBackground(new Color(255, 128, 64));
		lblNewLabel_11.setBounds(65, 353, 75, 25);
		layeredPane.add(lblNewLabel_11);
		
		lblNewLabel_10 = new JLabel("Sugar");
		lblNewLabel_10.setOpaque(false);
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setBackground(new Color(255, 128, 64));
		lblNewLabel_10.setBounds(65, 328, 75, 25);
		layeredPane.add(lblNewLabel_10);
		
		lblNewLabel_9 = new JLabel("Salt");
		lblNewLabel_9.setOpaque(false);
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setBackground(new Color(255, 128, 64));
		lblNewLabel_9.setBounds(65, 303, 75, 25);
		layeredPane.add(lblNewLabel_9);
		
		lblNewLabel_8 = new JLabel("Lard");
		lblNewLabel_8.setOpaque(false);
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setBackground(new Color(255, 128, 64));
		lblNewLabel_8.setBounds(65, 278, 75, 25);
		layeredPane.add(lblNewLabel_8);
		
		lblNewLabel_6 = new JLabel("Hardtack ");
		lblNewLabel_6.setOpaque(false);
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setBackground(new Color(255, 128, 64));
		lblNewLabel_6.setBounds(65, 253, 75, 25);
		layeredPane.add(lblNewLabel_6);
		
		lblNewLabel_5 = new JLabel("Flour ");
		lblNewLabel_5.setOpaque(false);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setBackground(new Color(255, 128, 64));
		lblNewLabel_5.setBounds(65, 228, 75, 25);
		layeredPane.add(lblNewLabel_5);
		
		lblNewLabel_4 = new JLabel("Dried Apples ");
		lblNewLabel_4.setOpaque(false);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBackground(new Color(255, 128, 64));
		lblNewLabel_4.setBounds(65, 203, 95, 25);
		layeredPane.add(lblNewLabel_4);
		
		lblNewLabel = new JLabel("Apple Vinegar");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 128, 64));
		lblNewLabel.setBounds(65, 103, 95, 25);
		layeredPane.add(lblNewLabel);
		lblNewLabel.setOpaque(false);
		
		layeredPane.moveToFront(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Bacon");
		lblNewLabel_1.setOpaque(false);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(new Color(255, 128, 64));
		lblNewLabel_1.setBounds(65, 128, 75, 25);
		layeredPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Beans    ");
		lblNewLabel_2.setOpaque(false);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBackground(new Color(255, 128, 64));
		lblNewLabel_2.setBounds(65, 153, 75, 25);
		layeredPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Coffee ");
		lblNewLabel_3.setOpaque(false);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBackground(new Color(255, 128, 64));
		lblNewLabel_3.setBounds(65, 178, 75, 25);
		layeredPane.add(lblNewLabel_3);
		
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
	
	/**
	 * The updater for the Wagon when a checkbox is pressed.
	 * @param box the JCheckBox to be checked
	 * @param item the Item that is supposed to be added
	 */
	public void itemCheck(JCheckBox box, Item item) {
		
		if(box.isSelected() == true) {
			wagon.addItem(item);
		}
		
		if(box.isSelected() == false && wagon.supplies.contains(item)) {
			wagon.removeItem(item);
		}
		
		wagon.updateWeight();
		lblTotalWeight.setText(wagon.getWeight() + "");
		
		if (wagon.getWeight() > wagon.getWagonMax()) {
			lblTotalWeight.setForeground(new Color(255,0,0));
			lblOverweight.setText("Too much weight! Total must be less than 2400");
		}
		
		else {
			lblTotalWeight.setForeground(new Color(0,0,0));
			lblOverweight.setText("");
		}
	}
}
