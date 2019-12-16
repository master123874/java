package iotest.算法测试.算法进阶;
import java.math.BigInteger;
import java.util.Scanner;
public class pintia5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final BigInteger s = new BigInteger("1");
        final BigInteger s1 = new BigInteger(Integer.toString(n));
        BigInteger bg = new BigInteger(Long.toString(Long.MAX_VALUE)).add(s);
        for(int i = 0;i<3;i++){
            while(!bg.mod(s1).equals(new BigInteger("0"))){
                bg=bg.add(s);
            }
            System.out.println(bg);
            bg=bg.add(s);
        }
    }
}
