/*** Part (b) ***/

public class Vehicle extends TaxableItem{

	private double cost;
	private double markup;

	public Vehicle(double c1, double m1, double rate) {
		super(rate);
		cost = c1;
		markup = m1;
	}

	public double getListPrice() {
		double listPrice = cost + markup;
		return listPrice;
	}

	public void changeMarkup(double m2) {
		markup = m2;
	}

}
