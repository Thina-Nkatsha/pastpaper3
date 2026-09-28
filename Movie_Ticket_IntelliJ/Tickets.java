public abstract class Tickets implements iTickets
{
    // Variables to store ticket details
    protected String customerName;
    protected String movieTitle;
    protected int customerAge;
    protected double moviePrice;

    // Constructor
    public Tickets(String customerName, String movieTitle, int customerAge, double moviePrice)
    {
        this.customerName = customerName;
        this.movieTitle = movieTitle;
        this.customerAge = customerAge;
        this.moviePrice = moviePrice;
    }

    // Get customer name
    public String getCustomerName()
    {
        return customerName;
    }

    // Get movie title
    public String getMovieTitle()
    {
        return movieTitle;
    }

    // Get customer age
    public int getCustomerAge()
    {
        return customerAge;
    }

    // Get movie price
    public double getMoviePrice()
    {
        return moviePrice;
    }
}
