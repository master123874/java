class test{
    public test(){

    }
    public void print(){
        System.out.print("change the world need every people");
    }
}
public class test1 extends test {
    public test1(){
    }
    public void print(){
        System.out.println("the world is chnage");
    }
    public static void main(String[] args){
        test1 sc = new test1();
        test sc1 =new test();
        sc.print();
    }
}
