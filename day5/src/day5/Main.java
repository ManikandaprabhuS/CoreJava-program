package day5.src.day5;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * Day 6
 * 
 * Author Mani
 */
//import java.util.Scanner;

public class Main extends Exception {

	public static void main(String[] args) throws Exception {

		int Count = 0; // for increment the paybackList if its data's present
		int Count2 = 1; // for increment the MemberShipCard if its data's present
		ArrayList<String> paybackCard_List = new ArrayList<String>(); // ArrayList for Paybackcard
		ArrayList<String> memberShipCard_List = new ArrayList<String>();// ArrayList for memberShipCard
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Welcome City bank App");
				System.out.println("Enter any one options");
				System.out.println("1).PayBackCard");
				System.out.println("2).MemberShipCard");
				int n = sc.nextInt();
				// char c = (char) n;
				if (n > 2) // checking N is greater than 2 or not
				{
					throw new Exception("Select either options 1 or options 2");
				}
				String rating = " ";
				System.out.println("Enter the card Details");
				String cardDetails = sc.next();
				String[] arr = cardDetails.split("\\|");
				String holderName = arr[0];
				String cardNumber = arr[1];
				String expiryDate = arr[2];
				char ch1 = holderName.charAt(0);
				char ch2 = cardNumber.charAt(0);
				if (Character.isDigit(ch1) || Character.isAlphabetic(ch2)) // checking holderName and cardNumber
				{
					throw new Exception("NumberFormatException");
				}
				if (n != 1) // if n!=1 means it will ask to give Rating
				{
					if (Count2 >= 2) // checking if holdername & cardNumber In MembershipCard
					{
						if ((memberShipCard_List.contains(holderName)) || (memberShipCard_List.contains(cardNumber))) {
							throw new Exception("Sorry " + holderName + ", you already applied for MemberShipcard....");
						} else {
							System.out.println("Enter Rating Out of Five");
							rating = sc.next();
							if (Character.isDigit(rating.charAt(0)) || (rating.length() > 5)) {
								throw new Exception("Enter Valid Rating!");
							}
							memberShipCard_List.add(arr[0]); // add the data to membershipCardList
							memberShipCard_List.add(arr[1]); // add the data to membershipCardList
						}
					} else {
						memberShipCard_List.add(arr[0]); // add the data to membershipCardList
						memberShipCard_List.add(arr[1]); // add the data to membershipCardList
					}

				} else {
					if (Count != 0) // check if data is already or not
					{
						if ((paybackCard_List.contains(holderName)) || (paybackCard_List.contains(cardNumber))) {
							throw new Exception("Sorry " + holderName + ", you already applied for Payback card....");
						} else {
							paybackCard_List.add(arr[0]);
							paybackCard_List.add(arr[1]);
						}
					} else {
						paybackCard_List.add(arr[0]); // add the data to membershipCardList
						paybackCard_List.add(arr[1]); // add the data to membershipCardList
					}
				}
				System.out.println("Enter the points in card");
				int pointsEarned = sc.nextInt();
				System.out.println("Enter The Amount");
				double amount = sc.nextDouble();
				switch (n) {
				case 1:
					PayBackCard pbc = new PayBackCard(holderName, cardNumber, expiryDate, pointsEarned, amount);
					pbc.printDetails();
					break;
				case 2:
					MembershipCard mcard = new MembershipCard(holderName, cardNumber, expiryDate, rating);
					mcard.display();
					break;
				default:
				}
				Count2++;
			} catch (Exception e) {
				System.out.println(e);
			}
			Count++;
		} while (true);
	}
}
