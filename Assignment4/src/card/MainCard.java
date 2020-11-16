
/**
 *    printing the bank details and type.
 */
package card;

import java.util.Scanner;

public class MainCard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("select the card \n 1.MembershiCard \n 2.PaybackCard");
		int selectCard;
		selectCard = scan.nextInt();
		scan.nextLine();

		System.out.println("enter the card details Holder_Nmae, Card_Number and Expiry_Date seperated by |");
		String entireString = scan.nextLine();
		String[] string = entireString.split("\\|");
		for (String a : string) {
			System.out.println(a);
		}
		String holderName = string[0];
		String cardNumber = string[1];
		String expiryDate = string[2];

		int rating;
		int totalAmount;
		double pointsEarned;

		if (selectCard == 1) {
			System.out.println("enter the rating value");
			rating = scan.nextInt();
			MembershipCard membershipCard = new MembershipCard(holderName, cardNumber, expiryDate, rating);
			System.out.println(membershipCard.holderName + " card details ");
			System.out.println("card number" + membershipCard.cardNumber);
			System.out.println("rating " + membershipCard.getRating());
			System.out.println("expiry date" + membershipCard.expiryDate);

			membershipCard = null;
		}

		else if (selectCard == 2) {

			System.out.println("enter the totalAmount and pointsEarned");
			totalAmount = scan.nextInt();
			pointsEarned = scan.nextDouble();
			PaybackCard paybackCard = new PaybackCard(holderName, cardNumber, expiryDate, totalAmount, pointsEarned);
			System.out.println(paybackCard.holderName + " card details ");
			System.out.println("card number" + paybackCard.cardNumber);
			System.out.println("rating" + paybackCard.getTotalAmount());
			System.out.println("rating" + paybackCard.getPointsEarned());
			System.out.println("expiry date" + paybackCard.expiryDate);

			paybackCard = null;
		}
		scan.close();

	}
}