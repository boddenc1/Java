
public class QueueTester {

	public static void main(String[] args) throws QueueException {
		// TODO Auto-generated method stub
		QueueImplemented q = new QueueImplemented();
		
		q.enqueue("work");
		q.isEmpty();
		System.out.println(q.peek());
		q.enqueue("Lets see if this works");
		q.printAll();
		q.dequeue();
		q.printAll();

	}

}
