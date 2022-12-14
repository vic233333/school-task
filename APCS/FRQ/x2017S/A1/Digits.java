import java.util.ArrayList;

public class Digits
{
  /** The list of digits from the number used to construct this object.
   *  The digits appear in the list in the same order in which they appear in the original number.
   */
  private ArrayList<Integer> digitList;

  /**************** Part (a) ****************/

  /** Constructs a Digits object that represents num.
   *  Precondition: num >= 0
   */

  public Digits(int num)
  {
   
      
  }

  /*  int a = Integer.parseInt(str);
   * int b = Integer.valueOf(str).intValue()
   */

 public String toString()
  {
    return digitList.toString();
  }

  /**************** Part (b) ****************/

  /** Returns true if the digits in this Digits object are in strictly increasing order;
   *  false otherwise.
   */
  public boolean isStrictlyIncreasing()
  {
    
  }

  public static void main(String[] args)
  {
    Digits d1 = new Digits(15704);
    System.out.println(d1);

    Digits d2 = new Digits(0);
    System.out.println(d2);

    System.out.println("7 shouble be true,your result is "+(new Digits(7)).isStrictlyIncreasing()); // true
    System.out.println("1356 shouble be true,your result is "+(new Digits(1356)).isStrictlyIncreasing()); // true
    System.out.println("1336 shouble be false,your result is "+(new Digits(1336)).isStrictlyIncreasing()); // false
    System.out.println("1536 shouble be false,your result is "+(new Digits(1536)).isStrictlyIncreasing()); // false
    System.out.println("65310 shouble be false,your result is "+(new Digits(65310)).isStrictlyIncreasing()); // false
  }
}