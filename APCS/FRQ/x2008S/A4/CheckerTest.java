public class CheckerTest
{
  public static void main(String[] args)
  {
    Checker aChecker = new SubstringChecker("artichokes");
    Checker kChecker = new SubstringChecker("kale");
    Checker yummyChecker;
    /* code to construct and assign to yummyChecker */

  /*** Part (c) ***/

    yummyChecker = new AndChecker(new NotChecker(aChecker), new NotChecker(kChecker));

  /****************/

    System.out.println(yummyChecker.accept("chocolate truffles"));
    System.out.println(yummyChecker.accept("kale is great"));
    System.out.println(yummyChecker.accept("Yuck: artichokes & kale"));
  }
}
