import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeatingChart {
	/**
	 * seats[r][c] represents the Student in row r and column c in the classroom.
	 */
	private Student[][] seats;

	/********************** Part (a) *********************/

	/**
	 * Creates a seating chart with the given number of rows and columns from the
	 * students in
	 * studentList. Empty seats in the seating chart are represented by null.
	 *
	 * @param rows the number of rows of seats in the classroom
	 * @param cols the number of columns of seats in the classroom
	 *             Precondition: rows > 0; cols > 0;
	 *             rows * cols >= studentList.size()
	 *             Postcondition:
	 *             - Students appear in the seating chart in the same order as they
	 *             appear
	 *             in studentList, starting at seats[0][0].
	 *             - seats is filled column by column from studentList, followed by
	 *             any
	 *             empty seats (represented by null).
	 *             - studentList is unchanged.
	 */

	/**
	 * method 1 不修改studentList
	 */
	public SeatingChart(List<Student> studentList, int rows, int cols) {
		seats = new Student[rows][cols];
		int i = 0;
		for (int c = 0; c < seats[0].length; c++) {
			for (int r = 0; r < seats.length; r++) {
				if (i < studentList.size()) {
					seats[r][c] = studentList.get(i);
					i++;
				} else {
					seats[r][c] = null;
				}
			}
		}
	}

	/**
	 * method 2 复制一份studentList并修改
	 */
	public SeatingChart(List<Student> studentList, int rows, int cols) {
		seats = new Student[rows][cols];
		List<Student> sl = new ArrayList<Student>();
		for (int i = 0; i < studentList.size(); i++) {
			sl.add(studentList.get(i));
		}
		for (int c = 0; c < seats[0].length; c++) {
			for (int r = 0; r < seats.length; r++) {
				if (sl.size() > 0) {
					seats[r][c] = sl.remove(0);
				} else {
					seats[r][c] = null;
				}
			}
		}
	}

	/**
	 * method 3
	 */
	public SeatingChart(List<Student> studentList, int rows, int cols) {
		seats = new Student[rows][cols];
		for (int i = 0; i < studentList.size(); i++) {
			int r = (int) (Math.random() * rows);
			int c = (int) (Math.random() * cols);
			while (seats[r][c] != null) {
				r = (int) (Math.random() * rows);
				c = (int) (Math.random() * cols);
			}
			seats[r][c] = studentList.get(i);
		}
	}

	/********************** Part (b) *********************/  

	/**
	 * Removes students who have more than a given number of absences from the
	 * seating chart, replacing those entries in the seating chart with null
	 * and returns the number of students removed.
	 *
	 * @param allowedAbsences an integer >= 0
	 * @return number of students removed from seats
	 * Postcondition:
	 * - All students with allowedAbsences or fewer are in their original
	 * positions in seat
	 * - No student in seats has more than allowedAbsences absences.
	 * - Entries without students contain null.
	 */
	public int removeAbsentStudents(int allowedAbsences) {
		int count = 0;
		for (int r = 0; r < seats.length; r++) {
			for (int c = 0; c < seats[0].length; c++) {
				if (seats[r][c] != null
						&& seats[r][c].getAbsenceCount() > allowedAbsences) {
					seats[r][c] = null;
					count++;
				}
			}
		}
		return count;
	}

	/********************** Test *********************/

	public String toString() {
		String s = "";

		for (int r = 0; r < seats.length; r++) {
			for (int c = 0; c < seats[0].length; c++) {
				s += seats[r][c] + "   ";
			}
			s += "\n";
		}
		return s;
	}

	public static void main(String[] args) {
		Student[] students = {
				new Student("Karen", 3),
				new Student("Liz", 1),
				new Student("Paul", 4),
				new Student("Lester", 1),
				new Student("Henry", 5),
				new Student("Renee", 9),
				new Student("Glen", 2),
				new Student("Fran", 6),
				new Student("David", 1),
				new Student("Danny", 3)};

		List<Student> roster = Arrays.asList(students);
		SeatingChart chart = new SeatingChart(roster, 3, 4);
		System.out.println(chart + "\n\n");
		chart.removeAbsentStudents(4);
		System.out.println(chart + "\n\n");
	}
}