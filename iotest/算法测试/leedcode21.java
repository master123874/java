package iotest.算法测试;

public class leedcode21 {
    public static int bitwiseComplement(int N) {
        int sum=0;
        int count=0;
        while(N>0){
            int t=N%2;
            if(t==0)sum+=Math.pow(2,count);
            N/=2;
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(4));
    }
}
