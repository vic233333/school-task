
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
  
    public static void main(String[] args)
  {
    System.out.println("******* A-4 *******");
    Robot robot = new Robot(new int[] {1,1,2,2}, 1, true);
    System.out.println(robot.clearHall());
  }
}
