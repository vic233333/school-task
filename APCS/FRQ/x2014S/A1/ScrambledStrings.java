import java.util.List;
import java.util.ArrayList;

public class ScrambledStrings
{
  /********************** Part (a) *********************/
  
  /** Scrambles a given word.
   *  @param word the word to be scrambled
   *  @return the scrambled word (possibly equal to word)
   *  Precondition: word is either an empty string or contains only uppercase letters.
   *  Postcondition: the string returned was created from word as follows:
   *   - the word was scrambled, beginning at the first letter and continuing from left to right
   *   - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
   *   - letters were swapped at most once
   */
  public static String scrambleWord(String word)
  {
   
  }

  /********************** Part (b) *********************/

  /** Modifies wordList by replacing each word with its scrambled
   *  version, removing any words that are unchanged as a result of scrambling.
   *  @param wordList the list of words
   *  Precondition: wordList contains only non-null objects
   *  Postcondition:
   *   - all words unchanged by scrambling have been removed from wordList
   *   - each of the remaining words has been replaced by its scrambled version
   *   - the relative ordering of the entries in wordList is the same as it was
   *        before the method was called
   */

  public static void scrambleOrRemove(List<String> wordList)
  {
    
  }


     
  /********************** Test *********************/
  
  public static void main(String[] args)
  {
    System.out.println("\nTesting Part (a):\n");
    
    String[] words = {"TAN", "ABRACADABRA", "WHOA", "AARDVARK", "EGGS", "A", ""};
    for (String word : words)
      System.out.println("\"" + word + "\" ==> \"" + scrambleWord(word) + "\"");

    System.out.println("\nTesting Part (b):\n");

    String[] words2 = {"TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS"};
    ArrayList<String> wordList = new ArrayList<String>();
    for (String word : words2)
      wordList.add(word);
    System.out.print(wordList);
    scrambleOrRemove(wordList);
    System.out.println(" ==> " + wordList);
  }  
}
