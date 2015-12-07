
public class QueueLLTester {

 public static void main(String[] args) throws QueueException {
  QueueImplementation q = new QueueImplementation();
  
  q.enqueue("TEST");
  q.enqueue("maybe");
  q.enqueue("lets");
  q.enqueue("see");
  q.enqueue("grwqer");
  q.enqueue("what?");
  q.enqueue("pooo");
  
  //q.display();
  System.out.println(q.dequeue());
  System.out.println();
  //q.dequeueAll();
  q.display();

 }

}
