public class HiddenWord
{
  
  
  /******************************************************************************/
  
  public static void main(String[] args)
  {
    HiddenWord puzzle = new HiddenWord("HARPS");
    System.out.println(puzzle.getHint("AAAAA"));
    System.out.println(puzzle.getHint("HELLO"));
    System.out.println(puzzle.getHint("HEART"));
    System.out.println(puzzle.getHint("HARMS"));
    System.out.println(puzzle.getHint("HARPS"));
  }
}
