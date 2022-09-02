public class MultPractice 
{
 

  public static void main(String[] args)
  {
    StudyPractice p1 = new MultPractice(7, 3);
    System.out.println(p1.getProblem()); // 7 TIMES 3
    p1.nextProblem();
    System.out.println(p1.getProblem()); // 7 TIMES 4
    p1.nextProblem();
    System.out.println(p1.getProblem()); // 7 TIMES 5
    p1.nextProblem();
    System.out.println(p1.getProblem()); // 7 TIMES 6

    StudyPractice p2 = new MultPractice(4, 12);
    p2.nextProblem();
    System.out.println(p2.getProblem()); // 4 TIMES 13
    System.out.println(p2.getProblem()); // 4 TIMES 13
    p2.nextProblem();
    p2.nextProblem();
    System.out.println(p2.getProblem()); // 4 TIMES 15
    p2.nextProblem();
    System.out.println(p2.getProblem()); // 4 TIMES 16
  }
}
