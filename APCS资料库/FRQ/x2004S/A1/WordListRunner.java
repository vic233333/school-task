
/**
 * Write a description of class WordListRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordListRunner
{
   public static void main(String[] args)
  {
    System.out.println("******* A-1 *******");
    WordList w = new WordList();
    w.add("cat");
    w.add("mouse");
    w.add("frog");
    w.add("dog");
    w.add("dog");
    System.out.println(w + " " +
           w.numWordsOfLength(4) + " " +
           w.numWordsOfLength(3) + " " +
           w.numWordsOfLength(2));
    w.removeWordsOfLength(4);
    System.out.println(w);
    w.removeWordsOfLength(3);
    System.out.println(w);
    w.removeWordsOfLength(2);
    System.out.println(w);
  }
    
}
