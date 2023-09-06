import java.util.ArrayList;

public class DailySchedule {
	// contains Appointment objects, no two Appointments overlap
	private ArrayList<Appointment> apptList;

	public DailySchedule() {
		apptList = new ArrayList();
	}


	/*** Part (b) ***/

	// removes all appointments that overlap the given Appointment
	// postcondition: all appointments that have a time conflict with
	//                appt have been removed from this DailySchedule
	public void clearConflicts(Appointment appt) {
		for (int i = 0; i < apptList.size(); i++) {
			if (apptList.get(i).conflictsWith(appt)) {
				apptList.remove(i);
				i--;
			}
		}
	}

	/*** Part (c) ***/

	// if emergency is true, clears any overlapping appointments and adds
	// appt to this DailySchedule; otherwise, if there are no conflicting
	// appointments, adds appt to this DailySchedule;
	// returns true if the appointment was added;
	// otherwise, returns false
	/* method 1*/
	public boolean addAppt(Appointment appt, boolean emergency) {
		if (emergency == true) {
			clearConflicts(appt);
			apptList.add(appt);
			return true;
		} else {
			boolean flag = false;
			for (int i = 0; i < apptList.size(); i++) {
				if (apptList.get(i).conflictsWith(appt)) {
					flag = true;
				}
			}
			if (flag == false) {
				apptList.add(appt);
				return true;
			} else {
				return false;
			}
		}
	}

	/* method 2*/
	public boolean addAppt(Appointment appt, boolean emergency) {
		if (emergency == true) {
			clearConflicts(appt);
			apptList.add(appt);
			return true;
		} else {
			int i = 0;
			while (i < apptList.size() && !apptList.get(i).conflictsWith(appt)) {
				i++;
			}//check if there is a conflicts
			if (i == apptList.size()) {//there is no conflicts
				apptList.add(appt);
				return true;
			} else {
				return false;
			}
		}
	}

	public String toString() {
		return apptList.toString();
	}
}
