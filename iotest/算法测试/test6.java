package iotest.算法测试;;

public class test6 {
    public static String multiply(String num1, String num2) {
        java.math.BigInteger n;
        n = new java.math.BigInteger(num1,2);
        n=n.multiply(new java.math.BigInteger(num2,2));
        return n.toString();
    }
    public static void main(String[] args) {
        String a = "6913259244";


        String b = "11033437";

    }
}
