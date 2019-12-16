import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class thesecond {
    static Random sc = new Random();
    static int num=10;
    public static void shuffle(ArrayList<Number> list){
        int[] a= new int[list.size()];
        for(int i=0;i<num;i++){
            int t=sc.nextInt(list.size());
            a[i] =list.get(t).intValue();
            list.remove(t);
        }
        list.clear();
        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }
        System.out.print("打乱后的数组:");
        System.out.println(list);
    }
    public static void main(String[] args){
        thesecond p = new thesecond();
        Scanner sc = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<>();
        for(int i=0;i<num;i++){
            int t =sc.nextInt();
            list.add(t);
        }
        System.out.print("打乱前的元素");
        System.out.println(list);
        shuffle(list);
    }
}
