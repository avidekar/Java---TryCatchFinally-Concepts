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
public class TryCatchFinallyExample {
    public static void main(String[] args)
    {
        try{
            int num = 45/3;
        }catch(Exception e)
        {
            System.out.println(e);
        }finally{
            System.out.println("Inside FInally block");
        }
        System.out.println("CHECK");
        TryCatchFinallyExample.test();
    }
    
    public static void test()
    {
        System.out.println("TEST");
    }
}
