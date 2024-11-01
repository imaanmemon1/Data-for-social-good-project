import java.util.Scanner;

public class DataRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketPromoter promoter = new TicketPromoter("venues.txt", "ticketsSold.txt", "ticketsAvailable.txt", "revenues.txt");

        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Taylor Swift Concert Ticket Promoter!");
            System.out.println("Choose an option:");
            System.out.println("1. Find revenue for a specific venue");
            System.out.println("2. Get total tickets sold");
            System.out.println("3. Get average revenue per venue");
            System.out.println("4. List all concert information");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                System.out.print("Enter the venue name: ");
                String venue = scanner.nextLine();
                System.out.println(promoter.findVenueRevenue(venue));
            } else if (choice == 2) {
                System.out.println("Total tickets sold: " + promoter.totalTicketsSold());
            } else if (choice == 3) {
                System.out.println(promoter.averageRevenuePerVenue());
            } else if (choice == 4) {
                System.out.print(promoter.toString());
            } else if (choice == 5) {
                System.out.println("Exiting...");
                running = false; // Set running to false to exit the loop
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
