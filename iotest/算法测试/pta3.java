package iotest.算法测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class pta3 {
    public static void removeDuplicate(ArrayList list){
        ArrayList<Integer> list1 = new ArrayList<>();
        boolean flag = false;
        for(int i=0;i<list.size();i++){
            if(!list1.contains(list.get(i))){
                int t = (int)list.get(i);
                list1.add(t);
                if(!flag){
                    System.out.print(t);
                    flag=true;
                }else System.out.print(" "+t);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1= sc.nextDouble();
        double y1= sc.nextDouble();
        double x2= sc.nextDouble();
        double y2= sc.nextDouble();
        double x3= sc.nextDouble();
        double y3= sc.nextDouble();
        double x4= sc.nextDouble();
        double y4= sc.nextDouble();
        double a = x1-x2;
        double b= y1-y2;
        double c = x3-x4;
        double d=y3-y4;
        if(a*d==b*c){
            System.out.print("The two lines are parallel");
        }else{
            double k1 = b/a;
            double k2 = d/c;
            double x = (y4-k2*x4-y1+k1*x1)/(k1-k2);
            double y = k1*(x-x1)+y1;
            System.out.print("The intersecting point is at (" +String.format("%.3f",x)+","
            + String.format("%.3f",y) +")");
        }

    }
}
