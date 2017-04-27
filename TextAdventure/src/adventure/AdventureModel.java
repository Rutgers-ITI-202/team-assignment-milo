package adventure;
/**
 * Name(s): Peter Lu, Sujay Adkar, Samson Dogbe
 * Due Date 4/28/2017
 * ITI 202-05 Object Oriented Programming
 * Final Project
 * @param
 * This contains the main class which builds the objects needed for the game and allows the user to interact with the game.
 */
public class AdventureModel {
	
	//Creates a constructor
	private int isNeeded = 0;
	private boolean needed;
	String name;
	
	//Conditions for adventure model.
	public AdventureModel(String str, boolean bool){
		name = str;
		needed = bool;
		if(needed)
			isNeeded++;
	}
	
	//Getters and setters
	public String getName(){
		return name;
	}
	
	public boolean isNeeded(){
		return needed;
	}
}
