package iotest.算法测试;

public class leedcode8 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        boolean flag=false;
        int t=0;
        for(int i=0;i<popped.length;i++){
            for(int j=0;j<pushed.length;j++){
                if(pushed[j]==popped[i]&&pushed[j]>=0){
                    if(!flag){
                        t=j;
                        pushed[j]=-1;
                        flag=true;
                    }
                    else{
                        int count=0;
                        for(int k=j;k<t;k++){
                            if(pushed[k]>=0)count++;
                        }
                        if(j>t||count==1){
                            pushed[j]=-1;
                            t=j;
                        }
                        else return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {0,1};
        int[] nums2={1,0};
        Math.sqrt(2);
        System.out.println(validateStackSequences(nums,nums2));
    }

}
