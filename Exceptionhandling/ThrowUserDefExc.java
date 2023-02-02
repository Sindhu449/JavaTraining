package com.java.Exceptionhandling;

class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {   
        super(str);
    }  
}  

public class ThrowUserDefExc  
{  
    public static void main(String args[])  
    {  
        try  
        {  
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ude)  
        {  
            System.out.println("Caught the exception");  
            System.out.println(ude.getMessage());  
        }  
    }  
}   