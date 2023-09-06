// Part (b)
/**
 * 方法二
 * 先定义一个数组存放所有可能的contains
 */
public class Range_2 extends NumberGroup {
    private int[] arr;

    public Range_2(int minn, int maxn) {
        super();
        arr = new int[maxn - minn + 1];
        int n = minn;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
            n++;// 双变量用法填充数组
        }
    }

    public boolean contains(int nums) {// overriding
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == nums)
                return true;
            // 找反例
        }
        return false;
    }
}
