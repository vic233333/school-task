public class RaceHorse implements Horse
{
  private String name;
  private int weight;

  public RaceHorse(String _name, int _weight) { name = _name; weight = _weight; }
  public String getName() { return name; }
  public int getWeight() { return weight; }
  public String toString() { return name + "/" + weight; }
}
