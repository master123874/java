package iotest.算法测试;

public class leedcode14 {
    public static int primePalindrome(int N) {
        while(true){
            int i;
            String t = Integer.toString(N);
            for(i=0;i<t.length()/2;i++){
                if(t.charAt(i)!=t.charAt(t.length()-i-1)){
                    break;
                }
            }
            if(i==t.length()/2&&isprime(N))break;
            N++;
        }
        return N;
    }
    public static boolean isprime(int n){
        if(n<2)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primePalindrome(8));


    }
}
class Solution {
    public int primePalindrome(int N) {
        if(N>=8 && N <= 11)
            return 11;
        char[] chars = String.valueOf(N).toCharArray();
        int x = 0;
        if(chars.length % 2 == 0)
            x = (int)Math.pow(10,chars.length/2);
        else
            for(int i=0;i<(chars.length+1)/2;i++)
                x = x * 10 + (chars[i] - '0');
        while(x > 0){
            int palindrome = createPalindrome(x);
            if(palindrome >= N && isPrimeNumber(palindrome) )
                return palindrome;
            x++;
        }
        return 0;
    }
    public boolean isPrimeNumber(int x){
        if(x == 1)
            return false;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i == 0)
                return false;
        }
        return true;
    }
    public int createPalindrome(int x) {
        int palindrome = x;
        while(x/10 > 0){
            x /= 10;
            palindrome = palindrome * 10 + x % 10;
        }
        return palindrome;
    }
}
    