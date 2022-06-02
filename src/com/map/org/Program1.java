package com.map.org;
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Map<Character,Integer> map1=new HashMap<Character,Integer>();
        map1.put('a',5);
        map1.put('b',2);
        System.out.println("value is: "+map1.get('b'));
    }
}
