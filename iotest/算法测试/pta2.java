package iotest.算法测试;

import java.util.*;

public class pta2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String name = sc.next();
            if(name.equals("noname"))break;
            String phone = sc.next();
            map.put(name,phone);
        }
        String name = sc.next();
        if(map.containsKey(name)){
            System.out.println((String)map.get(name));
        }else System.out.println("Not found.");

    }
}
