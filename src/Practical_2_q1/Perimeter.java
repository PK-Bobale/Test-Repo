/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_2_q1;

/**
 *
 * @author Tejas
 */
import java.util.Scanner;

public class Perimeter extends Peri_Square
{
    public static void main (String args [])
    {
       System.out.println("Enter side of square");
       Scanner input = new Scanner(System.in);
       int value = input.nextInt();
       Perimeter peri_square =new Perimeter();
       peri_square.cal_perimeter(value);
        
        
        
    }
}
