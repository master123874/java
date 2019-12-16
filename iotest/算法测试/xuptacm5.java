package iotest.算法测试;

import java.util.Scanner;

public class xuptacm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String s1 = sc.next();
        if(s.compareTo(s1)<0)System.out.print(-1);
        else if(s.compareTo(s1)>0)System.out.print(1);
        else System.out.print(0);
    }
}
