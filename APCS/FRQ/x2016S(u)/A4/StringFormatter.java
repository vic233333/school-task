import java.util.List;
import java.util.ArrayList;

public class StringFormatter
{
  /* Part (a) */

  public static int totalLetters(List<String> wordList)
  {
    int count = 0;

    for (String word : wordList)
      count += word.length();

    return count;
  }

  /* Part (b) */

  public static int basicGapWidth(List<String> wordList,
                                  int formattedLen)
  {
    
  }
  /***********/

  public static int leftoverSpaces(List<String> wordList,
                                                int formattedLen)
  {
    return formattedLen - totalLetters(wordList) -
                 basicGapWidth(wordList, formattedLen) * (wordList.size() - 1);
  }

  /* Part (c) */

  public static String format(List<String> wordList, int formattedLen)
  {
    
}
