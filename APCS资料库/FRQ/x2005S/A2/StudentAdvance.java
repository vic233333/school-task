/*** Part (b) ***/

public class StudentAdvance extends Advance {

	public StudentAdvance(int d) {
		super(d);
	}

	public double getPrice() {
		return super.getPrice() / 2;
	}


	public String toString() {
		return super.toString() + "\n(student ID required)";
	}
}
