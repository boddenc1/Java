public class queueLLClassTester
{
  
  public static void main(String [] args)
  {
    queueLLClass qll = new queueLLClass();
    
    qll.enqueue("1");
    qll.enqueue("2");
    
    System.out.println(qll.dequeue());
    
  }
}