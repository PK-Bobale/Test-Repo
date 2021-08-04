/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_2_q5_q6;
import java.util.Scanner;
/**
 *
 * @author Tejas
 */
public class Area 
{
   float cal_area (float side)
   {
       float square_area = side*side;
       System.out.println("Area of square = " + square_area + " sq units");
       return 0;
   }
   
   float cal_area (float length, float breadth)
   {
       float rectangle_area = length*breadth;
       System.out.println("Area of Rectangle = " + rectangle_area + " sq units");
       return 0;
   }
   
   public static void main (String args [])
   {
       Scanner value =new Scanner (System.in);
       Area a =new Area();
       
       System.out.println("Enter side of square.");
       float s = value.nextFloat();
       a.cal_area(s);
       
       
       System.out.println("Enter length and breadth of rectangle.");
       float l = value.nextFloat();
       float b = value.nextFloat();
       a.cal_area(l, b);
   }
}
