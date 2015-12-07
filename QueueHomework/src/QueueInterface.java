
public interface QueueInterface 
{
	public void isEmpty();
	
	public void enqueue(String newItem) throws QueueException;
	
	public String dequeue() throws QueueException;
	
	public void dequeueAll();
	
	public String peek() throws QueueException;

}
