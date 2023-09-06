
/**
 * Write a description of class Grad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grad extends Student {
    private int id;

    public Grad(String n, String g, int[] s, int id1) {
        super(n, g, s);
        id = id1;
    }

    public int getId() {

        return id;
    }

    public void computeGra() {
        if (getAve() >= 70) {
            setGrade("pass");
        } else {
            setGrade("failed");
        }

    }

}
