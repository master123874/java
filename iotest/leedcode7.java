package iotest;

import java.util.Arrays;

public class leedcode7 {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=1;
            if(digits[i]<10)break;
            else {
                digits[i]=0;
            }
        }
        System.out.println(digits[0]);
        if(digits[0]==0){
            int[] a=new int[digits.length+1];
            a[0]=1;
            for(int i=1;i<=digits.length;i++)a[i]=digits[i-1];
            return a;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] a={9};
        a=plusOne(a);
        for(int i=0;i<a.length;i++) System.out.println(a[i]);
    }
}
