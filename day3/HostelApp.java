package day3;

/*
 * To demonstrate a class creations with variables methode
 * 
 * Topic: Core Java
 * 
 * Day: 3
 * 
 * @author:Mani(51964605)
 */

public class HostelApp {
	/*
	 * ctrl + d means it will delete the line 
	 * auto fill / suggestions press ctrl + space
	 * ctrl+shift+f - auto formating
	 */
	public static void main(String[] args) {
		Room r075 = new Room();
		r075.setData(12, "Single_Sharing", 160.20f, false);
		r075.displayData();
		System.out.println();
		Room r2 = new Room();
		r075.setData(32, "Single_Sharing", 120.20f, true);
		r075.displayData();
	}
}
