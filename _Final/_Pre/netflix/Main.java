import Order.Movie;
import Role.*;

public class Main {
    public static void main(String[] args) {
        Movie TheShawshankRedemption = new Movie("2019-01-01", "The Shawshank Redemption", 180);
        Movie TheAvengers = new Movie("2018-01-01", "The Avengers", 100);

        Customer PuemMTH = new Customer(20, "puem@gmail.com", "PuemMTH", "0616544123");
        PuemMTH.BuyOrder(TheShawshankRedemption);
        PuemMTH.BuyOrder(TheAvengers);
        PuemMTH.rateMovies(TheShawshankRedemption, 5);
        PuemMTH.rateMovies(TheShawshankRedemption, 3);
        PuemMTH.rateMovies(TheShawshankRedemption, 2);
        PuemMTH.rateMovies(TheShawshankRedemption, 1);
        PuemMTH.rateMovies(TheAvengers, 4);

        System.out.println(TheShawshankRedemption.toString());
    }
}
