package code_list_two;

//��һ�Ĺ���ģʽ
public class ObjectO {
    public static void playGame(GameFactory gf) {
        Game game = gf.getGame();
        game.play();
    }

    public static void main(String[] args) {
        playGame(GameImpl.factory);
        playGame(GameImpl2.factory);
    }
}

interface Game {
    void play();
}

interface GameFactory {
    Game getGame();
}

class GameImpl implements Game {
    private GameImpl() {
    }//����Ĺ�������˽�еģ�������ͻ��˵��øù�����

    public void play() {
        System.out.println("GameImpl.play");
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new GameImpl();
        }
    };
}

class GameImpl2 implements Game {
    private GameImpl2() {
    }

    public void play() {
        System.out.println("GameImpl2.play");
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new GameImpl2();
        }
    };
}
