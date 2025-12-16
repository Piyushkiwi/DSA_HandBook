package graph.DFSTraversal;


import java.util.List;

public class DFSOnAdjList{
    public void DFS(List<List<Integer>> graph,int v){
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                DFSRec(graph,visited,v,i);
            }
        }
    }
    //DFSRec function
    public void DFSRec(List<List<Integer>> graph,boolean[] visited,int v,int src){
        visited[src]=true;
        //add answer
        System.out.print(src+" ");
        for(int i:graph.get(src)){
            if(!visited[i]){
                DFSRec(graph,visited,v,i);
            }
        }
    }
}
