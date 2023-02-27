/* A3 */

import java.util.ArrayList;

public class ClubMembers
{
  private ArrayList<MemberInfo> memberList;

  public ClubMembers()
  {
    memberList = new ArrayList<MemberInfo>();
  }

  public ClubMembers(MemberInfo[] members)
  {
    memberList = new ArrayList<MemberInfo>();
    for (MemberInfo member : members)
      memberList.add(member);
  }
  
  /* Part (a) */

  /** Adds new club members to memberList, as described in part (a).
   *  Precondition: names is a non-empty array.
   */
  public void addMembers(String[] names, int gradYear)
  {
   
  }

  /* Part (b) */
  
  /** Removes members who have graduated and returns a list of members who have graduated
   *  and are in good standing, as described in part (b).
   */
  public ArrayList<MemberInfo> removeMembers(int year)
  {
   
  }

  /***************** Test *****************/

  public String toString()
  {
    return memberList.toString();
  } 

  public static void main(String[] args)
  {
    MemberInfo[] members = {new MemberInfo("SMITH, JANE", 2019, false),
                            new MemberInfo("FOX, STEVE", 2018, true),
                            new MemberInfo("XIN, MICHAEL", 2017, false),
                            new MemberInfo("GARCIA, MARIA", 2020, true)};

    ClubMembers club = new ClubMembers(members);

    ArrayList<MemberInfo> newList = club.removeMembers(2018);
    System.out.println("New list = " + newList + " Club list = " + club);
  }
}