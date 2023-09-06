import java.util.List;

public class LogMessageTest
{
  public static void main(String[] args)
  {
    String[] messages = {
        "CLIENT3:security alert ? repeated login failures",
        "Webserver:disk offline",
        "SERVER1:file not found",
        "SERVER2:read error on disk DSK1",
        "SERVER1:write error on disk DSK2",
        "Webserver:error on /dev/disk",
        "True:disk",
        "True:error on disk",
        "True:error on disk DSK1",
        "False:DISK offline",
        "False:error on disk3",
        "False:error on /dev/disk",
        "False:diskette"};

    for (String s : messages)
    {
      LogMessage msg = new LogMessage(s);
      System.out.println(msg.getMachineId() + ":" + msg.getDescription() + "==>" + msg.containsWord("disk"));
    }

    SystemLog theLog  = new SystemLog(messages);
    List<LogMessage> removed = theLog.removeMessages("disk");

    System.out.println("Removed messages:\n");
    for (LogMessage msg : removed)
      System.out.println(msg);
    System.out.println();

    System.out.println("Remaining messages:\n");
    System.out.println(theLog);

  }
}
