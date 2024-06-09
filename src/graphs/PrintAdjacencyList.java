package graphs;

import java.util.ArrayList;
import java.util.List;

public class PrintAdjacencyList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<V;i++) {
            l.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++) {
            l.get(edges[i][0]).add(edges[i][1]);
            l.get(edges[i][1]).add(edges[i][0]);
        }
        return l;
    }

    public static void main(String...args) {
        int V = 5;
        int[][] edges = {{0,1},{0,4},{1,2},{1,3},{1,4},{2,3},{3,4}};
       // {(0,1),(0,4),(4,1),(4,3),(1,3),(1,2),(3,2)}
        List<List<Integer>> l = new PrintAdjacencyList().printGraph(V, edges);
        for(int i=0;i<l.size();i++) {
            System.out.print(i + " -> ");
            for(int j=0;j<l.get(i).size();j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
