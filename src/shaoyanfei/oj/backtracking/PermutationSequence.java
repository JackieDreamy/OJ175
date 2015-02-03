package shaoyanfei.oj.backtracking;

import java.util.LinkedList;

public class PermutationSequence {

	public static String getPermutation(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
		for (int i = 1; i <= n; i++)
			list.add(i);
		int fact = 1;
		for (int i = 2; i <= n; i++)
			fact *= i;

		StringBuilder strBuilder = new StringBuilder();
		for (k--; n > 0; n--) {
			fact /= n;
			strBuilder.append(list.remove(k / fact));
			k %= fact;
		}

		return strBuilder.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPermutation(3,5));
	}

}
