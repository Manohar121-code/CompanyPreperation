package expedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberOfSwapsRequired implements Cloneable {
	public static void main(String[] args) {
		NumberOfSwapsRequired obj = new NumberOfSwapsRequired();
		int doOperation = obj.doOperation(Arrays.asList(4, 5, 2, 3, 1));
		System.out.println(doOperation);
	}

	private int doOperation(List<Integer> list) {
		int count = 0, index = 0;
		List<Integer> copyList = new ArrayList<Integer>();
		for (Integer integer : list)
			copyList.add(integer);
		Collections.reverseOrder();
//		for (int i = copyArr.length-1; i >= 0; i--) {
//			if (copyArr[i] != arr[index++])
//				count++;
//		}
		return count;
	}
}
