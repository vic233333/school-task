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
				/*method 1 (不必掌握😅)：用 do while 语句写，简洁*/
				int randomNum;
				do {
					randomNum = (int) (Math.random() * MAX) + 1;
				} while (randomNum % 10 == 0 && randomNum % 100 != 0);
				//do while 是先执行一遍循环再判断是否循环
				grid[r][c] = randomNum;

				/*method 2 (常规做法🤩)：用 while 语句写*/
				int rand = (int) (Math.random() * MAX) + 1;// 先定义并random一遍储值
				while (rand % 10 == 0 && rand % 100 != 0) { // 判断条件
					rand = (int) (Math.random() * MAX) + 1; // 不符合进入循坏重新random
				}
				grid[r][c] = rand;
			}
		}
	}

	/*method 3 (常规做法😋)把随机数表放到ArrayList里面，并且用校验法检验每个随机数*/
	public void repopulate() {
		ArrayList<Integer> al = new ArrayList<Integer>(); // 随机数表
		int ran = (int) (Math.random() * MAX) + 1;
		while (al.size() <= grid.length * grid[0].length) { // 循环直至al被填充到指定长度为止
			if (ran % 10 == 0 && ran % 100 != 0) { // 校验
				al.add(ran);
			}
			ran = (int) (Math.random() * MAX) + 1; // 重新随机，为下一次循环做准备
		}
		int i = 0;
		// 把al的内容全部复制到数组里面
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[0].length; c++) {
				grid[r][c] = al.get(i);
				i++;
			}
		}
	}
	/* Part (b) */

	/**
	 * Returns the number of columns in grid that are in increasing order,
	 * as described in part (b)
	 * Precondition: grid is not null.
	 * grid has at least one element.
	 */
	/*method 1*/
	public int countIncreasingCols() {
		int r;
		int count = 0;
		for (int c = 0; c < grid[0].length; c++) {
			for (r = 0; r < grid.length; r++) {
				if (grid[r][c] > grid[r + 1][c]) {
					r = grid.length + 10;
					break;
					// "break;" 和 "r = grid.length + 10;" 任选其一
				}
				if (r == grid.length - 1) {
					count++;
				}
			}
		}
		return count;
	}

	/**
	 * Returns the number of columns in grid that are in increasing order,
	 * as described in part (b)
	 * Precondition: grid is not null.
	 * grid has at least one element.
	 */
	/*method 2*/
	public int countIncreasingCols() {
		int count = 0;
		for (int c = 0; c < grid[0].length; c++) {
			int r = 0;
			while (r < grid.length - 1 && grid[r + 1][c] >= grid[r][c]) {
				r++;
			}
			if (r == grid.length - 1) {
				count++;
			}
		}
		return count;
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
