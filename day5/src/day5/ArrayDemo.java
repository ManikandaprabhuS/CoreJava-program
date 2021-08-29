package day5;

public class ArrayDemo {

	public static void main(String[] args) {
	   int[] priceList = new int[] { 10, 20, 10, 30, 10 };

		 // Buy 2- 4 items
		int[] boughtItems = new int[3];
		System.arraycopy(priceList, 1, boughtItems, 0, 3); //copy from second item
		int totalPrice = 0;
		for (int buy : boughtItems) {
		totalPrice += buy;
		}
		System.out.println("Number of item bought:" + boughtItems.length + " Total Price is:" + totalPrice);

		 // Buy 2 & 5
		int[] boughtItems2 = new int[2];
		totalPrice = 0;
		boughtItems2[0] = priceList[1]; //second item
		boughtItems2[1] = priceList[4]; //fifth item
		for (int buy : boughtItems2) {
		totalPrice += buy;
		}
		System.out.println("Number of item bought:" + boughtItems2.length + " Total Price is:" + totalPrice);

		 }


	}

