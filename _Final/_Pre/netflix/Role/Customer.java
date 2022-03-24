package Role;

import java.util.ArrayList;
import java.util.HashMap;

import Order.Movie;

public class Customer extends UserAccount {

    private int rateMovies = 0;
    private ArrayList<Movie> BuyOrder = new ArrayList<Movie>();
    private HashMap<Movie,Double> RateOrder = new HashMap<Movie,Double>();

    public Customer(int age, String email, String name, String phone) {
        super(age, email, name, phone);
    }

    public void rateMovies(Movie move, double rate) {
        if (rate > 0 && rate <= 5) {
            move.addRate(rate);
            RateOrder.put(move, rate);
            rateMovies++;
        }
    }

    public void BuyOrder(Movie move) {
        BuyOrder.add(move);
    }

    public ArrayList<Movie> getBuyOrder() {
        return BuyOrder;
    }
    public HashMap<Movie,Double> getRateOrder() {
        return RateOrder;
    }

}