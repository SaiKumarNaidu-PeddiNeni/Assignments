/**
 * 
 */
package card;

/**
 * @Sai Kumar
 *Nov 10, 2020
 * 
 */
public class PaybackCard extends Card {
	private int pointsEarned;
	private double totalAmount;
	
	
	public int getPointsEarned() {
		return pointsEarned;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;

	}
	
}
