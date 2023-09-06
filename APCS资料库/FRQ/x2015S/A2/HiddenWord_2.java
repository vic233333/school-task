/**
 * 方法二
 */
public class HiddenWord_2 {
	private String word;

	public HiddenWord_2(String w1) {
		word = w1;
	}

	public String getHint(String guess) {
		String res = guess;
		for (int i = 0; i < guess.length(); i++) {
			if (!guess.substring(i, i + 1).equals(word.substring(i, i + 1))) {
				if (word.indexOf(guess.substring(i, i + 1)) != -1) {
					res = res.substring(0, i) + '+' + res.substring(i + 1);
				} else {
					res = res.substring(0, i) + "*" + res.substring(i + 1);
				}
			}
		}
		return res;
	}

	/******************************************************************************/

	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		System.out.println(puzzle.getHint("AAAAA"));
		System.out.println(puzzle.getHint("HELLO"));
		System.out.println(puzzle.getHint("HEART"));
		System.out.println(puzzle.getHint("HARMS"));
		System.out.println(puzzle.getHint("HARPS"));
	}
}
