package day5.src.day5;
/*
 * Create a another class Payback and extends card abstract class
 * 
 * Day 5
 * 
 * 
 * @author :Mani
 */

public class PayBackCard extends Card {
	private int pointsEarned;
	private double totalAmount;

	public int getPointsEarned() {
		return this.pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public PayBackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.totalAmount = totalAmount;
	}

	void printDetails() {
		System.out.println("Thanks " + this.holderName + " You have succesfully Applied for PayybackCard");
	}

}
