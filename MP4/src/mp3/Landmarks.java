package mp3;

public class Landmarks {
	
	private String name;
	private int location;
	private String tag;
	
	private double riverWidth;
	private double riverDepth;
	private double riverSpeed;
	
	public String getName() {
		return(name);
	}
	
	public int getLocation() {
		return(location);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setLoc(int newLoc) {
		location = newLoc;
	}
	
	public String getTag() {
		return(tag);
	}
	
	public void setTag(String newTag) {
		tag = newTag;
	}
	
	public double getRiverWidth() {
		return riverWidth;
	}

	public void setRiverWidth(double riverWidth) {
		this.riverWidth = riverWidth;
	}

	public double getRiverDepth() {
		return riverDepth;
	}

	public void setRiverDepth(double riverDepth) {
		this.riverDepth = riverDepth;
	}

	public double getRiverSpeed() {
		return riverSpeed;
	}

	public void setRiverSpeed(double riverSpeed) {
		this.riverSpeed = riverSpeed;
	}

}
