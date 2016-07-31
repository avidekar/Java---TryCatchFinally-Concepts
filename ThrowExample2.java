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
public class ThrowExample2 {

    static int sum(int a, int b)
    {
        if(a == 0)
        {
            throw new ArithmeticException("Bitch! Number cannot be equal to zero!");
        }else{
            System.out.println("Both the parameters are correct");
            return a + b;
        }
    }
    
    public static void main(String[] args)
    {
        int addition = sum(0,12);
        System.out.println(addition);
        System.out.println("Continue Next statements");
    }
}
