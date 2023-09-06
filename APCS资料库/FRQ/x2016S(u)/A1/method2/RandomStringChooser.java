import java.util.ArrayList;

public class RandomStringChooser {

	private ArrayList<String> arrayList;

	public RandomStringChooser(String[] wordArray) {
		arrayList = new ArrayList<String>();
		for (int i = 0; i < wordArray.length; i++) {
			arrayList.add(wordArray[i]);
		}
	}

	public String getNext() {
		if (arrayList.size() == 0) {
			return "NONE";
		} else {
			int rand = (int) (Math.random() * arrayList.size());
			return arrayList.remove(rand);
		}
	}
}






