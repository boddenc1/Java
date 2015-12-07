
public abstract class BinaryTreeBasis {
	
	private TreeNode root;
	
	public BinaryTreeBasis()
	{
		root = null;
	}
	
	public BinaryTreeBasis(String rootItem)
	{
		root = new TreeNode(rootItem, null, null);
	}
	
	public void isEmpty()
	{
		if(root == null)
			System.out.println("cheaaaaaa");
		else
			System.out.println("No");	
	}
	
	public void makeEmpty()
	{
		root = null;
	}
	
	public String getRootItem() throws TreeException 
	{
		if(root.item != null)
			return root.item;
		else
			throw new TreeException("The Tree is Empty or there is no Tree Created");
	}

	public abstract TreeNode setRootItem(String newItem) throws TreeException;

}
