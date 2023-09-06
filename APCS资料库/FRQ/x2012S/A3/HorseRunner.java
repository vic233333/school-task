public class HorseRunner
{
  public static void main(String[] args)
  {
    Horse[] horses =
      {
        new RaceHorse("Trigger", 1340),
        null,
        new RaceHorse("Silver", 1210),
        new RaceHorse("Lady", 1575),
        null,
        new RaceHorse("Patches", 1350),
        new RaceHorse("Duke", 1410)
      };

    HorseBarn sweetHome = new HorseBarn(horses);
    System.out.println(sweetHome);

    System.out.println("Trigger in " + sweetHome.findHorseSpace("Trigger"));
    System.out.println("Silver in " + sweetHome.findHorseSpace("Silver"));
    System.out.println("Coco in " + sweetHome.findHorseSpace("Coco"));
    System.out.println();

    horses[3] = null;
    sweetHome = new HorseBarn(horses);
    System.out.println("Before: " + sweetHome);
    sweetHome.consolidate();
    System.out.println("After:  " + sweetHome);
  }
}
