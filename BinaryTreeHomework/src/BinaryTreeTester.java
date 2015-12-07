
public class BinaryTreeTester {

	public static void main(String[] args) throws TreeException {
		
		BinaryTree tree1 = new BinaryTree();
		
		TreeNode node1 = new TreeNode("a");
		TreeNode node2 = new TreeNode("b");
		TreeNode node3 = new TreeNode("c");
		TreeNode node4 = new TreeNode("d");
		TreeNode node5 = new TreeNode("e");
		TreeNode node6 = new TreeNode("f");
		TreeNode node7 = new TreeNode("g");
		TreeNode node8 = new TreeNode("h");
		TreeNode node9 = new TreeNode("i");
		TreeNode node10 = new TreeNode("j");
		TreeNode node11 = new TreeNode("k");
		TreeNode node12 = new TreeNode("l");
		
		tree1.createBinaryTree(node1.item, node1, node2);
		
		//tree1.createBinaryTree(node1.item, node3, node4);
		//tree1.printRoot();

	}

}
