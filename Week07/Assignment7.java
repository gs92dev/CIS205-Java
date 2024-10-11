/*
 * Guilherme dos Santos
 * 10/10/2024
 * Right Triangle with method
 */

import java.util.Scanner;

public class Assignment7 {

    public static boolean isRightTriangle(double side1, double side2, double side3) {

        final double EPSILON = 1e-9; // Small tolerance value for comparing doubles
        // ------------------ Output variables ------------------
        double hypotenuse, cathetus1, cathetus2, squaredHypotenuse, squaredCathetus1, squaredCathetus2,
                summedSquaredCathetus;
        boolean rightTriangle;

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

        // ------------------ Calculations ------------------

        squaredHypotenuse = hypotenuse * hypotenuse;
        squaredCathetus1 = cathetus1 * cathetus1;
        squaredCathetus2 = cathetus2 * cathetus2;

        summedSquaredCathetus = squaredCathetus1 + squaredCathetus2;

        rightTriangle = (Math.abs(squaredHypotenuse - summedSquaredCathetus) < EPSILON);

        return rightTriangle;
    }

    public static void main(String args[]) {
        // ------------------ Scanner ------------------
        Scanner input = new Scanner(System.in);
        // ------------------ Variables ------------------
        // input variables
        double side1, side2, side3;

        // ------------------ User inputs ------------------
        System.out.println("Enter the first side of the triangle: ");
        side1 = input.nextDouble();

        System.out.println("Enter the second side of the triangle: ");
        side2 = input.nextDouble();

        System.out.println("Enter the third side of the triangle: ");
        side3 = input.nextDouble();

        System.out.println("The sides are: " + side1 + ", " + side2 + ", " + side3);

        // ------------------ Calling the method ------------------
        if (isRightTriangle(side1, side2, side3)) {
            // ------------------ Output ------------------
            System.out.println("The triangle is a right triangle.");
        } else {
            // ------------------ Output ------------------
            System.out.println("The triangle is not a right triangle.");
        }

        // close scanner
        input.close();
    }

}
