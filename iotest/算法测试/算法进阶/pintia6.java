package iotest.算法测试.算法进阶;
import java.util.Scanner;
public class pintia6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i = 0;
        String[] str = new String[100];
        while(sc.hasNext()){
            String a = sc.nextLine();
            if("end".equals((a)))break;
            str[i++]=a;
        }
        String b = sc.nextLine();
        String c = sc.nextLine();
        for(int j=0;j<i;j++){
            System.out.println(str[j].replace(b,c));
        }
        sc.close();
    }
}
