package shaoyanfei.oj.hashtable;

import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			hashMap.put(numbers[i], i + 1);
		}
		int[] result = { 0, 0 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= target) {
				if (hashMap.containsKey(target - numbers[i])
						&& hashMap.get(target - numbers[i]) != i) {
					result[0] = i + 1;
					result[1] = hashMap.get(target - numbers[i]);
					return result;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 2, 7, 2, 13 };
		twoSum(numbers, 4);
	}

}
