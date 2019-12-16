package iotest.算法测试;
import java.util.Scanner;
public class pta {
        private static Object Interger;

        public static Object max(Comparable[] a){
            boolean flag = true;
            Comparable b=a[0];
            for(int i=1;i<a.length;i++){
                if(b.compareTo(a[i])<0)b=a[i];
            }
            return b;
        }
        public static void main(String[] args){
            String[] sArray = new String[5];
            Integer[] intArray = new Integer[5];
            Scanner input = new Scanner(System.in);
            for(int i=0;i<sArray.length;i++)  {
                sArray[i] = input.next();
            }

            for(int i=0;i<intArray.length;i++)  {
                intArray[i] = input.nextInt();
            }

            System.out.println("Max string is " +(String)max(sArray));
            System.out.println("Max integer is " + (Integer)max(intArray));

        }
}


