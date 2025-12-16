package graph.BFSTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSWhenGraphIsAdjList {
    public void bfsOnAdjList(List<List<Integer>> graph,int V){
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                bfs(graph,i,visited);
            }
        }
    }
    public void bfs(List<List<Integer>> graph,int src,boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        visited[src]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            //add into the answer
            for(int adj:graph.get(u)){
                if(!visited[adj]){
                    q.offer(adj);
                    visited[adj]=true;
                }
            }
        }
    }
}
