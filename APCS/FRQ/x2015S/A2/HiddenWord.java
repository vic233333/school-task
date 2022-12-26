public class HiddenWord {
	private String word;

	public HiddenWord(String w1) {
		word = w1;
	}

	public String getHint(String guess) {
		String res = "";
		for (int i = 0; i < guess.length(); i++) {
			if (guess.substring(i, i + 1).equals(word.substring(i, i + 1))) {
				// in the same position
				res += word.substring(i, i + 1);
			} else if (word.indexOf(guess.substring(i, i + 1)) != -1) {
				// 排除第一种情况以后,在其他的位置
				res += "+";
			} else {// not in the hidden word
				res += "*";
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
