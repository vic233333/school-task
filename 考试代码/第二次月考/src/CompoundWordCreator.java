import java.util.*;

public class CompoundWordCreator {
	private List<String> wordList; //contains no duplicates

	/**
	 * @return true if word is in the dictionary; false otherwise
	 */
	private boolean inDictionary(String word) {
		/* implementation not shown */
	}

	/**
	 * precondition : wordLi st . size() > 0
	 *
	 * @return the number of deleted string in wordList and update the wordList
	 */
	private int deleteString(String str) {
		int count = 0;
		for (int i = 0; i < wordList.size(); i++) {
			String temp = wordList.get(i);
			int k = temp.indexOf(str);
			while (k != -1) {
				temp = temp.substring(0, k) + temp.substring(k + str.length());
				count++;
				k = temp.indexOf(str);
			}
			wordList.set(k, temp);
		}
		return count;
	}

	/**
	 * Combines all pairs of words in wordlist whose lengths sum to letterSum,
	 * and adds the new words to the list compoundWords if the new words were
	 * found in the dictionary. Words should not be combined with themselves.
	 */
	private void addCompoundWords(List<String> compoundWords, int letterSum) {
		for (int i = 0; i < wordList.size(); i++) {
			for (int j = 0; j < wordList.size(); j++) {
				String ti = wordList.get(i);
				String tj = wordList.get(j);
				if (ti.length() + tj.length() == letterSum) {
					if (inDictionary(ti + tj)) {
						compoundWords.add(ti + tj);
					}
					if (inDictionary(tj + ti)) {
						compoundWords.add(tj + ti);
					}
				}
			}
		}
	}

	/**
	 * precondition: wordList.size() > 0
	 *
	 * @return the length of the longest word in wordList
	 */
	private int findMaxLength() {
		/* to be completed in part (a) */
	}

	/**
	 * precondition: wordList.size() > 0
	 *
	 * @return a list of compound words found in the dictionary that were created
	 * by combining strings in the list wordList
	 * postcondition: for each word, w, in list, inDictionary(w) == true and
	 * 3 <= w.length() <= findMaxLength().
	 */
	public List<String> buildWords() {
		List<String> res = new ArrayList<String>();
		int maxn = findMaxLength(); // 这还需要自己找调用真是依托答辩
		for (int i = 3; i < maxn; i++) {
			addCompoundWords(res, i);
		}
		return res;
	}
// Constructors, other methods, and instance variables are not shown.
}