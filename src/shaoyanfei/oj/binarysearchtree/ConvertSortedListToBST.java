package shaoyanfei.oj.binarysearchtree;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class ConvertSortedListToBST {
	private static ListNode node;

	public static TreeNode createBST(int start, int end) {
		if (start > end)
			return null;
		int mid = start + (end - start) / 2;
		System.out.print("start = " + start + " end = " + end + " /:" + mid
				+ " ");
		int i = start + ((end - start) >> 1);
		System.out.println(">>:" + i);
		TreeNode leftNode = createBST(start, mid - 1);
		TreeNode treeNode = new TreeNode(node.val);
		treeNode.left = leftNode;
		node = node.next;
		TreeNode rightNode = createBST(mid + 1, end);
		treeNode.right = rightNode;
		return treeNode;
	}

	public static TreeNode sortedListToBST(ListNode head) {
		// calculate size of ListNode
		if (head == null)
			return null;
		int size = 0;
		ListNode pointer = head;
		node = head;
		while (pointer != null) {
			pointer = pointer.next;
			size++;
		}
		return createBST(0, size - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode start = new ListNode(1);
		start.next = new ListNode(3);
		sortedListToBST(start);
	}

}
