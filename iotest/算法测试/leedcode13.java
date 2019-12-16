package iotest.算法测试;

public class leedcode13 {
    public static boolean judge(String t){
        for(int i=0;i<t.length()/2;i++){
            if(t.charAt(i)!=t.charAt(t.length()-i-1))return false;
        }
        return true;
    }
    public static int superpalindromesInRange(String L, String R) {
        int count=0;
        for(long i=Long.parseLong(L)%Math.sqrt(Long.parseLong(L))==0?(long)(Math.sqrt(Long.parseLong(L))):(long)(Math.sqrt(Long.parseLong(L)))+1
            ;i<=Math.sqrt(Long.parseLong(R));i++){
                if(i==Math.sqrt(i*i)){
                    if(judge(Long.toString(i)) && judge(Long.toString(i*i))){
                        count++;
                    }
                }
            }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(superpalindromesInRange("462", "1543707128290645"));
    }
}
