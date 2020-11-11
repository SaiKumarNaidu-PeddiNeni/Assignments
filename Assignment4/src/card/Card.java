/**
 * 
 */
package card;

/**
 * @Sai Kumar
 *Nov 10, 2020
 * 
 */
public abstract class Card {
	
	protected String holderName;
	protected String cardNumber;
	protected String expiryDate;
	public Card(String holderName, String cardNumber, String expiryDate) {
		super();
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
	
	

}
