package iotest.算法测试.算法进阶;

public class leedcode20 {
    public static boolean validUtf8(int[] data) {
        String[][] a = {{"0"},{"110","10"},{"1110","10","10"},{"11110","10","10","10"}};
        for(int i = 0;i<data.length;i++){
            String t=Integer.toBinaryString(data[i]);
            int s = get(t,a);
            if(s>=0){
                for(int j = 1;j < a[s].length;j++){
                    ++i;
                    t=Integer.toBinaryString(data[i]);
                    if(t.indexOf(a[s][j])!=0||t.length()<8)return false;
                }
            }else return false;
        }
        return true;
    }
    public static int get(String t,String[][] a){
        if(t.length()<8)return 0;
        for(int i = 1;i<a.length;i++){
            if(t.indexOf(a[i][0])==0)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a ={235, 140, 4};
        System.out.println(validUtf8(a));
    }

}
