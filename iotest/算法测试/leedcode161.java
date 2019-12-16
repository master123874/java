package iotest.算法测试;

import java.util.Arrays;

public class leedcode161 {

    public static int[] fraction(int[] cont) {
        int[] a= {1,cont[cont.length-1]};
        if(cont.length<2){
            int[] a1= {cont[cont.length-1],1};
            return a1;
        }
        for(int i = cont.length-2;i>=0;i--){
            int t=a[1];
            int t1=cont[i]*t+a[0];
            a[0]=t;
            a[1]=t1;
            if(i==0){
                a[0]=t1;
                a[1]=t;
            }
        }
        process(a);
        return a;
    }
    public static void process(int[] a){
        int min=Math.min(a[0],a[1]);
        while(min>=1){
            if(a[0]%min==0&&a[1]/min==0){
                a[0]/=min;
                a[1]/=min;
                break;
            }
            min--;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 0, 2};
        System.out.println(fraction(a));
    }
}
