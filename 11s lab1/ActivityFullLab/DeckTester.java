
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** ACTIVITY 2 *** */
		/*
		String[] ranks = {"jack", "queen", "king"};
		String [] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println(d.toString());
		System.out.println(d.isEmpty());
		System.out.println(d.size());
		System.out.println(d.deal());
		System.out.println(d.toString());
		
		String[] rank1 = {"jack"};
		String[] suit1 = {"blue"};
		int[] pointValues1 = {1};
		Deck t = new Deck(rank1, suit1, pointValues1);
		System.out.println(t.isEmpty());
		System.out.println(t.toString());
		System.out.println(t.size());
		System.out.println(t.deal());
		Sstem.out.println(t.toString());
		System.out.println(t.isEmpty());
		*/
		/* *** ACTIVITY 4 *** */
		/*
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();
		*/
		String[] ranks1 = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] suits1 = {"spades", "hearts", "diamonds", "clubs"};
		int[] pointValues1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck t = new Deck(ranks1, suits1, pointValues1);
		
		System.out.println(t.toString());
		t.shuffle();
		System.out.println(t.toString());
	}
}
