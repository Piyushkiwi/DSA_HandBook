package graph.DisjointSet;

public class DSUWithoutOptimization {
    public static void main(String[] args) {
        int[] par={0,1,2,3,4,5};//sometimes need to initialize explicitly.
        union(par,0,3);
        union(par,3,4);
        union(par,0,5);

    }

    //function to get find
    private static int find(int[] par,int x){
        if(par[x]==x){
            return x;
        }
        return par[x];
    }

    //function to find the union
    private static void union(int[] par,int x,int y){
        int x_rep=find(par,x);
        int y_rep=find(par,y);

        if(x_rep==y_rep){// means x and y are in the same set already
            return ;
        }
        par[y_rep]=x_rep;
    }
}
