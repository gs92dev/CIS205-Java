package Assignment04;

import java.util.Scanner;

/*
 * Guilherme dos Santos
 * Assignment 04 - right triangle
 * 09/21/2024
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
                double hypotenuse, cathetus1, cathetus2, squaredHypotenuse, squaredCathetus1, squaredCathetus2,
                                summedSquaredCathetus;
                boolean rightTriangle;

                // ------------------ User inputs ------------------
                System.out.println("Enter the first side of the triangle: ");
                side1 = input.nextDouble();

                System.out.println("Enter the second side of the triangle: ");
                side2 = input.nextDouble();

                System.out.println("Enter the third side of the triangle: ");
                side3 = input.nextDouble();

                // ------------------ Comparing doubles ------------------

                // ------------------ Verify the longest side ------------------
                if ((side1 > side2) && (side1 > side3)) {
                        hypotenuse = side1;
                        cathetus1 = side2;
                        cathetus2 = side3;
                } else if ((side2 > side1) && (side2 > side3)) {
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

                summedSquaredCathetus = squaredCathetus1 + squaredCathetus2;

                System.out.println("The difference between the squared number is: "
                                + Math.abs(squaredHypotenuse - summedSquaredCathetus));

                rightTriangle = (Math.abs(squaredHypotenuse - summedSquaredCathetus) < EPSILON);

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
         * Not a right triangle:
         * Enter the first side of the triangle:
         * 7.3
         * Enter the second side of the triangle:
         * 2.5
         * Enter the third side of the triangle:
         * 6.8
         * The hypotenuse is: 7.3
         * The cathetus 1 is: 2.5
         * The cathetus 2 is: 6.8
         * The difference between the squared number is: 0.8000000000000043
         * The triangle is not a right triangle.
         * 
         * Is a right triangle:
         * Enter the first side of the triangle:
         * 1.5
         * Enter the second side of the triangle:
         * 2.0
         * Enter the third side of the triangle:
         * 2.5
         * The hypotenuse is: 2.5
         * The cathetus 1 is: 1.5
         * The cathetus 2 is: 2.0
         * The difference between the squared number is: 0.0
         * The triangle is a right triangle.
         * 
         * 
         */

}
