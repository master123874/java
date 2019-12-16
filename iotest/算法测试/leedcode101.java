package iotest.算法测试;

import java.util.ArrayList;

public class leedcode101 {
    public static int countPrimes(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<n;i++){
            boolean flag = true;
            for(int j=0;j<list.size();j++){
                if(i%list.get(j)==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
