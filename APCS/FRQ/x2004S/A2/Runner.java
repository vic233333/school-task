
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner {

	public static void main(String[] args) {
		System.out.println("******* A-2 *******");

		Kennel kennel = new Kennel();
		kennel.add(new Dog("Fido"));
		kennel.add(new Cat("Tommy"));
		kennel.add(new LoudDog("Barker"));
		kennel.allSpeak();
	}
}
