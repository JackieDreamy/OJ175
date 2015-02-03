package shaoyanfei.oj.dynamicprogramming;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParentheses {

	public static int longestValidParentheses(String s) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		int longest = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(count);
				count = 0;
			} else if (stack.size() > 0) {
				count += stack.poll() + 1;
				longest = Math.max(longest, count);
			} else {
				count = 0;
				stack.clear();
			}
		}
		return longest * 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
