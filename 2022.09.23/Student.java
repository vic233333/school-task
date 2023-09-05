
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student {
    private String name;
    private String grade;
    private int[] score;

    public Student() {//super()
        name = "";
        grade = "";
        score = new int[3];
    }

    public Student(String n, String g, int[] s) {//super(....)
        name = n;
        grade = g;
        score = s;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int[] getScore() {
        return score;
    }

    public void setName(String n) {
        name = n;
    }

    public void setGrade(String g) {
        grade = g;
    }

    public void setScore(int[] s) {
        score = s;
    }

    public double getAve() {
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum / score.length;
    }

    public void computeGra() {
        if (getAve() >= 60) {
            setGrade("pass");
        } else {
            grade = "failed";
        }
    }
}
