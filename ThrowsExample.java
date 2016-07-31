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
import java.io.*;

class MyException {
    void myMethod(int num) throws IOException, ClassNotFoundException
    {
        if(num==1)
        {
            throw new IOException("IOException handled");
        }else {
            throw new ClassNotFoundException("ClassNotFoundException handled");
        }
    }
}

class ThrowsExample {
    
    public static void main(String[] args)
    {
        try
        {
        MyException obj = new MyException();
        obj.myMethod(2);
        }catch(Exception e)
        {
            System.out.println(e);
            test();
        }
    }
    
    public static void test()
    {
        System.out.println("test");
    }
}
