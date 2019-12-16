package iotest.算法测试;

public class leedcode3 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        else if(strs.length==1)return strs[0];
        int count=1;
        boolean flag=false;
        String t="";
        for(int i=0;i<strs[0].length();i ++){
            if(i<count)break;
            t=strs[i].substring(0,count);
            boolean s = true;
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()<count)break;
                String t1=strs[j].substring(0,count);
                if(!t.equals(t1)){
                    s=false;
                    break;
                }
            }
            if(s){
                flag = true;
                count++;
            }
            else break;
        }
        if(flag)return t.substring(0,t.length()-1);
        return "";
    }

    public static void main(String[] args) {
        String[] nums = new String[]{"dog","","do"};
        System.out.println(longestCommonPrefix(nums));
    }
}
