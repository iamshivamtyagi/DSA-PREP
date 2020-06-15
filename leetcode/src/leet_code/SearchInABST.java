package leet_code;

public class SearchInABST {

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		@SuppressWarnings("unused")
		public TreeNode() {
			val = 0;
			left = null;
			right = null;
		}
	}

	// Recursive
	public static TreeNode searchInBSTRecursive(TreeNode root, int val) {
		if (root == null)
			return null;
		else if (root.val == val)
			return root;
		else if (root.val < val)
			return searchInBSTRecursive(root.right, val);
		else
			return searchInBSTRecursive(root.left, val);
	}

	// iterative
	public static TreeNode searchInBSTIterative(TreeNode root, int val) {
		if (root == null)
			return null;

		TreeNode curr = root;

		while (curr != null) {
			// if data found return current node
			if (curr.val == val) {
				return curr;
			}
			// if data is greater than current data, it means data is definitely in right
			// subtree of current node
			else if (curr.val < val) {
				// move the current node to right
				curr = curr.right;
			}
			// if data exist, it will be in left subtree
			else {
				// move current node to left
				curr = curr.right;
			}
		}
		return curr;
	}

}
