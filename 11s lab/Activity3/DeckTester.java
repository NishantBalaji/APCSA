/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String [] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println(d.toString());
		System.out.println(d.isEmpty());
		System.out.println(d.size());
		System.out.println(d.deal());
		System.out.println(d.toString());
		
		String[] rank1 = {};
		String[] suit1 = {};
		int[] pointValues1 = {};
		Deck t = new Deck(rank1, suit1, pointValues1);
		System.out.println(t.isEmpty());
		System.out.println(t.toString());
		System.out.println(t.size());
		System.out.println(t.deal());
		System.out.println(t.toString());
	}
}
