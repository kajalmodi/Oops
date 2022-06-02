package com.polymorphism.org;

class Area
{
    public void area(int a,int b)
    {
        System.out.println("Area of rectangle is: "+a*b);
    }
    public void area(int a,int b,int c)
    {
        System.out.println("Area of cuboid is:"+ 2*(a*b+b*c+c*a));
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Area a= new Area();
        a.area(10,30);
        a.area(24,36,45);
    }
}
