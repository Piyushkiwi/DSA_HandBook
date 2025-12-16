package graph.Representation;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        int v=5;
        List<List<Integer>> adj=new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }

        //u and v are the two vertex of the graph and the numbers are edges between them.
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,2,1);
        printGraph(adj);
    }

    //function to add the vertexes in the list
    public static void addEdge(List<List<Integer>> adj, int u, int v){
        //since the graph is an undirected graph so add both the edges
        adj.get(u).add(v);//add edges from u to v
        adj.get(v).add(u);//add edges from v to u
    }

    //function to print the adjacency list
    public static void printGraph(List<List<Integer>> adj){
        for(int i=0;i<adj.size();i++){

          for(int j=0;j<adj.get(i).size();j++){
              System.out.print(i+"-->");
              System.out.print(adj.get(i).get(j)+", ");
          }
            System.out.println();
        }
    }
}
