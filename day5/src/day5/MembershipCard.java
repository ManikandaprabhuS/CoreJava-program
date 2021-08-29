package day5.src.day5;
/*
 * Second class and extends a Card abstract 
 * 
 * Day 5 
 * 
 * @author :Mani
 * 
 */

public class MembershipCard extends Card {

	private String rating;

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public MembershipCard(String holderName, String cardNumber, String expiryDate, String rating2) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating2;
	}

	void display() {
		System.out.println("Thanks " + this.holderName + " You have succesfully Applied for MemberShipCard");
		// System.out.println("Rating:" + this.rating);
	}

}
