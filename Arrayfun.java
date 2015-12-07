public class Arrayfun
{
  private int [] sortedArray;
  private int desiredNumber;
  
  public Arrayfun( int [] Array, int num)
  {
    desiredNumber = num;
    sortedArray = new int[Array.length];
    
    for(int i=0; i<sortedArray.length; i++) // Fill Array with values
    {
      sortedArray[i] = Array[i];
    }
    sortArray();
  }
  
  private void sortArray()
  {
    int tempVal =0;
    
    for(int i=0; i<sortedArray.length;i++)
    {
      for(int l=0;l<sortedArray.length;l++)
      {
        if(sortedArray[i] < sortedArray[l])
        {
          tempVal = sortedArray[i]; // Tempval needed to swap values so no value is lost.
          sortedArray[i] = sortedArray[l];
          sortedArray[l] = tempVal;
        }
      }
    }
    binarySearch();
  }
  
  private void binarySearch()
  {
    int lower = 0; // lowerbound of Array
    int upper = sortedArray.length-1;// upperbound of array
    
    int position = (lower + upper)/2; // Finding the middle index
    
    while((sortedArray[position] != desiredNumber) && (lower <= upper))
    {
      if(sortedArray[position] > desiredNumber)
        upper = position-1;
      else
        lower = position +1;
      
      position = (lower + upper)/2;
    }
    
    if(lower<=upper)
      System.out.println("The Desired number " + desiredNumber + " is at index " + position);
    else
      System.out.println("Sorry that number is not in the array");
    
    printArray();
  }
  
  
  private void printArray()
  {
    for (int i=0; i<sortedArray.length;i++)
    {
      System.out.println(sortedArray[i]);
    }
  }
}
  
  
             