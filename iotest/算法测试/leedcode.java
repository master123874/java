package iotest.算法测试;

public class leedcode {
    public static boolean backspaceCompare(String S, String T){
        int x=0,y=0;
        char[] a = S.toCharArray();
        char[] b = T.toCharArray();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='#'){
                if(x>0){
                    x--;
                    a[x]=' ';
                }
            }
            else{
                a[x]=S.charAt(i);
                x++;
            }
        }
        for(int i=0;i<T.length();i++){
            if(T.charAt(i)=='#'){
                if(y>0){
                    y--;
                    b[y]=' ';
                }
            }
            else{
                b[y]=T.charAt(i);
                y++;
            }
        }
        if(x!=y)return false;
        else{
            if(x==0)return true;
            for(int i=0;i<x;i++){
                if(a[i]!=b[i])return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }
}
