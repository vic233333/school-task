public class M20122222 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static boolean no14(int[] nums) {
        boolean flag_1 = false;
        boolean flag_2 = false;
        boolean flag_4 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                flag_1 = true;
            }
            if (nums[i] == 2) {
                flag_2 = true;
            }
            if (nums[i] == 4) {
                flag_4 = true;
            }
        }
        return (flag_2 && (!flag_1 || !flag_4));
    }

    // array2DAllRows100B method 1
    public static boolean array2DAllRows100B(int[][] nums) {
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

    // array2DAllRows100B method 2
    public static boolean array2DAllRows100B(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            int maxn = Integer.MIN_VALUE;
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] >= maxn) {
                    maxn = nums[i][j];
                }
            }
            if (maxn < 100) {
                return false;
            }
        }
        return true;
    }
}
