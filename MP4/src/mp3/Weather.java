package mp3;
import java.util.Random;

/**
 * Weather class for an implementation of the game Oregon Trail. Holds all weather and temperature values.
 * @author Griffin Broge
 * @version 1.0.0
 * @date May 5th 2024
 * @filename Weather.java
 * 
 */
public class Weather {
	// Initialize variables for current weather and temp
	private String curWeather;
	private int temp;
	// Symbolic constants for weather
	private final String VHot = "Very Hot";
	private final String Hot = "Hot";
	private final String Warm = "Warm";
	private final String Cool = "Cool";
	private final String Cold = "Cold";
	private final String VCold = "Very Cold";
	// Symbolic constants for temperature
	private final int VHotMean = 100;
	private final int HotMean = 80;
	private final int WarmMean = 60;
	private final int CoolMean = 40;
	private final int ColdMean = 20;
	private final int VColdMean = 0;
	// Random object to add randomness to temperature and weather
	Random rand = new Random();


	/**
	 * Constructor for the weather object. Initializes the weather to warm.
	 */
	public Weather() {
		curWeather = Warm;
		temp = calcTemp(WarmMean);
	}

	/**
	 * Getter for the current weather
	 * @return the current weather in String form
	 */
	public String getWeather() {
		return curWeather;
	}

	/**
	 * Helper method to calculate the temp with given mean with a range of + or - 10.
	 * @param Mean : The mean for the current weather, used to determine temp range
	 * @return returns the temperature in int form.
	 */
	public int calcTemp(int Mean) {
		// 50/50 to determine if adding or subtracting
		int plusOrMinus = rand.nextInt(2);

		if(plusOrMinus == 0) {
			return(Mean + (rand.nextInt(10) + 1));
		}

		else return(Mean - (rand.nextInt(10) + 1));
	}

	/**
	 * Calculates the weather depending on the zone the player is currently in.
	 * @param Zone: The current zone.
	 */
	public void calcWeather(String Zone) {
		// To add some randomness to the weather
		int randTempRange = rand.nextInt(3);
		// Switch statement for each zone
		switch(Zone) {
		// For each zone
		case "Zone 1":
		{
			// One in three chance to be one of the given weather and temp ranges.
			switch(randTempRange) {

			case 0:
			{
				curWeather = VHot;
				temp = calcTemp(VHotMean);
				break;
			}

			case 1:
			{
				curWeather = Hot;
				temp = calcTemp(HotMean);
				break;
			}

			case 2:
			{
				curWeather = Warm;
				temp = calcTemp(WarmMean);
				break;
			}	
			}
			break;
		}

		case "Zone 2":
		{

			switch(randTempRange) {

			case 0:
			{
				curWeather = Hot;
				temp = calcTemp(HotMean);
				break;
			}

			case 1:
			{
				curWeather = Warm;
				temp = calcTemp(WarmMean);
				break;
			}

			case 2:
			{
				curWeather = Cool;
				temp = calcTemp(CoolMean);
				break;
			}	
			}
			break;
		}

		case "Zone 3":
		{

			switch(randTempRange) {

			case 0:
			{
				curWeather = Hot;
				temp = calcTemp(HotMean);
				break;
			}

			case 1:
			{
				curWeather = Warm;
				temp = calcTemp(WarmMean);
				break;
			}

			case 2:
			{
				curWeather = Warm;
				temp = calcTemp(CoolMean);
				break;
			}	
			}
			break;
		}

		case "Zone 4":
		{

			switch(randTempRange) {

			case 0:
			{
				curWeather = Warm;
				temp = calcTemp(VHotMean);
				break;
			}

			case 1:
			{
				curWeather = Cool;
				temp = calcTemp(HotMean);
				break;
			}

			case 2:
			{
				curWeather = Cold;
				temp = calcTemp(WarmMean);
				break;
			}	
			}
			break;
		}

		case "Zone 5":
		{

			switch(randTempRange) {

			case 0:
			{
				curWeather = Cool;
				temp = calcTemp(VHotMean);
				break;
			}

			case 1:
			{
				curWeather = Cold;
				temp = calcTemp(HotMean);
				break;
			}

			case 2:
			{
				curWeather = VCold;
				temp = calcTemp(VColdMean);
				break;
			}	
			}
			break;
		}

		case "Zone 6":
		{

			switch(randTempRange) {

			case 0:
			{
				curWeather = Cool;
				temp = calcTemp(CoolMean);
				break;
			}

			case 1:
			{
				curWeather = Cold;
				temp = calcTemp(ColdMean);
				break;
			}

			case 2:
			{
				curWeather = VCold;
				temp = calcTemp(VColdMean);
				break;
			}	
			}
			break;
		}
		}

	}


}
