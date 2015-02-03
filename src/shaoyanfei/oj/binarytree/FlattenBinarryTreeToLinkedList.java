package shaoyanfei.oj.binarytree;

import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class FlattenBinarryTreeToLinkedList {

	public void flatten(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.empty()) {
			TreeNode current = stack.pop();
			if (current.right != null)
				stack.push(current.right);
			if (current.left != null)
				stack.push(current.left);
			if (!stack.empty())
				current.right = stack.peek();
			current.left = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
