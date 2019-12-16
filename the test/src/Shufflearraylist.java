import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Shufflearraylist {
    static Random sc = new Random();
    static int num=10;

    public Shufflearraylist() {
    }

    public static void shuffle(ArrayList<Number> list){
        int[] a= new int[list.size()];
        for(int i=0;i<list.size();i++){
            a[i] =(int)list.get(sc.nextInt(list.size()));
        }
        list.clear();
        for(int i=0;i<list.size();i++){
            list.add(a[i]);
        }
        System.out.print("打乱后的数组:");
        System.out.println(list);
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<>();
        for(int i=0;i<num;i++){
            int t =sc.nextInt();
            list.add(t);
        }
        System.out.print("打乱前的元素");
        System.out.println(list);
    }
}
