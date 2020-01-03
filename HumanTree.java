import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;

@SuppressWarnings("all")
//哈夫曼树的初始状态
class intial_Tree{
    private int parent;
    private int left;
    private int right;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public static void init(temp_list[] a ,List list,intial_Tree[] x){
        for(int i=0;i<a.length;i++){
            list.add(a[i].getData());
            x[i]=new intial_Tree();
            x[i].left=0;
            x[i].right=0;
            x[i].parent=0;
            x[i].count=a[i].getCount();
        }
    }

    @Override
    public String toString() {
        return "intial_Tree{" +
                "parent=" + parent +
                ", left=" + left +
                ", right=" + right +
                ", data="  +
        ", count=" + count +
                '}';
    }
}
@SuppressWarnings("all")
//临时类，保存个数与数据
class temp_list{
    private int count=0;
    private char data;
    public static void insertsort(temp_list[] temp_lists){
        for(int i=1;i<temp_lists.length;i++){
            temp_list t = temp_lists[i];
            boolean flag = true;
            int j=i-1;
            while(j>=0&&t.count<temp_lists[j].count){
                temp_lists[j+1]=temp_lists[j];
                j--;
            }
            temp_lists[j+1]=t;
        }
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "temp_list{" +
                "count=" + count +
                ", data=" + data+"}";
    }
}
@SuppressWarnings("all")
public class HumanTree implements Runnable{
    private static Thread a ;
    private static Map<Character,Integer> map = new TreeMap<>();
    private static Map<Character,String> map1 = new TreeMap<>();   //保存字符与其对应的编码
    private static ArrayList list = new ArrayList<>();  //保存字符
    private intial_Tree[] x;  // 哈夫曼树静态数组
    int temp = 0;   //记录不足八倍时多的个数
    StringBuilder str = new StringBuilder(); //保留字符编码后的总字符
    StringBuilder str1 = new StringBuilder(); //保存译码后的总字符
    private StringBuilder binaryString = new StringBuilder();
    final String path1 = "E://a.txt";
    final String path2 = "E://b.txt";
    final String path3 = "E://c.txt";
    private StringBuilder sb = new StringBuilder();
    @Override
    public void run(){
        FileInputStream fos = null;
        try {
            fos = new FileInputStream("E://a.txt");
            System.out.println("正在读取"+path1+"文件内容:");
            a.sleep(1000);
            byte[] b = new byte[1024];
            int len = 0;
            while((len=fos.read(b))!=-1){
                String temp= new String(b,0,len);
                for(int i=0;i<temp.length();i++){
                    str.append(temp.charAt(i));
                    if(map.containsKey(temp.charAt(i))){
                        int t = map.get(temp.charAt(i))+1;
                        map.put(temp.charAt(i),t);
                    }else map.put(temp.charAt(i),1);
                }
            }
            Set<Character> characters = map.keySet();
            temp_list[] a = new temp_list[characters.size()];
            int count=0;
            for (Character c : characters) {
                a[count] = new temp_list();
               a[count].setData(c);
               a[count].setCount(map.get(c));
               count++;
            }
            System.out.println(path1+"文件内容为:");
            System.out.println(str);
            temp_list.insertsort(a);
            x=new intial_Tree[a.length*2-1];
            intial_Tree.init(a,list,x);  //初始化树，便于操作
            selectandps(a.length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(fos!=null){
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void selecttwomin(int[] t,int length){
        int min=0;
        boolean flag = false;
        int i;
        for(i=0;i<length;i++){
            if(x[i].getParent()==0){
                if(!flag){
                    min=x[i].getCount();
                    t[0]=i;
                    flag=true;
                }else if(min>x[i].getCount()){
                    min=x[i].getCount();
                    t[0]=i;
                }
            }
        }
        flag=false;
        for(int j=0;j<length;j++){
            if(x[j].getParent()==0&&j!=t[0]){
                if(!flag){
                    min=x[j].getCount();
                    t[1]=j;
                    flag=true;
                }else if(min>x[j].getCount()){
                    min=x[j].getCount();
                    t[1]=j;
                }
            }
        }
    }
    public void selectandps(int length){
        int[] a = new int[2];
        for(int i=length;i<x.length;i++){
            x[i]=new intial_Tree();
            selecttwomin(a,i);
            x[a[0]].setParent(i);
            x[a[1]].setParent(i);
            x[i].setLeft(a[0]);
            x[i].setRight(a[1]);
            x[i].setCount(x[a[0]].getCount()+x[a[1]].getCount());
        }
        // 编码
        start(length);
    }
    public void start(int length){
        char a[] = new char[length];
        int count=0;
        for(int i=0;i<length;i++){
            int t=i;
            int t2 = x[t].getParent();
            count=0;
            while(t2!=0){
                if(x[t2].getRight()==t){
                    a[count++]='1';
                }else if(x[t2].getLeft()==t){
                    a[count++]='0';
                }
                t=t2;
                t2=x[t].getParent();
            }
            for(int j=0;j<count/2;j++){
                char t1=a[j];
                a[j]=a[count-j-1];
                a[count-j-1]=t1;
            }
            map1.put((Character)list.get(i),new String(a,0,count));
        }
        inputfile();
    }
    //写b.txt
    public void inputfile(){
        byte bytes = 0;
        FileOutputStream fos = null;
        for(int i=0;i<str.length();i++){
            binaryString.append(map1.get(str.charAt(i)));
        }
        System.out.println(path1+"所对应的二进制码为:");
        int c=0;
        int length = binaryString.length();
        while(length>0){
            if(length>=20){
                System.out.println(binaryString.substring(20*c,20*c+20));
                length-=20;
            }else{
                System.out.println(binaryString.substring(20*c,20*c+length));
                length=0;
            }
            c++;
        }
        temp = binaryString.length()%8==0?0:8-binaryString.length()%8;
        for(int i=0;i<temp;i++)binaryString.append("0");
        File file = new File("E://b.txt");
        byte x1 = 48;
        byte x2 = 2;
        try {
            System.out.println("正在将文件"+path1+"中的内容"+"压缩进"+path2);
            a.sleep(1000);
             fos = new FileOutputStream(file);
            for(int i=0;i<binaryString.length();i+=8){
                int t=i;
                byte s=0;
                for(int j=i;j<binaryString.length()&&j<t+8;j++){
                    byte y = (byte)binaryString.charAt(j);
                    s= (byte) (s*x2+y-x1);
                }
                bytes=s;
                fos.write(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(fos!=null){
            try {
                fos.close();  //释放资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("文件压缩完成");
        //译码
        start1();
    }
    // 读取
    public void start1(){
        try {
            FileInputStream is = new FileInputStream("E://b.txt");
            System.out.println("正在读取"+path2+"压缩文件中的内容");
            a.sleep(1000);
            byte[] bytes1 = new byte[1024];
            int len = 0;
            while((len= is.read(bytes1))!=-1){
                for(int i=0;i<len;i++){
                    int a = bytes1[i];
                    StringBuilder sb1 = new StringBuilder();
                    StringBuilder z = new StringBuilder(Integer.toBinaryString(a));
                    if(a<0)sb.append(z.substring(z.length()-8));
                    else {
                        if(!z.equals(binaryString.substring(i,8*(i+1)))){
                            for(int j=0;j<8-z.length();j++){
                                sb1.append('0');
                            }
                            sb1.append(z);
                        }
                        sb.append(sb1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("读取完成");
        start3();
    }
    //写入文件
    public void start3(){
        FileOutputStream fos=null;
        try {
            File file = new File("E://c.txt");
            System.out.println("正在将刚刚读取到的文件内容写进"+path3);
            a.sleep(1000);
            StringBuilder sb5 = new StringBuilder();
            fos = new FileOutputStream(file);
            int t1=0;
            for(int i=0;i<sb.length()-temp;)
            {
                intial_Tree t2=x[list.size()*2-2];
                for(;i<sb.length()-temp;i++)
                {
                    if(t2.getLeft()==0&&t2.getRight()==0)
                    {
                        sb5.append(list.get(t1));
                        break;
                    }
                    if(sb.charAt(i)=='0')
                    {
                        t1=t2.getLeft();
                        t2=x[t2.getLeft()];
                    }
                    else if(sb.charAt(i)=='1')
                    {
                        t1=t2.getRight();
                        t2=x[t2.getRight()];
                    }
                }
            }
            sb5.append(list.get(t1));
            byte[] bytes = sb5.toString().getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(fos!=null){
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("写入完成");
        print();
    }
    public void print(){
        Set<Character> characters = map1.keySet();
        System.out.println(path1+"文件中不同字符个数"+list.size());
        for (Character character : characters) {
            System.out.println("字符:"+character+"\t编码:"+(String)map1.get(character)+"\t权重:"+map.get(character));
        }
    }
    public static void main(String[] args) {
        HumanTree t = new HumanTree();
        a = new Thread(t);
        a.start();
    }
}
