import java.util.*;

public class test {
    public static void main(String[] args) {
        String s = new String("hello");
        ElevensBoard game = new ElevensBoard();
        game.deal(0);
        game.deal(1);
        game.deal(3);
        game.deal(6);
        game.deal(7);
        System.out.println(game);
        List<Integer> gameList = game.cardIndexes();
        for (int i = 0; i < gameList.size(); i++) {
            System.out.println(gameList.get(i));
        }
    }
}
