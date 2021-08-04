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
public class Triangle_Type 
{
        public static void main (String args [])
    {
        int a1, a2, a3;
        System.out.println("Enter angles for triangle.");
        Scanner input =new Scanner(System.in);
        a1 = input.nextInt();
        a2 = input.nextInt();
        a3 = input.nextInt();
        
        if ((a1==a2 & a1==a3)&(a1==60 & a2==60 & a3==60))
        {
            System.out.println ("It is an equilateral triangle.");
        }
        else if (a1==a2 | a1==a3)
        {
            System.out.println ("It is an isoceles triangle.");
        }
        else
        {
            System.out.println ("It is a scalene triangle.");
        }
    }
}
