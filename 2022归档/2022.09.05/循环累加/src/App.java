public class App {
    public static void main(String[] args) throws Exception {
        // 泰勒级数展开
        // int sum = 0;
        // int n = 30;
        // for (int i = 0; i <= n; i++) {
        //     sum += Math.pow(n, i);
        // }
        // System.out.print(sum);
        tri(10);
    }

    public static int sumToNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(n, i);
        }
        return sum;
    }

    public static int factor(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= sum;
        }
        return sum;
    }

    public static double sin(int n, int x) {
        double sum = 0;
        int sign = 1;
        for (int i = 1, j = 1; i <= n; i++, j = j + 2) {
            sum += sign * Math.pow(x, j) / factor(j);
            sign = -sign;
        }
        return sum;
    }

    public static void tri(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
