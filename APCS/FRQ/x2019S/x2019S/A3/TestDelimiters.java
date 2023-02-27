/* Test A3 */

import java.util.ArrayList;

public class TestDelimiters
{
  public static void main(String[] args)
  {
    Delimiters test1 = new Delimiters("(", ")");
    String[] tokens1 = {"(", "x + y", ")", " * 5"};
    ArrayList<String> dels1 = test1.getDelimitersList(tokens1);
    System.out.println(dels1 + " " + test1.isBalanced(dels1));
    
    Delimiters test2 = new Delimiters("<q>", "</q>");
    String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
    ArrayList<String> dels2 = test2.getDelimitersList(tokens2);
    System.out.println(dels2 + " " + test2.isBalanced(dels2));

    Delimiters test3 = new Delimiters("<sup>", "</sup>");
    
    String[] tokens31 = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
    ArrayList<String> dels3 = test3.getDelimitersList(tokens31);
    System.out.println(dels3 + " " + test3.isBalanced(dels3));

    String[] tokens32 = {"<sup>", "</sup>", "</sup>"};
    dels3 = test3.getDelimitersList(tokens32);
    System.out.println(dels3 + " " + test3.isBalanced(dels3));
    
    String[] tokens33 = {"</sup>"};
    dels3 = test3.getDelimitersList(tokens33);
    System.out.println(dels3 + " " + test3.isBalanced(dels3));

    String[] tokens34 = {"<sup>", "<sup>", "</sup>"};
    dels3 = test3.getDelimitersList(tokens34);
    System.out.println(dels3 + " " + test3.isBalanced(dels3));
  }
}
