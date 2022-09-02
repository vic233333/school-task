public abstract class Ticket
{
  private int serialNumber;

  public Ticket()
  {
    serialNumber = getNextSerialNumber();
  }

  // returns the price for this ticket
  public abstract double getPrice();

  // returns a string with information about the ticket
  public String toString()
  {
    return "Number: " + serialNumber + "\nPrice: " + getPrice();
  }

  private static int nextSerialNumber = 0;

  // returns a new unique serial number
  private static int getNextSerialNumber()
  {
    return nextSerialNumber++;
  }
}
