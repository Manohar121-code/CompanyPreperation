package ge;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class DistinctFeatures {
	public static void main(String[] args) {
		DistinctFeatures obj = new DistinctFeatures();
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(0);
		q.add(1);
		q.add(2);
		q.add(1);
		int[] arr = {5, 0, 1, 2, 1, 5};
		int N = 5;
		int K = 1;
		int P = 3;//1, 5, 3
		obj.doOperation(arr, N, K, P);
	}

	private int doOperation(int[] A, int N, int K, int Itr) {
		Map<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stkObj = new Stack<>(); 
  
        for (int current : A) { 
        	if (!map.containsKey(current))
				map.put(current, 1);
			else
				map.put(current, map.get(current)+1);
            stkObj.add(current); 
        } 
  
        SortComparator comp = new SortComparator(map); 
  
        Collections.sort(stkObj, comp); 
        int iterations = Itr*K;
        while (!stkObj.isEmpty() && iterations-- > 0) {
			stkObj.pop();
		}
		map = new HashMap<>();
		while (!stkObj.isEmpty()) {
			Integer pop = stkObj.pop();
			if (!map.containsKey(pop))
				map.put(pop, 1);
			else
				map.put(pop, map.get(pop)+1);
		}
		return map.size();
	}
	
	private int doOperation2(int[] A, int N, int K, int Itr) {
		Map<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stkObj = new Stack<>(); 
  
        for (int current : A) { 
            int count = map.getOrDefault(current, 0); 
            map.put(current, count + 1); 
            stkObj.add(current); 
        } 
  
        SortComparator comp = new SortComparator(map); 
  
        Collections.sort(stkObj, comp); 
        int iterations = Itr*K;
        for (int i = 0; i < iterations; i++) {
			stkObj.pop();
		}
        if (stkObj.isEmpty())
        	return 0;
		int distinctCount = 0, prev = Integer.MIN_VALUE;
		while (!stkObj.isEmpty()) {
			Integer topEle = stkObj.pop();
			if (topEle != prev) {
				distinctCount++;
				prev = topEle;
			}
		}
		return distinctCount;
	}

}

class SortComparator implements Comparator<Integer> { 
    private final Map<Integer, Integer> freqMap; 
    SortComparator(Map<Integer, Integer> tFreqMap) 
    { 
        this.freqMap = tFreqMap; 
    } 
    @Override
    public int compare(Integer k1, Integer k2) 
    { 
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1)); 
        int valueCompare = k1.compareTo(k2); 
        if (freqCompare == 0) 
            return valueCompare; 
        else
            return freqCompare; 
    } 
} 	