public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public int array2DLowestEvenNumber(int rows, int cols, int[] array) {
        int[][] array2D = new int[rows][cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array2D[r][c] = array[idx];
                idx++;
            }
        }
        return array2DLowestEvenNumberB(array2D);
    }

    public int array2DLowestEvenNumberB(int[][] nums) {
        int minn = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] % 2 == 0 &&
                        nums[i][j] < minn) {
                    minn = nums[i][j];
                }
            }
        }
        if (minn == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minn;
        }
    }
}
