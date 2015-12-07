public class TreeNode 
{
	String item;
	TreeNode leftChild;
	TreeNode rightChild;
	
	public TreeNode(String newItem)
	{
		item = newItem;
		leftChild = null;
		rightChild = null;
	} // End default constructor
	
	public TreeNode(String newItem, TreeNode left, TreeNode right)
	{
		item = newItem;
		leftChild = left;
		rightChild = right;
	} // End overloaded Constructor

}