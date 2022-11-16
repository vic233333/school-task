/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String str = new String("A");
		Card cardOne = new Card("A", "Heart", 1);
		Card cardTwo = new Card("A", "Heart", 1);
		Card cardThree = new Card("J", "Spade", 1);
		System.out.println(cardOne);
		System.out.println(cardTwo);
		System.out.println(cardThree);
		System.out.println(cardOne.matches(cardTwo));
		System.out.println(cardOne.matches(cardThree));
	}
}
