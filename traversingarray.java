public class traversingarray
{
  public static void main(String [] args)
  {
    int [][] numbers = {{1,3,5,3}, {7,5,3,8},{1,8,2,7}};
    
    for(int i=0;i<numbers.length;i++)
    {
      for(int p=0;p<numbers[i].length;p++)
      {
        System.out.println(numbers[i][p]);
      }
    }
  }
}