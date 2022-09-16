public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public boolean firstLast6(int[] nums) {
        if (nums.length == 0) {
            return false;
        } else if (nums[0] == 6
                || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length == 0) {
            return false;
        } else if (nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public int[] makePi() {
        int[] Pi = new int[3];
        Pi[0] = 3;
        Pi[1] = 1;
        Pi[2] = 4;
        return Pi;
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] reverse3(int[] nums) {
        int[] nums_copy = new int[nums.length];
        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            nums_copy[i] = nums[j];
        }
        return nums_copy;
    }

    public int[] maxEnd3(int[] nums) {
        int maxn = 0;
        maxn = nums[0] > nums[nums.length - 1] ? nums[0] : nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = maxn;
        }
        return nums;
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];

        } else {
            return nums[0] + nums[1];
        }
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] ans = new int[] { a[a.length / 2], b[b.length / 2] };
        return ans;
    }

    public int[] makeEnds(int[] nums) {
        int[] ans = new int[] { nums[0], nums[nums.length - 1] };
        return ans;
    }

    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int ans[] = new int[nums.length * 2];
        ans[ans.length - 1] = nums[nums.length - 1];
        return ans;
    }

    public boolean double23(int[] nums) {
        int sum_2 = 0;
        int sum_3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum_2++;
            }
            if (nums[i] == 3) {
                sum_3++;
            }
        }
        return sum_2 == 2 || sum_3 == 2;
    }
}