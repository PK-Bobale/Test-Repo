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
public class Transpose_matrix 
{
    public static void main (String args [])
    {
        int array[][] =new int [3][3];
        System.out.println("Enter values for 3x3 matrix.");
        Scanner input =new Scanner(System.in);
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Entered matrix is : ");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of the entered matrix : ");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
