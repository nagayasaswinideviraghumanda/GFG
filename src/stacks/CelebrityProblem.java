package stacks;

public class CelebrityProblem {
    int celebrity(int M[][], int n)
    {
        // code here
        int a = 0;
        int b = n-1;
        while(a<b) {
            if(M[a][b]==1) {
                a++;
            } else {
                b--;
            }
        }

        for(int i=0;i<n;i++) {
            if((a!=i) && (M[i][a]==0 || M[a][i]==1)) {
                return -1;
            }
        }

        return a;
    }

    public static void main(String...args) {
        int[][] M = {{0, 1, 0},
                     {1, 0, 0},
                     {0, 1, 0}};
        System.out.println(new CelebrityProblem().celebrity(M, M.length));
    }
}
