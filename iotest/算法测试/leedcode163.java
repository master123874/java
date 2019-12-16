package iotest.算法测试;

import java.util.Arrays;

public class leedcode163 {
    public static String tictactoe(int[][] moves) {
        int[][] a = new int[3][3];
        for(int i=0;i<moves.length;i++){
            if(a[moves[i][0]][moves[i][1]]==0){
                if(i%2==0){
                    a[moves[i][0]][moves[i][1]]=1;
                    if(judge2(a,1)){
                        return "A";
                    }
                }else{
                    a[moves[i][0]][moves[i][1]]=2;
                    if(judge2(a,2)){
                        return "B";
                    }
                }
            }
        }
        if(judge2(a,1)){
            return "A";
        }
        if(judge2(a,2)){
            return "B";
        }
        if(judge1(a))return "Draw";
        return "Pending";
    }
    public static boolean judge1(int[][] a){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]==0)return false;
            }
        }
        return true;
    }
    public static boolean judge2(int[][] a,int t){
        boolean flag = true;
        for(int i=0;i<3;i++){
            flag = true;
            for(int j=0;j<3;j++){
                if(a[i][j]!=t)flag = false;
            }
            if(flag)return true;
        }
        for(int i=0;i<3;i++){
            flag = true;
            for(int j=0;j<3;j++){
                if(a[j][i]!=t)flag = false;
            }
            if(flag)return true;
        }
        if(a[0][0]==t&&a[1][1]==t&&a[2][2]==t)return true;
        if(a[0][2]==t&&a[1][1]==t&&a[2][0]==t)return true;
        return false;

    }
    public static void main(String[] args) {
        int[][] a = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        System.out.println(tictactoe(a));
    }
}
