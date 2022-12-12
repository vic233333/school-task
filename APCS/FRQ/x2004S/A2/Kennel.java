import java.util.ArrayList;

public class Kennel {
	private ArrayList<Pet> petList;

	public Kennel() {
		petList = new ArrayList();
	}

	public void add(Pet pet) {
		petList.add(pet);
	}

	// A-2, (c)

	public void allSpeak() {
		for (int i = 0; i < petList.size(); i++) {
			System.out.println(petList.get(i).getName() + petList.get(i).speak());
		}

	}


}

