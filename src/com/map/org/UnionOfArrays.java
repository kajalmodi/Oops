package com.map.org;

import java.util.*;

public class UnionOfArrays {
    public static void unionOfArray(int a[],int b[])
    {
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> list=new ArrayList<>();

        //storing the integer with frequency in map
        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }

        for(int i=0;i<b.length;i++)
        {
            set.add(b[i]);
        }
        for(int num: set){
            list.add(num);
        }

        for(int num: list){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int t=s.nextInt();

        System.out.println("Enter size of first array: ");
        int m=s.nextInt();

        System.out.println("Enter elements of first array: ");
        int a[]= new int[m];

        for(int i=0;i<m;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int n=s.nextInt();

        System.out.println("Enter elements of second array: ");
        int b[]= new int[n];

        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
        }
        unionOfArray(a,b);
    }
}
