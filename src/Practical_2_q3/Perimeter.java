/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_2_q3;

/**
 *
 * @author Tejas
 */
public class Perimeter implements Peri_Square, Peri_Triangle
{
    public void cal_square (int side)
    {
        int peri_square;
        peri_square = 4 * side;
        System.out.println("Perimeter of Square = " + peri_square);
    }
    
    public void cal_triangle (int s1, int s2, int s3)
    {
        int peri_triangle;
        peri_triangle = s1 + s2 + s3;
        System.out.println("Perimeter of Triangle = " + peri_triangle);
    }
    
    public void perimeter (int sq, int tri_a, int tri_b, int tri_c)
    {
        int square_perimeter = 4*sq;
        int triangle_perimeter = tri_a + tri_b + tri_c;
        System.out.println("Perimeter class:");
        System.out.println("Perimeter of square = " + square_perimeter);
        System.out.println("Perimeter of triangle = " + triangle_perimeter);
    }
    
    public static void main (String args[])
    {
        Perimeter p =new Perimeter();
        p.perimeter(7, 6, 8, 9);
        
        System.out.println("Interfaces :");
        Peri_Square psq =new Perimeter();
        psq = p;
        p.cal_triangle(4, 5, 6);
        Peri_Triangle ptri =new Perimeter();
        ptri = p;
        p.cal_square(10);
    }
}

