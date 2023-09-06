import java.util.List;
import java.util.ArrayList;
// import java.util.Iterator;

public class MasterOrder {
	/**
	 * The list of all cookie orders
	 */
	private List<CookieOrder> orders;

	/**
	 * Constructs a new MasterOrder object.
	 */
	public MasterOrder() {
		orders = new ArrayList<CookieOrder>();
	}

	/**
	 * Adds theOrder to the master order.
	 *
	 * @param theOrder the cookie order to add to the master order
	 */
	public void addOrder(CookieOrder theOrder) {
		orders.add(theOrder);
	}

	// Part (a)

	/**
	 * @return the sum of the number of boxes of all of the cookie orders
	 */
	public int getTotalBoxes() {
		int sum = 0;
		for (int i = 0; i < orders.size(); i++) {
			sum += orders.get(i).getNumBoxes();
		}
		return sum;
	}

	// Part (b)

	/**
	 * Removes all cookie orders from the master order that have the same variety of
	 * cookie as cookieVar and returns the total number of boxes that were removed.
	 *
	 * @param cookieVar the variety of cookies to remove from the master order
	 * @return the total number of boxes of cookieVar in the cookie orders removed
	 */

	public int removeVariety(String cookieVar) {
		int count = 0;
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getVariety().equals(cookieVar))
				orders.remove(i);
			i--;
			count++;
		}
		return count;
	}


	public static void main(String[] args) {
		MasterOrder goodies = new MasterOrder();
		goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
		goodies.addOrder(new CookieOrder("Shortbread", 5));
		goodies.addOrder(new CookieOrder("Macaroon", 2));
		goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
		System.out.println(goodies.orders);
		System.out.println("Total: " + goodies.getTotalBoxes());
		System.out.println(goodies.removeVariety("Chocolate Chip"));
		System.out.println(goodies.orders);
		System.out.println(" Total: " + goodies.getTotalBoxes());
		System.out.println(goodies.removeVariety("Brownie"));
		System.out.println(goodies.orders);
		System.out.println("Total: " + goodies.getTotalBoxes());
	}
}