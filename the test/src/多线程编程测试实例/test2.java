package 多线程编程测试实例;

public class test2 {
    private int money;
    private String name;

    public test2(String name,int money){
        this.money = money;
        this.name = name;
    }
    // 只能同一时间由单一线程处理
    public synchronized void deposit(int m){
        money +=m;
    }
    //取款
    public synchronized boolean withdraw(int m){
        if(money >= m){
            money -= m;
            return true;
        }
        else{
            return false;
        }
    }
    public String getName(){
        return name;
    }
}
