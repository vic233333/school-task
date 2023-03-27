public class LogMessage {
	private String machineId;
	private String description;

	/* Part (a) */

	public LogMessage(String message) {
		int i = message.indexOf(":");
		machineId = message.substring(0, i);
		description = message.substring(i + 1);
	}

	/* Part (b) */
	/* method 1 */
	public boolean containsWord(String keyword) {
		int i = description.indexOf(keyword);
		while (i >= 0) {
			String before = "";
			String after = " ";
			if (i > 0) {
				before = description.substring(i - 1, i);
			}
			if (i + keyword.length() < description.length()) {
				after = description.substring(i + keyword.length(), i + keyword.length() + 1);
			}
			if (before.equals("") && after.equals("")) {
				return true;
			}
			i = description.indexOf(keyword, i + 1);
		}
		return false;
	}

	/* method 2 */
	public boolean containsWord(String keyword) {
		return (" " + description + " ").indexOf(" disk ") != -1;
	}

	public String getMachineId() {
		return machineId;
	}

	public String getDescription() {
		return description;
	}

	public String toString() {
		return getMachineId() + ":" + getDescription();
	}
}
