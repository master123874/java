import java.util.Scanner;
abstract class GeometricObjext{
    double side1,side2,side3;
    boolean a =false;
    String color;
}
public class change extends GeometricObjext{
    public change(String color,boolean a,double side1,double side2,double side3){
        this.color=color;
        this.a=a;
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getArea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public boolean judge(){
        if(side1+side2<=side3||side1+side3<=side2||side2+side3<=side1){
            System.out.print("数据有误,无法计算");
            return false;
        }
        return true;
    }
    public String toString(){
        if(judge()){
            if(a)
            {
                return "该图形是否为填充图形"+a+"填充颜色为"+color+"\n该图形的面积为:"+String.format("%.2f",getArea())
                        +"\n该图形的周长为:"+getPerimeter();
            }
            else
                return "该图形是否为填充图形"+a+"\n该图形的面积为:"+String.format("%.2f",getArea())
                        +"\n该图形的周长为:"+getPerimeter();
        }
        else return "\n";

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三角形颜色:");
        String color = sc.next();
        System.out.print("请输入是否为填充图形:");
        boolean a= sc.nextBoolean();
        System.out.print("请输入边1,2,3:");
        double side1=sc.nextDouble();
        double side2=sc.nextDouble();
        double side3=sc.nextDouble();
        change t=new change(color,a,side1,side2,side3);
        System.out.print(t.toString());
    }

}
