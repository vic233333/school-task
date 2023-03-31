/* A2 */

public class StepTracker {
	private int actSteps;
	private int activeDays;
	private double sum;
	private int count;

	public StepTracker(int actSteps1) {
		actSteps = actSteps1;
		activeDays = 0;
		sum = 0.0;
		count = 0;
	}

	public int activeDays() {
		return activeDays;
	}

	public double averageSteps() {
		if (count == 0) {
			return 0.0;
		} else {
			return sum / count;
		}
	}

	public void addDailySteps(int steps2) {
		sum += steps2;
		count++;
		if (steps2 >= actSteps) {
			activeDays++;
		}
	}
}