/* 
   The Concert class represents a concert event, encapsulating details about the venue, 
   tickets sold, tickets available, and the revenue generated from the concert.
*/
public class Concert {
    // Instance variables to store concert details
    private String venue;           
    private int ticketsSold;        
    private int ticketsAvailable;   
    private double revenue;         

    /* 
       No-argument constructor initializes a Concert object with default values. 
       This allows for the creation of a Concert instance without needing to specify details initially
    */
    public Concert() {
        venue = "";                 
        ticketsSold = 0;           
        ticketsAvailable = 0;       
        revenue = 0.0;            
    }

    /* 
       Parameterized constructor allows for the creation of a Concert object 
       with specified values for the venue, tickets sold, tickets available, 
       and revenue. This provides flexibility for object initialization.
    */
    public Concert(String venue, int ticketsSold, int ticketsAvailable, double revenue) {
        this.venue = venue;                       
        this.ticketsSold = ticketsSold;            
        this.ticketsAvailable = ticketsAvailable;   
        this.revenue = revenue;                   
    }

    /* 
       Accessor method to retrieve the venue name.
       This method provides read access to the private venue variable.
    */
    public String getVenue() {
        return venue;
    }

    /* 
       Accessor method to retrieve the number of tickets sold.
       This method provides read access to the private ticketsSold variable.
    */
    public int getTicketsSold() {
        return ticketsSold;
    }

    /* 
       Accessor method to retrieve the number of tickets available.
       This method provides read access to the private ticketsAvailable variable.
    */
    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    /* 
       Accessor method to retrieve the total revenue generated.
       This method provides read access to the private revenue variable.
    */
    public double getRevenue() {
        return revenue;
    }

    /* 
       toString method returns a string representation of the Concert object.
       This method provides a formatted string containing key details about the concert,
       making it easy to print or log the concert information.
    */
    public String toString() {
        return "Concert at " + venue + ": Sold " + ticketsSold +  ", Available " + ticketsAvailable + ", Revenue: $" + revenue + ".\n";
    }
}
