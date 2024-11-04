import java.util.ArrayList;

/* 
   The TicketPromoter class manages concert data, including creating concerts 
   from data files and providing various methods to retrieve information about them
*/
public class TicketPromoter {
    private Concert[] concerts;

    /* 
       Constructor to initialize concert data from the provided file paths.
    */
    public TicketPromoter(String venuesFile, String ticketsSoldFile, String ticketsAvailableFile, String revenuesFile) {
        concerts = createConcerts(venuesFile, ticketsSoldFile, ticketsAvailableFile, revenuesFile);
    }

    /* 
       Create concerts from the data files provided as parameters.
    */
    public Concert[] createConcerts(String venuesFile, String ticketsSoldFile, String ticketsAvailableFile, String revenuesFile) {
        String[] venues = FileReader.toStringArray(venuesFile);
        int[] ticketsSold = FileReader.toIntArray(ticketsSoldFile);
        int[] ticketsAvailable = FileReader.toIntArray(ticketsAvailableFile);
        double[] revenues = FileReader.toDoubleArray(revenuesFile);

        Concert[] newConcerts = new Concert[venues.length];

        /* 
           Loop through each venue and create a Concert object using the corresponding
           values from the other arrays. 
        */
        for (int i = 0; i < newConcerts.length; i++) {
            newConcerts[i] = new Concert(venues[i], ticketsSold[i], ticketsAvailable[i], revenues[i]);
        }
        // Return the populated array of Concert objects
        return newConcerts;
    }

    /* 
       Find revenue for a specific venue.
       This method searches the concerts array for a concert with a matching venue name 
       and returns the revenue for that venue.
    */
    public String findVenueRevenue(String venue) {
        for (Concert concert : concerts) {
            if (concert.getVenue().equals(venue)) {
                return "Total revenue for " + venue + ": $" + concert.getRevenue();
            }
        }
        // If the venue is not found, return an appropriate message
        return "Venue not found.";
    }

    /* 
       Calculate the total number of tickets sold across all concerts.
       This method iterates through the concerts array and sums the tickets sold for each concert.
    */
    public int totalTicketsSold() {
        int total = 0; 
        for (Concert concert : concerts) {
            total += concert.getTicketsSold(); // Accumulate tickets sold
        }
        return total; // Return the total number of tickets sold
    }

    /* 
       Calculate the average revenue per venue.
       This method sums up the revenue from all concerts and divides by the number of concerts 
       to find the average revenue.
    */
    public String averageRevenuePerVenue() {
        double totalRevenue = 0; 
        for (Concert concert : concerts) {
            totalRevenue += concert.getRevenue(); // Accumulate total revenue
        }
        // Calculate the average revenue by dividing by the number of concerts
        double average = totalRevenue / concerts.length;
        return "Average revenue per venue: $" + average; 
    }

    /* 
       toString method returns a string representation of all concerts.
    */
    public String toString() {
        String result = ""; 
        for (Concert concert : concerts) {
            result += concert; 
            result += "----------\n"; 
        }
        return result; 
    }
}
