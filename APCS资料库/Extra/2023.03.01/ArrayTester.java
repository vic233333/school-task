import java.util.Arrays;

public class ArrayTester {
	/********************** Part (a) *************************/

	/**
	 * Returns an array containing the elements of column c of arr2D in the same
	 * order as they appear in arr2D.
	 * Precondition: c is a valid column index in arr2D.
	 * Postcondition: arr2D is unchanged.
	 */
	public static int[] getColumn(int[][] arr2D, int c) {

	}

	/*********************************************************/

	/**
	 * Returns true if and only if every value in arr1 appears in arr2.
	 * Precondition: arr1 and arr2 have the same length.
	 * Postcondition: arr1 and arr2 are unchanged.
	 */
	/* method1 用break */
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					flag = true;
				}
			}
			if (!flag) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns true if and only if every value in arr1 appears in arr2.
	 * Precondition: arr1 and arr2 have the same length.
	 * Postcondition: arr1 and arr2 are unchanged.
	 */
	/* method2 碰到条件退出循环，结束后判断循环次数 */
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			int j = 0;
			while (j < arr1.length && arr2[i] != arr1[j]) {
				j++;
			}
			if (j == arr1.length) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns true if and only if every value in arr1 appears in arr2.
	 * Precondition: arr1 and arr2 have the same length.
	 * Postcondition: arr1 and arr2 are unchanged.
	 */
	/* method3 不用break，手动break */
	public static boolean hasAl1Values(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			int j;
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					j = arr2.length + 10;
					// break
				}
			}
			if (j == arr2.length) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns true if arr contains any duplicate values;
	 * false otherwise.
	 */
	public static boolean containsDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

	/********************** Part (b) *************************/

	/**
	 * Returns true if square is a Latin square as described in part (b);
	 * false otherwise.
	 * Precondition: square has an equal number of rows and columns.
	 * square has at least one row.
	 */
	public static boolean isLatin(int[][] square) {

	}

	/********************** Test *************************/

	public static void main(String[] args) {
		int[][] arr2D = { { 0, 1, 2 },
				{ 3, 4, 5 },
				{ 6, 7, 8 },
				{ 9, 5, 3 } };

		int[] result = ArrayTester.getColumn(arr2D, 1);
		System.out.println(Arrays.toString(result));

		int[][] square1 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		int[][] square2 = { { 10, 30, 20, 0 }, { 0, 20, 30, 10 }, { 30, 0, 10, 20 }, { 20, 10, 0, 30 } };
		int[][] square3 = { { 1, 2, 1 }, { 2, 1, 1 }, { 1, 1, 2 } };
		int[][] square4 = { { 1, 2, 3 }, { 3, 1, 2 }, { 7, 8, 9 } };
		int[][] square5 = { { 1, 2 }, { 1, 2 } };

		System.out.println(isLatin(square1) + " " + isLatin(square2) + " " + isLatin(square3) + " " +
				isLatin(square4) + " " + isLatin(square5));
	}

}