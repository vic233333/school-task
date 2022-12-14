public class CompoundWordCreator
{
private List<String> wordList; //contains no duplicates
/** @return true if word is in the dictionary; false otherwise
*/
private boolean inDictionary(String word) {
/* implementation not shown */
}
/** Combines all pairs of words in wordlist whose lengths sum to letterSum,
* and adds the new words to the list compoundWords if the new words were
* found in the dictionary. Words should not be combined with themselves.
*/
private void addCompoundWords(List<String> compoundWords, int letterSum) {
/* to be completed in part (b) */
}
/** precondition: wordList.size() > 0
* @return the length of the longest word in wordList
*/
private int findMaxLength() {
/* to be completed in part (a) */
}
/** precondition: wordList.size() > 0
* @return a list of compound words found in the dictionary that were created
* by combining strings in the list wordList
* postcondition: for each word, w, in list, inDictionary(w) == true and
* 3 <= w.length() <= findMaxLength().
*/
public List<String> buildWords() {
/* to be completed in part (c) */
}
// Constructors, other methods, and instance variables are not shown.
}