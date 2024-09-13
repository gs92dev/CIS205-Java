import java.util.Scanner;

/*
 * Guilherme dos Santos
 * Lab03 - right triangle
 * 09/12/2024
 */

public class Lab3 {
        public static void main(String args[]) {
                // ------------------ Scanner ------------------
                Scanner input = new Scanner(System.in);
                // ------------------ Variables ------------------
                // input variables

                int side1, side2, side3;

                // ------------------ Output variables ------------------

                int hypotenuse, cathetus1, cathetus2, squaredHypotenuse, squaredCathetus1, squaredCathetus2;
                boolean rightTriangle;

                // ------------------ User inputs ------------------
                System.out.println("Enter the first side of the triangle: ");
                side1 = input.nextInt();

                System.out.println("Enter the second side of the triangle: ");
                side2 = input.nextInt();

                System.out.println("Enter the third side of the triangle: ");
                side3 = input.nextInt();

                // ------------------ Verify the longest side ------------------
                if (side1 > side2 && side1 > side3) {
                        hypotenuse = side1;
                        cathetus1 = side2;
                        cathetus2 = side3;
                } else if (side2 > side1 && side2 > side3) {
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

                if (rightTriangle == true) {
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
         * right triangle
         * Enter the first side of the triangle:
         * 3
         * Enter the second side of the triangle:
         * 4
         * Enter the third side of the triangle:
         * 5
         * The hypotenuse is: 5
         * The cathetus 1 is: 3
         * The cathetus 2 is: 4
         * The triangle is a right triangle.
         * 
         * Not a right triangle:
         * Enter the first side of the triangle:
         * 12
         * Enter the second side of the triangle:
         * 20
         * Enter the third side of the triangle:
         * 45
         * The hypotenuse is: 45
         * The cathetus 1 is: 12
         * The cathetus 2 is: 20
         * The triangle is not a right triangle.
         * 
         */

}
