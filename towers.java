public class towers
{
  
  public towers()
  {
  }
  
  public void solve(int i, String source, String alt, String destination)
  {
    if(i==1)
      System.out.println(source + " -> " + destination);
    else
    {
      solve(i-1, source, destination, alt);
      System.out.println(source + " -> " + destination);
      solve(i-1, alt, source, destination);
    }
  }
  
  
}