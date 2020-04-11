/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Two", "Four", "Eight"};
		String[] suits = {"Clubs", "Diamonds"};
		int[] pointValues = {2, 4, 8};
		Deck deckA = new Deck(ranks, suits, pointValues);

		String[] blackjackRanks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String[] blackjackSuits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		int[] blackjackValues = {2,3,4,5,6,7,8,9,10,10,10,10,11};
		Deck blackjackDeck = new Deck(blackjackRanks, blackjackSuits, blackjackValues);
		System.out.println("There are " + blackjackDeck.size() + " cards in the Twenty-One deck.");
	}
}
