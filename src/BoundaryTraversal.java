import java.util.ArrayList;

public class BoundaryTraversal {
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here
        ArrayList<Integer> l = new ArrayList<Integer>();
        if(n==1 || m==1) {
            if(n==1) {
                for(int c=0;c<m;c++) {
                    l.add(matrix[n][c]);
                }
                return l;
            } else if(m==1) {
                for(int r=0;r<n;r++) {
                    l.add(matrix[r][m]);
                }
                return l;
            }
        } else {
            for(int c=0;c<m;c++) {
                l.add(matrix[0][c]);
            }
            for(int r=1;r<n;r++) {
                l.add(matrix[r][m-1]);
            }
            for(int c = m-2;c>=0;c--) {
                l.add(matrix[n-1][c]);
            }
            for(int r = n-2;r>0;r--) {
                l.add(matrix[r][0]);
            }
        }
        return l;
    }
    public static void main(String...args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = 4;
        int m = 4;
        System.out.println(boundaryTraversal(matrix, n, m));
    }
}
