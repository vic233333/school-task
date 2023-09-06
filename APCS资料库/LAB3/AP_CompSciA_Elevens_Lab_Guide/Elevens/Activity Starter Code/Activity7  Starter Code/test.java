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
        printCards(game);
    }

    public static void printCards(ElevensBoard board) {
        List<Integer> cIndexes = board.cardIndexes();
        for (int i = 0; i < cIndexes.size(); i++) {
            System.out.println(board.cardAt(cIndexes.get(i)));
        }
    }
}
