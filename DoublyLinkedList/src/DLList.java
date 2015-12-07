
public interface DLList {
	/** The isEmpty method returns true if the list is empty. Otherwise, it returns false. 
	    * 
	    * @return True if the list is empty; Otherwise, false.
	    */
	  boolean isEmpty();
	  
	  /** The size method will return the size of the list. 
	    * 
	    * @return The number of items in the list.
	    */
	  int size();
	  
	  /** The add method will add an item to the list if the specified position is available. If there is already an item 
	    * in the given position, the method should return false and the item is not added to the list. If the position is
	    * available, the item should be added and the method should return true.
	    * 
	    * @param item The item to add
	    * @return True if the item is added; Otherwise, false.
	    */
	  boolean add(String item);
	  
	  /** The remove method will remove the item in the specified position. If there is no item in the specified position,
	    * the method should return false. If there is an item in the specified position, the method should remove the item
	    * and return true.
	    * 
	    * @param item - The data that is passed through to add into the linked list
	    * @param rec - an integer passed through for the recursion process
	    * 
	    * @return True if the item is removed; Otherwise, false.
	    */
	  boolean remove(String item);
	  
	  /** The remove method will remove all the items in the list.
	    * 
	    * @return True if the list is emptied; Otherwise, false.
	    */
	  boolean remove();
	 
	  

}
