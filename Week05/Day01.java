import java.util.Scanner;

public class Day01 {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        // int[] myArr1 = { 4, 2, 3, 4, 5 };
        // int[] myArr2 = new int[5];
        // System.out.println(myArr2[0]);
        // System.out.println(myArr1[3]);

        // int size = myArr1.length;
        // // int size2 = myArr2.length;

        // for (int i = 0; i < size; i++) {
        // System.out.print(myArr1[i] + " ");
        // }

        // for (int i = 0; i < size2; i++) {
        // System.out.println("Enter a number: ");
        // myArr2[i] = userIn.nextInt();
        // }

        // for (int item : myArr2) {
        // System.out.print(item + " ");
        // }

        // int index = -1;

        // for (int i = 0; i < size; i++) {
        // if (myArr1[i] == 4) {
        // index = i;
        // break;
        // }
        // }

        // System.out.println("\nindex " + index);
        // if (index == -1) {
        // System.out.println("Not found");
        // } else {
        // System.out.println("Found at index " + index);

        // }
        int[][] myArr = {
                { 1, 2, 3 },
                { 4, 5, 6, },
                { 7, 8, 9 }
        };

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println();
        }
        userIn.close();

    }
}