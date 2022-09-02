public class Player
{
  private String name;  // name of this player

  public Player(String aName)
  { name = aName; }

  public String getName()
  { return name; }

  /** This implementation chooses the first valid move.
   *  Override this method in subclasses to define players with other strategies.
   * @param state the current state of the game; its current player is this player.
   * @return a string representing the move chosen;
   *         "no move" if no valid moves for the current player.
  */
  public String getNextMove(GameState state)
  { return ""; }
}
