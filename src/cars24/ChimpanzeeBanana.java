package cars24;

import java.util.Scanner;

public class ChimpanzeeBanana {
	private int[] arr, resultArr;
	private final static int BASE = 1;
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter input");
		ChimpanzeeBanana obj = new ChimpanzeeBanana();
		int testCases = scr.nextInt();
		while (testCases-- > 0) {
			int numOfChimpu = scr.nextInt();
			int[] arr = new int[numOfChimpu];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scr.nextInt();
			}
//			long s = System.nanoTime();
			obj.doOperation(arr, arr.length);
//			long e = System.nanoTime();
//			System.out.println(e-s);
//			System.out.println("***************************END************************");
		}
	}

	private void doOperation(int[] ageArr, int length) {
		this.arr = ageArr;
		this.resultArr = new int[length];
		resultArr[0] = BASE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] < arr[i]) {
				resultArr[i] = resultArr[i-1] + 1;
			} else if (arr[i-1] == arr[i]) {
				resultArr[i] = BASE;
			} else {
				/*if (resultArr[i-1] > 1) {
					resultArr[i] = BASE;
				} else {
					resultArr[i] = BASE;
					doReduce(i);
				}*/
				resultArr[i] = BASE;
				if (resultArr[i-1] <= 1)
					doReduce(i);
			}
		}
		for (int iw = 0; iw < arr.length; iw++) {
			System.out.print(resultArr[iw]+" ");
		}
		System.out.println();
	}
/*
5
11
2 0 1 1 2 3 1 5 5 5 1
1
4
2
2 1
35
1 5 5 5 5 1 0 0 3 1 0 0 0 0 1 1 0 1 1 0 1 2 0 4 4 0 0 5 0 5 0 3 2 0 0
29
5 4 3 0 1 3 2 2 3 1 5 2 5 5 5 5 3 1 1 1 0 4 5 0 5 2 3 4 2
	SAMPLE STDOUT 1
2 1 2 1 2 3 1 2 1 2 1
1
2 1
1 2 1 1 3 2 1 1 3 2 1 1 1 1 2 2 1 2 2 1 2 3 1 2 2 1 1 2 1 2 1 3 2 1 1
4 3 2 1 2 3 1 1 2 1 2 1 2 1 1 3 2 1 1 2 1 2 3 1 2 1 2 3 1
*/
	private void doReduce(int i) {
		for (int j = i; j > 0; j--) {
			if (arr[j-1] > arr[j]) {
				if (resultArr[j-1] == resultArr[j]) {
					resultArr[j-1] = resultArr[j]+1;
				}
			} else if (arr[j-1] < arr[j]) {
				resultArr[j-1] = BASE;
				if (resultArr[j] <= 1) {
					resultArr[j] += 1;
				}
			} else {
				resultArr[j-1] = BASE;
			}
		}
	}
}
