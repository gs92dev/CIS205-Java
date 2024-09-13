/*
 * Guilherme dos Santos
 * Class activity 03
 * 09/12/2024
 */

public class ClassActivity03 {

    public static void main(String[] args) {
        int a = -10;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
        if (a < 0) {
            a *= -1;
            System.out.println(a);
        }
        switch (a) {
            case 11:
                System.out.println("a is 11");
                break;

            case 15:
                System.out.println("a is 15");
                break;
            case 10:
                System.out.println("a is 10");
                break;

            default:
                System.out.println("a is not 11 or 15");
                break;
        }

    }

}