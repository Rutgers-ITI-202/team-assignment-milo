package adventure;
/**
 * Name(s): Peter Lu, Sujay Adkar, Samson Dogbe
 * Due Date 4/28/2017
 * ITI 202-05 Object Oriented Programming
 * Final Project
 * Description: This contains the main class which builds the objects needed for the game and allows the user to interact with the game.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class TextAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creates all items for the game map
		AdventureModel item1 = new AdventureModel("Lantern", true);
		AdventureModel item2 = new AdventureModel("Key", true);
		AdventureModel item3 = new AdventureModel("Magic Banana Dildo", true);
		AdventureModel item4 = new AdventureModel("Shield", true);
		AdventureModel item5 = new AdventureModel("Coconut Bombs", true);
		AdventureModel item6 = new AdventureModel("Helpenol", true);
		AdventureModel item7 = new AdventureModel("Triplevil", true);
		AdventureModel item8 = new AdventureModel("Mystical Smoking Banana", true);
		AdventureModel item9 = new AdventureModel("Krispy Kreme Donuts", true);
		AdventureModel item10 = new AdventureModel("Laser Gun", true);
		AdventureModel item11 = new AdventureModel("Car Keys", true);
		AdventureModel item12 = new AdventureModel("Fire Stone", true);		

		//Creates all rooms for the game map with their items
		ArrayList<AdventureModel> mainChamberItems = new ArrayList<AdventureModel>();
		mainChamberItems.add(item1);
		Room mainChamber = new Room("Main Chamber", "You are in the Main Chamber. There are Gorilla Statues all around.", mainChamberItems);		

		ArrayList<AdventureModel> frostCoveItems = new ArrayList<AdventureModel>();
		frostCoveItems.add(item2);
		Room frostCove = new Room("Frost Cove", "You are in the Frost Cove. The room is coverd in glistening ice crystals and the brisk air makes you shiver.", frostCoveItems);

		ArrayList<AdventureModel> holyBananaSanctuaryItems = new ArrayList<AdventureModel>();
		holyBananaSanctuaryItems.add(item3);
		Room holyBananaSanctuary = new Room("Holy Banana Sanctuary", "You are in the Holy Banana Sanctuary. There is a golden chest on top of a pedestal.", holyBananaSanctuaryItems);

		ArrayList<AdventureModel> elderTreeForestItems = new ArrayList<AdventureModel>();
		elderTreeForestItems.add(item4);
		elderTreeForestItems.add(item5);
		Room elderTreeForest = new Room("Elder Tree Forest", "You are in the Elder Tree Forest. The room smells like summer and there are large towering palm trees that give an ominous presence.", elderTreeForestItems);

		ArrayList<AdventureModel> gvsPharmacyItems = new ArrayList<AdventureModel>();
		gvsPharmacyItems.add(item6);
		gvsPharmacyItems.add(item7);
		Room gvsPharmacy = new Room("GVS Pharmacy", "You are in the GVS Pharmacy. The room is a pharmacy with a counter full of drugz.", gvsPharmacyItems);

		ArrayList<AdventureModel> gardenOfEdenItems = new ArrayList<AdventureModel>();
		gardenOfEdenItems.add(item8);
		Room gardenOfEden = new Room("Garden of Eden", "You are in the Garden of Eden. The room is filled with lush fruits and tall banana trees. /nIn the center of the room, on top of pedestal with a beam of light shining down, is shillouttee of a large banana.", gardenOfEdenItems);

		ArrayList<AdventureModel> donutPalaceItems = new ArrayList<AdventureModel>();
		donutPalaceItems.add(item9);
		Room donutPalace = new Room("Donut Palace", "You are in the Donut Place. The room is filled with boxes of Krispy Kreme donuts.", donutPalaceItems);

		ArrayList<AdventureModel> spaceStationSixItems = new ArrayList<AdventureModel>();
		spaceStationSixItems.add(item10);
		Room spaceStationSix = new Room("Space Station Six", "You are in Space Station Six. The room is an anti gravity chamber and you begin to twist, turn, do 360 spins..", spaceStationSixItems);

		ArrayList<AdventureModel> concourseItems = new ArrayList<AdventureModel>();
		concourseItems.add(item11);
		Room concourse = new Room("Concourse", "You are in the Concourse. The room has a race track and at the starting you see a glossy white Bugatti Chiron.", concourseItems);

		ArrayList<AdventureModel> lavaPitsItems = new ArrayList<AdventureModel>();
		lavaPitsItems.add(item12);
		Room lavaPits = new Room("Lava Pits", "You are in the Lava Pits. The room is dark, smokey, loose ground, and there is a volcano. /nIn the center of the volcano there is a cave and in the middle there is stone with a burning ember inside.", lavaPitsItems);

		//Creates game map
		Room[][] gameMap= {{lavaPits, spaceStationSix, donutPalace, gardenOfEden},
				{gvsPharmacy, mainChamber, elderTreeForest, holyBananaSanctuary},
				{concourse, frostCove}};

		//Player will start in the Main Chamber
		int x = 1;
		int y = 1;

		//Creates the Adventurer Fuze
		Adventurer Fuze = new Adventurer();

		try{
			System.out.println("Welcome to Finding Milo! \n"
					+ "Find and collect all items to free King Milo.\n"
					+ "Commands:\n"
					+ "Movements:\n"
					+ "n = move north\n"
					+ "s = move south\n"
					+ "e = move east\n"
					+ "w = move west\n"
					+ "look = gives a description of the room\n"
					+ "get [item] = type 'get' followed by the name of the item to pick it up\n"
					+ "inventory = see what items are in your inventory\n"
					+ "quit = end the game");
			System.out.println();
			System.out.println(gameMap[x][y].getDescription());	

			boolean game = true;
			while(game && Fuze.getNeededItems() < 12)
			{
				//Gets user input
				System.out.print("> ");
				Scanner in = new Scanner(System.in);
				String input = in.nextLine();
				input = input.toLowerCase();

				//Commands to move between rooms
				if (input.equals("w")) {
					if (y > 0) {
						y--;
						gameMap[x][y].print();
					} else {
						System.out.println("You can't go that way.");
					}
				} else if (input.equals("e")) {
					if (y < gameMap[0].length - 1) {
						y++;
						gameMap[x][y].print();
					} else {
						System.out.println("You can't go that way.");
					}
				} else if (input.equals("n")) {
					if (x > 0) {
						x--;
						gameMap[x][y].print();
					} else {
						System.out.println("You can't go that way.");
					}
				} else if (input.equals("s")) {
					if (x < gameMap.length - 1) {
						x++;
						gameMap[x][y].print();
					} else {
						System.out.println("You can't go that way.");
					}
				}

				// Command to look around room
				else if (input.equals("look")) {
					gameMap[x][y].print();
				}

				// Command to get room item
				else if (input.length() > 4  && input.substring(0, 4).equals("get ")) {
					if (input.substring(0, input.indexOf(' ')).equals("get")) {
						if (input.substring(input.indexOf(' ')).length() > 1) {
							String item = input.substring(input.indexOf(' ') + 1);
							gameMap[x][y].getItem(gameMap[x][y], item, Fuze);
						}	
					}
				}

				//Command to show player inventory
				else if (input.equals("i") || input.equals("inv") || input.equals("inventory")) {
					Fuze.getInventory();
				}

				// Command to quit the game
				else if (input.equals("quit")) {
					System.out.println("Goodbye!");
					game = false;

					// Any other input is also invalid
				} else {
					System.out.println("You can't do that.");
				}

			}


			if(game)
				System.out.println("Congratulations! You found all the items and found Milo's Cell!\n"
						+ "	As you and King Milo headed for the extraction point, Drogas One-Eyed attacked you guys.\n"
						+ "	A furious battle began and you blocked with the shield and striked with the magic banana dildo\n"
						+ "	With one final blow, you brought Drogas down.\n"
						+ "	Then you headed back to the concourse, took the Bugatti and sped out of the temple while Gorilla soldiers attacked you two.\n"
						+ "	Once outside the temple, you and King Milo made it to the extraction point where Banana Party Five was waiting and returned to the Capital, Glistening Platanos to plan\n"
						+ "	for the invasion of San Gora!");
		}

		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("You can't go that way");

		}
	}

}


