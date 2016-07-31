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

class MyOwnException extends Exception
{
    public MyOwnException(String message)
    {
        super(message);
    }
}

public class ThrowExample {
    
    static void employeeAge(int age) throws MyOwnException
    {
        if(age < 0)
        {
            throw new MyOwnException("Age can't be less than zero");
        }else{
            System.out.println("Age is valid!");
        }
    }
    
    public static void main(String[] args)
    {
        try{
            employeeAge(-1);
        }catch(MyOwnException e)
        {
            e.printStackTrace();
        }
    }
    
}


