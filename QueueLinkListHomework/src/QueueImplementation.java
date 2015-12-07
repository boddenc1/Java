
public class QueueImplementation //implements QueueInterface 
{
 private Node head;
 private int numItems;
 
 public void QueueImplementation()
 {
  head = null;
 }
 
 public void isEmpty() 
 {
  if(numItems==0)
   System.out.println("yes");
  else
   System.out.println("No");
 }

 public void enqueue(String newItem) throws QueueException 
 {
  Node curr = head;
  Node newNode = new Node(newItem);
  
  if(numItems==0) // Adding the first Node to the list
  {
    head = newNode;
    newNode.next = null;
    numItems++;
  }
  else if(numItems>0)
  {
   traverseList(curr, newNode);
  }
  else
   throw new QueueException("You cannot add any more nodes."); // Will actually never happen
 }
 
 private Node traverseList(Node curr, Node newNode)
 {
  if(curr.next!=null)
  {
   traverseList(curr.next, newNode);
   return curr;
  }
  else
  {
   curr.next = newNode;
   newNode.next = null;
   numItems++;
   return curr;
  }
 }

 public String dequeue() throws QueueException 
 {
  if(numItems==0)
  {
   throw new QueueException("The List is empty.");
  }
  else
  {
   String temp;
   temp = head.item;
   head = head.next;
   head.prev = null;
   return temp;
  }
 }

 public void dequeueAll() 
 {
  head = null;
 }

 public String peek() throws QueueException 
 {
  if(numItems==0)
  {
   throw new QueueException("The Queue is empty, nothing to display");
  }
  return head.item;
 }
 
 public void display()
 {
  for(Node curr = head; curr != null; curr = curr.next)
    {
     System.out.println(curr.item);
    }
  
 }

}
