package iotest.算法测试;
import java.util.Arrays;
public class leedcode6 {
    public static int totalFruit(int[] tree) {
        if(tree.length==0||tree.length==1)return tree.length;
        int max=0,count=1;
        int t[]={0,-1};
        //初始化临时数组
        t[0]=tree[0];
        for(int i=1;i<tree.length;i++){
            if(t[0]!=tree[i]){
                t[1]=tree[i];
                break;
            }
        }
        int t5=0;
        for(int i=1;i<tree.length;i++){
            if(tree[i]==t[0]||tree[i]==t[1]){
                count++;
                t5=count;
            }
            else{
                int j,t1=tree[i-1];     /*不相等的前一个元素*/
                int t4=1;
                for(j=i-2;j>=0;j--){      /*判断前一个元素的前面有几个与当前元素相等*/
                    if(tree[j]!=t1)break;
                    else t4++;
                }
                t[0]=tree[i-1];
                t[1]=tree[i];                //重新赋值，在count值未发生改变前；
                count=t4+1;
            }
            if(max<t5)max=t5;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,6,6,4,4,6};
        System.out.println(totalFruit(nums));
    }
}
