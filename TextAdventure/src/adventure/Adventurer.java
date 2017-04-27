package adventure;
/**
 * Name(s): Peter Lu, Sujay Adkar, Samson Dogbe
 * Due Date: 4/28/2017
 * ITI 202-05 Object Oriented Programming
 * Final Project
 * @param
 * This class creates adventurer and its inventory.
 */

import java.util.ArrayList;


public class Adventurer {
	
	private ArrayList<AdventureModel> inventory;
	private int hasNeededItems = 0;
	
	//Default Constructor
	public Adventurer(){
		inventory = new ArrayList<AdventureModel>();
	}
	
	//Adds item to the inventory
	public void addtoInventory(AdventureModel item){
		inventory.add(item);
		if(item.isNeeded())
			hasNeededItems++;
		System.out.println(item.getName() + " added to inventory.");
		System.out.println();
		
	}
	
	//Prints out the inventory for viewing by the user
	public void getInventory(){
		for(int i = 0; i < inventory.size(); i++)
			System.out.println(inventory.get(i).getName());
		
		System.out.println();
	}
	
	public int inventorySize(){
		return inventory.size();
	}
	
	public int getNeededItems(){
		return hasNeededItems;
	}
}
