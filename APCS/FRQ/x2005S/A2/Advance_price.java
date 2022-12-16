/**
 * Advance的另一个写法
 * 在初始化的时候就定义price
 */
public class Advance_price extends Ticket {
	private double price;

	public Advance_price(int days) {
		if (days <= 9) {
			price = 40.0;
		} else {
			price = 30.0;
		}
	}

	public double getPrice() {
		return price;
	}
}
