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

    public boolean has77(int[] nums) {
        boolean flag2 = false;
        boolean flag3 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                flag2 = true;
            }
            if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) {
                flag3 = true;
            }
        }
        return flag2 || flag3;
    }

    public boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int j = i;
                while (j < nums.length && nums[j] != 2) {
                    j++;
                }
                if (j < nums.length) {
                    return true;
                }
            }
        }
        return false;
    }

    // modThree method 1
    public boolean modThree(int[] nums) {
        boolean flag2 = false;
        boolean flag3 = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                flag2 = true;
            }
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                flag3 = true;
            }
        }
        return flag2 || flag3;
    }

    // modThree method 2
    public boolean modThree(int[] nums) {
        boolean flag2 = false;
        boolean flag3 = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                flag2 = true;
            }
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                flag3 = true;
            }
        }
        return flag2 || flag3;
    }

    // method 1
    // @Enning_Zheng
    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == 3 && nums[i + 1] == 3) {
                flag = true;
            }
            if (nums[i] == 3) {
                count++;
            }
        }
        // 此处不够简洁
        // 可以参考method2
        if (count == 3 && flag == false) {
            return true;
        } else {
            return false;
        }
    }

    // haveThree method 2
    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == 3 && nums[i + 1] == 3) {
                found = true;
            }
            if (nums[i] == 3) {
                count++;
            }
        }
        return count == 3 && found == false;
    }

    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0 && nums[i] == 2 && nums[i + 1] != 2) {
                return false;
            }
            if (i == nums.length - 2 && nums[i] != 2 && nums[i + 1] == 2F) {
                return false;
            }
            if (i < nums.length - 2 && nums[i] != 2 &&
                    nums[i + 1] == 2 && nums[i + 2] != 2) {
                return false;
            }
        }
        if (nums.length == 1 && nums[0] == 2) {
            return false;
        }
        return true;
    }

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0, j = nums.length - len; i < len; i++, j++) {
            if (nums[i] != nums[j]) {
                return false;
            }
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 2] == nums[i + 1] + 1 &&
                    nums[i + 1] == nums[i] + 1) {
                return true;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] arr = new int[end - start];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + i;
        }
        return arr;
    }

    // shiftLeft method 1
    public int[] shiftLeft(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 1, j = 0; i < nums.length; i++, j++) {
            arr[j] = nums[i];
        }
        if (arr.length > 0)
            arr[arr.length - 1] = nums[0];
        return arr;
    }

    // shiftLeft method 2
    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] tenRun(int[] nums) {
        int flag = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                flag = i;
            }
            if (flag != -1) {// inside the run
                nums[i] = nums[flag];
            }
        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int j = 0;
        while (j < nums.length && nums[j] != 4) {
            j++;
        }
        int[] arr = new int[j];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }

    public int[] post4(int[] nums) {
        int j = nums.length - 1;
        while (j >= 0 && nums[j] != 4) {
            j--;
        }
        int[] arr = new int[nums.length - j - 1];
        for (int i = 0; i < arr.length; i++, j++) {
            arr[i] = nums[j + 1];
        }
        return arr;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        int j = arr.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                arr[j] = nums[i];
                j--;
            }
        }
        return arr;
    }
}