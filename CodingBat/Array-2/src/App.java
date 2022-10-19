public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public int countEvens(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }

    // bigDiff method 1
    public int bigDiff(int[] nums) {
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

    public int centeredAverage(int[] nums) {
        int maxn = Integer.MIN_VALUE;// 最大值，设置为最小值
        int minn = Integer.MAX_VALUE;// 最小值，设置为最大值
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            maxn = Math.max(nums[i], maxn);
            minn = Math.min(nums[i], minn);
            sum = sum + nums[i];
        }
        return (sum - maxn - minn) / (nums.length - 2);
    }

    // sum13 method 1
    // 双循环、跳指针
    // 吐槽：早上写的时候脑子不太清楚
    // 其实想的就是老师这个写法
    // 但是我又不愿意多写一个if和else
    // 可惜还是写不出来
    // 最后还是写了一个
    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                int j = i;
                while (j < nums.length && nums[j] == 13) {
                    j++;
                }
                i = j;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    // sum13 method 2
    // 单循环
    // 单判断
    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else if (i + 1 < nums.length && nums[i + 1] != 13) {
                i++;
            }
        }
        return sum;
    }

    public int sum67(int[] nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                int j = i;
                while (j < nums.length && nums[j] != 7) {
                    j++;
                }
                i = j;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }
}
