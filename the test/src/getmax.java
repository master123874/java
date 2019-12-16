public class getmax {
    static int getmax(String a,String b){
        int t=Math.min(a.length(),b.length());
        int m=Math.max(a.length(),b.length())-t;
        for(int i=0;i<t;i++){
            String t2=a.substring(i);
            String t1=b.substring(m+i);
            if(t2.equals(t1))return i+1;
        }
        return 0;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(getmax(a,b)>0)System.out.println("The common suffix is "+ a.substring(getmax(a,b)-1)+".");
        else System.out.println("No common suffix.");
    }
}
