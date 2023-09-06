import java.util.Arrays;

public class Robot {
	private int[] hall;
	private int pos;
	private boolean facingRight;

	public Robot(int[] toys, int pos, boolean facingRight) {
		hall = new int[toys.length];
		for (int i = 0; i < toys.length; i++)
			hall[i] = toys[i];
		this.pos = pos;
		this.facingRight = facingRight;
	}

	// A-4, (a)

	/**
	 * returns true if this Robot has a wall immediately in
	 * front of it, so that it cannot move forward:
	 * otherwise, returns false
	 */
	public boolean forwardMoveBlocked() {
		if (facingRight && pos == hall.length - 1) {
			return true;
		} else if (!facingRight && pos == 0) {
			return true;
		} else {
			return false;
		}
	}

	// A-4, (b)

	/**
	 * one move has been made according to the
	 * specifications above and the state of this
	 * Robot has been updated
	 */
	private void move() {
		// 搬
		if (hall[pos] > 0) {
			hall[pos]--;
		}
		// 走
		if (forwardMoveBlocked() == true) {
			facingRight = !facingRight;
		} else {
			if (facingRight) {
				pos++;
			} else {
				pos--;
			}
		}
	}

	// A-4, (c)

	/**
	 * no more items remain in the hallway;
	 * returns the number of moves made
	 */
	public int clearHall() {
		int numMoves = 0;
		while (hallIsClear() != true) {
			move();
			numMoves++;
		}
		return numMoves;
	}

	private boolean hallIsClear() {
		int count = 0;

		for (int i = 0; i < hall.length; i++)
			count += hall[i];

		return count == 0;
	}


}


