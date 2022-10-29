public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    // 两个方法为一组
    // 因为codingbat不支持二维数组
    // 第一个方法是为了支援二位数组用的
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

    public boolean array2DOneWord(int rows, int cols, String[] array) {
        String[][] array2D = new String[rows][cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array2D[r][c] = array[idx];
                idx++;
            }
        }
        return array2DOneWordB(array2D);
    }

    public boolean array2DOneWordB(String[][] words) {
        if (words.length == 0) {
            return false;
        }
        String flag = words[0][0];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[0].length; j++) {
                if (!words[i][j].equals(flag)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean array2DAllRows100(int rows, int cols, int[] array) {
        int[][] array2D = new int[rows][cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array2D[r][c] = array[idx];
                idx++;
            }
        }
        return array2DAllRows100B(array2D);
    }

    public boolean array2DAllRows100B(int[][] nums) {
        if (nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] >= 100) {
                    flag = true;
                    j = nums[0].length;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
