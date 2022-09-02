import java.util.List;
import java.util.ArrayList;

public class MultipleGroups implements NumberGroup
{
  private List<NumberGroup> groupList;  

  public MultipleGroups()
  {
    groupList = new ArrayList<NumberGroup>();
  }
  
  // Part(c)

  public boolean contains(int num)
  {
    
  }

  /******************************************************************************/
  
  public static void main(String[] args)
  {
    MultipleGroups multiple = new MultipleGroups();
    multiple.groupList.add(new Range(5, 8));
    multiple.groupList.add(new Range(10, 12));
    multiple.groupList.add(new Range(1, 6));
    System.out.println(multiple.contains(2));
    System.out.println(multiple.contains(9));
    System.out.println(multiple.contains(6));
  }  
}
