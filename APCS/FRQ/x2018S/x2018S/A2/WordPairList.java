import java.util.ArrayList;

public class WordPairList
{
  /** The list of word pairs, initialized by the constructor. */
  private ArrayList<WordPair> allPairs;

  /********************** Part (a) *************************/

  /** Constructs a WordPairList object as described in part (a).
   *  Precondition: words.length >= 2
   */
  public WordPairList(String[] words)
  {
    
  }

  /********************** Part (b) *************************/

  /** Returns the number of matches as described in part (b).
   */
  public int numMatches()
  {
    
  }

  /********************** Test *************************/

  public String toString() { return allPairs.toString(); }

  public static void main(String[] args)
  {
    String[] wordNums = {"one", "two", "three"};
    WordPairList exampleOne = new WordPairList(wordNums);
    System.out.println(exampleOne);

    String[] phrase = {"the", "more", "the", "merrier"};
    WordPairList exampleTwo = new WordPairList(phrase);
    System.out.println(exampleTwo);

    String[] moreWords = {"the", "red", "fox", "the", "red"};
    WordPairList exampleThree = new WordPairList(moreWords);
    System.out.println(exampleThree.numMatches());
  }
}