package graph.algorithms;

import java.util.Arrays;

public class BellmanFord {
    public static void main(String[] args) {
        int[][] edges={{3, 2, 6}, {5, 3, 1}, {0, 1, 5}, {1, 5, -3}, {1, 2, -2}, {3, 4, -2}, {2, 4, 3}};
        int V=4;
        int src=0;
        int[] ans=bellmanFord(edges,V,src);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] bellmanFord(int[][] edges,int V, int src) {
        // code here
        int[] dist=new int[V];
        Arrays.fill(dist,(int)1e8);
        dist[src]=0;
        for(int i=0;i<V-1;i++){
            for(int[] edge:edges){
                int u=edge[0],v=edge[1],w=edge[2];
                if(dist[u]!=(int)1e8 && dist[v]>dist[u]+w){
                    dist[v]=dist[u]+w;
                }
            }
        }


        //detect negative cycle.
        for(int i=0;i<V;i++){
            for(int[] edge:edges){
                int u=edge[0],v=edge[1],w=edge[2];
                if(dist[u]!=(int)1e8 && dist[v]>dist[u]+w){
                    return new int[]{-1};
                }
            }
        }
        return dist;
    }
}
