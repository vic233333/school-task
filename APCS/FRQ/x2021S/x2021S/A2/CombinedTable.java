/* A2 */

public class CombinedTable
{





  /***************** Test *****************/
 
  public static void main(String[] args)
  {
    SingleTable t1 = new SingleTable(4, 60.0, 74);
    SingleTable t2 = new SingleTable(8, 70.0, 74);
    SingleTable t3 = new SingleTable(12, 75.0, 76);

    CombinedTable c1 = new CombinedTable(t1, t2);
    CombinedTable c2 = new CombinedTable(t2, t3);

    System.out.println(c1.canSeat(9) + " " + c1.canSeat(11) + " " + c1. getDesirability());
    System.out.println(c2.canSeat(11) + " " + c2. getDesirability());
    t2.setViewQuality(80);
    System.out.println(c2. getDesirability());
  }
}