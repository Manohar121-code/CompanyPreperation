package cars24;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CalorieBurn {
	public static void main(String[] args) {
		CalorieBurn obj = new CalorieBurn();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCases = Integer.parseInt(reader.readLine());
			while (testCases-- > 0) {
				int numOfDays = Integer.parseInt(reader.readLine());
				int[] kmsArr = new int[numOfDays];
				StringTokenizer kilometreStr = new StringTokenizer(reader.readLine(), " ");
				int kmIndex = 0;
				while (kilometreStr.hasMoreTokens()) {
					kmsArr[kmIndex++] = Integer.parseInt(kilometreStr.nextToken());
				}
				System.out.println(obj.doOperation(kmsArr));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private long doOperation(int[] kmArr) {
		long totalCal = 0, totalKms = 0;
		Arrays.sort(kmArr);
		for (int i = kmArr.length - 1; i >= 0; i--) {
			int currKms = kmArr[i];
			totalCal += (2 * totalKms) + currKms;
			totalKms += currKms;
		}
		return totalCal;
	}
	
	/**
	 * 
	 * public static void main(String[] args) throws NumberFormatException, IOException {
		CalorieBurn obj = new CalorieBurn();
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		while (testCases-- > 0) {
			int numOfDays = Integer.parseInt(reader.readLine());
			String kilometreStr = reader.readLine();
			String[] kmsStrArr = kilometreStr.split(" ");
			int[] kmsArr = new int[numOfDays];
			for (int i = 0; i < kmsArr.length; i++) {
				kmsArr[i] = Integer.parseInt(kmsStrArr[i]);
			}
			System.out.println(obj.doOperation(kmsArr));
		}
	}

	private long doOperation(int[] kmArr) {
		long totalCal = 0, totalKms = 0;
		Arrays.sort(kmArr);
		for (int i = kmArr.length-1; i >= 0; i--) {
			int currKms = kmArr[i];
	    	totalCal += (2 * totalKms) + currKms;
	    	totalKms += currKms;
		}
		return totalCal;
	}
	 */

	/*
	 * 
	 * 
	 * public static void main(String[] args) { CalorieBurn obj = new CalorieBurn();
	 * Scanner scr = new Scanner(System.in); int testCases = scr.nextInt(); while
	 * (testCases-- > 0) { int numOfDays = scr.nextInt(); int[] kmArr = new
	 * int[numOfDays]; for (int i = 0; i < numOfDays; i++) { kmArr[i] =
	 * scr.nextInt(); } System.out.println(obj.doOperation(kmArr)); } }
	 * 
	 * private long doOperation(int[] kmArr) { long totalCal = 0, totalKms = 0;
	 * Arrays.sort(kmArr); for (int i = kmArr.length-1; i >= 0; i--) { int currKms =
	 * kmArr[i]; totalCal += (2 * totalKms) + currKms; totalKms += currKms; } return
	 * totalCal; }
	 * 
	 */
}
