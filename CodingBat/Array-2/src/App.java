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

    // sum67 method 1
    // 跳指针
    public int sum67(int[] nums) {
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

    // sum67 method 2
    // 用flag控制是否在区间内
    public int sum67(int[] nums) {
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                flag = true;
            }
            if (!flag) {
                sum += nums[i];
            }
            if (nums[i] == 7) {
                flag = false;
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        boolean flag1 = false;
        boolean flag3 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                flag1 = true;
            }
            if (nums[i] == 3) {
                flag3 = true;
            }
        }
        return flag1 == false && flag3 == false;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
        }
        return sum == 8;
    }

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            }
            if (nums[i] == 4) {
                count4++;
            }
        }
        return count1 > count4;
    }

    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + "";
        }
        return arr;
    }

    public boolean no14(int[] nums) {
        boolean flag1 = false;
        boolean flag3 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                flag1 = true;
            }
            if (nums[i] == 4) {
                flag3 = true;
            }
        }
        return !flag1 || !flag3;
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    // either24 method 1
    public boolean either24(int[] nums) {
        boolean flag2 = false;
        boolean flag4 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                flag2 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                flag4 = true;
            }
        }
        return flag2 && !flag4 || flag4 && !flag2;
    }

    // either24 method 2
    // 不同的判断方式
    public boolean either24(int[] nums) {
        boolean flag2 = false;
        boolean flag4 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                flag2 = true;
            }
            if (nums[i] == 4 && nums[1 + 1] == 4) {
                flag4 = true;
            }
        }
        return flag2 != flag4;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
                count++;
            }
        }
        return count;
    }
}
