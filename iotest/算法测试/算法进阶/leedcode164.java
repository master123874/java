package iotest.算法测试.算法进阶;

public class leedcode164 {
    public static int maximumGap(int[] nums) {
        if(nums.length<2)return 0;    //先判断数组长度是否小于2
        int max=nums[0];      // 定义max变量,先找到数组中的最大值
        for(int i = 1;i<nums.length;i++){
            if(max<nums[i])max=nums[i];
        }
        int[] temp = new int[max+1];    //定义临时数组，保存nums数组中各个数值个数
        for(int i = 0;i<nums.length;i++){
            temp[nums[i]]++;
        }         //基数排序
        int Max_Gap = Integer.MIN_VALUE;    //定义最大间距，并为其赋上整型的最小值
        int t=0;         //设置临时变量保存前一个值
        for(int i=0;i<=max;i++){
            if(temp[i]>0){
                if(Max_Gap<i-t){
                    Max_Gap=i-t;
                }
                t=i;
            }
        }
        return Max_Gap;
    }
    public static void main(String[] args) {
        int[] a = {3,1};
        System.out.println(maximumGap(a));
    }
}
