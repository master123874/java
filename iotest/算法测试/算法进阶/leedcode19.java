package iotest.算法测试.算法进阶;

import java.util.Arrays;

public class leedcode19 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int i=0,j=0;
        if(ransomNote.length()>magazine.length())return false;
        int[] a = new int[26];
        int[] b= new int[26];
        while(i<ransomNote.length()||j<magazine.length()){
            if(i<ransomNote.length()){
                a[ransomNote.charAt(i++)-97]++;
                b[magazine.charAt(j++)-97]++;
            }else{
                b[magazine.charAt(j++)-97]++;
            }
        }

        for(i = 0;i<26;i++){
            if(a[i]>b[i])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("bg",
                "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"
        ));
    }
}
