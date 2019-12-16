package iotest.算法测试;

import java.util.Arrays;

public class matriz {


    public static int[][] updateMatrix(int[][] matrix) {
            int[] fx= new int[10000];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j]!=0){
                        fx = find(matrix,i,j);
                        Arrays.sort(fx);
                        for(int k=0;k<10000;k++){
                            if(fx[k]!=0){
                                matrix[i][j] = fx[k];
                                break;
                            }
                        }
                    }
                }
            }
            return matrix;
        }
        public static int[] find(int[][] a,int b,int c){
            int count=0;
            int[] fx = new int[10000];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    if((b!=i||c!=j)&&a[i][j]==0){
                        fx[count] = Math.abs(b-i)+Math.abs(j-c);
                        count++;
                    }
                }
            }
            return fx;
        }
        public static void main(String[] args){
            int[][] a= new int[][]{{0,1,0},{0,1,0},{0,1,0},{0,1,0},{0,1,0}};
            a=updateMatrix(a);

            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
}

