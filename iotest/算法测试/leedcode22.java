package iotest.算法测试;

public class leedcode22 {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        for(int i=1;i<points.length;i++){
                if(points[i][0]==points[i-1][0])sum+=Math.abs(points[i][1]-points[i-1][1]);
                else if(points[i][1]==points[i-1][1])sum+=Math.abs(points[i][0]-points[i-1][0]);
                else{
                    if(Math.abs((points[i][1]-points[i-1][1])/((points[i][0]-points[i-1][0])))==1)sum+=Math.abs(points[i-1][0]-points[i][0]);
                    else{
                        sum=sum+Math.abs(points[i-1][0]-points[i][0]);
                    }
                    sum+=Math.abs(points[i][0]-(points[i-1][0]-points[i-1][1])-points[i][1]);
                }
            }
            return sum;
        }

    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
}
