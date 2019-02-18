package lenskart;

public class CatchFinallyReturn {
	public static void main(String[] args) {
		System.out.println(doIt());
	}

	private static int doIt() {
		int x = 10;
		try {
			x = x/0;
		} catch (Exception e) {
			System.out.println("catch");
			return 12;
		} finally {
			System.out.println("finally");
			x = 5;
			System.out.println("finally end");
//			return x;
		}
		return x;
	}
}
