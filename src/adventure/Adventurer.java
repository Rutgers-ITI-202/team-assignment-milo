/*
An adventurer has:
�	A location (some room).
�	An inventory (the things being carried).  When the player executes the �take thing� command, the item should be added to the inventory.

An adventurer can:
�	Move from room to room.
�	Carry a number of objects.
�	Pick up, drop, look at, and use various objects.
 */

package adventure;

public class Adventurer {

	private char note; 
	private char lantern;

	public char note(){ //note in entrance room
		return note; 
	}

	public char lantern(){ //lantern in entrance room
		return lantern;
	}


	public void addItemToInv(String name){ // method to add item into inventory

		for (int i = 0; i < inv.length; i++){ // for loop that limits the space of the inventory
			if (inv[i] == null){
				inv[i] = name;

				return;// returns item to inventory and repeats the loop if called again.
			}
		}
	}

	public static String inv[] = new String[5]; // creates an array named inv that holds 5 items

}
