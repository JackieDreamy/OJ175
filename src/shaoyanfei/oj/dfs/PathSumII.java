package shaoyanfei.oj.dfs;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	static List<Integer> tmp = new ArrayList<Integer>();
	static List<List<Integer>> result = new ArrayList<List<Integer>>();

	private static void getAll(TreeNode root, int sum) {
		if (root == null)
			return;
		if (root.left == null && root.right == null && sum - root.val == 0) {
			tmp.add(root.val);
			List<Integer> copy = new ArrayList<Integer>(tmp);
			result.add(copy);
			tmp.remove(tmp.size() - 1);
		}
		tmp.add(root.val);
		getAll(root.left, sum - root.val);
		getAll(root.right, sum - root.val);
		tmp.remove(tmp.size() - 1);
	}

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		getAll(root, sum);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
