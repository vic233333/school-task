import java.util.ArrayList;

public class DailySchedule
{
  // contains Appointment objects, no two Appointments overlap
  private ArrayList apptList;


  public DailySchedule()
  {  apptList = new ArrayList();  }


  /*** Part (b) ***/

  // removes all appointments that overlap the given Appointment
  // postcondition: all appointments that have a time conflict with
  //                appt have been removed from this DailySchedule
  public void clearConflicts(Appointment appt)
  {
    
  }

  /*** Part (c) ***/

  // if emergency is true, clears any overlapping appointments and adds
  // appt to this DailySchedule; otherwise, if there are no conflicting
  // appointments, adds appt to this DailySchedule;
  // returns true if the appointment was added;
  // otherwise, returns false
  public boolean addAppt(Appointment appt, boolean emergency)
  {
    

    
  }

  public String toString()
  { return apptList.toString(); }
}
