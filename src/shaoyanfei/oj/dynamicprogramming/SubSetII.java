package shaoyanfei.oj.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetII {

	public static List<List<Integer>> subsetsWithDup(int[] num) {
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		List<Integer> subset = new ArrayList<Integer>();
		int length = num.length;
		if (length == 0)
			return finalList;
		finalList.add(subset);
		Arrays.sort(num);
		subset = new ArrayList<Integer>();
		subset.add(num[0]);
		List<List<Integer>> newList = new ArrayList<List<Integer>>();
		finalList.add(subset);
		newList.add(subset);

		for (int i = 1; i < length; i++) {
			if (num[i] == num[i - 1]) {
				List<List<Integer>> nextList = new ArrayList<List<Integer>>();
				for (List<Integer> sub : newList) {
					subset = new ArrayList<Integer>(sub);
					subset.add(num[i]);
					nextList.add(subset);
				}
				newList = nextList;
			} else {
				newList.clear();
				for (List<Integer> sub : finalList) {
					subset = new ArrayList<Integer>(sub);
					subset.add(num[i]);
					newList.add(subset);
				}
			}
			finalList.addAll(newList);
		}
		return finalList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 2 };
		subsetsWithDup(num);
	}

}
