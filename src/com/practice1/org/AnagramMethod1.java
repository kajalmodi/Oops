package com.practice1.org;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramMethod1 {
        public static void main(String[] args)
        {
            Scanner s =new Scanner(System.in);
            System.out.println("Enter string 1: ");
            String s1=s.next();
            System.out.println("Enter second string: ");
            String s2=s.next();
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean result=Arrays.equals(c1,c2);
            if(result==true)
                System.out.println("Anagram..");
            else
                System.out.println("Not Anagram..");
        }
    }


