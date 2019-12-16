package 多线程编程测试实例;

public class test1 {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            try{
                System.out.print("goof ");
                Thread.sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
