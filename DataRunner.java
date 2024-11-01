import java.util.Scanner; 

/* 
   The DataRunner class is the main entry point for the ticket promotion program. 
   It initializes the necessary components and provides a user interface for interaction.
*/
public class DataRunner {
    public static void main(String[] args) {
        /* 
           Create a Scanner object to read input from the console. 
           This will allow us to capture user choices and other inputs.
        */
        Scanner scanner = new Scanner(System.in);
        
        /* 
           Instantiate the TicketPromoter class with the required file names.
           These files likely contain data about venues, tickets sold, 
           tickets available, and revenues associated with the concerts.
        */
        TicketPromoter promoter = new TicketPromoter("venues.txt", "ticketsSold.txt", "ticketsAvailable.txt", "revenues.txt");

        /* 
           Initialize a boolean variable to control the while loop for the menu.
        */
        boolean running = true;
      
        while (running) {
            // Display a welcome message and the options available to the user
            System.out.println("Welcome to the Taylor Swift Concert Ticket Promoter!");
            System.out.println("Choose an option:");
            System.out.println("1. Find revenue for a specific venue");
            System.out.println("2. Get total tickets sold");
            System.out.println("3. Get average revenue per venue");
            System.out.println("4. List all concert information");
            System.out.println("5. Exit");

            /* 
               Read the user's choice as an integer. 
            */
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after the integer input

            /* 
               Use an if-else structure to execute code based on the user's choice
               Each option corresponds to a specific method in the TicketPromoter class
            */
            if (choice == 1) {
                // If the user chooses option 1, prompt them to enter a venue name
                System.out.print("Enter the venue name: ");
                String venue = scanner.nextLine(); 
                // Call the findVenueRevenue method and print the revenue for the specified venue
                System.out.println(promoter.findVenueRevenue(venue));
            } else if (choice == 2) {
                System.out.println("Total tickets sold: " + promoter.totalTicketsSold());
            } else if (choice == 3) {
                System.out.println(promoter.averageRevenuePerVenue());
            } else if (choice == 4) {
                System.out.print(promoter.toString());
            } else if (choice == 5) {
                System.out.println("Exiting...");
                running = false; 
            } else {
                // If the user enters an invalid option, inform them and prompt for input again
                System.out.println("Invalid choice. Please try again.");
            }
        }

        /* 
           Close the scanner
        */
        scanner.close();
    }
}
