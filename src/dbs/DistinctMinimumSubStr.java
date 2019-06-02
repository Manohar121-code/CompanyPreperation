package dbs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class DistinctMinimumSubStr {
	public static void main(String[] args) {
		DistinctMinimumSubStr obj = new DistinctMinimumSubStr();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter please");
		int testCases = scr.nextInt();
		while (testCases-- > 0) {
			int n = scr.nextInt();
			int k = scr.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = scr.nextInt();
			System.out.println(obj.doOperation(arr, n, k));
		}
	}

	private int doOperation(int[] arr, int n, int k) {
		int finalRes = Integer.MAX_VALUE;
		Set<Integer> setObj;
		for (int i = 0; i < n; i++) {
			setObj = new HashSet<Integer>();
			for (int j = i; j < n; j++) {
				setObj.add(arr[j]);
				if (setObj.size() == k) {
					finalRes = Math.min(finalRes, j-i+1);
					break;
				}
			}
		}
		return finalRes;
	}
}
