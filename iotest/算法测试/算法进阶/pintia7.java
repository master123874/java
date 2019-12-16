package iotest.算法测试.算法进阶;
import java.util.*;
public class pintia7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        int t=0;
        int[] sum=new int[n];
        int[] sum1=new int[n];
        int max=0,max1=0;
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                t=sc.nextInt();
                sum[i]+=t;
                sum1[j]+=t;
            }
            if(!flag){
                max=sum[i];
                flag=true;
            }else if(max<sum[i]){
                max=sum[i];
            }
        }
        flag=false;
        for(int i = 0;i<n;i++){
            if(!flag){
                max1=sum1[i];
                flag=true;
            }else if(max1<sum1[i]){
                max1=sum1[i];
            }
        }
        System.out.println(max1);
        for(int i = 0;i<n;i++){
            if(sum[i]==max){
                list1.add(i);
            }
            if(sum1[i]==max1){
                list2.add(i);
            }
        }
        System.out.println("Highest row: "+list1);
        System.out.println("Highest column: "+list2);
    }
}
