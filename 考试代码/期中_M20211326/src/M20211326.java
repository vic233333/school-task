public class M20211326 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    // no14 method 1
    // 常规做法，用一堆的boolean
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

    // no14 method 2
    // 转换成String后用indexOf判断
    public static void no14(int[] nums) {
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            // 注意这边要多加一个空格防止多位数被判断为个位数
            result += result + nums[i] + " ";
        }
        return (result.indexOf("2 ") != -1 &&
                (result.indexOf("1 ") == -1 ||
                        result.indexOf("4 ") == -1));
    }

    // array2DAllRows100B method 1
    // 常规每一行做反例分析
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
    // 找每一行的最大值
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

    // array2DAllRows100B method 3
    // 找到最大值所在的位号
    public static boolean array2DAllRows100B(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            int maxnIndex = 0;
            for (int j = 1; j < nums[0].length; j++) {
                if (nums[i][j] >= nums[i][maxnIndex]) {
                    maxnIndex = j;
                }
            }
            if (nums[i][maxnIndex] < 100) {
                return false;
            }
        }
        return true;
    }

    // array2DAllRows100B method 4
    // 不符合条件就把位号往后移动
    // 如果位号移动到尾了
    // 就代表没找到
    public static boolean array2DAllRows100B(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            while (j < nums[i].length && nums[i][j] < 100) {
                j++;
            }
            if (j == nums[i].length) {
                return false;
            }
        }
        return true;
    }

    // getSandwich method 1
    // 跳指针，改原数组
    public static String getSandwich(String str) {
        int i = str.indexOf("bread");
        if (i != -1) {
            str = str.substring(i);
        }
        // delete front
        int last = -1;
        i = str.indexOf("bread");
        while (i != -1) {
            str = str.substring(0, i) + str.substring(i + 5);
            last = i;
            i = str.indexOf("bread");
        }
        if (last != -1) {
            return str.substring(0, last);
        } else {
            return "";
        }
    }

    // getSandwich method 2
    // 遍历
    public static String getSandwich(String str) {
        String result = "";
        for (int i = 0; i < array.length - 4; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                int j = str.indexOf("bread", i + 5);
                if (j != -1) {
                    result += str.substring(i + 5, j);
                }
            }
        }
        return result;
    }

    // getSandwich method 3
    // 双针，跳指针
    public static String getSandwich(String str) {
        String result = "";
        int i = str.indexOf("bread");
        int j = str.indexOf("bread", i + 1);
        while (i != -1 && j != -1) {
            result += str.substring(i + 5, j);
            i = j;
            j = str.indexOf("bread", i + 1);
        }
        return result;
    }
}
