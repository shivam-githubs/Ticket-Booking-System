package TicketBookingSystem;

import java.util.Scanner;


public class BoxOffice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b;
        Theater th = new Theater("Prajyot Movie Center");

        System.out.println("Welcome to Prajyot Movie Center!");

        do {
            System.out.println("\n*************** Menu ****************");
            System.out.println("1. Book tickets");
            System.out.println("2. Cancel tickets");
            System.out.println("3. Show available seats");
            System.out.println("4. Show Movie Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                	sc.nextLine();
                    System.out.print("Enter the movie name ");
                    String  movie = sc.nextLine();
                    System.out.print("How many tickets do you want to book? ");
                    int numTickets = sc.nextInt();
                    th.setQs(new Ticket(movie, numTickets));
                    th.ticket_book();
                    break;
                case 2:
                	System.out.print("How many tickets do you want to Cancel? ");
                    int c = sc.nextInt();
                    th.cancelTicket(c);
                    break;
                case 3:
                    th.seatAvalbility();
                    break;
                case 4:
                    th.showDetail();
                    break;
                case 5:
                    System.out.println("Thank you for using Prajyot Movie Center!");
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

            System.out.print("\nDo you want to continue (Y/N)? ");
            b = sc.next();

        } while (b.equalsIgnoreCase("Y"));

        System.out.println("Thank you for using Prajyot Movie Center!");
    }
}

