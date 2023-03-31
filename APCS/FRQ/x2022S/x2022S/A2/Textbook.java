public class Textbook extends Book {
	private int edition;

	public Textbook(String str, double price, int edition1) {
		super(str, price);
		edition = edition1;
	}

	public int getEdition() {
		return edition;
	}

	public String getBookInfo() {
		return super.getBookInfo() + "-" + edition;
	}

	public boolean canSubstituteFor(Textbook str) {
		return str.getTitle().equals(getTitle()) && str.getEdition() < getEdition();
	}
}
