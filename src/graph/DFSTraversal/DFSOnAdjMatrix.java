package graph.DFSTraversal;

public class DFSOnAdjMatrix {
    //dfs function
    private static void dfs(int[][] graph){
        int V=graph.length;
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfsRec(graph,i,visited);
            }
        }
    }
    //dfsRec function
    private static void dfsRec(int[][] graph,int src,boolean[] visited){
        visited[src]=true;
        //add the answer here
        System.out.print(src+" ");
        for(int i=0;i<graph[src].length;i++){
            if(graph[src][i]==1 && !visited[i]){
                dfsRec(graph,i,visited);
            }
        }
    }
}
