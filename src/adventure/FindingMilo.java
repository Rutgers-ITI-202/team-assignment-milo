package adventure;
import java.util.Scanner;
public class FindingMilo {

	public static void main(String[] args) 
	{	//create/import Fuze class 
		System.out.println("Would you like to play a game?");
		
		Scanner s = new Scanner(System.in);
		String newGame = s.next();
		
		if (newGame.equalsIgnoreCase("Yes"))
		{
						System.out.println("Welcome to Finding Milo! You are the adventurer named Fuze, searching for Milo the Monkey!" 
								+ " You will explore a dungeon on your quest to find to him. \n \n"
								+ "You find yourself in a room, dimly lit by a small lantern."
								+ " On the floor in front of you, you see a note.");
		}
		
		else 
		{
			System.out.println("Goodbye");
		}
	}

}
