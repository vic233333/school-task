public class TestImage
{

  public static void main(String[] args)
  {
    int [][] pixels1 = {
      {255, 184, 178,  84, 129},
      { 84, 255, 255, 130,  84},
      { 78, 255,   0,   0,  78},
      { 84, 130, 255, 130,  84}
    };

    GrayImage image = new GrayImage(pixels1);
    System.out.println(image.countWhitePixels());

    int[][] pixels2 = {
      {221, 184, 178,  84, 135},
      { 84, 255, 255, 130,  84},
      { 78, 255,   0,   0,  78},
      { 84, 130, 255, 130,  84}
    };

    image = new GrayImage(pixels2);
    System.out.println();
    System.out.println(image);
    image.processImage();
    System.out.println();
    System.out.println(image);
  }
}
