package shaoyanfei.oj.binarytree;

public class BinaryMaximumPathSum {

	static int maxValue;

	static public int maxPathSum(TreeNode root) {
		maxValue = Integer.MIN_VALUE;
		maxPathDown(root);
		return maxValue;
	}

	static private int maxPathDown(TreeNode node) {
		if (node == null)
			return 0;
		int left = Math.max(0, maxPathDown(node.left));
		int right = Math.max(0, maxPathDown(node.right));
		maxValue = Math.max(maxValue, left + right + node.val);
		return Math.max(left, right) + node.val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		// treeNode.left.left = new TreeNode(3);
		treeNode.left.left = new TreeNode(3);
		// treeNode.right = new TreeNode(3);
		// treeNode.left.left.left = new TreeNode(4);
		// treeNode.right.right = new TreeNode(6);
		// treeNode.left.left.left.left = new TreeNode(5);
		System.out.println(maxPathSum(treeNode));
	}

}
