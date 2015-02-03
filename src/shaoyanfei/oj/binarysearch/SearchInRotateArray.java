package shaoyanfei.oj.binarysearch;

public class SearchInRotateArray {

	public static boolean search(int[] A, int target) {
		int low = 0;
		int high = A.length - 1;
		while (low < high) {
			int mid = (low + high + 1) / 2;
			if (A[mid] == target)
				return true;
			if (A[mid] > A[low]) {
				if (target < A[low] || target > A[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else if (A[mid] < A[low]) {
				if (target < A[mid] || target > A[high]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				low++;
			}
		}
		return low < A.length && A[low] == target ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 1, 1, 3, 1 };
		System.out.println(search(A, 1));
	}

}
