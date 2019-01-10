package yatra;

public class PrintAllPathsFromRootInBT {
	private static String str = "";
	public static void main(String[] args) {
		MyBTNode root = new MyBTNode(1);
		root.left = new MyBTNode(2);
		root.right = new MyBTNode(3);
		root.left.left = new MyBTNode(4);
		root.left.right = new MyBTNode(5);
		root.right.left = new MyBTNode(6);
		root.right.right = new MyBTNode(7);
		
		PrintAllPathsFromRootInBT obj = new PrintAllPathsFromRootInBT();
		obj.doOperation(root, str);
	}
	private void doOperation(MyBTNode root, String s) {
		if (root == null)
			return;
		s += " - "+root.data;
		if (root.left == null && root.right == null)
			System.out.println(s);
		doOperation(root.left, s);
		doOperation(root.right, s);
	}
}

class MyBTNode {
	MyBTNode left, right;
	int data;

	public MyBTNode(int data) {
		this.data = data;
		left = right = null;
	}
}