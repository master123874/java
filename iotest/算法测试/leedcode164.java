package iotest.算法测试;
public class leedcode164 {
    public static boolean isAlienSorted(String[] words, String order) {
        if(words.length<2)return true;
        for(int i=0;i<words.length-1;i++){
            int j,k;
            boolean flag = false;
            for(j=0,k=0;j<words[i].length()&&k<words[i+1].length();j++,k++){
                if(order.indexOf(words[i].charAt(j))>order.indexOf(words[i+1].charAt(k))){
                    break;
                }else if(order.indexOf(words[i].charAt(j))<order.indexOf(words[i+1].charAt(k))) flag =true;
            }
            if(!flag)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] a = {"hello","lee"};
        String b = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(a,b));
    }
}
