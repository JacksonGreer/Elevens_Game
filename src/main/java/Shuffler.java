import java.util.concurrent.ThreadLocalRandom;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 5;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
//		System.out.println("Results of " + SHUFFLE_COUNT +
//								 " consecutive perfect shuffles:");
//		int[] values1 = {0,1,2,3};
//		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
//			values1 = perfectShuffle(values1);
//			System.out.print("  " + j + ":");
//			for (int k = 0; k < values1.length; k++) {
//				System.out.print(" " + values1[k] + ", ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//
//		System.out.println("Results of " + SHUFFLE_COUNT +
//								 " consecutive efficient selection shuffles:");
//		int[] values2 = {0,1,2,3};
//		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
//			values2 = selectionShuffle(values2);
//			System.out.print("  " + j + ":");
//			for (int k = 0; k < values2.length; k++) {
//				System.out.print(" " + values2[k] + ", ");
//			}
//			System.out.println();
//		}
//		System.out.println();

		int headsCount = 0;
		for (int i = 0; i < 1000000; i++) {
			String coin = flip();
			if (coin.equals("heads")) {
				headsCount++;
			}
		}
		System.out.println("Weighted coin that was flipped 100 times. Came up heads " + headsCount + " times.");
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 * @return a shuffled array of values
	 */
//	public static int[] perfectShuffle(int[] values) {
//		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
//		int[] shuffled = new int[values.length];
//		int k = 0;
//		for (int j = 0; j < values.length/2; j++ ){
//			shuffled[k] = values[j];
//			k += 2;
//		}
//		k = 1;
//		for (int j = values.length/2; j < values.length; j++){
//			shuffled[k] = values[j];
//			k += 2;
//		}
//		return shuffled;
//	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 * @return a shuffled array of the values
	 */
//	public static int[] selectionShuffle(int[] values) {
//		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
//		int[] shuffled = values.clone();
//		for (int k = values.length - 1; k >= 0; k--){
//			int r = (int)(Math.random() * values.length); // range of values r could == 1..values.length
//			// get references to the specific cards
//			int firstCard = shuffled[r];
//			int secondCard = shuffled[k];
//			// now switch cards
//			shuffled[k] = firstCard;
//			shuffled[r] = secondCard;
//		}
//
//		return shuffled;
//	}

	public static String flip(){
		String[] coins = {"heads", "heads", "tails"};
		int r = ThreadLocalRandom.current().nextInt(0, 3);
//		System.out.println("The result of the coin flip is " + coins[r] + ".");
		return coins[r];
	}


}
