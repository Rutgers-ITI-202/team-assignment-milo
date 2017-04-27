package adventure;

public class AdventureModel {
	
	private int isNeeded = 0;
	private boolean needed;
	String name;
	
	public AdventureModel(String str, boolean bool){
		name = str;
		needed = bool;
		if(needed)
			isNeeded++;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isNeeded(){
		return needed;
	}
}
