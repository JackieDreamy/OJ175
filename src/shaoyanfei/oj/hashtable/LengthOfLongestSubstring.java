package shaoyanfei.oj.hashtable;

import java.util.HashMap;

public class LengthOfLongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		int length = 0;
		int minIndex = 0;
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (hashMap.containsKey(s.charAt(i))) {
				minIndex = Math.max(hashMap.get(s.charAt(i)) + 1, minIndex);
			}
			length = Math.max(i - minIndex + 1, length);
			hashMap.put(s.charAt(i), i);
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
