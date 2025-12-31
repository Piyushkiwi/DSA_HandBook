package graph.algorithms;

import java.util.Arrays;

public class FloydWarshall {
    public static void main(String[] args) {
        int[][] matrix = {{0, 2, -1, -1}, {1, 0, 3, -1}, {-1, -1, 0, 1}, {3, 5, 4, 0}};
        int[][] ans=floydWarshall(matrix);
        for(int[] row:ans){
            System.out.println(Arrays.toString(row));
        }
    }
    /*Below function will return the shortest distance between every pair of vertices
     like (0,0),(0,1),(0,2) and so on.
     I have to return the answer in place just change the given matrix no need to
     form a new matrix.
     To reach the i to j I am trying every possibility through each vertex v.
    * */
    public static int[][] floydWarshall(int[][] matrix){
        int v=matrix.length;
        for(int k=0;k<v;k++){
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    if(matrix[i][k]!=(int)1e8 && matrix[k][j]!=(int)1e8){
                        matrix[i][j]=Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);
                    }
                }
            }
        }
        return matrix;
    }
}
