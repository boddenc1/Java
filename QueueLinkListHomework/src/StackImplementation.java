public class StackImplementation
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

 public void push(String newItem) throws StackException 
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
    newNode.next = head;
    head = newNode;
   //traverseList(curr, newNode);
  }
  else
   throw new StackException("The stack is full, please pop one or more off of the stack."); // Will actually never happen, because it is a linked list not an array
 }


 public String pop() throws StackException // Displays and then removes the most recently (last) added Node
 {
  if(numItems==0)
  {
   throw new StackException("The Stack is empty.");
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

 public void popAll() 
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