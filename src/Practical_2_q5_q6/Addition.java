/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_2_q5_q6;

/**
 *
 * @author Tejas
 */
 class Calculator
{
  int add (int num1, int num2)
  {
      int add2num = num1 + num2;
      System.out.println("Inside Parent class");
      System.out.println("Addition of two numbers = " + add2num);
      return 0;
  }
}
public class Addition extends Calculator 
{
      int add (int num1, int num2)
  {
      int add2num = num1 + num2;
      System.out.println("Inside Child class");
      System.out.println("Addition of two numbers = " + add2num);
      return 0;
  }
    int add (int num1, int num2, int num3)
    {
        int add3num = num1 + num2 + num3 ;
        System.out.println("Addition of three numbers = " + add3num);
       return 0;
    }
    
    public static void main (String args [] )
    {
       Calculator cal =new Calculator();
        cal.add(25, 42);
        
        cal =new Addition();
        cal.add(30, 20);
        
        Addition a =new Addition();
        a.add(5,10,15);
    }
}
