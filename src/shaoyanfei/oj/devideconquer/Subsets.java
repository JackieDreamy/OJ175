package shaoyanfei.oj.devideconquer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	// bit manipulation
	public static List<List<Integer>> subsets(int[] S) {
		int length = S.length;
		Arrays.sort(S);
		List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
		int totalNumber = 1 << length;
		for (int i = 0; i < totalNumber; i++) {
			List<Integer> subSet = new ArrayList<Integer>();
			for (int j = 0; j < length; j++) {
				if ((i & (1 << j)) != 0) {
					subSet.add(S[j]);
				}
			}
			finalResult.add(subSet);
		}
		return finalResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = { 1, 2, 3 };
		subsets(s);
	}

}
