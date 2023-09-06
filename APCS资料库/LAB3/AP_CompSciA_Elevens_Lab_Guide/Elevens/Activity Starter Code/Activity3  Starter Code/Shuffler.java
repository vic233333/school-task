import java.util.*;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	/**
	 * Tests shuffling methods.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
				" consecutive perfect shuffles:");
		int[] values1 = { 0, 1, 2, 3 };
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
				" consecutive efficient selection shuffles:");
		int[] values2 = { 0, 1, 2, 3, 4, 5, 6, 7 };
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		selectionSort(values2);
		System.out.println(Arrays.toString(values2));
		System.out.println();
	}

	public static void selectionSort(int[] n) {
		for (int i = 0; i < n.length; i++) {
			int max = i;
			// find max
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] > n[max]) {
					max = j;
				}
			}
			// swap
			int temp = n[i];
			n[i] = n[max];
			n[max] = temp;

		}
	}

	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * 
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		int[] shuffled = new int[values.length];
		int k = 0;
		for (int j = 0; j < (values.length - 1) / 2 + 1; j++) {
			shuffled[k] = values[j];
			k = k + 2;
		}
		k = 1;
		for (int j = (values.length - 1) / 2 + 1; j < values.length; j++) {
			shuffled[k] = values[j];
			k = k + 2;
		}
		for (int i = 0; i < shuffled.length; i++) {
			values[i] = shuffled[i];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * 
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		/*
		 * method 1
		 * for (int k = values.length - 1; k >= 0; k--) {
		 * int r = (int) (Math.random() * (k + 1));
		 * int temp = values[k];
		 * values[k] = values[r];
		 * values[r] = temp;
		 * }
		 */
		/* method 2 */
		List<Integer> suffleList = new ArrayList<Integer>();
		for (int i = 0; i < values.length; i++) {
			suffleList.add(values[i]);
		}
		for (int i = 0; i < values.length; i++) {
			int k = (int) (Math.random() * suffleList.size());
			values[i] = suffleList.remove(k);
		}
	}

	public static String flip() {
		int k = (int) (Math.random() * 3);
		if (k == 0 || k == 1) {
			return "head";
		} else {
			return "tail";
		}
	}

	public static void testFlip() {
		int count_head = 0;
		int count_tail = 0;
		for (int i = 0; i < 1000; i++) {
			String temp = flip();
			if (temp.equals("head")) {
				count_head++;
			} else {
				count_tail++;
			}
		}
		System.out.println("head" + count_head);
		System.out.println("tail" + count_tail);
	}

	public static boolean arePermutations(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int k = 0; k < b.length; k++) {
				if (a[i] == b[k]) {
					flag = true;
				}
			}
			if (flag == false) {
				return false;
			}
		}
		return true;
	}

	public static void testP() {
		int[] array_1 = new int[] { 1, 2, 3, 4 };
		int[] array_2 = new int[] { 2, 1, 3, 4 };
		int[] array_3 = new int[] { 1, 4, 2, 5 };
		System.out.println(arePermutations(array_1, array_2));
		System.out.println(arePermutations(array_1, array_3));
	}

	public static void sort(int[] values) {
		for (int k = values.length - 1; k >= 0; k--) {
			int maxn_index = k;
			for (int j = 0; j < k; j++) {
				if (values[j] > values[maxn_index]) {
					maxn_index = j;
				}
			}
			int temp = values[k];
			values[k] = values[maxn_index];
			values[maxn_index] = temp;
		}
	}
}
