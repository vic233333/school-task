public class WordPair {
	private String first, second;

	/**
	 * Constructs a WordPair object.
	 */
	public WordPair(String first, String second) {
		this.first = first;
		this.second = second;
	}

	/**
	 * Returns the first string of this WordPair object.
	 */
	public String getFirst() {
		return first;
	}


	/**
	 * Returns the second string of this WordPair object.
	 */
	public String getSecond() {
		return second;
	}

	public String toString() {
		return "(" + first + ", " + second + ")";
	}
}