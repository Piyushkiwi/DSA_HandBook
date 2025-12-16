package graph.Representation;

import java.util.ArrayList;
import java.util.List;

public class ConstructGraphFromEdges {
    /*Given the list of edges I have to construct the graph from the
    given edges.
    * */

    public void constructGraph(int[][] edges,int V){
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
    }
}
