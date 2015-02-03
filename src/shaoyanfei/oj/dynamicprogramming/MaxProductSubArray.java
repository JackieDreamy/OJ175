package shaoyanfei.oj.dynamicprogramming;

public class MaxProductSubArray {

	public static int maxProduct(int[] A) {
		if (A.length <= 1)
			return A[0];
		int max = A[0];
		int min = A[0];
		int maxProduct = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > 0) {
				max = Math.max(max * A[i], A[i]);
				min = Math.min(min * A[i], A[i]);
			} else {
				int TempMax = max;
				max = Math.max(min * A[i], A[i]);
				min = Math.min(TempMax * A[i], A[i]);
			}
			maxProduct = Math.max(maxProduct, max);
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 3, -2, 4 };
		System.out.println(maxProduct(A));
	}

}
