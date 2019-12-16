package iotest.算法测试;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class leedcode4 {
    public static List<List<Integer>> fourSum(int[] nums,int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int s=j+1;s<nums.length;s++){
                    for(int t=s+1;t<nums.length;t++){
                        if(nums[i]+nums[j]+nums[s]+nums[t]==target){
                            List<Integer> sc = new ArrayList<>();
                            sc.add(nums[i]);
                            sc.add(nums[j]);
                            sc.add(nums[s]);
                            sc.add(nums[t]);
                            if(!list.contains(sc)){
                                list.add(sc);
                            }
                        }
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[]={1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(nums,0));
    }
}
