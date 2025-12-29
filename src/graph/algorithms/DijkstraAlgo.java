package graph.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgo{
    public static int[] dijkstra(int V,int[][] edges, int src){
        //construct graph.
        List<List<int[]>> graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0],v=edge[1],w=edge[2];
            graph.get(u).add(new int[]{v,w});
            graph.get(v).add(new int[]{u,w});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        int[] dist=new int[V];
        Arrays.fill(dist,(int)1e9);
        boolean[] visited=new boolean[V];
        int count=0;
        
        dist[src]=0;
        pq.add(new int[]{src,0});
        
        while(!pq.isEmpty() && count<V){
            int[] temp=pq.poll();
            int u=temp[0];
            if(visited[u]) continue;
            visited[u]=true;
            count++;

           for(int[] pair:graph.get(u)){
               int v=pair[0],w=pair[1];
               if(dist[v]>w+dist[u]){
                   dist[v]=w+dist[u];
                   pq.add(new int[]{v,w+dist[u]});
               }
           }
        }
        return dist;
    }
}
