public class palindromeFun
{
  String inputString;
  boolean classification = true;
  char [] charArray = null;;
  
  
  public palindromeFun(String s)
  {
    inputString = s;
    charArray = inputString.toCharArray();
  }
  
  public boolean isPalindrome()
  {
    int lower = 0;
    int upper = charArray.length-1;
    char c1 = charArray[lower];
    char c2 =charArray[upper];

    while(classification == true && lower != charArray.length/2)
    {
      if(c1==c2)
      {
        lower = lower +1;
        upper = upper - 1;
        c1 = charArray[lower];
        c2 = charArray[upper];
      }
      else
        classification = false;
    }
      return classification;
  }
}
