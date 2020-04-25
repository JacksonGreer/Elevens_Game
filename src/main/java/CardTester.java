/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("Two", "Hearts", 2);
		Card b = new Card("Jack", "Spades", 10);
		Card c = new Card("Ace", "Diamonds", 11);
		Card d = new Card("Jack", "Spades", 10);

		System.out.println("The ranks and suits of the cards are as follows...");
		System.out.println("Card a: " + a.rank() + " of " + a.suit());
		System.out.println("Card b: " + b.rank() + " of " + b.suit());
		System.out.println("Card c: " + c.rank() + " of " + c.suit());

		System.out.println("Does Card A equal Card B? " + a.equals(b));
		System.out.println("Does Card B equal Card D? " + b.equals(d));

	}
}
