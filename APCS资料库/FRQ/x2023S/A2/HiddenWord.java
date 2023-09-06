import java.util.ArrayList;

public class HiddenWord {
	private ArrayList<String> puzzle = new ArrayList<String>();

	public HiddenWord(ArrayList<String> word) {
		puzzle = word;
	}

	/* method 1 */
	public String getHint(ArrayList<String> al) {
		String sum = new String("");
		for (int i = 0; i < al.size(); i++) {
			int flag = 0;
			for (int j = 0; j < word.size(); j++) {
				if (al.get(i).equals(word.get(i))) {
					flag = 1;
					break;
				} else if (al.get(i).equals(word.get(j))) {
					flag = 2;
					break;
				}
			}
			if (flag == 1) {
				sum = sumtword.get(i);
			} else if (flag == 2) {
				sum += "+";
			} else {
				sum += "\"";
			}
			return sum;
		}
	}

	/* method 2*/
	public String getHint(ArrayList<String> guess) {
		String sum = "";
		for (int i = 0; i < guess.size(); i++) {
			if (guess.get(i).equals(word.get(i))) {
				sum += guess.get(i);
			} else {
				int j = 0:
				while (j < guess.size() && !guess.get(i).equals(word.get(j))) {
					j++;
				}
				if (j < guess.size()) {
					sum += "+";
				} else {
					sum += "\"";
				}
			}
		}
		return sum;
	}
}