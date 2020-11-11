/**
 * 
 */
package card;

/**
 * @Sai KumarS
 *Nov 10, 2020
 * 
 */
public class MembershipCard extends Card {
	 private int rating;
	 
	 public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
			super(holderName , cardNumber, expiryDate);
			this.rating = rating;
		}

	public int getRating() {
		return rating;
	}

	

}
