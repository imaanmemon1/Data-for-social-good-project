import java.util.ArrayList;

public class TicketPromoter {
    private Concert[] concerts;

    // Constructor to initialize concert data
    public TicketPromoter(String venuesFile, String ticketsSoldFile, String ticketsAvailableFile, String revenuesFile) {
        concerts = createConcerts(venuesFile, ticketsSoldFile, ticketsAvailableFile, revenuesFile);
    }

    // Create concerts from the data files
    public Concert[] createConcerts(String venuesFile, String ticketsSoldFile, String ticketsAvailableFile, String revenuesFile) {
        String[] venues = FileReader.toStringArray(venuesFile);
        int[] ticketsSold = FileReader.toIntArray(ticketsSoldFile);
        int[] ticketsAvailable = FileReader.toIntArray(ticketsAvailableFile);
        double[] revenues = FileReader.toDoubleArray(revenuesFile);

        Concert[] newConcerts = new Concert[venues.length];

        for (int i = 0; i < newConcerts.length; i++) {
            newConcerts[i] = new Concert(venues[i], ticketsSold[i], ticketsAvailable[i], revenues[i]);
        }
        return newConcerts;
    }

    // Find revenue for a specific venue
    public String findVenueRevenue(String venue) {
        for (Concert concert : concerts) {
            if (concert.getVenue().equals(venue)) {
                return "Total revenue for " + venue + ": $" + concert.getRevenue();
            }
        }
        return "Venue not found.";
    }

    // Calculate total tickets sold
    public int totalTicketsSold() {
        int total = 0;
        for (Concert concert : concerts) {
            total += concert.getTicketsSold();
        }
        return total;
    }

    // Calculate average revenue per venue
    public String averageRevenuePerVenue() {
        double totalRevenue = 0;
        for (Concert concert : concerts) {
            totalRevenue += concert.getRevenue();
        }
        double average = totalRevenue / concerts.length;
        return "Average revenue per venue: $" + average;
    }

    // toString method to display all concerts
    public String toString() {
        String result = "";
        for (Concert concert : concerts) {
            result += concert; // Using simple string concatenation
            result += "----------\n";
        }
        return result;
    }
}
