package iotest.算法测试.算法进阶;

import java.util.Arrays;

public class leedcode21 {
    public static boolean checkValidString(String s) {
        char[] a = new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                boolean flag=false;
                for(int j=top;j>=0;j--){
                    if(a[j]=='('){
                        a[j]='x';
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    for(int j=top;j>=0;j--){
                        if(a[j]=='*'){
                            a[j]='x';
                            flag=true;
                            break;
                        }
                    }
                }
                if(!flag)return false;
            }else a[++top]=s.charAt(i);
        }
        for(int i = 0;i<=top-1;i++){
            if(a[i]=='('){
                boolean flag = false;
                for(int j =i+1;j<=top;j++){
                    if(a[j]=='*'){
                        a[i]='x';
                        a[j]='x';
                        flag=true;
                        break;
                    }
                }
                if(!flag)return false;
            }
        }
        for(int i=0;i<=top;i++){
            if(a[i]!='x'&&a[i]!='*')return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkValidString("(*()"));
    }
}
