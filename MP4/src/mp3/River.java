package mp3;

import java.util.Random;

public class River extends Landmarks{
	



	
	Random rand = new Random();
	
	public River(String newName, int newLocation) {
		
		double tempWid = rand.nextDouble(50) + 1;
		double tempDep = rand.nextDouble(15) + 1;
		double tempSpd = rand.nextDouble(15) + 1;
		
		tempWid = Math.round(tempWid * 1000) / 1000;
		tempDep = Math.round(tempDep * 1000) / 1000;
		tempSpd = Math.round(tempDep * 1000) / 1000;
	
		setName(newName);
		setLoc(newLocation);
		setTag("R");
		setRiverWidth(tempWid);
		setRiverDepth(tempDep);
		setRiverSpeed(tempSpd);
	}
	
	

}
