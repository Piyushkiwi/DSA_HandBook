package graph.BFSTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class BFSOnGrid {
    public static void main(String[] args) {
        int[][] grid={{1,2,3,},{4,5,6},{7,8,9}};
        bfs(grid);
    }

    //bfs function
    private static void bfs(int[][] grid){
       int m=grid.length,n=grid[0].length;

       Queue<int[]> q=new LinkedList<>();
       boolean[][] visited=new boolean[m][n];
       q.offer(new int[]{0,0});
       visited[0][0]=true;

       int[] dx={-1,1,0,0};
       int[] dy={0,0,-1,1};

       while(!q.isEmpty()){
           int[] temp=q.poll();
           int x=temp[0];
           int y=temp[1];

           //add the answer
           System.out.print(grid[x][y]+" ");
           //from {x,y} cell go in 4 direction.

           for(int i=0;i<4;i++){
               int newX=x+dx[i];
               int newY=y+dy[i];
               if(newX<0 || newY<0 || newX>=m || newY>=n || visited[newX][newY]){
                   continue;
               }
               q.offer(new int[]{newX,newY});
               visited[newX][newY]=true;
           }
       }
    }
}
