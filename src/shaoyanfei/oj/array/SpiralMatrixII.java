package shaoyanfei.oj.array;

public class SpiralMatrixII {

	public static int[][] generateMatrix(int n) {
		int row = 0;
		int column = 0;
		int direction = 0;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n * n; i++) {
			matrix[row][column] = i + 1;
			switch (direction) {
			case 0:
				column++;
				if (column >= n || matrix[row][column] > 0) {
					column--;
					row++;
					direction = 1;
				}
				break;
			case 1:
				row++;
				if (row >= n || matrix[row][column] > 0) {
					column--;
					row--;
					direction = 2;
				}
				break;
			case 2:
				column--;
				if (column < 0 || matrix[row][column] > 0) {
					column++;
					row--;
					direction = 3;
				}

				break;
			case 3:
				row--;
				if (row < 0 || matrix[row][column] > 0) {
					column++;
					row++;
					direction = 0;
				}
				break;
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateMatrix(3);
	}

}
