package presource;

import java.util.ArrayList;
import java.util.List;

public class MinimumDiffBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.
//
//				Example 1:
//				Input: root = [4,2,6,1,3]
//				Output: 1
//
//				Example 2:
//				Input: root = [1,0,48,null,null,12,49]
//				Output: 1

//				Example 3:
//				Input: root = [4,null,6,null,14,10,null,8,12]
//				Output: 2

	}

	public static int minDiffInBST(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		check(root, list);
		int m = Integer.MAX_VALUE;
		int n = list.size();
		for (int i = 1; i < n; i++) {
			m = Math.min(m, list.get(i) - list.get(i - 1));
		}
		return m;
	}

	private static void check(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		check(root.left, list);
		list.add(root.val);
		check(root.right, list);

	}

}
