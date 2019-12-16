package iotest.算法测试;

import java.sql.SQLOutput;
import java.util.Scanner;

public class xuptacm8 {

    public static void main(String[] args) {
        System.out.println("Nine-by-nine Multiplication Table");
        System.out.println("--------------------------------------");
        System.out.println("1 2 3 4 5 6 7 8 9");
        System.out.println("--------------------------------------");
        for (int i=1; i<=9; i++){
            System.out.print(i+" ");
            for (int j=1; j<=i; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}
