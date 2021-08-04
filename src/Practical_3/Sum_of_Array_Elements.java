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
public class Sum_of_Array_Elements 
{
   public static void main (String args [])
   {
    int [] array =new int [5];
    System.out.println ("Enter elements for array (input 5 values).");
    int i;
    for (i =0;i< 5; i++ )
    {
       Scanner input =new Scanner (System.in);
       array[i]= input.nextInt();
    }
    int sum=0;
    for (i=0; i<5; i++)
    {
        sum = sum + array[i];
    }
   System.out.println("Total of entered elements = " + sum);
   }
}
