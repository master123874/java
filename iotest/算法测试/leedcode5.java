package iotest.算法测试;

public class leedcode5 {
    public static boolean isValid(String s){
        if(s.length()==0)return true;
        else if(s.charAt(0)!='('&&s.charAt(0)!='{'&&s.charAt(0)!='[')return false;
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            switch(arr[i]){
                case ')':{
                    int j;
                    for(j=i-1;j>=0;j--){
                        if(arr[j]=='('){
                            arr[j]=' ';
                            break;
                        }
                    }
                    if(j<0||(i-j+1)%2!=0)return false;
                    else arr[i]=' ';
                    break;
                }
                case '}':{
                    int j;
                    for(j=i-1;j>=0;j--){
                        if(arr[j]=='{'){
                            arr[j]=' ';
                            break;
                        }
                    }
                    if(j<0||(i-j+1)%2!=0)return false;
                    else arr[i]=' ';
                    break;
                }
                case ']':{
                    int j;
                    for(j=i-1;j>=0;j--){
                        if(arr[j]=='['){
                            arr[j]=' ';
                            break;
                        }
                    }
                    if(j<0||(i-j+1)%2!=0)return false;
                    else arr[i]=' ';
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' ')return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
}
