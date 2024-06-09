package cr;
public class SensorAnalysis {
    public static final int[] X_DIRS = {1, 0, -1, 0};
    public static final int[] Y_DIRS = {0, 1, 0, -1};

    public static int findLargestContiguousRegionTwoStatuses(int[][] matrix) {
        int largestRegionSize = 0;
        boolean[][] visited = new

                boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (!visited[i][j]) {
                    int regionSize = dfsTwoStatuses(matrix, visited, i, j);
                    largestRegionSize = Math.max(largestRegionSize, regionSize);
                }
            }
        }

        return largestRegionSize;
    }

    private static int dfsTwoStatuses(int[][] matrix, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || visited[row][col]
                || matrix[row][col] == matrix[row][col]) {
            return 0;
        }

        visited[row][col] = true;

        int regionSize = 1;

        for (int i = 0; i < X_DIRS.length; i++) {
            int newRow = row + X_DIRS[i];
            int newCol = col + Y_DIRS[i];

            if (newRow >= 0 && newRow < matrix.length && newCol >= 0 && newCol < matrix[0].length && matrix[row][col] != matrix[newRow][newCol]
                    && isAdjacent(row, col, newRow, newCol)) {
                regionSize += dfsTwoStatuses(matrix, visited, newRow, newCol);
            }
        }

        return regionSize;
    }

    private static boolean isAdjacent(int row1, int col1, int row2, int col2) {
        return Math.abs(row1 - row2) <= 1 && Math.abs(col1 - col2) <= 1;
    }



    public static void main(String...args) {
        int[][] matrix = {
                {8, 3, 9, 3},
                {4, 9, 9, 2},
                {9, 9, 2, 7},
                {8, 2, 2, 9}
        };

        int largestRegionSize = findLargestContiguousRegionTwoStatuses(matrix);

        System.out.println(largestRegionSize);
    }


}