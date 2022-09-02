public class Reservation
{
  private String guestName;
  private int roomNumber;

  public Reservation(String guestName, int roomNumber)
  {
    this.guestName = guestName;
    this.roomNumber = roomNumber;
  }

  public int getRoomNumber()
  {
    return roomNumber;
  }

  public String toString()
  {
    return "[" + guestName + ", " + roomNumber + "]";
  }
}
