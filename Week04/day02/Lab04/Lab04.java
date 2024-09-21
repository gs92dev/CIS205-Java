/*
 * Guilherme dos Santos
 * Lab 04 - Movie Tickets
 * 09/12/2024
 */
package Lab04;

import java.util.Scanner;

public class Lab04 {
    public static void main(String args[]) {
        // ------------------ Scanner ------------------
        Scanner input = new Scanner(System.in);
        // ------------------ Variables ------------------
        // input variables

        int availableTickets = 100;
        int purchasedTickets = 0;

        // ------------------ Output variables ------------------
        int totalPurchasedTickets = 0;
        // ------------------ User inputs ------------------
        System.out.println("Welcome to the Movie Theater Ticket Sales System!");
        System.out.println("Total available seats: " + availableTickets);

        // ------------------ Comparing doubles ------------------
        while (availableTickets > 0) {
            System.out.println("How many tickets would you like to purchase?");
            purchasedTickets = input.nextInt();

            if (purchasedTickets > availableTickets) {
                System.out.println("Sorry, you cannot purchase " + purchasedTickets);
                System.out.println(" Only " + availableTickets + " seats are available.");
                purchasedTickets = 0;
            } else if (purchasedTickets < availableTickets) {
                availableTickets -= purchasedTickets;
                System.out.println("You have purchased " + purchasedTickets + " tickets.");
                System.out.println(availableTickets + " seats remaining.");
            } else {
                availableTickets -= purchasedTickets;
                System.out.println("You have purchased " + purchasedTickets + " tickets.");
                System.out.println(availableTickets + " seats remaining.");
            }

            totalPurchasedTickets += purchasedTickets;
        }
        System.out.println("All tickets have been sold out!");
        System.out.println("Total tickets sold: " + totalPurchasedTickets);

        // close scanner
        input.close();
    }
    /*
     * Output:
     * All tickets:
     * Welcome to the Movie Theater Ticket Sales System!
     * Total available seats: 100
     * How many tickets would you like to purchase?
     * 
     * More tickets than available:
     * Welcome to the Movie Theater Ticket Sales System!
     * Total available seats: 100
     * How many tickets would you like to purchase?
     * 150
     * Sorry, you cannot purchase 150
     * Only 100 seats are available.
     * How many tickets would you like to purchase?
     * 100
     * You have purchased 100 tickets.
     * 0 seats remaining.
     * All tickets have been sold out!
     * Total tickets sold: 100
     * 
     * Less tickets than available:
     * Welcome to the Movie Theater Ticket Sales System!
     * Total available seats: 100
     * How many tickets would you like to purchase?
     * 35
     * You have purchased 35 tickets.
     * 65 seats remaining.
     * How many tickets would you like to purchase?
     * 4
     * You have purchased 4 tickets.
     * 61 seats remaining.
     * How many tickets would you like to purchase?
     * 25
     * You have purchased 25 tickets.
     * 36 seats remaining.
     * How many tickets would you like to purchase?
     * 13
     * You have purchased 13 tickets.
     * 23 seats remaining.
     * How many tickets would you like to purchase?
     * 45
     * Sorry, you cannot purchase 45
     * Only 23 seats are available.
     * How many tickets would you like to purchase?
     * 13
     * You have purchased 13 tickets.
     * 10 seats remaining.
     * How many tickets would you like to purchase?
     * 15
     * Sorry, you cannot purchase 15
     * Only 10 seats are available.
     * How many tickets would you like to purchase?
     * 9
     * You have purchased 9 tickets.
     * 1 seats remaining.
     * How many tickets would you like to purchase?
     * 2
     * Sorry, you cannot purchase 2
     * Only 1 seats are available.
     * How many tickets would you like to purchase?
     * 3
     * Sorry, you cannot purchase 3
     * Only 1 seats are available.
     * How many tickets would you like to purchase?
     * 1
     * You have purchased 1 tickets.
     * 0 seats remaining.
     * All tickets have been sold out!
     * Total tickets sold: 100
     * 
     */
}
