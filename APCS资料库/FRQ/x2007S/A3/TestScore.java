import java.util.ArrayList;
import java.util.Arrays;

public class TestScore
{
  public static void main(String[] args)
  {
    ArrayList<String> key = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "C", "D", "E", "B", "C", "E", "B", "B", "C"}));

    ArrayList<String> answers1 = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "B", "D", "E", "A", "C", "?", "B", "D", "C"}));

    ArrayList<String> answers2 = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "?", "D", "E", "A", "C", "?", "B", "D", "C"}));

    ArrayList<String> answers3 = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "?", "D", "E", "A", "C", "E", "B", "D", "C"}));

    ArrayList<String> answers4 = new ArrayList<String>(Arrays.asList(
              new String[] {"A", "C", "D", "E", "A", "C", "E", "B", "D", "C"}));

    ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();

    sheets.add(new StudentAnswerSheet("Amy", answers1));
    sheets.add(new StudentAnswerSheet("Ben", answers2));
    sheets.add(new StudentAnswerSheet("Cory", answers3));
    sheets.add(new StudentAnswerSheet("Mark", answers4));


    for (StudentAnswerSheet s : sheets)
    {
      System.out.println(s.getName() + ": " + s.getScore(key));
    }
    TestResults results = new TestResults(sheets);
    System.out.println("Best: " + results.highestScoringStudent(key));
  }
}
