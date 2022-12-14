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

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int sum = 0;
        if (a.length > 0 && a[0] == 1) {
            sum++;
        }
        if (b.length > 0 && b[0] == 1) {
            sum++;
        }
        return sum;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sum_a = 0;
        int sum_b = 0;
        for (int i = 0; i < a.length; i++) {
            sum_a += a[i];
        }
        for (int j = 0; j < b.length; j++) {
            sum_b += b[j];
        }
        return sum_a >= sum_b ? a : b;
    }

    public int[] makeMiddle(int[] nums) {
        int[] ans = new int[2];
        ans[0] = nums[nums.length / 2 - 1];
        ans[1] = nums[nums.length / 2];
        return ans;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = a[i];
        }
        for (int i = a.length; i < b.length + a.length; i++) {
            ans[i] = b[i - a.length];
        }
        return ans;
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int[] ans = new int[3];
        ans[0] = nums[nums.length / 2 - 1];
        ans[1] = nums[nums.length / 2];
        ans[2] = nums[nums.length / 2 + 1];
        return ans;
    }

    public int maxTriple(int[] nums) {
        int maxn = Integer.MIN_VALUE;
        maxn = nums[0] > maxn ? nums[0] : maxn;
        maxn = nums[nums.length / 2] > maxn ? nums[nums.length / 2] : maxn;
        maxn = nums[nums.length - 1] > maxn ? nums[nums.length - 1] : maxn;
        return maxn;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        } else {
            int[] ans = new int[2];
            ans[0] = nums[0];
            ans[1] = nums[1];
            return ans;
        }
    }

    // unlucky1 method 1
    // ??????????????????????????????
    public boolean unlucky1(int[] nums) {
        if (nums.length <= 1) {
            return false;
        } else if (nums.length == 2) {
            if (nums[0] == 1 && nums[1] == 3) {
                return true;
            } else {
                return false;
            }
        } else {
            if (nums[0] == 1 && nums[1] == 3
                    || nums[1] == 1 && nums[2] == 3
                    || nums[nums.length - 1] == 3
                            && nums[nums.length - 2] == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    // unlucky1 method 2
    // ????????????????????????
    // ?????????????????????????????????
    // public boolean unlucky1(int nums[]) {
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (i == 2) {
    //             i = nums.length - 2;
    //         }
    //         if (nums[i] == 1 && nums[i] == 3) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public int[] make2(int[] a, int[] b) {
        int[] ans = new int[2];
        int k = 0;
        for (int i : a) {
            if (k >= 2) {
                break;
            }
            ans[k++] = i;
        }
        for (int i : b) {
            if (k >= 2) {
                break;
            }
            ans[k++] = i;
        }
        return ans;
    }

    public int[] front11(int[] a, int[] b) {
        int lenans = 2;
        if (a.length < 1) {
            lenans--;
        }
        if (b.length < 1) {
            lenans--;
        }
        int[] ans = new int[lenans];
        int k = 0;
        if (a.length >= 1) {
            ans[k++] = a[0];
        }
        if (b.length >= 1) {
            ans[k++] = b[0];
        }
        return ans;
    }
}