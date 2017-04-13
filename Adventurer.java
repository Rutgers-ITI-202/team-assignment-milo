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

	private boolean lantern = false;
	private boolean helpenol = false;
	private boolean magicBananaDildo = false;
	private boolean key = false;
	private boolean mysticalSmokingBanana = false;
	private boolean giantLeaf = false;
	public Adventurer(){
	}
	public void setlantern(boolean lantern) {
			this.lantern=!this.lantern;
		}
		public boolean getlantern() {
			return lantern;
		}
	public void sethelpenol(boolean sethelpenol) {
			this.helpenol=!this.helpenol;
		}
		public boolean gethelpenol() {
			return helpenol;
		}
	public void setmagicBananaDildo(boolean setmagicBananaDildo) {
			this.magicBananaDildo=!this.magicBananaDildo;
		}
		public boolean getmagicBananaDildo() {
			return magicBananaDildo;
		}
	public void setkey(boolean key) {
			this.key=!this.key;
		}
		public boolean getkey() {
			return key;
		}
	public void setmysticalSmokingBanana(boolean mysticalSmokingBanana) {
			this.mysticalSmokingBanana=!this.mysticalSmokingBanana;
		}
		public boolean getmysticalSmokingBanana() {
			return mysticalSmokingBanana;
		}
	public void setgiantLeaf(boolean giantLeaf) {
			this.giantLeaf=!this.giantLeaf;
		}
		public boolean getgiantLeaf() {
			return giantLeaf;
		}

	public static String inv[] = new String[6]; // creates an array named inv that holds 5 items

}
