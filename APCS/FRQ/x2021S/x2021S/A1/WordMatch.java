/* A1 */

public class WordMatch
{
  /** The secret string. */
  private String secret;

  /** Constructs a WordMatch object with the given secret string of lowercase letters. */
  public WordMatch(String word)
  {
    secret = word;
  }

  /* Part (a) */
  
  /** Returns a score for guess, as described in part (a).
   *  Precondition: 0 < guess.length() <= secret.length()
   */
  public int scoreGuess(String guess)
  {
    
  }

  /* Part (b) */

  /** Returns the better of two guesses, as determined by scoreGuess and the rules for a
   *  tie-breaker that are described in part (b).
   *  Precondition: guess1 and guess2 contain all lowercase letters.
   *  guess1 is not the same as guess2.
   */
  public String findBetterGuess(String guess1, String guess2)
  { 
   }

  /***************** Test *****************/
  
  public static void main(String[] args)
  {
    WordMatch game = new WordMatch("mississippi");
    String[] guesses1 = {"i", "iss", "issipp", "mississippi"};
    for (String guess : guesses1)
      System.out.println("Guess = " + guess + ", scoreGuess = " + game.scoreGuess(guess));
    System.out.println();

    game = new WordMatch("aaaabb");
    String[] guesses2 = {"a", "aa", "aaa", "aabb", "c"};
    for (String guess : guesses2)
      System.out.println("Guess = " + guess + ", scoreGuess = " + game.scoreGuess(guess));
    System.out.println();

    game = new WordMatch("concatenation");
    String guess1 = "ten";
    String guess2 = "nation";
    System.out.println("Guess = " + guess1 + ", scoreGuess = " + game.scoreGuess(guess1) + " " + 
                       "Guess = " + guess2 + ", scoreGuess = " + game.scoreGuess(guess2) + " ==> " +
                       game.findBetterGuess(guess1 , guess2));
    
    guess1 = "con";
    guess2 = "cat";
    System.out.println("Guess = " + guess1 + ", scoreGuess = " + game.scoreGuess(guess1) + " " + 
                       "Guess = " + guess2 + ", scoreGuess = " + game.scoreGuess(guess2) + " ==> " +
                       game.findBetterGuess(guess1, guess2));
  }
}