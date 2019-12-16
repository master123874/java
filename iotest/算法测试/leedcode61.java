package iotest.算法测试;

import java.util.Arrays;

public class leedcode61 {
    public static void setZeroes(int[][] matrix) {
        int[][] a = new int[matrix.length*matrix[0].length][2];
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    a[count][0]=i;
                    a[count][1]=j;
                    count++;
                }
            }
        }
        for(int i=0;i<count;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[j][a[i][1]]=0;
            }
            for(int j=0;j<matrix[a[i][0]].length;j++){
                matrix[a[i][0]][j]=0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(Arrays.deepToString(a));
        setZeroes(a);
        System.out.println(Arrays.deepToString(a));
    }

}
