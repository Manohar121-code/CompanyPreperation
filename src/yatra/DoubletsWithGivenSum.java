package yatra;

import java.util.HashSet;
import java.util.Set;

public class DoubletsWithGivenSum {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		int k = 20;
		Set<Integer> set = new HashSet<>();
		for (Integer i : arr) {
			if (!set.isEmpty() && set.contains(k - i))
				System.out.println(k-i + " " + i);
			set.add(i);
		}
	}
}
