package iotest.算法测试;

import java.util.Arrays;

public class test2 {
    final static String b="balloon";
    public static void main(String[] args){
        String a;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        a=sc.next();
        System.out.println(getcount(a));
    }
    public static int getcount(String a){
        int i,j;
        int[] t=new int[5];
        int count=0,c=0;
        char[] temp=b.toCharArray();
        for(i=0;i<a.length();i++){
            switch(a.charAt(i)){
                case 'b':{
                    t[0]++;
                    break;
                }
                case 'a':{
                    t[1]++;
                    break;
                }
                case 'l':{
                    t[2]++;
                    break;
                }
                case 'o':{
                    t[3]++;
                    break;
                }
                case 'n':{
                    t[4]++;
                    break;
                }
            }

        }
        t[2]/=2;
        t[3]/=2;
        Arrays.sort(t);
        return t[0];
    }

}
