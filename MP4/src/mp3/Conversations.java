package mp3;

import java.util.Random;
import javax.swing.JTextArea;

/**
 * The conversations for an implementation of the game Oregon Trail
 * @author Griffin Broge
 * @version 1.0.0
 * @date May 5th 2024
 * @filename Conversations.java
 */


public class Conversations {

	// Initialize random object to randomize conversations
	Random rand = new Random();
	int entryCounter = 0;

	/**
	 * Checks the players current location and then randomizes one of three conversations unique to each location
	 * @param text : The text area that displays the conversation on method call
	 * @param locName : The name of the current location
	 * @wbp.parser.entryPoint
	 */
	public void showConversation(JTextArea text, String locName) {
		// Temp variable that is used to choose the randomly selected conversation
		int temp = rand.nextInt(3);
		// Switch statement for each location
		switch(locName) {
		// For each location
		case "Fort Independence":
		{
			// Another switch to determine what conversation to show
			switch(temp) {

			case 0 : 
			{
				text.setText("A stranger tells you:\r\n"
						+ "“ Some people around here seem to think that two oxen is enough for the trip. If you ask me, I think that’s crazy. Two oxen can barely move a fully loaded wagon. And then what if one dies? I’d say at the very least four.”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("A weary traveller tells you:\r\n"
						+ "“I hope this trip is worth it. So many in my company have died just to get here, and yet we still have a long way to go. If Oregon is as promising as they say, then all this has to be worth it wouldn’t you agree?”");
				break;
			}

			case 2:
			{
				text.setText("A kind merchant tells you:\r\n"
						+ "“You should really consider purchasing spare parts for your wagon friend. The next fort is some ways away and you don’t want to get stranded if one of our axles or wheels break. We can sell you some at the store here. I’d recommend at least one of each, better safe than sorry.”");
				break;
			}
			}
		}
		break;

		case "Kansas River Crossing":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("A nice lady says:\r\n"
						+ "“I recently had an Indian chief visit my tent. I gave him a portion of the dinner I made for my family, and in return he gave me a knife. Very rarely do Indians give things away, so I am grateful for the gift”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("An observant woman tells you:\r\n"
						+ "\"It seemed like the river level had gone up since yesterday, and there was water all over the place. We\r\n"
						+ "are glad we noticed, because we used to do our laundry!\" ");
				break;
			}

			case 2:
			{
				text.setText("A stern woman tells you:\r\n"
						+ "\"We had a hard time crossing this river because of the high water level. It looks like the rope holding\r\n"
						+ "the wagons together helped, but it was a small sacrifice.\" ");
				break;
			}
			}
		}
		break;

		case "Big Blue River Crossing":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("Lucena tells you:\r\n"
						+ "“ We need to cross this river to get to Fort Kearny. Hopefully the water is low, I heard 5 men drowned trying to cross this spring. The strength of the current was too much for them unfortunately”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("Lucena remarks:\r\n"
						+ "“Crossing this river could be tricky. I heard from a traveler that just last week, a wagon got swept away by the current. Luckily, everyone made it out okay, but it’s a reminder to be cautious.”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("A seasoned traveler shares:\r\n"
						+ "“This crossing can be a gamble, depending on the water level. I once saw a family lose their wagon and most of their belongings when they misjudged the depth. Best to take it slow and steady.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Fort Kearny":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("A sophisticated young lady says:\r\n"
						+ "“ There have been so many graves, and so much death within my company. We found five more today on our way here. We have lost a lot of people to get to this point, yet we forge onward.”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("An interiged wife says:\r\n"
						+ "“Shortly before we got here the captain lost his ox! The search party never found it, so I wonder what happened to it? Perhaps the Indians have seen it.”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("A soldier shares a local legend:\r\n"
						+ "“They say this fort was built right on top of an old Indian burial ground. Some of the men claim to have seen ghostly figures wandering the grounds at night. Me? I’m not taking any chances.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Chimeny Rock":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("Lucena tells you:\r\n"
						+ "“I cannot believe how enormous this is. I mean, we could see it from miles away. The view is gorgeous from here wouldn't you agree? From here all those rocks look like houses. We should carve our names into the rock… we can’t stay here forever but we can at least leave a little part of ourselves behind.”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("A traveller says:\r\n"
						+ "Chimney Rock sure is a welcome sight after days of endless plains. It's like a beacon guiding us westward.");
				break;
			}

			case 2:
			{
				text.setText("A young man tells you:\r\n"
						+ "This landmark sure makes for a picturesque backdrop. I should sketch it in my journal to remember our journey.");
				break;
			}
			}
		}
		break;

		case "Fort Laramie":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("A stranger tells you:\r\n"
						+ "“Hopefully you don’t need any blacksmithing done to get you along your journey, the shop here has been packed with work for a while now. I’d say we have about 1500 people come through here everyday. However, if you need any supplies, the general store sells flour and whiskey at a fair price. “\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("A fort scout tells you:\r\n"
						+ "“There has been plenty of game to hunt recently around here. Unfortunately, some people like to hunt them just for fun and take very little back with them. It’s such a shame they leave so much to rot in the sun.”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("A cook tells you:\r\n"
						+ "“How long is your company staying for? You guys should consider staying an extra day, I’m cooking a little feast for some of the people in my company, you should join us. It’s been a very difficult journey so far, hopefully this can cheer some folks up.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Independence Rock":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("A child in your company tells you:\r\n"
						+ "“Look Look! That rock kinda looks like a steamboat. Wow, there are so many names on it too! Do you have some paint I can borrow? I want to put my name on the rock too!” (pg 263)\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("An attentive man tells you:\r\n"
						+ "Look at all these names carved into the rock. Each one tells a story of someone who passed through here seeking a better life.");
				break;
			}

			case 2:
			{
				text.setText("A hardy man tells you:\r\n"
						+ "Independence Rock, a true symbol of hope and determination for pioneers on the trail. They say if you reach it by July 4th, you're on track for a successful journey.");
				break;
			}
			}
		}
		break;

		case "South Pass":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("A young women tells you:\r\n"
						+ "They say the pioneers who passed through South Pass left behind a trail of stories and dreams. What will our legacy be?");
				break;
			}

			case 1:
			{
				text.setText("A hopeful young man man tells you:\r\n"
						+ "South Pass may seem unassuming, but it holds the key to our future. Our dreams and aspirations are just beyond those peaks.");
				break;
			}

			case 2:
			{
				text.setText("A weary man tells you:\r\n"
						+ "I am grateful to finally reach South Pass. It feel like this journey shall never end, and yet reaching this place fills me with hope");
				break;
			}
			}
		}
		break;

		case "Green River Crossing":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("Lucena Parsons tells you:\r\n"
						+ "“ Hey there! Maybe my party and I will camp here for the night before moving on ahead, the river here is just so beautiful! The water runs swiftly and the river floor is a smooth layer of pebbles. Unlike the Crystal Springs from my hometown, the water here is green! Back in my hometown the water was always super clear. You should join us if you have the time, it’s always nice to meet other travelers out here on the trail.”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("A young child runs up to you:\r\n"
						+ "\r\n"
						+ "“You must have made it past the wolves as well! I talked to a nice lady named Lucena a couple of days ago when her group’s wagon passed by. We found some berries and black currants near the riverbank. She told me that the cherries make for super sweet and delicious pies! When I arrive in Oregon, I’ll be sure to bake a piping hot pie to share with her! If you see Lucena along the trail, tell her Clara said hi!”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("A ferry operator warns:\r\n"
						+ "“The Green River can be deceptively swift. Don’t underestimate its power, or you might find yourself downstream in a hurry. Trust me, I’ve seen it happen more times than I care to count.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Fort Bridger":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("You start conversing with a lady you’re staying alongside at one of the log houses:\r\n"
						+ "\r\n"
						+ "“How has your trip been so far? The rain a couple days ago slowed us down a bit, but the weather otherwise has been very cool. I’ve heard some news about the mountains ahead of us and I’ve decided - I will leave a flag on the highest point just to mark the progress we’ve made! It’ll serve as a sign to others that I, Lucena, have reached and climbed to the highest peak!”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("You see a young red-headed man as you stop by the horse enclosure:\r\n"
						+ "\r\n"
						+ "“Heya fellows! Ya travelin’ alright so far? There’s a lot of Indian huts nearby so be careful! I’ve even heard that another group came across more than 200 Indians riding their horses! Ain’t that crazy now? Apparently, one of the lasses - Lucena if I recall correctly - said that she saw them ridin’ at full speed, perhaps runnin’ from the nearin’ rain? Anyway, if ya see her along the road, ask ‘er how she’s doing’ for me, got it?”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("A frontier doctor advises:\r\n"
						+ "“Keep an eye on your health as you travel. Many ailments can creep up on you when you least expect it. I’ve seen everything from dysentery to broken bones out here. Better to be prepared than sorry.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Soda Springs":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("A fellow traveler comments:\r\n"
						+ "“These geysers are like nature’s fireworks, don’t you think? It’s no wonder they attracted so many pioneers on their way west. A sight to behold, for sure.”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("Lucena points out:\r\n"
						+ "“Did you know these springs were discovered by an expedition led by Captain Bonneville? They say the water tastes like soda, hence the name. Quite refreshing after a long day’s journey.”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("An excited women says:\r\n"
						+ "“The springs here are beautiful. Perhaps I should look around to see if I can find some gold to earn some extra money. It is better than waiting around.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Fort Hall":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("An observant woman tells you:\r\n"
						+ "\"It appears that the security situation is getting worse. It looks like we would better get together with\r\n"
						+ "more than one person. I'd better be sure.\" \r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("A fur trader mentions:\r\n"
						+ "“Trading with the Shoshone here has been quite profitable lately. They’re friendly folk, willing to exchange goods for the trinkets we bring from the East. Just mind your manners and they’ll treat you well.”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("A local indigenous guide advises:\r\n"
						+ "“If you’re planning on heading into the mountains, be sure to stock up on provisions. The weather can turn on a dime up there, and you don’t want to be caught unprepared.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Snake River Crossing":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("Lucena muses:\r\n"
						+ "“Look at the size of those rapids! It’s no wonder they call it the Snake River. We’ll need to find the shallowest point if we want to cross without incident.”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("An observant woman tells you:\r\n"
						+ "\"It seemed like the river level had gone up since yesterday, and there was water all over the place. We\r\n"
						+ "are glad we noticed, because we used to do our laundry!\" ");
				break;
			}

			case 2:
			{
				text.setText("A Native American elder shares wisdom:\r\n"
						+ "“Respect the land, and it will respect you. Take only what you need, and give back what you can. That’s the way of our people, and it’s served us well for generations.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Fort Boise":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("Lucena tells you:\r\n"
						+ "\r\n"
						+ "“A while back my company passed an Indian village. There were a large number of wigwams. I find them fascinating. There were not many Indians though, as they were all hunting when we passed through”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("A local guide advises:\r\n"
						+ "“If you plan on fording any rivers ahead, make sure your wagon is properly waterproofed. You don’t want your supplies getting soaked halfway across. I’ve seen too many wagons lose valuable cargo that way.”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("A local settler remarks:\r\n"
						+ "“You picked a good time to arrive. The trading post just got a fresh shipment of supplies from the East. If you need anything, now’s the time to stock up.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Blue Mountains":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("An observant woman tells you:\r\n"
						+ "\"They say you can get gold around here. Looks like some people stop by here looking for gold. It's\r\n"
						+ "hard to cross until June or so because of the snow.\" ");
				break;
			}

			case 1:
			{
				text.setText("A traveller tells you:\r\n"
						+ "“The mountains here are a terrifying sight. I pray that we make it through in one piece.”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("An old man tells you:\r\n"
						+ "“ Preparing to travel through the mountains eh? Be careful, and be sure that you have plenty of clothing.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "Fort Walla Walla":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("A local trader boasts:\r\n"
						+ "“If it’s supplies you’re after, you’ve come to the right place. I’ve got everything from bacon to bullets, and at prices that can’t be beat. Step right up and see for yourself.”\r\n"
						+ "");
				break;
			}

			case 1:
			{
				text.setText("A gambler offers to play a game:\r\n"
						+ "“Looking for a bit of excitement? Care to try your luck at a game of poker? Winner takes all, and the stakes couldn’t be higher.”\r\n"
						+ "");
				break;
			}

			case 2:
			{
				text.setText("A fur trader shares a tall tale:\r\n"
						+ "“I once saw a bear stand up on its hind legs and dance a jig. Swear on my mother’s grave, it’s the god’s honest truth. Course, I’d had a fair bit of whiskey at the time, so take it with a grain of salt.”\r\n"
						+ "");
				break;
			}
			}
		}
		break;

		case "The Dalles":
		{
			switch(temp) {

			case 0 : 
			{
				text.setText("A local tells you:\r\n"
						+ "They say the waters around The Dalles can be treacherous. We must navigate them with caution and skill.");
				break;
			}

			case 1:
			{
				text.setText("A cautious traveller tells you:\r\n"
						+ "The Dalles is a bustling hub of activity, a stark contrast to the untamed wilderness we've traveled through. Let's not let our guard down.");
				break;
			}

			case 2:
			{
				text.setText("A stranger tells you:\r\n"
						+ "“It's been a long journey so far, hasn't it my friend. What’s been your favorite part so far? There's definitely been so many beautiful views. It's amazing how much the landscape changes the more you travel. One moment you're looking at mountains, and the next you're looking at endless plains.” \r\n"
						+ "");
				break;
			}
			}
		}
		break;
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void showDiary(JTextArea text) {
		entryCounter++;
		
		if(entryCounter == 4) {
			entryCounter = 1;
		}
		
		switch(entryCounter) {
		case 1:
		{
			text.setText("Entry #1");
			break;
			
		}
		case 2:
		{
			text.setText("Entry #2");
			break;
			
		}
		case 3:
		{
			text.setText("Entry #3");
			break;
			
		}
		}
	}
}
