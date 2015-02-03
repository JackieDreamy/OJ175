package shaoyanfei.oj.dynamicprogramming;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {

	public static boolean wordBreak(String s, Set<String> dict) {
		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && dict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("aaa");
		hashSet.add("aaaa");
		// Set<String> hashSet2 = new HashSet<String>();
		// hashSet2.add("le");
		// hashSet2.add("t");
		// hashSet2.add("code");
		String s = "aaaaaaa";
		System.out.println(wordBreak(s, hashSet));
		// System.out.println(wordBreak(s, hashSet2));
	}

}
