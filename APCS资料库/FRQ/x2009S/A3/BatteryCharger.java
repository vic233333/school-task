public class BatteryCharger {
	/**
	 * rateTable has 24 entries representing the charging costs for hours 0 through 23.
	 */
	private int[] rateTable;

	public BatteryCharger() {
		int[] table = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200,
				40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
		rateTable = table;
	}

	// Part (a)

	/**
	 * Determines the total cost to charge the battery starting at the beginning of startHour.
	 *
	 * @param startHour  the hour at which the charge period begins
	 *                   Precondition: 0 = startHour = 23
	 * @param chargeTime the number of hours the battery needs to be charged
	 *                   Precondition: chargeTime > 0
	 * @return the total cost to charge the battery
	 */
	/* method 1*/
	private int getChargingCost(int startHour, int chargeTime) {
		int sum = 0;
		for (int i = 0; i < chargeTime; i++) {
			sum += rateTable[(startHour + i) % rateTable.length];
		}
		return sum;
	}

	/* method 2*/
	private int getChargingCost(int startHour, int chargeTime) {
		int sum = 0;
		int j = startHour;
		for (int i = 0; i < chargeTime; i++) {
			sum += rateTable[j % rateTable.length];
			j++;
		}
		return sum;
	}

	/* method 3*/
	private int getChargingCost(int startHour, int chargeTime) {
		int sum = 0;
		for (int i = startHour; i < startHour + chargeTime; i++) {
			sum += rateTable[i % rateTable.length];
		}
		return sum;
	}

	// *************************************************

	// Part (b)

	/**
	 * Determines start time to charge the battery at the lowest cost for the given charge time.
	 *
	 * @param chargeTime the number of hours the battery needs to be charged
	 *                   Precondition: chargeTime > 0
	 * @return an optimal start time, with 0 = returned value = 23
	 */
	public int getChargeStartTime(int chargeTime) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < rateTable.length; i++) {
			int temp = getChargingCost(i, chargeTime);
			if (temp < min) {
				min = temp;
			}
		}
		return min;
	}

	// *************************************************

	public static void main(String[] args) {
		BatteryCharger charger = new BatteryCharger();

		System.out.println("Cost:");
		System.out.println(charger.getChargingCost(12, 1));
		System.out.println(charger.getChargingCost(0, 2));
		System.out.println(charger.getChargingCost(22, 7));
		System.out.println(charger.getChargingCost(22, 30));
		System.out.println();

		System.out.println("Best starting time:");
		System.out.println(charger.getChargeStartTime(1));
		System.out.println(charger.getChargeStartTime(2));
		System.out.println(charger.getChargeStartTime(7));
		System.out.println(charger.getChargeStartTime(30));
		System.out.println();
	}
}
