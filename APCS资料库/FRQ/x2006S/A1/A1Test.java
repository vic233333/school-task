public class A1Test
{
  public static void main(String[] args)
  {
    DailySchedule schedule = new DailySchedule();
    System.out.println("9-10 added: " +
      schedule.addAppt(new Appointment(new TimeInterval(9, 10)), false));

    System.out.println("11-12 added: " +
      schedule.addAppt(new Appointment(new TimeInterval(11, 12)), false));

    System.out.println("12-16 added: " +
      schedule.addAppt(new Appointment(new TimeInterval(12, 16)), false));

    System.out.println("10-12 added: " +
      schedule.addAppt(new Appointment(new TimeInterval(10, 12)), false));

    System.out.println("10-14 added (emergency): " +
      schedule.addAppt(new Appointment(new TimeInterval(10, 14)), true));

    System.out.println(schedule);
  }
}
