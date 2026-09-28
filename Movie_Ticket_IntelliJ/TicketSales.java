public class TicketSales extends Tickets
{
    // Constructor
    public TicketSales(String customerName, String movieTitle, int customerAge, double moviePrice)
    {
        super(customerName, movieTitle, customerAge, moviePrice);
    }

    // Print the ticket
    @Override
    public void print_tickets()
    {
        double discount;

        if (getCustomerAge() >= 65)
        {
            discount = getMoviePrice() * 0.10;
        }
        else
        {
            discount = 0;
        }

        double finalCost = getMoviePrice() - discount;

        System.out.println();
        System.out.println("MOVIE TICKET");
        System.out.println("*****************************");
        System.out.println("CUSTOMER NAME: " + getCustomerName());
        System.out.println("MOVIE TITLE: " + getMovieTitle());
        System.out.println("MOVIE PRICE: R" + String.format("%.2f", getMoviePrice()));
        System.out.println("DISCOUNT: R" + String.format("%.2f", discount));
        System.out.println("FINAL COST DUE: R" + String.format("%.2f", finalCost));
        System.out.println("*****************************");
    }
}
