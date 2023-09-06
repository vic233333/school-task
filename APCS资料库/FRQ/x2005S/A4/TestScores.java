
public class TestScores
{
  public static void main(String[] args)
  {
    int scores1[] = {50, 50, 20, 80, 53};
    int scores2[] = {20, 50, 50, 53, 80};
    int scores3[] = {20, 50, 50, 80};

    System.out.print((new StudentRecord(scores1)).finalAverage() + " ");
    System.out.print((new StudentRecord(scores2)).finalAverage() + " ");
    System.out.print((new StudentRecord(scores3)).finalAverage() + " ");
    System.out.println();
  }  
}
