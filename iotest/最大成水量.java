package iotest;

import java.util.Scanner;

public class 最大成水量 {
    public static int maxArea(int[] height) {
        int max=0;
        int temp=0;
        for(int i=0;i<height.length;i++){
            for(int j=height.length-1;j>=0;j--){
                if(height[j]>height[i])temp=height[i]*(j-i);
                else temp = height[j] * (j-i);
                if(max<temp)max=temp;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums = new int[1];
        java.util.Scanner sc = new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        System.out.print(maxArea(nums));
    }

}
