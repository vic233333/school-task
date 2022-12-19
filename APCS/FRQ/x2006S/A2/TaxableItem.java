public abstract class TaxableItem implements Item {
	private double taxRate;

	public abstract double getListPrice();

	public TaxableItem(double rate) {
		taxRate = rate;
	}

	/*** Part (a) ***/

	// returns the price of the item including the tax
	public double purchasePrice() {
		return getListPrice()*(1+ taxRate);
	}
}
