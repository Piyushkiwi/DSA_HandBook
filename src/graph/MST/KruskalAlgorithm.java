package graph.MST;

import java.util.Arrays;

public class KruskalAlgorithm {
    public static void main(String[] args){
        int V=3;
        int E = 3;
        int[][] edges = {{0, 1, 5}, {1, 2, 3}, {0, 2, 1}};
        KruskalAlgorithm kruskalAlgorithm=new KruskalAlgorithm();
        int mST=kruskalAlgorithm.spanningTree(V,edges);
        System.out.print(mST);
    }
    public int spanningTree(int V, int[][] edges) {
        // code here
        DSU dsu=new DSU(V);
        Arrays.sort(edges,(a, b)->Integer.compare(a[2],b[2]));
        int weight=0;
        int edgeCount=0;
        for(int[] edge:edges){
            int u=edge[0],v=edge[1],w=edge[2];
            if(dsu.union(u,v)){
                weight+=w;
                edgeCount++;
            }


            if(edgeCount==V-1) return weight;
        }

        return -1;
    }
}

class DSU{
    int[] par,rank;//rank is height of the tree.
    public DSU(int V){
        par=new int[V];
        rank=new int[V];
        for(int i=0;i<V;i++){
            par[i]=i;
        }
    }

    public int find(int x){
        if(par[x]==x) return par[x];

        par[x]=find(par[x]);
        return par[x];
    }

    public boolean union(int x,int y){
        int x_rep=find(x);
        int y_rep=find(y);

        if(x_rep==y_rep) return false;//there is a cycle when both edge belongs to same set.

        if(rank[x_rep]<rank[y_rep]){
            par[x_rep]=y_rep;
        }else if(rank[y_rep]<rank[x_rep]){
            par[y_rep]=x_rep;
        }else{
            par[x_rep]=y_rep;
            rank[y_rep]++;
        }
        return true;
    }
}

