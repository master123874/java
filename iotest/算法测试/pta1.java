package iotest.算法测试;
import java.math.BigInteger;
import java.util.Scanner;
public class pta1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();

        BigInteger a = new BigInteger(a1);
        String a2 = sc.next();
        BigInteger a3 = new BigInteger(a2);
        System.out.print(a.divide(a3));
    }
}
