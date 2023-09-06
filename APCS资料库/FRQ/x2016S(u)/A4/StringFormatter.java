import java.util.List;
import java.util.ArrayList;

public class StringFormatter {
	/* Part (a) */

	public static int totalLetters(List<String> wordList) {
		int total = 0;
		for (int i = 0; i < wordList.size(); i++) {
			total += wordList.get(i).length();
		}
		return total;
	}

	/* Part (b) */

	public static int basicGapWidth(List<String> wordList,
									int formattedLen) {
		return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
	}

	/***********/

	public static int leftoverSpaces(List<String> wordList,
									 int formattedLen) {
		return formattedLen - totalLetters(wordList) -
				basicGapWidth(wordList, formattedLen) * (wordList.size() - 1);
	}

	/* Part (c) */

	public static String format(List<String> wordList, int formattedLen) {
		int gapLen = basicGapWidth(wordList, formattedLen);
		int leftoversLen = leftoverSpaces(wordList, formattedLen);
		String sum = "";
		String gap = "";
		for (int i = 0; i < gapLen; i++) {
			gap = gap + " ";
		}
		for (int i = 0; i < wordList.size(); i++) {
			sum = sum + wordList.get(i);
			if (i < wordList.size() - 1) {
				sum += gap;
			}
			if (leftoversLen > 0) {
				sum = sum + " ";
				leftoversLen--;
			}
		}
		return sum;
	}
}