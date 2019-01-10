package tracxn;

public class XYZ {
	public static void main(String[] args) {
		String input = "axefyzijkmoq";
		int count;
		do {
			count = 0;
			int start = -1;
			for (int i = 0; i < input.length()-1; i++) {
				if ((int) input.charAt(i)+1 == (int) input.charAt(i+1)) {
					count++;
					if (start == -1)
						start = i;
				} else if (start != -1) {
					input = input.substring(0, start) + input.substring(i+1);
					i -= (i - start) -1;
					start = -1;
				}
			}
		} while (count > 0);
		if (count == 0) {
			System.out.println(input);
		}
	}
}
