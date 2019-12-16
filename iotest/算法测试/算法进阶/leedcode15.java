package iotest.算法测试.算法进阶;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leedcode15 {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> sc = new ArrayList<>();
        for(int i = 0;i<groupSizes.length;i++){
            if(groupSizes[i]>0){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                int t=groupSizes[i]-1;
                for(int j=i+1;j<groupSizes.length&&t>0;j++){
                    if(groupSizes[j]>0&&groupSizes[i]==groupSizes[j]){
                        list.add(j);
                        t--;
                        groupSizes[j]=-1;
                    }
                }
                sc.add(list);
            }
        }
        return sc;
    }

    public static void main(String[] args) {
        int[] a = {3,3,3,3,3,1,3};
        System.out.println(groupThePeople(a));
    }
}
