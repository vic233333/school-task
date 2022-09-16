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

    public static void main(String[] args) {
        int[][] arr = make2D(3, 4);
        print2D(arr);

    }
}
