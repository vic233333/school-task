class MyFuelRobot implements FuelRobot
{
  private int currentIndex;
  private boolean facingRight;

  public MyFuelRobot(int index) { currentIndex = index; facingRight = true; }
  public int getCurrentIndex() {return currentIndex; }
  public boolean isFacingRight() { return facingRight; }
  public void changeDirection() { facingRight = !facingRight; }
  public void moveForward(int numLocs)
  {
    if (facingRight)
      currentIndex += numLocs;
    else
      currentIndex -= numLocs;
  }
}
