package shaoyanfei.oj.backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 If n = 4 and k = 2, a solution is:

 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],

 */

public class Combinations {
	public static List<List<Integer>> combine(int n, int k) {
		int[] S = new int[n];
		for (int i = 1; i <= n; i++)
			S[i - 1] = i;
		List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
		int totalNumber = 1 << n;
		for (int i = 0; i < totalNumber; i++) {
			List<Integer> subSet = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					subSet.add(S[j]);
				}
			}
			finalResult.add(subSet);
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (List<Integer> sub : finalResult) {
			if (sub.size() == k) {
				result.add(sub);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combine(4, 3);
	}

}
