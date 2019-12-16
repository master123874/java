
abstract class GeometricObject{
    public static double side1=1.0,side2=1.0,side3=1.0;
    protected abstract double getArea();
    protected abstract double getPerimeter();
}
public class Triangle extends GeometricObject{
    public Triangle(double side1,double side2,double side3){
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
    public String toString(){
        return "Triangle: side1 = "+side1+" side2 = "+side2 + " side3 = "+side3;
    }
    public static void main(String[] args){
        Triangle sc = new Triangle(3,4,5);
        System.out.println(sc.toString());
        System.out.println("the area of the Triangle is "+String.format("%.2f",sc.getArea()));
        System.out.println("the perimeter of the Triangle is "+sc.getPerimeter());
    }
}
