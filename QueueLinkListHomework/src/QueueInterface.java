
public interface QueueInterface 
{
	/**
	 * isEmpty()
	 * Prints yes if the list is empty. Otherwise, it prints no.
	 */
	public void isEmpty();
	
	/**
	 * enqueue()
	 * Queues an item to the list at the end of the list.
	 * 
	 * @param newItem - The new Item to be added at the end of the list
	 * @throws QueueException - If Item cannot be added, throw an Exception.
	 */
	public void enqueue(String newItem) throws QueueException;
	
	/**
	 * dequeue()
	 * Will remove the first item that was added into the Queue, and returns its value.
	 * 
	 * @return - The first Item in the list
	 * @throws QueueException - If there are no items in the list, throw a QueueException
	 */
	public String dequeue() throws QueueException;
	
	/**
	 * dequeueAll()
	 * 
	 * Removes all items from the queue.
	 */
	public void dequeueAll();
	
	/**
	 * peek()
	 * displays the first item in the queue.
	 * 
	 * @return - returns the first item in the queue
	 * @throws QueueException - If there are no Items in the Queue, throw a QueueException.
	 */
	public String peek() throws QueueException;

}