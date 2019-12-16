import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Person{
    protected String name;
    protected String address;
    protected String emailaddress;
    protected String phonenumber;
    public Person(){}
    public Person(String name,String address,String emailaddress,String phonenumber){
        this.name = name;
        this.address = address;
        this.emailaddress = emailaddress;
        this.phonenumber = phonenumber;
    }
    public String toString(){
        return "个人基本信息如下\n"+"姓名:" + name +"\n地址:"+address + "\nemail地址:" + emailaddress + "\n电话号码"
                +phonenumber;
    }
}
class Student extends Person{
    private final String[] status1= new String[]{"","大学", "高中", "初中", "小学"};
    private int status=0;
    public Student(int status,String name,String address,String emailaddress,String phonenumber){
        super();
        this.status=status;
    }
    public String toString(){
        String s = "状态:学生正在读" +status1[status];
        return s;
    }
}
class Employee extends Person{
    private String office;
    private double salary;
    public Employee(){

    }
    public Employee(double salary,String office) {
            super();
            this.salary=salary;
            this.office=office;
    }
    public String toString(){
        return "工作办公室:" + office +"工资:" + String.format("%.2f",salary);
    }
}
class Faculty extends Employee{
    String rank;
    public Faculty(String rank) {
        super();
        this.rank=rank;
        System.out.print(toString());
    }
    public String toString(){
        return "\n入职时间:"+new SimpleDateFormat("yyyy:mm:ss").format(new Date())+"等级:" + rank;
    }
}
class Staff extends Employee{
    private int hours;
    private String workname;
    public Staff(int hours,String workname) {
            super();
            this.hours=hours;
            this.workname = workname;
            toString();
    }
    public String toString(){
        return "\n状态:" +"Staff" +"入职时间" + new SimpleDateFormat("yyyy:mm:ss").format(new Date()) +"\n每天工作时长:" + hours+ "hours";
    }
}
public class testPerson {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入状态S:1为学生,2为雇员,3为职员,4为教员:");
        int s=sc.nextInt();
        System.out.print("请输入姓名:");
        String name = sc.next();
        System.out.print("请输入地址:");
        String address = sc.next();
        System.out.print("请输入email地址:");
        String emailaddress = sc.next();
        System.out.print("手机号码:");
        String phonenumber = sc.next();
        Person person = new Person(name,address,emailaddress,phonenumber);
        switch(s){
            case 1:{
                System.out.print("请输入学生状态1/大学2/高中3/初中4/小学:");
                int t=sc.nextInt();
                System.out.println(person.toString());
                System.out.println(new Student(t, name, address, emailaddress, phonenumber));
                break;
            }
            case 2:{
                System.out.print("请输入雇员薪资:");
                double salary = sc.nextDouble();
                System.out.print("请输入办公室名称:");
                String office = sc.next();
                System.out.println(person.toString());
                System.out.println(new Employee(salary,office).toString());
                break;
            }
            case 3:{
                System.out.print("请输入雇员薪资:");
                double salary = sc.nextDouble();
                System.out.print("请输入办公室名称:");
                String office = sc.next();
                System.out.print("请输入工作时长:");
                int hours = sc.nextInt();
                System.out.print("请输入工名:");
                String workname = sc.next();
                System.out.println(person.toString());
                System.out.println(new Employee(salary,office).toString());
                System.out.println(new Staff(hours,workname).toString());
                break;
            }
            case 4:{
                System.out.print("请输入雇员薪资:");
                double salary = sc.nextDouble();
                System.out.print("请输入办公室名称:");
                String office = sc.next();
                System.out.print("请输入工作等级:");
                String rank = sc.next();
                System.out.println(person.toString());
                System.out.println(new Employee(salary,office).toString());
                System.out.println(new Faculty(rank).toString());
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + s);
        }
    }
}
