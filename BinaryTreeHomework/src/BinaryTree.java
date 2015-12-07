
public class BinaryTree extends BinaryTreeBasis implements BinaryTreeInterface {

	private TreeNode root;
	
	public BinaryTree()
	{
		
	}

	public void createBinaryTree() 
	{
		root = null;
	}

	public void createBinaryTree(String rootItem) 
	{
		root = new TreeNode(rootItem);
	}
	
	public void createBinaryTree(String rootItem, TreeNode leftTree, TreeNode rightTree)
	{
		root = new TreeNode(rootItem, null, null);
		
		try {
			attachLeftSubTree(leftTree);
		} catch (TreeException e) {
			e.printStackTrace();
		}
		try {
			attachRightSubTree(rightTree);
		} catch (TreeException e) {
			e.printStackTrace();
		}
		
	}
	
	public TreeNode setRootItem(String newItem) throws TreeException
	{
		if(root == null)
		{
			root = new TreeNode(newItem, null, null);
			return root;
		}
		else
			throw new TreeException("Poop");
	}

	public void attachLeft(String newItem) throws TreeException 
	{
		if(root != null && root.leftChild == null)
		{
			root.leftChild = new TreeNode(newItem, null, null);
		}
		else
			throw new TreeException("There is already a leftChild");
	}

	public void attachRight(String newItem) throws TreeException 
	{
		if(root != null && root.rightChild == null)
		{
			root.rightChild = new TreeNode(newItem, null, null);
		}
		else
			throw new TreeException("There is already a rightChild");
	}
		

	public void attachLeftSubTree(TreeNode leftTree) throws TreeException 
	{
		if(root == null)
			throw new TreeException("Tree is Empty");
		else if(root.leftChild != null)
			throw new TreeException("We cannot over write left Subtree");
		else
			root.leftChild = leftTree;
	}

	
	public void attachRightSubTree(TreeNode rightTree) throws TreeException 
	{
		if(root == null)
			throw new TreeException("Tree is Empty");
		else if(root.rightChild != null)
			throw new TreeException("We cannot over write right Subtree");
		else
			root.rightChild = rightTree;
		
	}
	
	private BinaryTree(TreeNode rootNode)
	{
		root = rootNode;
	}

	public void detachLeftSubTree() throws TreeException 
	{
		if(root == null)
			throw new TreeException("There is no Left TreeNode to Detach");
		else
		{
			BinaryTree leftTree;
			leftTree = new BinaryTree(root.leftChild);
			root.leftChild = null;
		}
			
	}

	public void detachRightSubTree() throws TreeException 
	{
		if(root == null)
			throw new TreeException("");
		else
		{
			BinaryTree rightTree;
			rightTree = new BinaryTree(root.rightChild);
			root.rightChild = null;
		}
	}
	
	public void printRoot()
	{
		//TreeNode curr = root;
		System.out.println(root.item);
		
	}
	
	public void print(TreeNode node)
	{
		//TreeNode curr = root;
		System.out.println(node.item);
		
	}
	
	public void left(TreeNode node) 
	{
		System.out.println(node.leftChild.item);
    }
	
	public void right(TreeNode node)
	{
		System.out.println(node.rightChild.item);
	}
}