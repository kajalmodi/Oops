package com.practice1.org;
import java.util.*;

public class Palindrome {
    public static int check_palindrome(int num)
    {
        int temp=num,sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        if(sum==num)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=s.nextInt();
        if(check_palindrome(num)==1)
            System.out.println("Number is palindrome.");
        else
            System.out.println("Number is not palindrome.");
    }
}
