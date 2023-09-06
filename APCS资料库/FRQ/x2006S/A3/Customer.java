public class Customer {
	private String name;
	private int idNum;

	// constructs a Customer with given name and ID number
	public Customer(String name, int idNum) {
		this.name = name;
		this.idNum = idNum;
	}

	// returns the customer's name
	public String getName() {
		return name;
	}

	// returns the customer's id
	public int getID() {
		return idNum;
	}

	/*** Part (a) ***/

	// returns 0 when this customer is equal to other;
	//   a positive integer when this customer is greater than other;
	//   a negative integer when this customer is less than other
	public int compareCustomer(Customer other) {
		if (name.compareTo(other.name) == 0) {
			return idNum - other.idNum;
		} else {
			return name.compareTo(other.name);
		}
	}

	public String toString() {
		return name + " " + idNum;
	}
}
