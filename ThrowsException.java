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
public class ThrowsException {
    
    static void throwMethod() 
    {
        System.out.println("Inside throwMethod");
        throw new NullPointerException ("demo");
    }
    
    public static void main(String[] args)
    {
        try
        {
            throwMethod();
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception caught!");
        }
        catch(Exception e)
        {
            System.out.println("Exception thrown is - "+e);
        }
    }
    
}
