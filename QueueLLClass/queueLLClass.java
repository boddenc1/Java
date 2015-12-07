import java.util.*;

public class queueLLClass
{
  LinkedList ll = new LinkedList();
  public queueLLClass()
  {
  }
  
  public Object peek()
  {
    return ll.getFirst();
  }
  
  public void enqueue(String s)
  {
    ll.addLast(s);
  }
  
  
  public boolean dequeue()
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