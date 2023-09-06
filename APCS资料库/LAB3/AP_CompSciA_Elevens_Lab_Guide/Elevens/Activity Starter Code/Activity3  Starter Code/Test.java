/**
 * Write a description of class Test here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test {
    public static void main(String[] args) {
        int numh = 0;
        int numt = 0;
        for (int i = 0; i < 100; i++) {
            String s = flip();
            if (s.equals("heads")) {
                numh++;
            } else if (s.equals("tails")) {
                numt++;
            }
        }
        System.out.println(numh);
        System.out.println(numt);
        int a1[] = { 1, 2, 3 };
        int a2[] = { 3, 2, 1 };

    }

    public static String flip() {
        int r = (int) (Math.random() * 3);
        if (r <= 1) {
            return "heads";
        } else
            return "tails";
    }

    public static boolean arePermutations(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {

            int j = 0;
            while (j < b.length && b[j] != a[i]) {
                j++;
            }
            if (j == b.length) {
                return false;
            }
        }
        return true;
    }
}
