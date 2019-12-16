package iotest.算法测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leedcode92 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        for(int i=0;i<wordDict.size();i++){
           if(s.indexOf(wordDict.get(i))!=-1){
               if(wordDict.get(i).length()==s.length())return true;
               else{
                   boolean flag = false;
                   StringBuilder sc = new StringBuilder();
                   if(s.indexOf(wordDict.get(i))!=0)sc.append(s.substring(0,s.indexOf(wordDict.get(i))));
                   if(s.indexOf(wordDict.get(i))+wordDict.get(i).length()!=s.length())sc.append(s.substring(s.indexOf(wordDict.get(i))+wordDict.get(i).length()));
                   do{
                       flag=false;
                       for(int j = 0;j<wordDict.size();j++){
                           if(sc.indexOf(wordDict.get(j))!=-1){
                               flag=true;
                               if(s.indexOf(wordDict.get(j))!=0)sc.append(s.substring(0,s.indexOf(wordDict.get(j))));
                               if(s.indexOf(wordDict.get(j))+wordDict.get(j).length()!=s.length())sc.append(s.substring(s.indexOf(wordDict.get(j))+wordDict.get(j).length()));
                           }
                       }
                   }while(flag&&sc.length()!=0);
               }
           }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] a = {"leet", "code"};
        String b = "leetcode";
        List<String> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }
        System.out.println(wordBreak(b,list));
    }
}
