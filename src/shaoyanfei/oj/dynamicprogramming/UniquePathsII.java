package shaoyanfei.oj.dynamicprogramming;

public class UniquePathsII {

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		// if obstacleGrid is null, then return 0
		if (obstacleGrid.length == 0)
			return 0;

		int row = obstacleGrid.length;
		int col = obstacleGrid[0].length;

		// if obstacleGrid start or end point has obstacle, then return 0
		if (obstacleGrid[0][0] == 1 || obstacleGrid[row - 1][col - 1] == 1)
			return 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (obstacleGrid[i][j] == 1)
					obstacleGrid[i][j] = 0;
				else if (i == 0 && j == 0)
					obstacleGrid[i][j] = 1;
				else if (i == 0)
					obstacleGrid[i][j] = obstacleGrid[i][j - 1];// For row 0, if
																// there are no
																// paths to left
																// cell, then
																// its 0,else 1
				else if (j == 0)
					obstacleGrid[i][j] = obstacleGrid[i - 1][j];// For col 0, if
																// there are no
																// paths to
																// upper cell,
																// then its
																// 0,else 1
				else
					obstacleGrid[i][j] = obstacleGrid[i - 1][j]
							+ obstacleGrid[i][j - 1];
			}
		}
		return obstacleGrid[row - 1][col - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
