import java.util.ArrayList;

public class MyGameState implements GameState
{
  private RandomPlayer randy;
  private ArrayList<String> moves;

  public MyGameState()
  {
    randy = new RandomPlayer("Randy");
    moves = new ArrayList<String>();
    moves.add("Move1");
    moves.add("Move2");
    moves.add("Move3");
  }

  /** @return true if the game is in an ending state;
   *          false otherwise
   */
  public boolean isGameOver()
  {
    return moves.isEmpty();
  }

  /** Precondition: isGameOver() returns true
   *  @return the player that won the game or null if there was no winner
   */
  public Player getWinner()
  {
    return randy;
  }

  /** Precondition: isGameOver() returns false
   *  @return the player who is to make the next move
   */
  public Player getCurrentPlayer()
  {
    return randy;
  }

  /** @return a list of valid moves for the current player;
   * the size of the returned list is 0 if there are no valid moves.
   */
  public ArrayList<String> getCurrentMoves()
  {
    return moves;
  }

  /** Updates game state to reflect the effect of  the specified move.
   * @param move a description of the move to be made
   */
  public void makeMove(String move)
  {
    moves.remove(move);
  }

  /** @return a string representing the current GameState
   */
  public String toString()
  {
    return moves.toString();
  }
}
