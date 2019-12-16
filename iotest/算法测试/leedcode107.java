package iotest.算法测试;

public class leedcode107 {
    public static char getfirst(String s){
        int i=0;
        char[] a = s.toCharArray();
        for(;i<s.length();i++){
            boolean flag = true;
            if(a[i]!=' '){
                for(int j=i+1;j<s.length();j++){
                    if(a[j]==a[i]){
                        a[j]=' ';
                        flag = false;
                    }
                }
                if(flag){
                    return s.charAt(i);
                }
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        System.out.println(getfirst("aabc"));
    }
}
