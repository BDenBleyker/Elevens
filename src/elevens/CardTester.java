package elevens;


/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Ace","Spades",1);
                Card card2 = new Card("One","Diamonds",1);
                Card card3 = new Card("Eight","Hearts",1);
                System.out.println(card1 + " == " + card2 + ": " + (card1.matches(card2)));
                card1.setRank(card2.getRank());
                card1.setSuit(card2.getSuit());
                card1.setPointValue(card2.getPointValue());
                System.out.println(card1 + " == " + card2 + ": " + (card1.matches(card2)));
	}
}
