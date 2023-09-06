/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
      
        String[] ranks1 = {"jack","queen","king","A","2","3","4","5","6","7","8","9","10"};
        String[] suits = {"spades","hearts","diamonds","clubs"};
        int[] pointValues = {10,10,10,11,2,3,4,5,6,7,8,9,10};
        Deck d = new Deck(ranks1,suits,pointValues);
        
        
        for(int i = 0;i < 5;i++){
        d.deal();
        }
        System.out.println(d);
    }
}
