package com.abstractiom.org;

abstract class Human
{
    public abstract void eat();
    public void walk()
    {
        System.out.println("A person is walking..");
    }
}
class Man extends Human
{
    public void eat()
    {
        System.out.println("Man is eating..");
    }
}

public class AbstractionDemo {
    public static void main(String[] args)
    {
        Human obj=new Man();
        obj.eat();
        obj.walk();
    }
}
