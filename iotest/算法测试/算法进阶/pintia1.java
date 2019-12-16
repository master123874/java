package iotest.算法测试.算法进阶;

import java.text.DecimalFormat;
import java.util.Scanner;
interface IShape {
    double getArea();
    double getPerimeter();
}
class RHexagon implements IShape{
    double t;
    public RHexagon(double t){
        this.t=t;
    }
    public double getArea(){
        return (t+2*t)*t*(Math.cos(Math.toRadians(30)));
    }
    public double getPerimeter(){
        return 6*t;
    }
}
public class pintia1 {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        IShape r = new RHexagon (a);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}
