package iotest.算法测试;

public class leedcode62 {
    public static int reverse(int x) {
            long s=0;
            while(x!=0){
                s= s*10+ x%10;
                x=x/10;
            }
            if((int)s!=s){
                return 0;
            }
            return (int)s;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
