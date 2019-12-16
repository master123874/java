package iotest.算法测试;

public class MainThread {
    public static void main(String[] args){
        Thread[] a=new Thread[10];
        for(int i=0;i<10;i++){
            Liftoff launch = new Liftoff();
            a[i]=new Thread(launch);
            a[i].run();
        }
    }
}
