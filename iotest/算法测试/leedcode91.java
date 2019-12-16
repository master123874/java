package iotest.算法测试;

public class leedcode91 {
    public static boolean isPalindrome(String s) {
            int k=0,end=s.length()-1;
            while(k<end){
                if((!Character.isLetter(s.charAt(k))&&!Character.isDigit(s.charAt(k)))&&(!Character.isLetter(s.charAt(end))&&!Character.isDigit(s.charAt(end)))){

                    k++;
                    end--;
                }
                else if(!Character.isLetter(s.charAt(k))&&!Character.isDigit(s.charAt(k)))k++;
                else if(!Character.isLetter(s.charAt(end))&&!Character.isDigit(s.charAt(end)))end--;
                else if(Character.toUpperCase(s.charAt(k))!=Character.toUpperCase(s.charAt(end)))return false;
                else {
                    k++;
                    end--;
                }
            }
            return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(".,"));
    }
}
