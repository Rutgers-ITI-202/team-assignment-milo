/*
An adventurer has:
•	A location (some room).
•	An inventory (the things being carried).  When the player executes the “take thing” command, the item should be added to the inventory.

An adventurer can:
•	Move from room to room.
•	Carry a number of objects.
•	Pick up, drop, look at, and use various objects.
 */

package adventure;

public class Adventurer {

	private char enter; 
	private char exit;
	private char look; 
	private char take; 
	private char drop; 
	private char light; 

	public char enter(){ //action to enter room and displays message that one has entered new room
		return.enter, System.out.println("Entered room");
	}

	public char exit(){ //action to leave and reenter preivous room and display entered previous room or room name
		return.exit, System.out.println("Exit room");
	}

	public char look(){ // action gives description of environment
		return.look;
	}

	public char take(){ // action for picking up an item. Figure out how to get to say item name.
		return.take, System.out.println("Fuze has picked up item");
	}

	public char drop(){ // action for dropping an item. Figure out how to get to say item name.
		return.drop, System.out.println("Fuze has dropped an item");
	}

	public char light(){ // action to light item. Figure out parameters for items that can be lit and to say item name.
		return.light, System.out.println("Fuze has lit the item");
	}

	public void addItemToInv(String name){ // method to add item into inventory

		for (int = 0; i < inv.length; i++){ // for loop that limits the space of the inventory
			if (inv[i] == null){
				inv[i] = name;

				return;// returns item to inventory and repeats the loop if called again.
			}
		}
	}

	public static String inv[] = new String[5]; // creates an array named inv that holds 5 items

}
