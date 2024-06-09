package cr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class lab22 {
    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sensor2.txt"));
            int N = Integer.parseInt(reader.readLine());
            int[][] field = new int[N][N];

            for (int i = 0; i < N; i++) {
                String[] row = reader.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    field[i][j] = Integer.parseInt(row[j]);
                }
            }

            reader.close();

            int maxSameStatusRegion = findMaxSameStatusRegion(field);
            int maxDifferentStatusRegion = findMaxDifferentStatusRegion(field);

            PrintWriter writer = new PrintWriter(new FileWriter("sensor2out.txt"));
            writer.println(maxSameStatusRegion);
            writer.println(maxDifferentStatusRegion);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findMaxSameStatusRegion(int[][] field) {
        int maxRegionSize = 0;
        boolean[][] visited = new boolean[field.length][field[0].length];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (!visited[i][j]) {
                    int regionSize = dfs(field, visited, i, j, field[i][j]);
                    maxRegionSize = Math.max(maxRegionSize, regionSize);
                }
            }
        }

        return maxRegionSize;
    }
    private static int dfs(int[][] field, boolean[][] visited, int x, int y, int status) {
        if (x < 0 || x >= field.length || y < 0 || y >= field[0].length || visited[x][y] || field[x][y] != status) {
            return 0;
        }

        visited[x][y] = true;
        int size = 1;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            size += dfs(field, visited, newX, newY, status);
        }

        return size;
    }


    private static int findMaxDifferentStatusRegion(int[][] field) {
        int maxRegionSize = 0;
        boolean[][] visited = new boolean[field.length][field[0].length];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                maxRegionSize = Math.max(maxRegionSize, dfsDifferentStatus(field, visited, i, j));
            }
        }

        return maxRegionSize;
    }

    private static int dfsDifferentStatus(int[][] field, boolean[][] visited, int x, int y) {
        if (x < 0 || x >= field.length || y < 0 || y >= field[0].length || visited[x][y]) {
            return 0;
        }

        visited[x][y] = true;
        int size = 1;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newX < field.length && newY >= 0 && newY < field[0].length
                    && field[newX][newY] != field[x][y]) {
                size += dfsDifferentStatus(field, visited, newX, newY);
            }
        }

        return size;
    }
}