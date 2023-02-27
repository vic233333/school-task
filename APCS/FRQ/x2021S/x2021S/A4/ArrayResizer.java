/* A4 */

public class ArrayResizer
{
   /* Part (a) */
   
   /** Returns true if and only if every value in row r of array2D is non-zero.
    *  Precondition: r is a valid row index in array2D.
    *  Postcondition: array2D is unchanged.
    */
   public static boolean isNonZeroRow(int[][] array2D, int r)
   {
     
   }

   /** Returns the number of rows in array2D that contain all non-zero values.
    *  Postcondition: array2D is unchanged.
    */
   public static int numNonZeroRows(int[][] array2D)
   {
      int count = 0;
      for (int r = 0; r < array2D.length; r++)
         if (isNonZeroRow(array2D, r))
            count++;
      return count;
   }

   /* Part (b) */

   /** Returns a new, possibly smaller, two-dimensional array that contains only rows
   * from array2D with no zeros, as described in part (b).
   * Precondition: array2D contains at least one column and at least one row with no zeros.
   * Postcondition: array2D is unchanged.
   */
   public static int[][] resize(int[][] array2D)
   {
     
   }

   /***************** Test *****************/

   public static void main(String[] args)
   {
      int[][] arr = {{2, 1, 0},
                      {1, 3, 2},
                      {0, 0, 0},
                      {4, 5, 6}};
   
      System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
      System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
      System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
      System.out.println(ArrayResizer.isNonZeroRow(arr, 3));
      System.out.println();
      
      int[][] smaller = ArrayResizer.resize(arr);
      for (int[] row : smaller)
      {
         for (int x : row)
            System.out.print(x + " ");
         System.out.println();
      }
   }                   
}