package iotest.算法测试;
import java.util.*;
public class leedcode20 {
    public static int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int[] a = new int[A[A.length-1]+1];
        for(int i=0;i<A.length;i++){
            a[A[i]]++;
        }
        int count=0;
        for(int i=0;i<A[A.length-1]+1;i++){
            if(a[i]!=0)count++;
        }
        for(int i=0;i<A[A.length-1]+1;i++){
            if(a[i]==count-1)return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a={5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(a));
    }
}
