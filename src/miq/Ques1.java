package miq;

import java.util.ArrayList;
import java.util.List;

public class Ques1 {
	public static void main(String[] args) {
		Ques1 obj = new Ques1();
		List<Integer> klist = new ArrayList<>();
		klist.add(1);
		klist.add(0);
		klist.add(1);
		klist.add(0);
		klist.add(0);
		klist.add(0);
		klist.add(0);
		klist.add(1);
		int dooo = obj.dooo(klist);
		System.out.println(dooo);
	}

	private int dooo(List<Integer> list) {
		int counter = 0, index = 0;
        while (index < list.size() && list.get(index) != 1) {
              index++;
        }
        int temp = index+1;
        while1:
        while (true) {                
              while (temp < list.size() && list.get(temp) != 0) {
                    counter += (temp - (index + 1));
                    index++;
                    temp++;
              }
              if (temp++ >= list.size()) {
                    break while1;
              }
        }
        return counter;

		/*int counter = 0, index = 0;
		while (index < list.size() && list.get(index) != 1) {
			index++;
		}
		int temp = index+1;
		while1:
		while (true) {			
			while (list.get(temp) != 0 && temp < list.size()) {
				counter += (temp - index + 1);
				index++;
				temp++;
			}
			if (temp >= list.size()) {
				break while1;
			}
		}
		return counter;*/
	}
}
