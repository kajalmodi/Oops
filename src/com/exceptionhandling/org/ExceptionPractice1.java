package com.exceptionhandling.org;

public class ExceptionPractice1 {
    public static int divide(int a, int b) throws DivideByZero
    {
        if(b==0)
        {
            throw new DivideByZero();
        }
        return a/b;
    }
    public static void main(String[] args)
    {
        try
        {
            divide(10,0);
            System.out.println("Within try block.");
        }
        catch (DivideByZero e)
        {
            System.err.println("Divide by zero exception is raised..");
        }
        System.err.println("Out of try and catch block..");
    }
}
