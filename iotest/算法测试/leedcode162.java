package iotest.算法测试;

import java.util.Arrays;

public class leedcode162 {
    public static boolean hasGroupsSizeX(int[] deck) {
        if(deck.length<2)return false;
        Arrays.sort(deck);
        int[] a = new int[deck.length];
        int index=0,t=deck[0];
        a[index]++;
        for(int i=1;i<deck.length;i++){
            if(deck[i]==t){
                a[index]++;
            }else{
                index++;
                a[index]++;
                t=deck[i];
            }
        }
        index++;
        int min=a[0];
        for(int i=1;i<index;i++){
            if(min>a[i])min=a[i];
        }
        System.out.println(Arrays.toString(a));
        if(min==1)return false;
        for(int i=0;i<index;i++){
            if(a[i]%min!=0&&min<a[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,2,3,3};
        System.out.println(hasGroupsSizeX(a));
    }
}
