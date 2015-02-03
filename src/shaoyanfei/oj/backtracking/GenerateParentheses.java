package shaoyanfei.oj.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void generate(List<String> result, String str, int left,
			int right, int n) {
		if (left == n && right == n) {
			result.add(str);
			return;
		}
		if (right > left) {
			return;
		}
		if (left == n) {
			generate(result, str + ")", left, right + 1, n);
			return;
		}
		generate(result, str + "(", left + 1, right, n);
		generate(result, str + ")", left, right + 1, n);
	}

	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		generate(result, "", 0, 0, n);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateParenthesis(3);
	}

}
