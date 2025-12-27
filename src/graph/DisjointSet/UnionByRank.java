package graph.DisjointSet;

public class UnionByRank {
    static boolean flag=false;//to keep track that rank,par should be initialized only once
    static int[] rank;
    private static void initialize(int n){
        if(!flag){
            rank=new int[n];
            flag=true;
        }
    }
    public static void main(String[] args) {
        int[] par={0,1,2,3,4,5};
        union(par,1,2 );
        union(par,0,3);
        union(par,4,5);
        System.out.println(find(par,5));
        System.out.println(find(par,0));
    }

    private static int find(int[] par,int x){
        if(par[x]==x){
            return x;
        }
        par[x]=find(par,par[x]); //path compression
        return par[x];
    }

    /*There are three cases based on the finding of the representation of x and y.
      CASE-I: If the rank of x ka representation is less than the representative of y
              then x will be merged in the y.
       CASE-II: Just the reverse of CASE-I for the vice versa scenario.
       CASE-III: If the rank of both x and y are equal then simply merge any one in other and
                 increase the rank of one in which merging.
    * */
    private static void union(int[] par,int x,int y){
        /*initialize() will be called multiple times but will be executed
         only once since global variable flag will become true after one time execution.
        * */
        initialize(par.length);
        int x_rep=find(par,x);
        int y_rep=find(par,y);

        if(rank[x_rep]<rank[y_rep]){
            par[x_rep]=y_rep;
        }
        else if(rank[y_rep]<rank[x_rep]){
            par[y_rep]=x_rep;
        }
        else{
            par[y_rep]=x_rep;
            rank[x_rep]++;
        }
    }
}
