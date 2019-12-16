package iotest.算法测试;
import java.text.DecimalFormat;
import java.util.Scanner;
abstract class shape {// 抽象类

    /* 抽象方法 求面积 */
    public abstract double getArea();

    /* 抽象方法 求周长 */
    public abstract double getPerimeter();
}
class RegularPolygon extends shape{
    int n;
    double n1;
    public RegularPolygon(int n,double n1){
        this.n=n;
        this.n1=n1;
    }
    public double getPerimeter(){
        return n*n1;
    }
    public double getArea(){
        return n*n1*n1/(Math.tan(Math.toRadians(180/n))*4);
    }
}
public class pta4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");
        int n=input.nextInt();
        double side = input.nextDouble();
        shape rp = new  RegularPolygon(n,side);
        System.out.println(d.format(rp.getArea()));
        System.out.println(d.format(rp.getPerimeter()));
        input.close();
    }
}
