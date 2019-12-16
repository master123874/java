package iotest.算法测试;

public class test5 {
    static int count=0;
    public static boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<s.length();i++){
            String t=s.substring(0,i);
            if(i+t.length()>s.length())break;
            boolean flag=true;
            int j;
            for(j=t.length();j<=s.length()-t.length();){
                String t1=s.substring(j,j+t.length());
                if(!t1.equals(t))
                {
                    flag=false;
                    break;
                }
                j+=t.length();
            }
            if(flag&&j==s.length())return true;
        }
        return false;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a = sc.next();
        System.out.print(repeatedSubstringPattern(a));
    }
}
