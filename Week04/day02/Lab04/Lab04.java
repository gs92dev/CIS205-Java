package Lab04;

import java.util.Scanner;

/*
 * Guilherme dos Santos
 * Lab 04 - Movie Tickets
 * 09/12/2024
 */

public class Lab04 {
    public static void main(String args[]) {
        // ------------------ Scanner ------------------
        Scanner input = new Scanner(System.in);
        // ------------------ Variables ------------------
        // input variables

        int avaibleTickets = 100;

        // ------------------ Output variables ------------------

        // ------------------ User inputs ------------------
        System.out.println("Welcome to the Movie Theater Ticket Sales System!");
        System.out.println("Total available seats: " + avaibleTickets);

        // ------------------ Comparing doubles ------------------
        while (avaibleTickets > 0) {
            System.out.println("How many tickets would you like to purchase?");
            int tickets = input.nextInt();

            if (tickets > avaibleTickets) {
                System.out.println(
                        "Sorry, you cannot purchase " + tickets + " Only " + avaibleTickets + "seats are available.");
            } else {
                avaibleTickets -= tickets;
                System.out.println("You have purchased " + tickets + " tickets." + avaibleTickets + "seats remaining.");
            }

        }
        System.out.println("All tickets have been sold out!");
        System.out.println("Total tickets sold: 100");

        // ------------------ Verify the longest side ------------------

        // ------------------ Calculations ------------------

        // close scanner
        input.close();
    }

}
