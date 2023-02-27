import java.util.Arrays;

import javax.swing.text.rtf.RTFEditorKit;

public class DiverseArray {
	// Part (a)

	/**
	 * Returns the sum of the entries in the one-dimensional array arr.
	 */
	public static int arraySum(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i];
		}
		return ans;
	}

	// Part (b)

	/**
	 * Returns a one-dimensional array in which the entry at index k is the sum of
	 * the entries of row k of the two-dimensional array arr2D.
	 */
	public static int[] rowSums(int[][] arr2D) {
		int ans[] = new int[arr2D.length];
		for (int r = 0; r < arr2D.length; r++) {
			ans[r] = arraySum(arr2D[r]);
		}
		return ans;
	}

	// Part (c)

	/**
	 * Returns true if all rows in arr2D have different row sums;
	 * false otherwise.
	 */
	public static boolean isDiverse(int[][] arr2D) {
		int ans[] = rowSums(arr2D);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans.length; j++) {
				if (ans[i] == ans[j]) {
					return false;
				}
			}
		}
		return true;
	}

	/******************************************************************************/

	public static void main(String[] args) {
		int[][] mat1 = { { 1, 3, 2, 7, 3 },
				{ 10, 10, 4, 6, 2 },
				{ 5, 3, 5, 9, 6 },
				{ 7, 6, 4, 2, 1 } };

		int[][] mat2 = { { 1, 1, 5, 3, 4 },
				{ 12, 7, 6, 1, 9 },
				{ 8, 11, 10, 2, 5 },
				{ 3, 2, 3, 0, 6 } };

		int[] sums = rowSums(mat1);
		System.out.println(Arrays.toString(sums));
		System.out.println(isDiverse(mat1) + " " + isDiverse(mat2));
	}
}
