public class Concert {
    private String venue;
    private int ticketsSold;
    private int ticketsAvailable;
    private double revenue;

    // No-argument constructor
    public Concert() {
        venue = "";
        ticketsSold = 0;
        ticketsAvailable = 0;
        revenue = 0.0;
    }

    // Parameterized constructor
    public Concert(String venue, int ticketsSold, int ticketsAvailable, double revenue) {
        this.venue = venue;
        this.ticketsSold = ticketsSold;
        this.ticketsAvailable = ticketsAvailable;
        this.revenue = revenue;
    }

    // Accessor methods
    public String getVenue() {
        return venue;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public double getRevenue() {
        return revenue;
    }

    // toString method
    public String toString() {
        return "Concert at " + venue + ": Sold " + ticketsSold + ", Available " + ticketsAvailable + ", Revenue: $" + revenue + ".\n";
    }
}