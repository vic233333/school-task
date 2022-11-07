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
}
