public class StringUtil {
	private String str;

	/**
	 * @param oldStr a String
	 * @param newStr a String
	 * @return a new String in which all occurrences of the substring
	 * oldstr in str are replaced by the substring newstr
	 */
	public String apcsReplaceAll(String oldStr, String newStr) {
		int i = str.indexOf(oldStr);
		while (i != -1) {
			str = str.substring(0, i) + newStr + str.substring(i + oldStr.length());//update
			i = str.indexOf(oldStr, i + newStr.length());
		}
		return str;
	}

	/**
	 * @param people array of references to Person objects
	 * @return a copy of str modified so that each occurrence of a first
	 * name in people is replaced by the corresponding nickname
	 */
	public String replaceNameNickname(Person[] people) {
		String res = str;
		for (int i = 0; i < people.length; i++) {
			str = apcsReplaceAll(people[i].getFirstName(), people[i].getNickname());
		}
		String temp = str;
		str = res;
		return temp;
	}
// There may be methods that are not shown.
}