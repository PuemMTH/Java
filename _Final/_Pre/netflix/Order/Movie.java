package Order;
import java.util.ArrayList;

public class Movie {
    String date;
    String name;
    ArrayList<Double> rateList = new ArrayList<Double>();
    double rate;
    int calcPrice;

    public Movie(String date, String name, int calcPrice ) {
        this.date = date;
        this.name = name;
        this.calcPrice = calcPrice;
    }

    public void addRate(double Rate) {
        rateList.add(Rate);
        double rateSum = 0;
        for (int i = 0; i < rateList.size(); i++) {
            rateSum += rateList.get(i);
        }
        rate = rateSum / rateList.size();
    }

    public String toString() {
        return "Movie: " + name + " " + date + " " + rate + " " + calcPrice;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Double> getRateList() {
        return rateList;
    }
    public void setRateList(ArrayList<Double> rateList) {
        this.rateList = rateList;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
}
