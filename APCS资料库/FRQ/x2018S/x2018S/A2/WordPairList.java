import java.util.ArrayList;

public class WordPairList {
	/**
	 * The list of word pairs, initialized by the constructor.
	 */
	private ArrayList<WordPair> allPairs;

	/********************** Part (a) *************************/

	/**
	 * Constructs a WordPairList object as described in part (a).
	 * Precondition: words.length >= 2
	 */
	public WordPairList(String[] words) {
		allPairs = new ArrayList<WordPair>();
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				allPairs.add(new WordPair(words[i], words[j]));
			}
		}
	}

	/********************** Part (b) *************************/

	/**
	 * Returns the number of matches as described in part (b).
	 */
	public int numMatches() {
		int count = 0;
		for (int i = 0; i < allPairs.size(); i++) {
			if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) {
				count++;
			}
		}
		return count;
	}

	/********************** Test *************************/

	public String toString() {
		return allPairs.toString();
	}

	public static void main(String[] args) {
		String[] wordNums = {"one", "two", "three"};
		WordPairList exampleOne = new WordPairList(wordNums);
		System.out.println(exampleOne);

		String[] phrase = {"the", "more", "the", "merrier"};
		WordPairList exampleTwo = new WordPairList(phrase);
		System.out.println(exampleTwo);

		String[] moreWords = {"the", "red", "fox", "the", "red"};
		WordPairList exampleThree = new WordPairList(moreWords);
		System.out.println(exampleThree.numMatches());
	}
}