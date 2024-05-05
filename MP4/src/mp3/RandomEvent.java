import java.util.Random;

/**
 * The gui implementation of packing a wagon in an implementation of the game Oregon Trail.
 * @authors Yutaka Yamato
 * @version 1.0.0
 * @date April 25th, 2024
 * @filename RandomEvent.java
 */

public class RandomEvent extends OregonTrail {
    private Random random;

    // Generate numbers at random.
    public RandomEvent() {
        random = new Random();
    }

    // The method to simulate a day's travel and check for random events
    public void travelDay() {
        // need to write code more
        // how can we get turn on how the event will happen? 
        checkRandomEvents();
    }
   
    // The
    // The probability of an event occurring depends on the probability of the event.
    // Only one event will be selected.
    private void checkRandomEvents() {
        int eventIndex = random.nextInt(5);
        switch(eventIndex){
            case 0:
            if (loseTrail()) {
                if(random.nextInt(100) <= 2){
                    wagon.setFoodAmt(-10);
                    return;
                }                        
            }
            break;
            case 1:
            if (wrongTrail()) {
                if(random.nextInt(100) <= 1){
                    wagon.setFoodAmt(-20);
                    return;
                }                        
            }
            break;
            case 2:
            if (wagonFire()) {
                if(random.nextInt(100) <= 2){
                    wagon.setFoodAmt(-15);                    
                    return;
                }                        
            }
            break;      
            case 3:
            if (isOxInjured()) {
                if (random.nextInt(100) < 2) {
                    // how can we determine if ox is injured?
                    // If ox is injured, reduce the number because it will die.
                    return;
                }
            }
              break;
            case 4:
            if (isMemberInjured()) {
                if (random.nextInt(100) <= 2) {                
                    return;
                }
            }        
              break;
                      
            
        }       

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
	 * A Boolean function to determine whether wagonFire occured or not
	 * @return - Returns true.
     * */
    private boolean wagonFire() {
        return true;
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
    
    private boolean isMemberInjured() {
        return false; 
    }



}