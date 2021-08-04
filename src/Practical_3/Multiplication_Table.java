/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_3;
import java.util.Scanner;
/**
 *
 * @author Tejas
 */
public class Multiplication_Table 
{
    public static void main (String args [])
    {
        System.out.println ("Enter a number to obtain it's multiplication table");
        Scanner input =new Scanner(System.in);
        int value = input.nextInt();
        System.out.println("Multiplication table of  " + value);
        for (int i=1; i<=10; i++)
        {
            int multiply = value * i;
            System.out.println(value + " x " + i + " = " + multiply );
        }
    }
}
