package shaoyanfei.oj.binarysearchtree;

public class RecoverTree {

	TreeNode firstElement = null;
	TreeNode secondElement = null;
	TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);

	public void recoverProcess(TreeNode root) {
		if (root == null)
			return;

		recoverProcess(root.left);
		if (firstElement == null && prevElement.val >= root.val)
			firstElement = prevElement;
		if (firstElement != null && prevElement.val >= root.val)
			secondElement = root;
		prevElement = root;
		recoverProcess(root.right);
	}

	public void recoverTree(TreeNode root) {
		recoverProcess(root);

		// swap value
		int temp = firstElement.val;
		firstElement.val = secondElement.val;
		secondElement.val = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
