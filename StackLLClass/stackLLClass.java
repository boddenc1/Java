import java.util.*;

public class stackLLClass
{
  LinkedList ll = new LinkedList();
  
  public stackLLClass()
  {
  }
  
  public Object peek()
  {
    return ll.getFirst();
  }
  
  public void push(String s)
  {
    ll.addFirst(s);
  }
  
  public boolean pop()
  {
    if(ll.size() < 1)
    {
      return false;
    }
    else
    {
      ll.removeFirst();
      return true;
    }
  }
  
}