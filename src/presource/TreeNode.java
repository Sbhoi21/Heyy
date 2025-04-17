package presource;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}
	
	TreeNode(int x) {
		val = x;
	}

	public TreeNode insert(int[] val) {
		TreeNode root = null;
		for (int i = 0; i < val.length; i++) {
			root = insert(root, val[i]);
		}
		return root;
	}

	public static TreeNode insert(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (val < root.val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}
	
	//print the tree
	public static void print(TreeNode root) {
		if (root == null) {
			return;
		}
		print(root.left);
		System.out.println(root.val);
		print(root.right);
	}
}