public class Textbook extends Book {
	private int edition;

	public Textbook(String title1, double price1, int edition1) {
		super(title1, price1);
		edition = edition1;
	}

	public int getEdition() {
		return edition;
	}

	public String getBookInfo() {
		return super.getBookInfo() + "-" + edition;
	}

	public boolean canSubstituteFor(Textbook other) {
		return other.getTitle().equals(getTitle()) && other.getEdition() < getEdition();
	}
}
