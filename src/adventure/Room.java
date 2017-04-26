package adventure;

import java.util.ArrayList;


public class Room {

	private String name;
    private String description;
    public ArrayList<AdventureModel> roomItems = new ArrayList<>();

    public Room(String str, String des, ArrayList<AdventureModel> items) {
    	name = str;
    	description = des;
    	roomItems = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void print(){
    	System.out.println(this.getDescription());
    	System.out.println("Items you see: ");
    	this.getItems();
    	System.out.println();
    }
    
    public void getItem(Room room, String item, Adventurer player){
    	for(int i = 0; i < roomItems.size(); i++){
    		String roomItem = roomItems.get(i).getName().toLowerCase();
    		if(roomItem.equals(item)){
    			player.addtoInventory(roomItems.get(i));
    			roomItems.remove(i);
    		}
    	}
    }

    public void getItems() {
    	String itemList ="";
    	for(int i = 0; i < roomItems.size(); i++){
    	   System.out.println(roomItems.get(i).getName() + " ");
    	   }
    }

}
