package cisco;

public class SnakePattern {
	private int[][] arr;
	private int rows, cols, UP = 1, DOWN = 2;
	public static void main(String[] args) {
		SnakePattern obj = new SnakePattern();
		int[][] arr = {{1, 2, 3, 4, 5}, 
					   {6, 7, 8, 9, 10}, 
					   {11, 12, 13, 14, 15}};
		obj.doOperation(arr, 3, 5);
	}
	private void doOperation(int[][] arr, int rows, int cols) {
		this.arr = arr;
		this.rows = rows;
		this.cols = cols;
		doIt(arr, 0, 0, UP);
	}
	private void doIt(int[][] arr, int i, int j, int action) {
		if (action == UP) {
			while (chkWithInBoundary(i, j)) {
				System.out.print(arr[i--][j++]+" ");//going top right
			}
			i++;j--;//Back to last valid position
			if (chkWithInBoundary(i, j+1)) {// check right
				doIt(arr, i, j+1, DOWN);
			} else if (chkWithInBoundary(i+1, j)) {//check down
				doIt(arr, i+1, j, DOWN);
			}
		} else {
			while (chkWithInBoundary(i, j)) {
				System.out.print(arr[i++][j--]+" ");//going down left
			}
			i--;j++;//Back to last valid position
			if (chkWithInBoundary(i+1, j)) {//check down
				doIt(arr, i+1, j, UP);
			} else if (chkWithInBoundary(i, j+1)) {//check right
				doIt(arr, i, j+1, UP);
			}
		}
	}
	private boolean chkWithInBoundary(int i, int j) {
		return (0 <= i && i < rows) && (0 <= j && j < cols);
	}
}
