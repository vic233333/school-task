public class RandomLetterChooser extends RandomStringChooser {
	/* Part (b) */

	public RandomLetterChooser(String str) {
		super(getSingleLetters(str));
	}

	public static String[] getSingleLetters(String str) {
		String[] letters = new String[str.length()];

		for (int i = 0; i < str.length(); i++)
			letters[i] = str.substring(i, i + 1);

		return letters;
	}

}
