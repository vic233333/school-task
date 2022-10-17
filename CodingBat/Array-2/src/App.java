public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public int countEvens(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0) {
                sum ++;
            }
        }
        return sum;
    }

    // bigDiff method 1
    public int bigDiff (int[] nums) {
        int maxn = nums[0];
        int minn = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxn) {
                maxn = nums[i];
            }
            if (nums[i] < minn) {
                minn = nums[i];
            }
        }
        return maxn - minn;
    }

    // bigDiff method 2
    public int bigDiff(int[] nums) {
        int maxn = nums[0];
        int minn = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxn = Math.max(nums[i], maxn);
            minn = Math.min(nums[i], minn);
        }
        return maxn - minn;
    }
}