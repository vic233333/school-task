import java.util.ArrayList;

public class FuelDepotTest
{
  public static void main(String[] args)
  {
    int[] levels = {20, 30, 80, 55, 50, 75, 20};
    ArrayList<FuelTank> tanks = new ArrayList<FuelTank>();
    for (int level : levels)
      tanks.add(new MyFuelTank(level));

    FuelRobot filler = new MyFuelRobot(2);
    FuelDepot depot = new FuelDepot(filler, tanks);
    System.out.println(depot.nextTankToFill(50)); 
    System.out.println(depot.nextTankToFill(15));
    depot.moveToLocation(5);
    System.out.println(filler.getCurrentIndex());
    depot.moveToLocation(2);
    System.out.println(filler.getCurrentIndex());
  }
}
