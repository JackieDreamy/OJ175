package shaoyanfei.oj.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static List<List<Integer>> combinationSum(int[] candidates,
			int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < candidates.length; i++) {
			if (target < candidates[i])
				return result;
			else if (target == candidates[i]) {
				List<Integer> set = new ArrayList<Integer>();
				set.add(candidates[i]);
				result.add(set);
			} else {
				int[] array = Arrays.copyOfRange(candidates, i,
						candidates.length);
				List<List<Integer>> temp = combinationSum(array, target
						- candidates[i]);
				for (List<Integer> list : temp) {
					list.add(0, candidates[i]);
					result.add(list);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 1, 2 };
		int target = 3;
		combinationSum(candidates, target);
	}

}
