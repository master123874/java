package iotest.算法测试;
interface s{
    int a=1;
    void show();
    void chan();
}
abstract class s1 implements s{
    @Override
    public void chan() {
        System.out.println("change the world");
    }

}
public class demotest1 extends s1{
    public void show(){
        System.out.println("dhabs");
    }

    public static void main(String[] args) {
        demotest1 s5 = new demotest1();
        s5.show();
        s5.chan();
    }
}
