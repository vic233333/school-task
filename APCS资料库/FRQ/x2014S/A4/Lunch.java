public class Lunch
{
  public static void main(String[] args)
  {
    Sandwich cheesburger = new Sandwich("Cheeseburger", 2.75);
    Sandwich club = new Sandwich("Club Sandwich", 2.75);
    Salad spinach = new Salad("Spinach Salad", 1.25);
    Salad coleslaw = new Salad("Coleslaw", 1.25);
    Drink soda = new Drink("Orange Soda", 1.25);
    Drink cappuccino  = new Drink("Cappuccino", 3.50);
  
    Trio trio1 = new Trio(cheesburger, spinach, soda);
    System.out.println(trio1.getName()+ ":"+ trio1.getPrice());
    Trio trio2 = new Trio(club, coleslaw, cappuccino);
    System.out.println(trio2.getName()+ ":"+ trio2.getPrice());
  }  
}
