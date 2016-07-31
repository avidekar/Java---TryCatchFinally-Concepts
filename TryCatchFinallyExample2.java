/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch;

/**
 *
 * @author avidekar
 */
public class TryCatchFinallyExample2 {
    
    public static void main(String[] args)
    {
        try{
            System.out.println("Inside try block");
            int num = 45/0;
            System.out.println(num);
        }catch(ArrayIndexOutOfBoundsException e) 
        {//if exception is caught then "Outside ..." will be executed, else only till finally. :X
            System.out.println("The exception is "+e);
        }finally{
            System.out.println("Inside the finally block");
        }
        
        System.out.println("Outside try-catch-finally block");
    }
    
}
