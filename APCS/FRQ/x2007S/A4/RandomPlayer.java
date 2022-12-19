import java.lang.Thread.State;
import java.util.ArrayList;

/*** Part (a) ***/

class RandomPlayer extends Player {
	public RandomPlayer(String n) {
		super(n);
	}

	public String getNexString(GameState state) {
		ArrayList<String> temp = state.getCurrentMoves();
		int r = (int) (Math.random() * temp.size());
		if (temp.size() == 0) {
			return "no move";
		} else {
			return temp.get(r);
		}
	}
}