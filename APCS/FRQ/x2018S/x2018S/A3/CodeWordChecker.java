public class CodeWordChecker {
	private int min;
	private int max;
	private String str;

	public CodeWordChecker(int min1, int max1, String str1) {
		min = min1;
		max = max1;
		str = str1;
	}

	public CodeWordChecker(String str1) {
		min = 6;
		max = 20;
		str = str1;
	}//overloading

	public boolean isValid(String strPhrase) {
		if (strPhrase.length() >= 5 && strPhrase.length() <= 8 && strPhrase.indexOf(str) == -1) {
			return true;
		} else {
			return false;
		}
	}
}