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
public class NestedTryCatch {
    
    public static void main(String[] args)
    {
        try
        {
            try
            {
//                int check1 = 40/0;
//                System.out.println(check1);
                
                try
                {
                    int check = 40/0;
                    System.out.println(check);
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Inside the third try-catch block "+e);
                }
            }catch(ArrayStoreException e)
            {
                System.out.println("Inside the second try-catch block "+e);
            }
        }catch(ArithmeticException e)
        {
            System.out.println("Inside the first try-catch block = "+e);
        }
    }
    
}
