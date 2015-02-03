package shaoyanfei.oj.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static List<List<Integer>> permute(int[] num) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> subList = new ArrayList<Integer>();
		if (num.length == 0)
			return null;
		subList.add(num[0]);
		result.add(subList);
		for (int i = 1; i < num.length; i++) {
			List<List<Integer>> newList = new ArrayList<List<Integer>>();
			for (List<Integer> sub : result) {
				int size = sub.size();
				for (int j = 0; j <= size; j++) {
					List<Integer> newSub= new ArrayList<Integer>(sub);
					newSub.add(j, num[i]);
					newList.add(newSub);
				}
			}
			result = new ArrayList<List<Integer>>(newList);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 3 };
		permute(num);
	}

}
