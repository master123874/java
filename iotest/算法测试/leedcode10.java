package iotest.算法测试;

import java.util.Scanner;

public class leedcode10 {
    public String addBinary(String a, String b) {
        char[] c=a.toCharArray();
        char[] d = b.toCharArray();
        StringBuilder sc = new StringBuilder();
        int num=0;
        int i,j;
        for(i=c.length-1,j=d.length-1;i>=0&&j>=0;i--,j--){
            int t=c[i]+d[j]-96+num;
            if(t<2){
                char t1=(char)(t+48);
                sc.append(t1);
                num=0;
            }else{
                num=1;
                sc.append((char)(t%2+48));
            }
        }
        while(i>=0){
            int t=c[i]+num-48;
            if(t<2){
                sc.append(t);
                num=0;
            }else{
                sc.append(t%2);
            }
            i--;
        }
        while(j>=0){
            int t=d[j]+num-48;
            if(t<2){
                sc.append(t);
                num=0;
            }else{
                sc.append(t%2);
                num=1;
            }
            j--;
        }
        if(num>0)sc.append(num);
        return sc.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        Integer a=1654;
        int b=1654;
        System.out.println(a==b);
        System.out.println(new leedcode10().addBinary(s,s1));
    }
}
