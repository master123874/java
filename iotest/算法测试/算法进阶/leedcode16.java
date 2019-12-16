package iotest.算法测试.算法进阶;

public class leedcode16 {
    public static int smallestDivisor(int[] nums, int threshold) {
        int t=1;
        while(true){
            int sum = 0;
            for(int i = 0;i<nums.length;i++){
                int s=nums[i]%t==0?nums[i]/t:nums[i]/t+1;
                sum = sum + s;
            }
            if(sum<=threshold)break;
            t++;
        }
        return t;
    }

    public static void main(String[] args) {
        int[] a ={1,2,5,9};
        System.out.println(smallestDivisor(a,6));
    }

}
