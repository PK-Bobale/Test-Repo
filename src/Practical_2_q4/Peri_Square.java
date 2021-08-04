/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_2_q4;
import java.util.Scanner;
/**
 *
 * @author Tejas
 */
public class Peri_Square extends Perimeter
{
    
    public static void main (String args [])
    {
        System.out.println("Enter side of square.");
        Scanner value =new Scanner(System.in);
        int s;
        s = value.nextInt();
        Peri_Square p =new Peri_Square();
        p.cal_square(s);
        
    }
}
