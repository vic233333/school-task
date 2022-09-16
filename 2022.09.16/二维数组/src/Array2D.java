public class Array2D {
    public static int[][] make2D(int row, int col) {
        int[][] arr = new int[row][col];
        return arr;
    }

    public static void print2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {// 获取行数
            for (int j = 0; j < arr[0].length; j++) {// 获取列数
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();// 换行
        }
    }

    public static int[][] make1ToN2Darray(int row, int col) {
        int[][] arr = new int[row][col];
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = n;
                n++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr_1 = make2D(3, 4);
        print2D(arr_1);
        int[][] arr_2 = make1ToN2Darray(3, 4);
        print2D(arr_2);
    }
}
