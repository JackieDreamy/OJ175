package shaoyanfei.oj.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationII {

	public static List<List<Integer>> combinationSum2(int[] num, int target) {
		return combination(num, -1, target);
	}

	public static List<List<Integer>> combination(int[] candidates,
			int lastIdx, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = lastIdx + 1; i < candidates.length; i++) {
			if (target < candidates[i])
				return result;
			else if (target == candidates[i]) {
				List<Integer> set = new ArrayList<Integer>();
				set.add(candidates[i]);
				if (!result.contains(set))
					result.add(set);
			} else {
				List<List<Integer>> temp = combination(candidates, i, target
						- candidates[i]);
				for (List<Integer> list : temp) {
					list.add(0, candidates[i]);
					if (!result.contains(list))
						result.add(list);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 1 };
		List<List<Integer>> result = combinationSum2(num, 1);
		result.add(null);
	}

}
