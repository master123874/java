package iotest.算法测试;

import java.util.Arrays;

public class leedcode11 {
    static void qsort(int[] a,int start,int end){
        if(start<end){
            int i=start;
            int j=end+1;
            while(i<j){
                do{
                    i++;
                }while(a[start]>=a[i]&&i<end);
                do{
                    j--;
                }while(a[j]>=a[start]&&j>start);
                if(i<j){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
                else break;
            }
            int t=a[start];
            a[start]=a[j];
            a[j]=t;
            qsort(a,start,j-1);
            qsort(a,j+1,end);
        }
    }

    public static void main(String[] args) {
        int a[] = {55,54};
        qsort(a,0,a.length-1);
        for(int i:a){
            System.out.println(i+" ");
        }
    }
}
