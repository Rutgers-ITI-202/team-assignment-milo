package adventure;
/**
 * Name(s): Peter Lu, Sujay Adkar, Samson Dogbe
 * Due Date: 04/28/2017
 * ITI 202-04 Object Oriented Programming
 * Final Project
 * @param
 * This class contains the methods to build the rooms that are in the game map
*/
import java.util.ArrayList;


public class Room {

	//Creates strings and arraylist.
	private String name;
    private String description;
    public ArrayList<AdventureModel> roomItems = new ArrayList<>();

    //Room method and attributes.
    public Room(String str, String des, ArrayList<AdventureModel> items) {
    	name = str;
    	description = des;
    	roomItems = items;
    }

    //Sets room name.
    public void setName(String name) {
        this.name = name;
    }

    //Gets and returns room name.
    public String getName() {
        return this.name;
    }
    
    //Sets room description
    public void setDescription(String description) {
        this.description = description;
    }

    //Gets room and returns room description.
    public String getDescription() {
        return this.description;
    }
    
    //Calls and displays getDescription and items for the room.
    public void print(){
    	System.out.println(this.getDescription());
    	System.out.println("Items you see: ");
    	this.getItems();
    	System.out.println();
    }
    
    //Creates the method for "get" player command
    public void getItem(Room room, String item, Adventurer player){
    	for(int i = 0; i < roomItems.size(); i++){
    		String roomItem = roomItems.get(i).getName().toLowerCase();
    		if(roomItem.equals(item)){
    			player.addtoInventory(roomItems.get(i));
    			roomItems.remove(i);
    		}
    	}
    }

    //Displays item that was added to inventory after using the "get" player command.
    public void getItems() {
    	String itemList ="";
    	for(int i = 0; i < roomItems.size(); i++){
    	   System.out.println(roomItems.get(i).getName() + " ");
    	   }
    }

}
