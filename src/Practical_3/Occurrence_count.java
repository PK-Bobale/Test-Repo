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
public class Occurrence_count 
{
    public static void main (String args [])
    {
        int [] array = {2,4,3,3,5,2,3,7,8,9,4,3,3,2,6};
        System.out.println ("Enetr a number between 0-9");
        Scanner input =new Scanner(System.in);
        int key = input.nextInt();
        int i, sum=0;
        for (i=0; i<array.length; i++)
        {
            if (key == array[i])
            {
                sum = sum + 1;
            }
        }
        System.out.println("The entered number has occurred " + sum + " times");
        
    }
}
