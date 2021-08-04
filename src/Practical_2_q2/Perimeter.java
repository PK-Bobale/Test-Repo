/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_2_q2;
import java.util.Scanner;
/**
 *
 * @author Tejas
 */
public class Perimeter extends Peri_Triangle
{
    public static void main (String args[])
    {
        System.out.println("Enter sides of triangle.");
        Scanner value =new Scanner(System.in);
        int tri_s1, tri_s2, tri_s3;
        tri_s1 = value.nextInt();
        tri_s2 = value.nextInt();
        tri_s3 = value.nextInt();
        System.out.println("Enter side of square.");
        int s;
        s = value.nextInt();
        
        Perimeter p =new Perimeter();
        p.cal_triangle(tri_s1, tri_s2, tri_s3);
        p.cal_square(s);
    }
}
