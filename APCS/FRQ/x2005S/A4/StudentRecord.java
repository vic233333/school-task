public class StudentRecord
{
  private int[] scores; // contains scores.length values
                        // scores.length > 1

  public StudentRecord(int[] nums)
  {
    scores = new int[nums.length];
    for (int k = 0; k < nums.length; k++)
      scores[k] = nums[k];
  }

  /*** Part (a) ***/

  // returns the average (artithmetic mean) of the values in scores
  // whose subscripts are between first and last inclusive
  // precondition:  0 <= first <= last < scores.length
  private double average(int first, int last)
  {
   
  }

  /*** Part (b) ***/

  // returns true if each successive value in scores is greater
  // than or equal to the previous value;
  // otherwise, returns false
  private boolean hasImproved()
  {
   
  }

  /*** Part (c) ***/

  // if the values in scores have improved, returns the average
  // of the elements in scores with indexes greater than or equal
  // to scores.length/2;
  // otherwise, returns the average of all of the values in scores
  public double finalAverage()
  {
    
  }
}
