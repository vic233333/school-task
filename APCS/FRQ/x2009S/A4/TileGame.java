import java.util.ArrayList;

public class TileGame
{
  /** represents the game board; guaranteed never to be null */
  private ArrayList<NumberTile> board;

  public TileGame()
  { board = new ArrayList<NumberTile>(); }

  // Part (a)

  /** Determines where to insert tile, in its current orientation, into game board
   *  @param tile the tile to be placed on the game board
   *  @return the position of tile where tile is to be inserted:
   *           0 if the board is empty;
   *          -1 if tile does not fit in front, at end, or between any existing tiles;
   *          otherwise, 0 = position returned = board.size()
   */
  private int getIndexForFit(NumberTile tile)
  {
    
  }

  // *************************************************

  // Part (b)

  /** Places tile on the game board if it fits (checking all possible tile orientations if necessary).
   *  If there are no tiles on the game board, the tile is placed at position 0.
   *  The tile should be placed at most 1 time.
   *  Precondition: board is not null
   *  @param tile the tile to be placed on the game board
   *  @return true if tile is placed successfully; false otherwise
   *  Postcondition: the orientations of the other tiles on the board are not changed
   *  Postcondition: the order of the other tiles on the board relative to each other is not changed
   */
  public boolean insertTile(NumberTile tile)
  {
    
  }

  // *************************************************

  public String toString()
  {
    return board.toString();
  }

  public static void main(String[] args)
  {
    TileGame game = new TileGame();

    System.out.println(game.insertTile(new NumberTile(3, 4, 6, 3)) + " " + game.board);
    System.out.println(game.insertTile(new NumberTile(4, 3, 4, 7)) + " " + game.board);
    System.out.println(game.insertTile(new NumberTile(4, 2, 1, 3)) + " " + game.board);
    System.out.println(game.insertTile(new NumberTile(2, 9, 5, 2)) + " " + game.board);
    System.out.println(game.insertTile(new NumberTile(2, 2, 3, 5)) + " " + game.board);
    System.out.println(game.insertTile(new NumberTile(9, 7, 2, 2)) + " " + game.board);
    System.out.println(game.insertTile(new NumberTile(8, 2, 3, 9)) + " " + game.board);
  }
}
