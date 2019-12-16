package iotest.算法测试;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class leedcode160 {
    public static boolean exist(Map t, String s){
        Collection s1 = t.values();
        Iterator iterator = s1.iterator();
        while(iterator.hasNext()){
           String s2 = (String)iterator.next();
           if(s2.equals(s))return true;
        }
        return false;
    }
    public static boolean wordPattern(String pattern, String str) {
        String[] t = str.split(" ");
        if(t.length!=pattern.length())return false;
        int s=0,e=pattern.length()-1;
        Map<Character,String> map = new HashMap<>();
        for(int i=0;i<t.length/2;i++){
            if(pattern.charAt(e)==pattern.charAt(s)){
                if(!t[i].equals(t[t.length-i-1])){
                    return false;
                }
            }else if(t[i].equals(t[t.length-i-1]))return false;
            if(map.containsKey(pattern.charAt(e))){
                if(!map.get(pattern.charAt(e)).equals(t[t.length-i-1])){
                    return false;
                }
            }else if(exist(map,t[t.length-i-1]))return false;
            else map.put(pattern.charAt(e),t[t.length-i-1]);
            if(map.containsKey(pattern.charAt(s))){
                if(!map.get(pattern.charAt(s)).equals(t[i])){
                    return false;
                }
            }else if(exist(map,t[i]))return false;
            else map.put(pattern.charAt(s),t[i]);
            e--;
            s++;
        }
        return true;
    }
    public static void main(String[] args) {
        double a= 95.123;
        BigDecimal sc = new BigDecimal(a);
        sc=sc.pow(12);
        System.out.println(sc);
        System.out.println(wordPattern("aaa","change chage change"));
    }
}
