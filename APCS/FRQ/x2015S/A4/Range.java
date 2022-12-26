// Part (b)
/**
 * 方法一
 * 最大最小值比大小
 */
public class Range extends NumberGroup {
    private int maxn;
    private int minn;

    public Range(int minnn, int maxnn) {
        super();
        maxn = maxnn;
        minn = minnn;
    }

    public boolean contains(int nums) {
        return nums >= minn && nums <= maxn;
    }
}