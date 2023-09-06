public class CrosswordTest
{
  public static void main(String[] args)
  {
    boolean blackSquares[][] = {
    {true,  false, false, true,  true,  true,  false, false, false},
    {false, false, false, false, true,  false, false, false, false},
    {false, false, false, false, false, false, true,  true,  true},
    {false, false, true,  false, false, false, true,  false, false},
    {true,  true,  true,  false, false, false, false, false, false},
    {false, false, false, false, true,  false, false, false, false},
    {false, false, false, true,  true,  true,  false, false, true}};

    Crossword crossword = new Crossword(blackSquares);

    for (int r = 0; r < blackSquares.length; r++)
    {
      for (int c = 0; c < blackSquares[0].length; c++)
        System.out.print(crossword.getSquare(r, c) + " ");
      System.out.println();
    }
  }
}
