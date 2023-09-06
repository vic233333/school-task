public interface FuelRobot
{
  /** @return the index of the current location of the robot */
  int getCurrentIndex();

  /** Determine whether the robot is currently facing to the right
   *  @return true if the robot is facing to the right (toward tanks with larger indexes)
   *         false if the robot is facing to the left (toward tanks with smaller indexes)
   */
  boolean isFacingRight();

  /** Changes the current direction of the robot */
  void changeDirection();

  /** Moves the robot in its current direction by the number of locations specified.
   *  @param numLocs the number of locations to move. A value of 1 moves
   *                the robot to the next location in the current direction.
   *        Precondition: numLocs > 0
   */
  void moveForward(int numLocs);
}