import java.util.ArrayList;

public class SelfDivisor {
	/* Part (a) */

	/**
	 * @param number the number to be tested
	 *               Precondition: number > 0
	 * @return true if every decimal digit of number is a divisor of number;
	 * false otherwise
	 */
	public static boolean isSelfDivisor(int number) {
		int n = number;
		while (number > 0) {
			int dig = number % 10;
			if (dig == 0 || n % dig != 0) {
				return false;
			}
			number = number / 10;
		}
		return true;
	}

	/* Part (b) */

	/**
	 * @param start starting point for values to be checked
	 *              Precondition: start > 0
	 * @param num   the size of the array to be returned
	 *              Precondition: num > 0
	 * @return an array containing the first num integers >= start that are self-divisors
	 */
	/* method 1*/
	public static int[] firstNumSelfDivisors(int start, int num) {
		int[] arr = new int[num];
		int sd = start - 1;
		for (int i = 0; i < arr.length; i++) {
			sd = sd + 1;
			while (!isSelfDivisor(sd)) {
				sd = sd + 1;
			}
			arr[i] = sd;
		}
		return arr;
	}

	/**
	 * @param start starting point for values to be checked
	 *              Precondition: start > 0
	 * @param num   the size of the array to be returned
	 *              Precondition: num > 0
	 * @return an array containing the first num integers >= start that are self-divisors
	 */
	/* method 2*/
	public static int[] firstNumSelfDivisors(int start, int num) {
		int[] arr = new int[num];
		ArrayList<Integer> al = new ArrayList<Integer>();
		int sd = start;
		while (al.size() <= num) {
			if (isSelfDivisor(sd)) {
				al.add(sd);
			}
			sd++;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = al.get(i);
		}
		return arr;
	}

	/****************/

	public static void main(String[] args) {
		System.out.println("128: " + isSelfDivisor(128));
		System.out.println("26: " + isSelfDivisor(26));
		System.out.println("120: " + isSelfDivisor(120));
		System.out.println("102: " + isSelfDivisor(102));
		for (int n : firstNumSelfDivisors(10, 3))
			System.out.print(n + " ");
		System.out.println();
	}
}
