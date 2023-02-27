import java.util.ArrayList;

public class StringCoderTest {
  public static void main(String[] args) {
    StringCoder coder = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
    ArrayList<StringPart> parts = coder.encodeString("overeager");
    System.out.println(parts);
    System.out.println(coder.decodeString(parts));
  }
}
