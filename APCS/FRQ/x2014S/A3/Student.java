public class Student
{
  private String name;
  private int absenceCount;
  
  public Student (String nm, int count)
  {
    name = nm;
    absenceCount = count;
  }
  
  /** Returns the name of this Student. */
  public String getName()
  { return name; }

  /** Returns the number of times this Student has missed class. */
  public int getAbsenceCount()
  { return absenceCount; }
  
  public String toString()
  { return name + " " + absenceCount; }
}