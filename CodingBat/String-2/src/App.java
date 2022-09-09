public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6
                || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }
}
