package iotest.算法测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("all")
public class leedcode166 {
    leedcode166(){
        System.out.println("change");
    }
    public static String largestNumber(int[] nums) {
        StringBuffer sf = new StringBuffer();
        String[] t = sort(nums);
        for (int i = 0; i < t.length; i++) {
            sf.append(t[i]);
        }
        if(t[0].charAt(0)=='0')return "0";
        return sf.toString();
    }

    public static String[] sort(int[] nums) {
        String[] t = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            t[i] = Integer.toString(nums[i]);
        }
        boolean flag = true;
        int k = t.length;
        while (flag) {
            flag = false;
            for (int i = 0; i < k - 1; i++) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder();
                sb.append(t[i] + t[i + 1]);
                sb1.append(t[i + 1] + t[i]);
                if (sb.toString().compareTo(sb1.toString()) < 0) {
                    String t1 = t[i];
                    t[i] = t[i + 1];
                    t[i + 1] = t1;
                    flag = true;
                }
            }
            k--;
        }
        /*for(int i = 0;i<t.length-1;i++){
            for(int j = i+1;j<t.length;j++){
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder();
                sb.append(t[i]+t[j]);
                sb1.append(t[j]+t[i]);
                if(sb.toString().compareTo(sb1.toString())<0){
                    String t1 = t[i];
                    t[i] = t[j];
                    t[j] =t1;
                }
                /*int min = Math.min(t[i].length(),t[j].length());
                if(t[i].substring(0,min).compareTo(t[j].substring(0,min))<0){
                    String t1 = t[i];
                    t[i] = t[j];
                    t[j] =t1;
                }else if(t[i].substring(0,min).compareTo(t[j].substring(0,min))==0){
                    if(t[i].length()!=t[j].length()){
                        if(t[i].substring(t[i].length()-min).compareTo(t[j].substring(t[j].length()-min))<0){
                            String t1 = t[i];
                            t[i] = t[j];
                            t[j] =t1;
                        }
                    }
                }*/
        return t;
    }

    public static void main(String[] args) {
        int[] a ={0,0};
        List<Integer> list = new ArrayList<>();
        Integer a1 = 12;
        Integer a2 = 13;
        new leedcode166();
        System.out.println(a1==a2);
        System.out.println(largestNumber(a));
    }
}
