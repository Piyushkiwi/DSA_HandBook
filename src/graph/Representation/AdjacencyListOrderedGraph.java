package graph.Representation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjacencyListOrderedGraph {
    public static void main(String[] args) {
        int v=5;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,2);
        addEdge(adj,0,3);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        printGraph(adj);
        indegrees(adj);
        outdegree(adj);
    }
    //function to create the adjacency list
    public static void addEdge(List<List<Integer>> adj,int u,int v){
        adj.get(u).add(v);
    }

    /*Printing of graph is like :
      go to the ith index of list one by one and for each ith index
      print all the edges connected.
    * */
    static void printGraph(List<List<Integer>> adj){
       for(int i=0;i<adj.size();i++){
           for(int j=0;j<adj.get(i).size();j++){
               System.out.print(i+"->");
               System.out.print(adj.get(i).get(j)+", ");
           }
           System.out.println();
       }
    }

    /*Indegree is the no. of times a vertex appears in the adjacency list of
    graph.
    In the below function I am calculating the indegree of each vertex of the graph.
    * */
    static void indegrees(List<List<Integer>> adj){
        int[] temp=new int[adj.size()];
        for(List<Integer> list:adj){
            for(int i:list){
                temp[i]++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    /*Outdegree is the size of list for a vertex in the adjacency list of
    graph.In the below function I am calculating the outdegree for each vertex of the
    graph.
    * */
    static void outdegree(List<List<Integer>> adj){
        int[] temp=new int[adj.size()];
        int i=0;
        for(List<Integer> list:adj){
            temp[i++]=list.size();
        }
        System.out.println(Arrays.toString(temp));
    }
}
