import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    /**
     * scoresClump method 1:
     * <p>
     * Use Math.max() and Math.min()
     * <p>
     * NOT RECOMMENDED: Math.max() and Math.min() DO NOT occur in AP CSA
     */
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            int t1 = scores[i] - scores[i + 1];
            int t2 = scores[i + 1] - scores[i + 2];
            int t3 = scores[i] - scores[i + 2];
            if (Math.abs(t1) <= 2 && Math.abs(t2) <= 2 && Math.abs(t3) <= 2) {
                return true;
            }
        }
        return false;
    }

    /**
     * scoresClump method 2:
     * <p>
     * Use Math.max() and Math.min()
     * <p>
     * NOT RECOMMENDED: Math.max() and Math.min() DO NOT occur in AP CSA
     */
    public boolean scoresClump2(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            int max = Math.max(scores[i], Math.max(scores[i + 1], scores[i + 2]));
            int min = Math.min(scores[i], Math.min(scores[i + 1], scores[i + 2]));
            if (max - min <= 2) {
                return true;
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i < scores.length / 2) {
                sum1 += scores[i];
            } else {
                sum2 += scores[i];
            }
        }
        int ans;
        if (sum1 > sum2) {
            ans = sum1 / (scores.length / 2);
        } else {
            ans = sum2 / (scores.length / 2);
        }
        return ans;
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = words[i];
        }
        return ans;
    }

    public List wordsWithoutList(String[] words, int len) {
        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                ans.add(words[i]);
            }
        }
        return ans;
    }

    /**
     * hasOne method 1:
     * <p>
     * Digit separation
     */
    public boolean hasOne(int n) {
        while (n != 0) {
            int d = n % 10;// 每一位数字
            // %表示取余数
            if (d == 1) {
                return true;
            }
            n /= 10;// 去掉个位数
        }
        return false;
    }

    /**
     * hasOne method 2:
     * <p>
     * Convert to String and process
     */
    public boolean hasOne2(int n) {
        String trans = "" + n;
        return trans.indexOf("1") != -1;
    }

    public boolean dividesSelf(int n) {
        int num = n;
        while (n > 0) {
            int d = n % 10;
            if (d == 0 || num % d != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] array = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && j < array.length) {
                array[j] = nums[i];
                j++;
            }
        }
        return array;
    }

    public int[] copyEndy(int[] nums, int count) {
        int j = 0;
        int[] arr = new int[count];
        for (int i = 0; i < nums.length; i++) {
            if ((j < arr.length) && ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100))) {
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }

    public int matchUp(String[] a, String[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 0 && b[i].length() > 0 &&
                    a[i].substring(0, 1).equals(
                            b[i].substring(0, 1))) {
                sum++;
            }
        }
        return sum;
    }
}
