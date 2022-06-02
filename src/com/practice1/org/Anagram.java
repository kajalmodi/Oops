package com.practice1.org;
import java.util.*;
public class Anagram {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1=s.nextLine();
        System.out.print("Enter second string: ");
        String s2=s.nextLine();
        int l1=s1.length();
        int l2=s2.length();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int count=0;
        if(l1==l2)
        {
            for(int i=0;i<l1;i++)
            {
//                count=0;
                for(int j=0;j<l2;j++)
                {
                    if(c1[i]==c2[j])
                    {
                        count++;
                        break;
                    }

                }
            }
        }
        else
            System.out.println("Strings are not equal in length..");
        if(count==1)
        {
            System.out.println("Anagram..");
        }
        else
            System.out.println("Not anagram..");
    }
}
