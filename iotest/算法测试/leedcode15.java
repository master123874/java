package iotest.算法测试;

public class leedcode15 {
    static int isprime(int n){
        if(n<2)return -1;
        for(int i=n-1;i>=2;i--){
            if(n%i==0)return i;
        }
        return -1;
    }
    public static int minSteps(int n) {
        if(n==1)return 0;
        else if(n<=5)return n;
        if(isprime(n)>0){
            return minSteps(isprime(n))+n/isprime(n);
        }
        return  n;
    }
    public static void main(String[] args) {
        System.out.println(minSteps(11));
        System.out.println(Math.pow(10,18)<Long.MAX_VALUE);
    }
}
