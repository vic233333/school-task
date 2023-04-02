public class Phrase {
	private String currentPhrase;

	/**
	 * Constructs a new Phrase object.
	 */
	public Phrase(String p) {
		currentPhrase = p;
	}

	/**
	 * Returns the index of the nth occurrence of str in the current phrase;
	 * returns -1 if the nth occurrence does not exist.
	 * Precondition: str.length() > 0 and n > 0
	 * Postcondition: the current phrase is not modified.
	 */
	public int findNthOccurrence(String str, int n) {
		int i = -1;
		while (n > 0) {
			i = currentPhrase.indexOf(str, i + 1);
			if (i < 0) return -1;
			n--;
		}
		return i;
	}

	/**************** Part (a) ****************/

	/**
	 * Modifies the current phrase by replacing the nth occurrence of str with repl.
	 * If the nth occurrence does not exist, the current phrase is unchanged.
	 * Precondition: str.length() > 0 and n > 0
	 */
	public int replaceNthOccurrence(String str, int n, String repl) {
		int index = findNthOccurrence(str, n + 1);
		while (index != -1) {
			n++;
			index = findNthOccurrence(str, n + 1);
		}
		if (n != 0) {
			return findNthOccurrence(str, n);
		} else {
			return -1;
		}
	}

	/**************** Part (b) ****************/

	/**
	 * Returns the index of the last occurrence of str in the current phrase;
	 * returns -1 if str is not found.
	 * Precondition: str.length() > 0
	 * Postcondition: the current phrase is not modified.
	 */
	/* method 1 */
	public int findLastOccurrence(String str) {
		int last = -1;
		int i = currentPhrase.indexOf(str);
		while (i != -1) {
			last = i;
			i = currentPhrase.indexOf(str, i + 1);
		}
		return last;
	}

	/* method 2 */
	public int findLastOccurrence(String str) {
		int count = 1;
		int last = -1;
		int i = findNthOccurrence(str, 1);
		while (i != -1) {
			count++;
			last = i;
			i = findNthOccurrence(str, count);
		}
		return last;
	}

	/* method 3 */
	public int findLastOccurrence(String str) {
		int count = currentPhrase.length();
		while (count >= 1 && findNthOccurrence(str, count) == -1) {
			count--;
		}
		if (count >= 1) {
			return findNthOccurrence(str, count);
		} else {
			return -1;
		}
	}

	/* method 4 */
	public int findLastOccurrence(String str) {
		for (int i = currentPhrase.length() - 1; i >= 0; i--) {
			if (findNthOccurrence(str, i + 1) != -1) {
				return findNthOccurrence(str, i + 1);
			}
		}
		return -1;
	}

	/**
	 * Returns a string containing the current phrase.
	 */
	public String toString() {
		return currentPhrase;
	}

	public static void main(String[] args) {
		Phrase phrase1 = new Phrase("A cat ate late.");
		phrase1.replaceNthOccurrence("at", 1, "rane");
		System.out.println(phrase1); // A crane ate late.

		Phrase phrase2 = new Phrase("A cat ate late.");
		phrase2.replaceNthOccurrence("at", 6, "xx");
		System.out.println(phrase2); // A cat ate late.

		Phrase phrase3 = new Phrase("A cat ate late.");
		phrase3.replaceNthOccurrence("bat", 2, "xx");
		System.out.println(phrase3); // A cat ate late.

		Phrase phrase4 = new Phrase("aaaa");
		phrase4.replaceNthOccurrence("aa", 1, "xx");
		System.out.println(phrase4); // xxaa

		Phrase phrase5 = new Phrase("aaaa");
		phrase5.replaceNthOccurrence("aa", 2, "bbb");
		System.out.println(phrase5); // abbba

		phrase1 = new Phrase("A cat ate late.");
		System.out.println(phrase1.findLastOccurrence("at")); // 11
		System.out.println(phrase1.findLastOccurrence("cat")); // 2
		System.out.println(phrase1.findLastOccurrence("bat")); // -1
	}
}
