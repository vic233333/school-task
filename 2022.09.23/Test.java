
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test {
    public static void main() {
        String s = new String("Hello");
        Student s1 = new UnderGra("Tom", "", new int[]{65, 67, 68});
        Student s2 = new Grad("Tom", "", new int[]{65, 67, 68}, 11111);
        s1.computeGra();
        s2.computeGra();
        System.out.println("s1 grade:" + s1.getGrade());
        System.out.println("s2 grade:" + s2.getGrade());
        //downcast;
        System.out.println("s2 id:" + ((Grad) s2).getId());
    }
}
