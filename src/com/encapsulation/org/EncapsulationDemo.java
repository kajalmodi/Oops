package com.encapsulation.org;

class Student
{
    private int roll_no;
    private double marks;
    public void set_roll(int r)
    {
        roll_no=r;
        marks=95;
    }
    public int get_roll()
    {
        return roll_no;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.set_roll(10);
        System.out.println("Roll no. of student is: "+s1.get_roll());
    }
}
