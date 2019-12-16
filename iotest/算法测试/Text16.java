package iotest.算法测试;
import java.util.Scanner;
public class Text16 {
    static int c;
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        Scanner scanner= new Scanner(System.in);
        int a[] = null;  //声明
        a = new int[5];
        String str[] = null;
        str = new String[5];
        int i,j,t;
        Text16[] a1= new Text16[5];
        for(i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            str[i]=scanner.next();
        }
        String max=str[0];
        for(i=1;i<5;i++)
        {
            if(max.compareTo(str[i])<0);
            {
                max=str[i];
            }
        }
        System.out.printf("%d",a[0]);
        System.out.println(max);
    }
}
