
public class TestHotel
{
  public static void main(String[] args)
  {
    Hotel hotel = new Hotel(3);

    System.out.println("Reserve Amanda " + hotel.requestRoom("Amanda"));
    System.out.println("Reserve Ben " + hotel.requestRoom("Ben"));
    System.out.println("Reserve Cate " + hotel.requestRoom("Cate"));
    System.out.println("Reserve Don " + hotel.requestRoom("Don"));
    System.out.println("Reserve Euginia " + hotel.requestRoom("Euginia"));
    System.out.println();

    System.out.println("Hotel: " + hotel);
    System.out.println();

    System.out.println("Reassign Rm 2 " + hotel.cancelAndReassign(new Reservation("Cate", 2)));
    System.out.println("Reassign Rm 0 " + hotel.cancelAndReassign(new Reservation("Amanda", 0)));
    System.out.println("Reassign Rm 1 " + hotel.cancelAndReassign(new Reservation("Ben", 1)));
    System.out.println();

    System.out.println("Hotel: " + hotel);
    System.out.println();

    System.out.println("Reserve Frank " + hotel.requestRoom("Frank"));
    System.out.println("Reserve Gabrielle " + hotel.requestRoom("Gabrielle"));
    System.out.println();

    System.out.println("Hotel: " + hotel);
    System.out.println();
  }
}
