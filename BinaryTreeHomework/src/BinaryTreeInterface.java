
public interface BinaryTreeInterface {
	
	public void createBinaryTree();
	
	public void createBinaryTree(String rootItem);
	
	public void createBinaryTree (String rootItem, TreeNode leftTree, TreeNode rightTree);
	
	public void makeEmpty();
	
	public void isEmpty();
	
	public String getRootItem() throws TreeException;
	
	public TreeNode setRootItem(String newItem) throws TreeException;
	
	public void attachLeft(String newItem) throws TreeException;
	
	public void attachRight(String newItem) throws TreeException;
	
	public void attachLeftSubTree(TreeNode leftTree) throws TreeException;
	
	public void attachRightSubTree(TreeNode rightTree) throws TreeException;
	
	public void detachLeftSubTree() throws TreeException;
	
	public void detachRightSubTree() throws TreeException;
	

}
