package iotest.算法测试.算法进阶;

import java.util.Arrays;

public class leedcode1 {
    public static int[][] kClosest(int[][] points, int K) {
        if(points.length<2)return points;
        int[][] a = new int[K][2];
        for(int i = 0;i<K;i++){
            double min = Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
            System.out.println(min);
            int t = i;
            for(int j = i+1;j<points.length;j++){
                if(min>Math.sqrt(points[j][0]*points[j][0]+points[j][1]*points[j][1])){
                    min=Math.sqrt(points[j][0]*points[j][0]+points[j][1]*points[j][1]);
                    t=j;
                }
            }
            int t1 = points[i][0];
            int t2 = points[i][1];
            points[i][0] = points[t][0];
            points[i][1] = points[t][1];
            points[t][0] = t1;
            points[t][1] = t2;
        }
        for(int i = 0;i<K;i++){
            a[i][0]=points[i][0];
            a[i][1]=points[i][1];
        }
        return a;
    }
    public static void main(String[] args) {
        int[][] a = {{1,3},{2,2}};
        System.out.println(Arrays.deepToString(kClosest(a,1)));
    }
}
