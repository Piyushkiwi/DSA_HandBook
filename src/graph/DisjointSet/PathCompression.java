package graph.DisjointSet;

public class PathCompression {
    public static void main(String[] args) {
        int[] par={1,2,3,4,5};
        union(par,1,2);
        union(par,2,4);
        union(par,3,5);
        union(par,1,5);
    }

    /* When find will be called with x then make a recursive call sending
       the new value present at par[x].At first, it looks like that I am calling
       the x everytime but actually in each recursive call I am sending the value of
       par[x] in the recursive  call.
    * */
    public static int find(int[] par,int x){
        if(par[x]==x) return x;

        par[x]=find(par,par[x]);//path compression
        return par[x];
    }

    public static void union(int[] par,int x,int y){
        int x_rep=find(par,x);
        int y_rep=find(par,y);

        /* If representative of x and y are equal which means that
          both x and y are in the same set so return the function.
        * */
        if(x_rep==y_rep) return ;
        par[x_rep]=y_rep;//make any one the parent of other.
    }

}
