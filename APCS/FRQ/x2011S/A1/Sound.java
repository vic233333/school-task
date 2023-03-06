import java.util.Arrays;

public class Sound {
	/** the array of values in this sound; guaranteed not to be null */
	private int[] samples;

	// Part (a)

	/**
	 * Changes those values in this sound that have an amplitude greater than limit.
	 * Values greater than limit are changed to limit.
	 * Values less than -limit are changed to -limit.
	 * 
	 * @param limit the amplitude limit
	 *              Precondition: limit >= 0
	 * @return the number of values in this sound that this method changed
	 */
	public int limitAmplitude(int limit) {
		int count = 0;
		for (int i = 0; i < samples.length; i++) {
			if (samples[i] > limit) {
				samples[i] = limit;
				count++;
			}
			if (samples[i] < -limit) {
				samples[i] = -limit;
				count++;
			}
		}
		return count;
	}

	// Part (b)

	/**
	 * Removes all silence from the beginning of this sound.
	 * Silence is represented by a value of 0.
	 * Precondition: samples contains at least one nonzero value
	 * Postcondition: the length of samples reflects the removal of starting silence
	 */
	public void trimSilenceFromBeginning() {
		int j = 0;
		while (j < samples.length && samples[j] == 0) {
			j++;
		}
		int[] arr = new int[samples.length - j];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = samples[j];
			// j ++;
		}
		samples = arr;
	}

	public static void main(String[] args) {
		Sound sound = new Sound();
		sound.samples = new int[] { 40, 2532, 17, -2300, -17, -4000, 2000, 1048,
				-420, 33, 15, -32, 2030, 3223 };
		int numChanges = sound.limitAmplitude(2000);
		System.out.println(numChanges);
		System.out.println(Arrays.toString(sound.samples));

		sound.samples = new int[] { 0, 0, 0, 0, -14, 0, -35, -39, 0,
				-7, 16, 32, 37, 29, 0, 0 };
		sound.trimSilenceFromBeginning();
		System.out.println(Arrays.toString(sound.samples));
	}
}