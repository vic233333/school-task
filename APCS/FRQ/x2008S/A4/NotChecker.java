public class NotChecker implements Checker
{
  private Checker checker;

  public NotChecker(Checker c)
  {
    checker = c;
  }

  public boolean accept(String text)
  {
    return !checker.accept(text);
  }
}
