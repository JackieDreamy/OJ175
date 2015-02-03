package shaoyanfei.oj.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static int minimumTotal(List<List<Integer>> triangle) {
		Integer[] lastRow = triangle.get(triangle.size() - 1).toArray(
				new Integer[triangle.size()]);
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i).size(); j++) {
				lastRow[j] = triangle.get(i).get(j)
						+ Math.min(lastRow[j], lastRow[j + 1]);
			}
		}
		return lastRow[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(2);
		List<Integer> row2 = new ArrayList<Integer>();
		row2.add(3);
		row2.add(4);
		List<Integer> row3 = new ArrayList<Integer>();
		row3.add(6);
		row3.add(5);
		row3.add(7);
		List<Integer> row4 = new ArrayList<Integer>();
		row4.add(4);
		row4.add(1);
		row4.add(8);
		row4.add(3);
		List<List<Integer>> testList = new ArrayList<List<Integer>>();
		testList.add(row1);
		testList.add(row2);
		testList.add(row3);
		testList.add(row4);
		System.out.println(minimumTotal(testList));
	}

}
