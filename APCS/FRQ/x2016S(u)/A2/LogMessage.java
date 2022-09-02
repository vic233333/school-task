public class LogMessage
{
  private String machineId;
  private String description;

  /* Part (a) */

  public LogMessage(String message)
  {
   
  }

  /* Part (b) */

  public boolean containsWord(String keyword)
  {
  }



  public String getMachineId()
  { return machineId; }

  public String getDescription()
  { return description; }

  public String toString()
  {
    return getMachineId() + ":" + getDescription();
  }
}
