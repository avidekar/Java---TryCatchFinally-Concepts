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
public class TestGarbage1 {
    public static void main(String[] args)
    {
        TestGarbage1 test = new TestGarbage1();
        System.out.println("Main is completed");
    }
    
    public void finalize()
    {
        System.out.println("Rest in Peace!");
    }
}
