/*不推荐*/
public class SeatingChart_method2 {
	/**
	 * seats[r][c] represents the Student in row r and column c in the classroom.
	 */
	private Student[][] seats;

	/**
	 * Creates a seating chart with the given number of rows and columns from the students in
	 * studentList. Empty seats in the seating chart are represented by null.
	 *
	 * @param rows the number of rows of seats in the classroom
	 * @param cols the number of columns of seats in the classroom
	 *             Precondition: rows > 0; cols > 0;
	 *             rows * cols >= studentList.length
	 *             Postcondition:
	 *             Students appear in the seating chart in random order
	 *             seats is filled column by column from studentList, followed by any
	 *             empty seats (represented by null).
	 *             studentList is unchanged.
	 */
	public SeatingChart_method2(Student[] studentList, int rows, int cols) {
		seats = new Student[rows][cols];
		Student[] arr = new Student[rows * cols];
		for (int i = 0; i < arr.length; i++) {
			if (i < studentList.length) {
				arr[i] = studentList[i];
			} else {
				arr[i] = null;
			}
		}
		int i = arr.length - 1;
		for (int r = 0; r < seats.length; r++)
			for (int c = 0; c < seats[0].length; c++) {
				int ran = (int) (Math.random() * i);
				seats[r][c] = arr[ran];
				Student temp = arr[i];
				arr[i] = arr[ran];
				arr[ran] = temp;
				i--;
			}
	}

	/**
	 * Removes students who have more than a given number of absences from the
	 * seating chart, replacing those entries in the seating chart with null
	 * and returns the number of students removed.
	 *
	 * @param allowedAbsences an integer>=0
	 * @return number of students removed from seats
	 * Postcondition:
	 * All students with allowedAbsences or fewer are in their original
	 * positions in seats.
	 * No student in seats has more than allowedAbsences absences.
	 * Entries without students contain null.
	 */
	public int removeAbsentStudents(int allowedAbsences) {
		/* to be implemented in part (b) */
	}

	// There may be instance variables, constructors, and methods that are not
	// shown.
}