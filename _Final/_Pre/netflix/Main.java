import Order.Movie;
import Role.*;

public class Main {
    public static void main(String[] args) {
        Movie TheShawshankRedemption = new Movie("2019-01-01", "The Shawshank Redemption", 180);
        Movie TheAvengers = new Movie("2018-01-01", "The Avengers", 100);

        Customer Mother = new Customer(25, "Mother@gmail.com", "Mother", "06xxxxxxxx");
        Mother.BuyOrder(TheShawshankRedemption);
        Mother.BuyOrder(TheAvengers);
        Mother.rateMovies(TheShawshankRedemption, 5);
        Mother.rateMovies(TheAvengers, 4);

        Customer Jode = new Customer(28, "Jode@gmail.com", "Jode", "08xxxxxxxx");
        Jode.BuyOrder(TheShawshankRedemption);
        Jode.BuyOrder(TheAvengers);
        Jode.rateMovies(TheShawshankRedemption, 3.2);
        Jode.rateMovies(TheAvengers, 1.5);

        Mother.showBuyOrder();
        Jode.showBuyOrder();
        Mother.showRateOrder();
        Jode.showRateOrder();

    }
}
