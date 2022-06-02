package com.polymorphism.org;

import org.w3c.dom.ls.LSOutput;

class A
{
    public void show()
    {
        System.out.println("inside a");
    }
    public void print()
    {
        System.out.println("print inside a");
    }
}
class B extends A
{
    
    public void show()
    {
        System.out.println("inside B");
    }
    public void print()
    {
        System.out.println("print inside B");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
        obj.print();
    }
}
