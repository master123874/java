package iotest.算法测试;

public class leedcode12 {
    public static int hammingDistance(int x, int y) {
        String y1=Integer.toBinaryString(y);
        int count=0;
        int i;
        String x1=Integer.toBinaryString(x);
        int min = x1.length()>y1.length()?y1.length():x1.length();
        String c=x1.substring(x1.length()-min);
        String d=y1.substring(y1.length()-min);
        int t=0;
        if(x1.length()>min){
            t=x1.length()-min;
        }
        if(y1.length()>min){
            t=y1.length()-min;
        }
        for(i=min-1;i>=0;i--){
            if(c.charAt(i)!=d.charAt(i))count++;
        }
        return count+t;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));

    }
}
