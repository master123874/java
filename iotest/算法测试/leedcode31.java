package iotest.算法测试;

import java.util.ArrayList;
import java.util.Arrays;

public class leedcode31 {
    public static int countServers(int[][] grid) {
        int count=0;
        int find[][] = new int[grid.length*grid[0].length][2];
        int visit[][] = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    find[count][0]=i;
                    find[count][1]=j;
                    count++;
                }
            }
        }
        int t=0;
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if(find[j][0]==find[i][0]||find[j][1]==find[i][1]){
                    if(visit[find[i][0]][find[i][1]]==0){
                        visit[find[i][0]][find[i][1]]=1;
                        t++;
                    }
                    if(visit[find[j][0]][find[j][1]]==0){
                        visit[find[j][0]][find[j][1]]=1;
                        t++;
                    }
                }
            }
        }
        return t;
    }
    public static void main(String[] args) {
        int[][] a = {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(Arrays.deepToString(a));
        System.out.println(countServers(a));
        System.out.println(Arrays.deepToString(a));
        ArrayList<Integer> sc= new ArrayList<>();
    }
}
