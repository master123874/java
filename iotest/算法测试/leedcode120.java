package iotest.算法测试;
import java.util.Arrays;
public class leedcode120 {
    public static int binarySearch(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);
        int start=0,end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                if(mid-1>=0&&nums[mid-1]==target)return mid-1;
                return mid;
            }
            else if(nums[mid]>target)end=mid-1;
            else start=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,4,5,6,8,13,17,18};
        System.out.println(binarySearch(nums,17));
    }
}
