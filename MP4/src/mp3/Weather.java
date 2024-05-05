package mp3;
import java.util.Random;

public class Weather {

	private String curWeather;
	private int temp;
	
	private final String VHot = "Very Hot";
	private final String Hot = "Hot";
	private final String Warm = "Warm";
	private final String Cool = "Cool";
	private final String Cold = "Cold";
	private final String VCold = "Very Cold";
	
	private final int VHotMean = 100;
	private final int HotMean = 80;
	private final int WarmMean = 60;
	private final int CoolMean = 40;
	private final int ColdMean = 20;
	private final int VColdMean = 0;
	
	Random rand = new Random();
	
	
	public Weather() {
		
		curWeather = Warm;
		
		temp = calcTemp(WarmMean);
		
	}
	
	public String getWeather() {
		return curWeather;
	}
	
	public int calcTemp(int Mean) {
		
		int plusOrMinus = rand.nextInt(2);
		
		if(plusOrMinus == 0) {
			return(Mean + (rand.nextInt(10) + 1));
		}
		
		else return(Mean - (rand.nextInt(10) + 1));
	}
	
	public void calcWeather(String Zone) {
		
		int randTempRange = rand.nextInt(3);
		
		switch(Zone) {
		
		case "Zone 1":
		{
			
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
