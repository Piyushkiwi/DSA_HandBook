package graph.DFSTraversal;

public class DFSOnGrid {
    //dfs function
    private static void dfs(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];

        /*Before starting of the dfs check if starting is valid or not,
          This is important to check for some problem.
        * */
        if(isValid(grid,0,0,visited)){
            dfsRec(grid,0,0,visited);
        }
    }

    /*From the cell {x,y} go in 4 different directions but only when going in one
      direction completes i.e, we have reached to the end or at invalid position.
    * */
    private static void dfsRec(int[][] grid,int x,int y,boolean[][] visited){
        visited[x][y]=true;
        System.out.print(grid[x][y]+" ");

        //go up
        if(isValid(grid,x-1,y,visited)) {
            dfsRec(grid, x - 1, y, visited);
        }
        //go down
        if(isValid(grid,x+1,y,visited)){
           dfsRec(grid,x+1,y,visited);
        }
        //go left
        if(isValid(grid,x,y-1,visited)){
            dfsRec(grid,x,y-1,visited);
        }
        //go right
        if(isValid(grid,x,y+1,visited)){
            dfsRec(grid,x,y+1,visited);
        }
    }

    /*While going in cell check if it's a valid cell to visit or not.
    * */
    private static boolean isValid(int[][] grid,int x,int y,boolean[][] visited){
        int n=grid.length;
        int m=grid[0].length;
        if(x<0 || y<0 || x>=n || y>=m || visited[x][y]){
            return false;
        }
        return true;
    }
}
