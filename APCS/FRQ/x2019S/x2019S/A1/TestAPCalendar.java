/* A1 test */

public class TestAPCalendar
{
  public static void main(String[] args)
  {
    for (int year = 1999; year <= 2007; year++)
      System.out.println(year + " Feb 5 " + APCalendar.dayOfWeek(2, 5, year) +
                                " Nov 15 " + APCalendar.dayOfWeek(11, 15, year));

    /*
      1999 Feb 5 5 Nov 15 1
      2000 Feb 5 6 Nov 15 3
      2001 Feb 5 1 Nov 15 4
      2002 Feb 5 2 Nov 15 5
      2003 Feb 5 3 Nov 15 6
      2004 Feb 5 4 Nov 15 1
      2005 Feb 5 6 Nov 15 2
      2006 Feb 5 0 Nov 15 3
      2007 Feb 5 1 Nov 15 4
    */
  }
}
