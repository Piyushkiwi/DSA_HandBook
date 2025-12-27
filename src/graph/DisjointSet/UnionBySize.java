package graph.DisjointSet;


import java.util.Arrays;

public class UnionBySize {
    static boolean flag=false;//to ensure that par is initialized only once.
    static int[] par,size;
    static void initialize(int n){
        if(!flag){
            par=new int[n];
            size=new int[n];
            for(int i=0;i<n;i++){
                par[i]=i;
            }
            Arrays.fill(size,1);
            flag=true;
        }
    }

    public static void main(String[] args) {
        int[] par = {0, 1, 2, 3, 4, 5};
        union(par, 1, 2);
        union(par, 0, 3);
        union(par,4,5);
    }

    private static int find(int[] par,int x){
        if(par[x]==x){
            return x;
        }
        par[x]=find(par,par[x]);//path compression
        return par[x];
    }


    /*Basically the find function will give the root of tree called representative, where x and y are present
      as child.Now there are three case :
      CASE-I : If the size of the roots, are same of x and y then return.
      CASE-II: If no. of nodes in the tree where x is present is less than the no. of nodes in the tree
               where y is present,means we have to add the x wala tree in the y wala tree i.e make the
               par[x_rep]=y_rep and increase the size of  y wala tree.
       CASE-III : Do the reverse of CASE-II in the else block.
    * */
    private static void union(int[] par,int x,int y){
        initialize(par.length);//this will be called multiple times but executed only once using flag.
        int rep_x=find(par,x);
        int rep_y=find(par,y);

        if(rep_x==rep_y){
            return;
        }
        if(size[rep_x]<size[rep_y]){
            par[rep_x]=rep_y;
            size[rep_y]+=size[rep_x];
        }
        else{
            par[rep_y]=rep_x;
            size[rep_x]+=size[rep_y];
        }
    }
}
