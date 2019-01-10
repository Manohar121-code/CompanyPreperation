package cisco;

public class ZeroMatrix {
	private int[][] arr, tempArr;
	private final int BASE = 0;
	public static void main(String[] args) {
		ZeroMatrix obj = new ZeroMatrix();
		int[][] arr = {{1, 1, 1, 1, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 1, 1, 1}};
		obj.printArray(arr);
		obj.doOperation(arr);
		System.out.println("---------");
		obj.printArray(arr);
	}
	
	private void doOperation(int[][] arr) {
		this.arr = arr;
		int rows = arr.length, cols = arr[0].length;
		this.tempArr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				tempArr[i][j] = -1;
			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (tempArr[i][j] == -1 && arr[i][j] == 0) {
					fillRowColWithZero(i, j, rows, cols);
				}
			}
		}
	}
	
	private void fillRowColWithZero(int i, int j, int rows, int cols) {
		for (int k = 0; k < rows; k++) {
			if (arr[k][j] != BASE)
				tempArr[k][j] = BASE;
			arr[k][j] = BASE;
		}
		for (int k = 0; k < arr.length; k++) {
			if (arr[i][k] != BASE)
				tempArr[i][k] = BASE;
			arr[i][k] = BASE;
		}
	}

	private void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
