package iotest.算法测试;;

public class test3 {
    public static int[] twoSum(int[] nums, int target) {
        int[] min = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    min[0]=i;
                    min[1]=j;
                    System.out.println(min[1]);
                    return min;
                }
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] nums = new int[4];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for(int i=0;i<nums.length;i++)nums[i]=sc.nextInt();
        System.out.print(nums);
    }
}
