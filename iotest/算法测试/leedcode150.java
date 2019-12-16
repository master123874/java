package iotest.算法测试;

import java.util.Arrays;

public class leedcode150 {
    public static int sumSubarrayMins(int[] A) {
        long t = 0l;
        for(int i=1;i<=A.length;i++){
            for(int j=0;j<A.length-i+1;j++){
                int[] a = Arrays.copyOfRange(A,j,j+i);
                Arrays.sort(a);
                t+=a[0];
            }
        }
        long s = t%((int)(Math.pow(10,9))+7);
        return (int)s;
    }

    public static void main(String[] args) {
        int[] a = {3,1,2,4};
        System.out.println(sumSubarrayMins(a));

    }
}
