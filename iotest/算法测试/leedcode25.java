package iotest.算法测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leedcode25 {
    public static boolean uniqueOccurrences(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1])count++;
            else{
                if(list.contains(count))return false;
                list.add(count);
                count=1;
            }
        }
        if(list.contains(count))return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
}
