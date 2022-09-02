public class TestGame
{
  public static void main(String[] args)
  {
    GameDriver game = new GameDriver(new MyGameState());
    game.play();
  }
}
