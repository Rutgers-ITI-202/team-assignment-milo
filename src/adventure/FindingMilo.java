/*
This class:
•	Contains the main method used to start the game.
•	Talks to the AdventureModel and to the Adventurer classes, as needed.
 */

package adventure;

import java.util.Scanner;

public class FindingMilo {

	public static void main(String[] args) {	

		System.out.println("Would you like to play a game?");

		Adventurer Fuze = new Adventurer();//create/import Fuze class 

		Scanner s = new Scanner(System.in);

		String newGame = s.next();

		if (newGame.equalsIgnoreCase("Yes")){

			System.out.println("Welcome to Finding Milo! You are the adventurer named Fuze, searching for Milo the Monkey!" 
					+ " You will explore a dungeon on your quest to find to him. \n \n"
					+ "You find yourself in a room, dimly lit by a small lantern."
					+ " On the floor in front of you, you see a note.");
		}

		else{

			System.out.println("Goodbye");
		}
	}

}
