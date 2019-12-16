package iotest.算法测试;

public class leedcode67 {
    public static int rotatedDigits(int N) {
        int[] a ={0,1,5,-1,-1,2,9,-1,8,6};
        int count=0;
        for(int i=1;i<=N;i++){
            int t=0,sum=0;
            int t1=i;
            boolean flag=true;
            while(t1>0){
                if(a[t1%10]<0){
                    flag=false;
                    break;
                }
                sum=sum+a[t1%10]*(int)Math.pow(10,t);
                t++;
                t1/=10;
            }
            if(i!=sum&&flag){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(rotatedDigits(10));
        /**/
    }
}
