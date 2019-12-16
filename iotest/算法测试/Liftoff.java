package iotest.算法测试;;

public class Liftoff implements Runnable {
    protected int Countdown = 3; //default
    private static int taskDown = 0;
    private final int id = taskDown++;
    public Liftoff(){
        System.out.println("开始执行");

    }
    public String status(){
        return "#" + id + "(" +
                (Countdown > 0 ? Countdown : "Liftoff!") + "), ";
    }
    public void run(){
        while (Countdown-->0){
            System.out.println("执行中----");
            Thread.yield();
        }
        System.out.println("执行结束");
    }
}
