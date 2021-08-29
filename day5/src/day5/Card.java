package day5.src.day5;
/*
 * 
 * Day 5: Assignment
 * 
 * @author mani
 * 
 */

abstract class Card {

	protected String holderName;
	protected String cardNumber;
	protected String expiryDate;

	public String getHolderName() {

		return this.holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Card(String holderName, String cardNumber, String expiryDate) {
		super();
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

}
