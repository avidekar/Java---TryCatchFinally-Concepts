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
 public class FInallyExample {
    
    public static int method()
    {
        try{
            return 0;
        }finally
        {
            System.out.println("Inside finally block");
            return 19;
        }
    }
    
    public static void main(String[] args)
    {
        FInallyExample.method();
    }
}
