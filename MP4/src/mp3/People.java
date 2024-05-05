package mp3;

public class People {
	
	String name;
	int numDisease;
	
	/*
	 * Sets the person's number of diseases to 0 when created.
	 */
	public People() {
		numDisease = 0; 
	}
	
	/*
	 * Sets the name of the person.
	 * @param name - a String value containing the new name of the person.
	 */
	public void setName (String name) {
		this.name = name;
	}
	
	/*
	 * Gets the name of the person.
	 * @return name - a String value with the name of the person.
	 */
	public String getName() {
		return name;
	}

}
