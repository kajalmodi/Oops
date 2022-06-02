package com.map.org;
import java.util.*;
public class IntersectionOfTwoArrays {
    public static void intersectionOfArray(int a[],int b[])
    {

        //Initializing map and ArrayList
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();

        //storing the integer with frequency in map
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                int temp = map.get(a[i]);
                map.put(a[i],temp++);
            }
            else
                map.put(a[i],1);
        }
        // System.out.println(map1.values());

        //comparing the values in map with second array values
        for(int i=0;i<b.length;i++)
        {
            if(map.containsKey(b[i]))
            {
                list.add(b[i]);
                int temp = map.get(b[i]);
                map.put(b[i], temp--);
                if(map.get(b[i])==0)
                    map.remove(b[i]);
            }
        }
        //erase the map after use
        map.clear();

        //print the resultant list
        for(int num : list){
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
        intersectionOfArray(a,b);
    }
}