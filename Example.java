/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author avidekar
 */
public class Example {
    public static void main(String[] args)
    {
        Example e1 = new Example();
        Example e2 = new Example();
        Lock lock = new ReentrantLock(); //gaining lock method. IMP* study
        
        e1=null;
        e2=null;
        System.gc();
        int num1, num2;
        try
        {
            num1 = 0;
            num2 = 62/num1;
        }
        catch (ArithmeticException e) 
        { 
            //System.gc();
            System.out.println("Inside arithmetic exception");
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Inside normal exception");
        }
        finally
        {
            System.out.println("Inside finally block!");
            System.gc();
           
        }
    }
    
    public void finalize()
    {
        System.out.println("Inside finalize block");
    }
}
