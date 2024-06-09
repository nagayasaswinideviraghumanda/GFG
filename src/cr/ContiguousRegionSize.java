package cr;
public class ContiguousRegionSize {
    public int findContiguousRegionSize(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;
        boolean[][] visited = new boolean[numRows][numCols];
        int maxRegionSize = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (!visited[i][j]) {
                    int currentRegionSize = dfs(matrix, visited, i, j);
                    maxRegionSize = Math.max(maxRegionSize, currentRegionSize);
                }
            }
        }

        return maxRegionSize;
    }

    private int dfs(int[][] matrix, boolean[][] visited, int row, int col) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int currentNumber = matrix[row][col];
        int currentRegionSize = 1;
        visited[row][col] = true;

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isValidCell(newRow, newCol, numRows, numCols) && !visited[newRow][newCol] && matrix[newRow][newCol] == currentNumber) {
                currentRegionSize += dfs(matrix, visited, newRow, newCol);
            }
        }

        return currentRegionSize;
    }

    private boolean isValidCell(int row, int col, int numRows, int numCols) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }

    public static void main(String[] args) {
        ContiguousRegionSize crs = new ContiguousRegionSize();

        int[][] matrix = {
                {8, 3, 9, 3},
                {4, 9, 9, 2},
                {9, 9, 2, 7},
                {8, 2, 2, 9}
        };

        int result = crs.findContiguousRegionSize(matrix);
        System.out.println("Size of the largest contiguous region with the same number: " + result);
    }
}
