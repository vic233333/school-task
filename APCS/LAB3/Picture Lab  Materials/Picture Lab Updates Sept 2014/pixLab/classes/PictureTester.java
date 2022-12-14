/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {
	/**
	 * Method to test zeroBlue
	 */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	/**
	 * Method to test keepOnlyBlue
	 */
	public static void testKeepOnlyBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
	}

	/**
	 * Method to test negate
	 */
	public static void testNegate() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}

	/**
	 * Method to test grayScale
	 */
	public static void testGrayscale() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.grayScale();
		beach.explore();
	}

	/**
	 * Method to test fixUnderwater
	 */
	public static void testFixUnderwater() {
		Picture water = new Picture("water.jpg");
		water.explore();
		water.fixUnderWater();
		water.explore();
	}

	/**
	 * Method to test mirrorVertical
	 */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/**
	 * Method to test mirrorHorizontal
	 */
	public static void testMirrorHorizontal() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorHorizontal();
		caterpillar.explore();
	}

	/**
	 * Method to test mirrorDiagonal
	 */
	public static void testMirrorDiagonal() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorDiagonal();
		caterpillar.explore();
	}

	/**
	 * Method to test mirrorSnowman
	 */
	public static void testMirrorSnowman() {
		Picture temple = new Picture("snowman.jpg");
		temple.explore();
		temple.mirrorSnowman();
		temple.explore();
	}

	/**
	 * Method to test mirrorGull
	 */
	public static void testMirrorSeagull() {
		Picture temple = new Picture("seagull.jpg");
		temple.explore();
		temple.mirrorSeagull();
		temple.explore();
	}

	/**
	 * Method to test mirrorTemple
	 */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/**
	 * Method to test the collage method
	 */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/**
	 * Method to test carteMyCollage method
	 */
	public static void testCarteMyCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.carteMyCollage();
		canvas.explore();
	}

	/**
	 * Method to test copyOtherToThis method
	 */
	public static void testCopyOtherToThis() {
		Picture canvas = new Picture("flower2.jpg");
		Picture flower1 = new Picture("flower1.jpg");
		flower1.explore();
		canvas.copyOtherToThis(flower1, 0, 0, 0, 30, 30, 65);
		canvas.explore();
	}

	/**
	 * Method to test edgeDetection
	 */
	public static void testEdgeDetection() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/**
	 * Main method for testing.  Every class can have a main
	 * method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		//testZeroBlue();
//		testKeepOnlyBlue();
		//testKeepOnlyRed();
		//testKeepOnlyGreen();
//		testNegate();
//		testGrayscale();
//		testFixUnderwater();
//		testMirrorVertical();
//		testMirrorHorizontal();
//		testMirrorHorizontal();
//		testMirrorSnowman();
		testMirrorSeagull();
		//testMirrorTemple();
		//testMirrorArms();
		//testMirrorGull();
		//testMirrorDiagonal();
		//testCollage();
		//testCopy();
		//testEdgeDetection();
		//testEdgeDetection2();
		//testChromakey();
		//testEncodeAndDecode();
		//testGetCountRedOverValue(250);
		//testSetRedToHalfValueInTopHalf();
		//testClearBlueOverValue(200);
		//testGetAverageForColumn(0);
	}
}