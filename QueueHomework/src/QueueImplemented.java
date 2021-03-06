
public class QueueImplemented //implements QueueInterface 
{
 private String [] queue = new String [10];
 private int numItems;
 
 public void isEmpty()
 {
  if(numItems ==0)
   System.out.println("Yes");
  else
   System.out.println("No");
  
 }
 
 public void enqueue(String newItem) throws QueueException
 {
  
  if(numItems==0)
  {
   queue[numItems] = newItem;
   numItems++;
  }
  else if (numItems>0)
  {
   if((numItems+1)>queue.length)
   {
    increaseQueueSize(numItems+10);
    queue[numItems] = newItem;
    numItems++;
   }
   else
   {
    queue[numItems] = newItem;
    numItems++;
   }
  }
  else
   throw new QueueException("Cannot add any more items to the Queue");
 }

 public String dequeue() throws QueueException 
 {
  String temp;
  if(numItems>0)
  {
   temp = queue[0];
   queue[0] = null;
   numItems--;
   
   String [] queue2 = new String [queue.length];
   System.arraycopy(queue, 1, queue2, 0, queue.length-1);
   queue = queue2;
   return temp;
   
  }
  else
   throw new QueueException("There is nothing in the Queue to dequeue");
 }

 
 public void dequeueAll() {
  
  
  
 }

 public String peek() throws QueueException 
 {
  int i=0;
  if(numItems>0)
  {
  do{
   if(queue[i] != null)
    return queue[i];
   else
    i++;
  }while(queue[i]!=null);
  }
  else
   throw new QueueException("There is nothing in the Queue");
  return null;
  
 }
 
 void printAll()
 {
  for(int i=0;i<queue.length;i++)
  {
   if(queue[i]!=null)
   {
   System.out.println(queue[i]);
   }
  }
 }
 
 private void increaseQueueSize(int count) 
 {
     String[] newQueue = new String[count];
     for (int i = 0; i < queue.length; i++){
       newQueue[i] = queue[i];
     }
     queue = newQueue;
 }
}
