package iotest.算法测试;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
    public static int getmin(int[] nums, int target){
        int i;
        boolean flag = false;
        int sum=0,sum1=0;
        for(i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int z=j+1;z<nums.length;z++)
                {
                    int t = Math.abs(nums[j]+nums[i]+nums[z]-target);
                    if(t==0)return target;
                    else if(!flag){
                        sum = t;
                        sum1=nums[j]+nums[i]+nums[z];
                        flag=true;
                    }
                    else if(sum>t){
                        sum1=nums[j]+nums[i]+nums[z];
                        sum=t;
                    }
                }
            }
        }
        return sum1;
    }
    public static void main(String[] args){
        int[] nums = new int[3];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for(int i=0;i<nums.length;i++)nums[i]=sc.nextInt();
        System.out.println(getmin(nums,1));
    }
}
