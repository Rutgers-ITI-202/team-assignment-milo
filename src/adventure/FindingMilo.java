/*
This class:
�	Contains the main method used to start the game.
�	Talks to the AdventureModel and to the Adventurer classes, as needed.
 */

package adventure;

import java.util.Scanner;

public class FindingMilo {

	public static void main(String[] args) {	

		System.out.println("Would you like to play a game?");

		Adventurer Fuze = new Adventurer();//create/import Fuze class 

		Scanner s = new Scanner(System.in);//creates new scanner

		//Asks if the players whats to play a new game
		String newGame = s.next();

		if (newGame.equalsIgnoreCase("Yes")){

			System.out.println("Welcome to Finding Milo! You are the adventurer named Fuze, searching for Milo the Monkey!" 
					+ " You will explore a dungeon on your quest to find to him."
					+ "\nAs Fuze you have the ability to ENTER, EXIT, LOOK, TAKE, and DROP. Every ability must be entered in CAPS!!!!"
					+ " \n \nYou find yourself in a room, dimly lit by a small lantern."
					+ " On the floor in front of you, you see a note."
					+ "\nWhat do you want to do?");
		}

		else
		{
			System.out.println("Goodbye");
		}
		
		//This is the first action which the player will perform.
		String action = s.next();

		switch (action){

		case "ENTER" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "EXIT" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "LOOK" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "DROP" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "TAKE" :
			System.out.println("You pick up the note and read it. The note reads..."
					+ "\n \"Milo has been taken by Lord Galapagos, King of the Seven Seas. He expects your presence further into the depths of this cave."
					+ "\n You must navigate your way through the following rooms"
					+ "\n You put the note back on the ground. You are intrigued by the door to your left that is filled with flowers and trees and rainbows. What action do you perform now?");
			break;

		}
		

		//This is the second action which the player will perform.
		String action2 = s.next();

		switch (action2){

		case "ENTER" :
			System.out.println("You walk toward the door. You pull hard on the handle. Unfornately you are not able to make the door open."
					+ "You are now intrigued by the lantern on the floor that is illumiating the room"
					+ "Now what do you do?");
			break;

		case "EXIT" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "LOOK" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "DROP" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "TAKE" :
			System.out.println("That's not possible right now. Try something else.");
			break;
		}
		
		//This is the third action which the player will perform.
		String action3 = s.next();

		switch (action3){

		case "ENTER" :
			System.out.println("That's not possible right now. Try something else.");
			break;

		case "EXIT" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "LOOK" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "DROP" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "TAKE" :
			System.out.println("You figure the lantern might be useful further down the cave. You hold in your left hand you make your way to the other door.");
			break;
		}

		//This is the fourth action which the player will perform.
		String action4 = s.next();

		switch (action4){

		case "ENTER" :
			System.out.println("You pull the door open and proceed into the next room.");
			break;

		case "EXIT" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "LOOK" :
			System.out.println("You look at the door. It looks menacing");
			break;

		case "DROP" :
			System.out.println("That's not possilbe right now. Try something else.");
			break;

		case "TAKE" :
			System.out.println("That's not possible right now. Try something else.");
			break;
		}	
	}
}



