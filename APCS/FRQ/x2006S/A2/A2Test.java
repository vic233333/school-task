public class A2Test
{
  public static void main(String[] args)
  {
    Vehicle car = new Vehicle(20000, 2500, 0.1);
    System.out.printf("20000, 2500, 0.1 ==> purchase price: %.2f\n", car.purchasePrice());
    car.changeMarkup(1000);
    System.out.printf("Changed markup to 1000 ==> purchase price: %.2f\n", car.purchasePrice());
  }
}
