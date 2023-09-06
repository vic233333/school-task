import java.text.DecimalFormat;

public class SimpleLunchItem implements MenuItem
{
  private String name;
  private double price;
  
  public SimpleLunchItem(String aName, double aPrice)
  {
    name = aName;
    price = aPrice;
  }

  public String getName() { return name; }
  public double getPrice() { return price; }
  
  public String toString ()
  {
    DecimalFormat money = new DecimalFormat("0.00");
    return getName() + " " + money.format(getPrice());
  }
}

