package iotest.算法测试.算法进阶;

public class leedcode18 {
    public static double largestSumOfAverages(int[] A, int K) {
        int[] a = new int[10001];
        double sum = 0;
        int t = K;
        for(int i = 0;i<A.length;i++){
            a[A[i]]++;
        }
        for(int i = 10000;i>=1&&t>1;i--){
            if(a[i]>0){
                sum+=i;
                a[i]--;
                t--;
                i++;
            }
        }
        double sum1 = 0;
        for(int i = 1;i<=10000;i++){
            while(a[i]>0){
                sum1+=i;
                a[i]--;
            }
        }
        return sum+sum1/(A.length-K+1);
    }

    public static void main(String[] args) {
        int[] a = new int[]{9,1,2,3,9};
        System.out.println(largestSumOfAverages(a,1));
    }
}
