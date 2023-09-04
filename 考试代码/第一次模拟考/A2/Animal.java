public class Animal {
	private String type;
	private String species;
	private String name;

	public Animal(String t, String s, String n) {
		type = t;
		species = s;
		name = n;
	}

	public String toString() {
		return name + " the " + species + " is a " + type;
	}
}
