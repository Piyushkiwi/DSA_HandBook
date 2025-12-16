package graph.BFSTraversal;

import java.util.LinkedList;
import java.util.Queue;

/*When the graph is in the form of adjMatrix then always consider row as
u and columns as v.
visited array will always be 1d we are interested in vertex, the matrix
basically shows the relationship between the vertices.
if V is not given in the parameter then calculate it using graph.length
* */
public class BFSWhenGraphIsAdjMatrix {
    public void bfsOnAdjMatrix(int[][] graph,int V){
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                bfs(graph,i,visited,V);
            }
        }
    }

    public void bfs(int[][] graph,int src,boolean[] visited,int V){
        Queue<Integer> q=new LinkedList<>();
        q.offer(src);
        visited[src]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            //add the answer
            for(int i=0;i<V;i++){
                if(graph[u][i]==1 && !visited[i]){
                    q.offer(i);
                    visited[i]=true;
                }
            }
        }
    }
}
