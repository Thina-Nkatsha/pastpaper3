import java.util.Scanner;

public class MovieTicketApplication
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();

        System.out.print("Enter movie title: ");
        String movieTitle = input.nextLine();

        System.out.print("Enter customer age: ");
        int customerAge = input.nextInt();

        System.out.print("Enter movie price: R");
        double moviePrice = input.nextDouble();

        TicketSales ticket = new TicketSales(customerName, movieTitle, customerAge, moviePrice);

        ticket.print_tickets();
    }
}
