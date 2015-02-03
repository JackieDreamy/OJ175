package shaoyanfei.oj.binarysearchtree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class ValidateBinarySearchTree {

	public boolean isVaild(TreeNode root, long min, long max) {
		if (root == null)
			return true;
		if (root.val >= max || root.val <= min)
			return false;
		return isVaild(root.left, min, root.val)
				&& isVaild(root.right, root.val, max);
	}

	public boolean isValidBST(TreeNode root) {
		return isVaild(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
