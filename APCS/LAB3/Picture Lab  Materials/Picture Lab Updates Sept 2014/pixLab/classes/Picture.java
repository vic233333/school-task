import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 *
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 *
	 * @param height the height of the desired picture
	 * @param width  the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a
	 * copy of that picture
	 *
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 *
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 *
	 * @return a string with information about the picture such as fileName,
	 * height and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() +
				" height " + getHeight()
				+ " width " + getWidth();
		return output;

	}

	/**
	 * Method to set the blue to 0
	 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	/**
	 * 提取蓝色通道
	 */
	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (int r = 0; r < pixels.length; r++) {
			for (int c = 0; c < pixels[0].length; c++) {
				pixels[r][c].setRed(0);
				pixels[r][c].setGreen(0);
			}
		}
	}

	/**
	 * 反色
	 */
	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (int r = 0; r < pixels.length; r++) {
			for (int c = 0; c < pixels[0].length; c++) {
				pixels[r][c].setRed(255 - pixels[r][c].getRed());
				pixels[r][c].setGreen(255 - pixels[r][c].getGreen());
				pixels[r][c].setBlue(255 - pixels[r][c].getBlue());
			}
		}
	}

	/**
	 * 灰度
	 */
	public void grayScale() {
		Pixel[][] pixels = this.getPixels2D();
		for (int r = 0; r < pixels.length; r++) {
			for (int c = 0; c < pixels[0].length; c++) {
				Pixel pixelAtRC = pixels[r][c];
				int averageColor = (pixelAtRC.getRed() + pixelAtRC.getBlue() + pixelAtRC.getGreen());
				pixelAtRC.setRed(averageColor);
				pixelAtRC.setGreen(averageColor);
				pixelAtRC.setBlue(averageColor);
			}
		}
	}

	/**
	 * 修正水下照片
	 * 即削弱蓝绿色提升红色
	 */
	public void fixUnderWater() {
		Pixel[][] pixels = getPixels2D();
		for (int r = 0; r < pixels.length; r++) {
			for (int c = 0; c < pixels[0].length; c++) {
				pixels[r][c].setRed(pixels[r][c].getRed() * 2); //把红色*2
				pixels[r][c].setBlue(pixels[r][c].getBlue() / 2); //把蓝色/2
				pixels[r][c].setGreen(pixels[r][c].getGreen() / 2); //把蓝色/2
			}
		}
	}

	/**
	 * Method that mirrors the picture around a
	 * vertical mirror in the center of the picture
	 * from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * Method that mirrors the picture around a
	 * horizontal mirror in the center of the picture
	 * from up to down
	 */
	public void mirrorHorizontal()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel upPixel = null;
		Pixel downPixel = null;
		int height = pixels.length;
		int width = pixels[0].length;
		for (int row = 0; row < height / 2; row++) {
			for (int col = 0; col < width; col++) {
				upPixel = pixels[row][col];
				downPixel = pixels[height - 1 -row][col];
				downPixel.setColor(upPixel.getColor());
			}
		}
	}

	/**
	 * Method that mirrors the picture around a
	 * diagonal mirror in the center of the picture
	 * from left up to right down
	 */
	public void mirrorDiagonal()
	{
		Pixel[][] pixels = this.getPixels2D();
		int height = pixels.length;
		int width = pixels[0].length;
		int square = Math.min(height, width);
		for (int r = 0; r < square; r++) {
			for (int c = 0; c < square; c++) {
				if (r>=c)
				{
					pixels[c][r].setColor(pixels[r][c].getColor());
				}
			}
		}
	}

	/**
	 * Mirror for snowman.jpg
	 */
	public void mirrorSnowman()
	{
		Pixel[][] pixels = getPixels2D();
		for (int r = 156; r < 192; r++) {
			for (int c = 109; c < 167; c++) {
				pixels[192 * 2 - r][c].setColor(pixels[r][c].getColor());
			}
		}
		for (int r = 156; r < 192; r++) {
			for (int c = 109; c < 167; c++) {
				pixels[192 * 2 - r][c].setColor(pixels[r][c].getColor());
			}
		}
	}

	/**
	 * Mirror just part of a picture of a temple
	 */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the
	 * specified startRow and startCol in the
	 * current picture
	 *
	 * @param fromPic  the picture to copy from
	 * @param startRow the start row to copy to
	 * @param startCol the start col to copy to
	 */
	public void copy(Picture fromPic,
					 int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length &&
				toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length &&
					toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/**
	 * Method to create a collage of several pictures
	 */
	public void createCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 *
	 * @param edgeDist the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main
	 * method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this
