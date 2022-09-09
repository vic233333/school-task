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
        for(int i= nums.length-1, j=0; i>=0;i--, j++)
        {
            nums_copy[i] = nums[j];
        }
        return nums_copy;
    } 
}