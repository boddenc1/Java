public class stackLLClassTester
{
  public static void main(String [] args)
  {
    stackLLClass sll = new stackLLClass();
    
    sll.push("hey");
    sll.push("wow");
    sll.push("grr");
    
    System.out.println(sll.pop());
  }
}