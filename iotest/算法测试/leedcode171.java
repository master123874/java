package iotest.算法测试;
public class leedcode171 {
    public static String multiply(String num1, String num2) {
        int num = 0;
        int[] a = new int[300];
        int index=0;
        int count=0;
        int n=0;
        StringBuilder sb = new StringBuilder();
        for(int i = num1.length()-1;i>=0;i--){
            num=0;
            for(int j = num2.length()-1;j>=0;j--){
                int t = (num1.charAt(i)-48)*(num2.charAt(j)-48)+num;
                System.out.println(index);
                a[index] += t%10;
                index++;
                num=t/10;
            }
            if(num>0)a[index++]=num;
            count = index;
            index= ++n;
        }
        num=0;
        for(int i = 0;i<count;i++){
            int t1=a[i]+num;
            a[i]=t1%10;
            sb.append(a[i]);
            num=t1/10;
        }
        if(num>0)sb.append(num);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(multiply("123","456"));
    }
}
