/* test A2 */
    
public class TestStepTracker
{
  public static void main(String args[])
  {
    StepTracker tr = new StepTracker(10000);
    
    System.out.println(tr.activeDays());
    System.out.println(tr.averageSteps());
    
    tr.addDailySteps(9000);
    tr.addDailySteps(5000);
    System.out.println(tr.activeDays());
    System.out.println(tr.averageSteps());
    
    tr.addDailySteps(13000);
    System.out.println(tr.activeDays());
    System.out.println(tr.averageSteps());
    
    tr.addDailySteps(23000);
    tr.addDailySteps(1111);
    System.out.println(tr.activeDays());
    System.out.println(tr.averageSteps());
  }
}
