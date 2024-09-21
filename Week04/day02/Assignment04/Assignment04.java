package Assignment04;

import java.util.Scanner;

/*
 * Guilherme dos Santos
 * Assignment 04 - right triangle
 * 09/12/2024
 */

public class Assignment04 {
        public static void main(String args[]) {
                // ------------------ Scanner ------------------
                Scanner input = new Scanner(System.in);
                // ------------------ Variables ------------------
                // input variables

                double side1, side2, side3;

                // ------------------ Output variables ------------------
                final double EPSILON = 1e-9; // Small tolerance value for comparing doubles
                double hypotenuse, cathetus1, cathetus2, squaredHypotenuse, squaredCathetus1, squaredCathetus2;
                boolean rightTriangle;

                // ------------------ User inputs ------------------
                System.out.println("Enter the first side of the triangle: ");
                side1 = input.nextDouble();

                System.out.println("Enter the second side of the triangle: ");
                side2 = input.nextDouble();

                System.out.println("Enter the third side of the triangle: ");
                side3 = input.nextDouble();

                // ------------------ Comparing doubles ------------------

                // boolean side = (Math.abs(side1 - side2) < EPSILON);
                // System.out.println(side);
                // ------------------ Verify the longest side ------------------
                if ((Math.abs(side1 - side2) < EPSILON) && (Math.abs(side1 - side3) < EPSILON)) {
                        hypotenuse = side1;
                        cathetus1 = side2;
                        cathetus2 = side3;
                } else if ((Math.abs(side2 - side1) < EPSILON) && (Math.abs(side2 - side3) < EPSILON)) {
                        hypotenuse = side2;
                        cathetus1 = side1;
                        cathetus2 = side3;
                } else {
                        hypotenuse = side3;
                        cathetus1 = side1;
                        cathetus2 = side2;
                }

                System.out.println("The hypotenuse is: " + hypotenuse);
                System.out.println("The cathetus 1 is: " + cathetus1);
                System.out.println("The cathetus 2 is: " + cathetus2);

                // ------------------ Calculations ------------------

                squaredHypotenuse = hypotenuse * hypotenuse;
                squaredCathetus1 = cathetus1 * cathetus1;
                squaredCathetus2 = cathetus2 * cathetus2;

                rightTriangle = squaredHypotenuse == (squaredCathetus1 + squaredCathetus2);

                if (rightTriangle) {
                        // ------------------ Output ------------------
                        System.out.println("The triangle is a right triangle.");
                } else {
                        // ------------------ Output ------------------
                        System.out.println("The triangle is not a right triangle.");
                }

                // close scanner
                input.close();
        }

        /*
         * output:
         * 
         * 
         * 
         */

}
