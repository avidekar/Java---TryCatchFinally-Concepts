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
public class TestGarbage {
    @Override
    public void finalize() throws Throwable 
    {
        //super.finalize(); check for answers
        System.out.println("Object is garbage collected");
        
    }
    public static void main(String[] args)
    {
        TestGarbage t1 = new TestGarbage();
        TestGarbage t2 = new TestGarbage();
        t1 = null;
        t2=null;
        //t1.finalize(); //will throw an error. run-time exception. NullPointerException
        System.gc();
    }
}
