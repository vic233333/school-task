import java.util.ArrayList;

public class Data {
	public static final int MAX = 255;
	private int[][] grid;

	/* Part (a) */

	/**
	 * Fills all elements of grid with randomly generated values,
	 * as described in part (a)
	 * Precondition: grid is not null.
	 * grid has at least one element.
	 */
	public void repopulate() {
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[0].length; c++) {
				/*法一(不必掌握)：用 do while 语句写，简洁*/
				int randomNum;
				do {
					randomNum = (int) (Math.random() * MAX + 1);
				} while (randomNum % 10 == 0 && randomNum % 100 != 0);
				//do while 是先执行一遍循环再判断是否循环
				grid[r][c] = randomNum;

				/*法二(常规做法)：用 while 语句写。*/
				int rand = (int) (Math.random() * MAX + 1);// 先定义并random一遍储值
				while (rand % 10 == 0 && rand % 100 != 0) { // 判断条件
					rand = (int) (Math.random() * MAX + 1); // 不符合进入循坏重新random
				}
				grid[r][c] = rand;
			}
		}
	}

	/* Part (b) */

	/**
	 * Returns the number of columns in grid that are in increasing order, as
	 * described
	 * in part (b)
	 * Precondition: grid is not null.
	 * grid has at least one element.
	 */
	public int countIncreasingCols() {

	}

	/* Test */

	public static void main(String[] args) {
		Data data = new Data();
		data.grid = new int[4][8];
		data.repopulate();
		for (int r = 0; r < data.grid.length; r++) {
			for (int c = 0; c < data.grid[0].length; c++)
				System.out.print(data.grid[r][c] + " ");
			System.out.println();
		}

		data.grid = new int[][]{
				{10, 50, 40},
				{20, 40, 20},
				{30, 50, 30}
		};

		System.out.println(data.countIncreasingCols());

		data.grid = new int[][]{
				{10, 540, 440, 440},
				{220, 450, 440, 190}
		};

		System.out.println(data.countIncreasingCols());

		data.grid = new int[][]{
				{10, 540, 440, 440}
		};

		System.out.println(data.countIncreasingCols());
	}
}
