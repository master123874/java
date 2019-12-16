package iotest.算法测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leedcode5027 {
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> list = new ArrayList<>();
        Arrays.sort(products);
        for(int i=0;i<searchWord.length();i++){
            String r = searchWord.substring(0,i+1);
            ArrayList<String> sc = new ArrayList<>();
            int count=0;
            for(int j=0;j<products.length;j++){
                if(products[j].indexOf(r)==0){
                    sc.add(products[j]);
                    count++;
                    if(count==3)break;
                }
            }
            list.add(sc);
        }
        return list;
    }
    public static void main(String[] args) {
        String t = "mouse";
        String[] t1 = {"mobile","mouse","moneypot","monitor","mousepad"};
        System.out.println(suggestedProducts(t1,t));
    }
}
