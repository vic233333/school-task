/*
* 链接：https://codingbat.com/home/tlsmith2@wsfcs.k12.nc.us/homework-2d-arrays
* 两个方法为一组
* 第一个方法是为了支援二位数组用的
* 因为codingbat不支持二维数组
*/
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
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }

    public int array2DColumnSum(int rows, int cols, int[] array, int columnToSum) {
        int[][] array2D = new int[rows][cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array2D[r][c] = array[idx];
                idx++;
            }
        }
        return array2DColumnSumB(array2D, columnToSum);
    }

    public int array2DColumnSumB(int[][] nums, int columnToSum) {
        if (columnToSum >= nums[0].length || columnToSum < 0) {
            return -1;
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i][columnToSum];
        }
        return ans;
    }

    public double array2DRowAverage(int rows, int cols, int[] array, int rowToAverage) {
        int[][] array2D = new int[rows][cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array2D[r][c] = array[idx];
                idx++;
            }
        }
        return array2DRowAverageB(array2D, rowToAverage);
    }

    public double array2DRowAverageB(int[][] nums, int rowToAverage) {
        if (rowToAverage >= nums.length || rowToAverage < 0 || nums.length == 1) {
            return -1.0;
        }
        int sum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            sum += nums[rowToAverage][i];
        }
        return sum * 1.0 / nums[0].length;
    }

    public int array2DLongWords(int rows, int cols, String[] array, int len) {
        String[][] array2D = new String[rows][cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array2D[r][c] = array[idx];
                idx++;
            }
        }
        return array2DLongWordsB(array2D, len);
    }

    public int array2DLongWordsB(String[][] words, int len) {
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[0].length; j++) {
                if (words[i][j].length() > len) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public String array2DFirstChars(int rows, int cols, String[] array) {
        String[][] array2D = new String[rows][cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array2D[r][c] = array[idx];
                idx++;
            }
        }
        return array2DFirstCharsB(array2D);
    }

    public String array2DFirstCharsB(String[][] words) {
        if (words.length <= 1) {
            return "?";
        }
        String ans = "";
        for (int i = 1; i < words.length; i += 2) {
            for (int j = 0; j < words[0].length; j++) {
                ans += words[i][j].substring(0, 1);
            }
        }
        return ans;
    }

    public int[] array2DColumnMins(int rows, int cols, int[] array) {
        int[][] array2D = new int[rows][cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array2D[r][c] = array[idx];
                idx++;
            }
        }
        return array2DColumnMinsB(array2D);
    }

    public int[] array2DColumnMinsB(int[][] nums) {
        int[] ans = new int[nums[0].length];
        for (int j = 0; j < nums[0].length; j++) {
            int minn = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i][j] < minn) {
                    minn = nums[i][j];
                }
            }
            ans[j] = minn;
        }
        return ans;
    }
}
