package shaoyanfei.oj.dynamicprogramming;

public class UniqueBST {

	public static int numTrees(int n) {
		int[] dp = new int[n + 1];
		dp[0] = dp[1] = 1;
		for (int i = 2; i <= n; i++)
			for (int j = 0; j < i; j++)
				dp[i] += dp[j] * dp[i - 1 - j];
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(3));
	}

}