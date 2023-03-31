/* A3 */

import java.util.ArrayList;

public class ClubMembers {
	private ArrayList<MemberInfo> memberList;

	public ClubMembers() {
		memberList = new ArrayList<MemberInfo>();
	}

	public ClubMembers(MemberInfo[] members) {
		memberList = new ArrayList<MemberInfo>();
		for (MemberInfo member : members)
			memberList.add(member);
	}

	/* Part (a) */

	/**
	 * Adds new club members to memberList, as described in part (a).
	 * Precondition: names is a non-empty array.
	 */
	/* 题目要求：乱序添加 */
	public void addMembers(String[] names, int gradYear) {
		for (int i = 0; i < names.length; i++) {
			MemberInfo temp = new MemberInfo(names[i], gradYear, true);
			memberList.add(temp);
		}
	}

	/* 提高要求：按年份顺序添加 */
	public void addMembers(String[] names, int gradYear) {
		for (int i = 0; i < names.length; i++) {
			MemberInfo temp = new MemberInfo(names[i], gradYear, true);
			int j = 0;
			while (j < names.length && gradYear > memberList.get(j).getGradYear()) {
				j++;
			}
			memberList.add(j, temp);
		}
	}

	/* Part (b) */

	/**
	 * Removes members who have graduated and returns a list of members who have graduated
	 * and are in good standing, as described in part (b).
	 */
	public ArrayList<MemberInfo> removeMembers(int year) {
		ArrayList<MemberInfo> al = new ArrayList<MemberInfo>();
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getGradYear() <= year) {
				MemberInfo temp = memberList.remove(i);
				i--;
				if (temp.inGoodStanding()) {
					al.add(temp);
				}
			}
		}
		return al;
	}

	/***************** Test *****************/

	public String toString() {
		return memberList.toString();
	}

	public static void main(String[] args) {
		MemberInfo[] members = {new MemberInfo("SMITH, JANE", 2019, false),
				new MemberInfo("FOX, STEVE", 2018, true),
				new MemberInfo("XIN, MICHAEL", 2017, false),
				new MemberInfo("GARCIA, MARIA", 2020, true)};

		ClubMembers club = new ClubMembers(members);

		ArrayList<MemberInfo> newList = club.removeMembers(2018);
		System.out.println("New list = " + newList + " Club list = " + club);
	}
}