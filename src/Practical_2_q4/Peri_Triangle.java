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
public class Peri_Triangle extends Perimeter 
{
        
    public static void main (String args [])
    {
        System.out.println("Enter sides of triangle.");
        Scanner value =new Scanner(System.in);
        int tri_s1, tri_s2, tri_s3;
        tri_s1 = value.nextInt();
        tri_s2 = value.nextInt();
        tri_s3 = value.nextInt();
       
        Peri_Triangle p =new Peri_Triangle();
        p.cal_triangle(tri_s1, tri_s2, tri_s3);
    }

}

