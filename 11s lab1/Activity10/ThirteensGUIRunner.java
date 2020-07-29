/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class ThirteensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ThirteensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
