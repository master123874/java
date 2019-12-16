package iotest.算法测试;

public class leedcode2 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        long a = Integer.MIN_VALUE;
        long b= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long t1=(long)nums[i];
                long t2 = (long)nums[j];
                if(j-i<=k&&Math.abs(t2-t1)<=t)return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums ={2147483647,-2147483647
        };
        System.out.print(containsNearbyAlmostDuplicate(nums,1,2147483647));
    }

}
