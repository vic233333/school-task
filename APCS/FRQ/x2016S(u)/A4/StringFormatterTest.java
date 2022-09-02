import java.util.List;
import java.util.ArrayList;

public class StringFormatterTest
{
    public static void main(String[] args)
    {
        List<String> wordList1 = new ArrayList<String>();
        wordList1.add("AP");
        wordList1.add("COMP");
        wordList1.add("SCI");
        wordList1.add("ROCKS");
        System.out.println(StringFormatter.format(wordList1, 20));
        System.out.println(StringFormatter.basicGapWidth(wordList1, 20));
        System.out.println(StringFormatter.leftoverSpaces(wordList1, 20));
        List<String> wordList2 = new ArrayList<String>();
        wordList2.add("GREEN");
        wordList2.add("EGGS");
        wordList2.add("AND");
        wordList2.add("HAM");
        System.out.println(StringFormatter.format(wordList2, 20));
        System.out.println(StringFormatter.basicGapWidth(wordList2, 20));
        System.out.println(StringFormatter.leftoverSpaces(wordList2, 20));
        List<String> wordList3 = new ArrayList<String>();
        wordList3.add("BEECH");
        wordList3.add("BALL");
        System.out.println(StringFormatter.format(wordList3, 20));
        System.out.println(StringFormatter.basicGapWidth(wordList3, 20));
        System.out.println(StringFormatter.leftoverSpaces(wordList3, 20));
    }
}
