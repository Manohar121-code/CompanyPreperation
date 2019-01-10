package tracxn;

public class SingleDigitThreshold {
	public static void main(String[] args) {
		String input = "1234567879", secondInput = "";
		do {
			int threshold = 10;
			int sum = 0;
			char[] charArray = input.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				sum += Integer.parseInt(charArray[i]+"");
				if (sum > threshold) {
					secondInput += sum;
					threshold = sum;
					sum = 0;
				} else if (i == charArray.length-1) {
					secondInput += sum;
				}
			}
			input = secondInput;secondInput="";
		} while (input.length() > 1);
		if (input.length() == 1)
			System.out.println(input);
		
		System.out.println("-------------");
		char c = 'a', h = 'b';
		System.out.println((int) c +1 == (int) h);
	}
}
