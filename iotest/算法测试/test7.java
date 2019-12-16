
package iotest.算法测试;
import java.util.*;

public class test7 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> sc = new ArrayList<>();
       List<Integer> sc1 = new ArrayList<>();
       Arrays.sort(candidates);
       for(int i=0;i<candidates.length;i++){
           int sum= candidates[i];
           int j;
           for(j=i+1;j<candidates.length;j++){
               if(sum>=target)break;
               sum+=candidates[j];
           }
           if(sum==target){
               for(int k=i;k<j;k++){
                   sc1.add(candidates[k]);
               }
               if(!sc.contains(sc1))sc.add(sc1);
               sc1.clear();
           }
       }
       System.out.print(sc.size());
       return sc;
    }
    public static void main(String[] args) {
       int target = 8;
       java.util.Scanner sc = new Scanner(System.in);
       int[] a = new int[10];
       for(int i=0;i<a.length;i++){
           a[i] = sc.nextInt();
       }
       System.out.print(combinationSum(a,target));
       sc.close();
    }
}
