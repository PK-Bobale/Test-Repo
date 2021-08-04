/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_2_q2;

/**
 *
 * @author Tejas
 */
public class Peri_Triangle extends Peri_Square
{
    void cal_triangle (int s1, int s2, int s3)
    {
        int peri_triangle;
        peri_triangle = s1 + s2 + s3;
        System.out.println("Perimeter of Triangle : (side 1 + side 2 + side 3) = " + peri_triangle);
    }
}
