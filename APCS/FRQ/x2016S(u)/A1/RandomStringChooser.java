import java.util.ArrayList;

public class RandomStringChooser {

	private String[] arr;
	private int range;

	public RandomStringChooser(String[] wordArray) {
		arr = new String[wordArray.length];
		range = arr.length - 1;
		for (int i = 0; i < wordArray.length; i++) {
			arr[i] = wordArray[i];
		}
	}

	public String getNext() {
		if (range == 0) {
			return "NONE";
		} else {
			int rand = (int) (Math.random() * arr.length);
			String temp = arr[rand];
			arr[rand] = arr[range];
			arr[range] = temp;
			range = range - 1;
			return temp;
		}
	}
}






