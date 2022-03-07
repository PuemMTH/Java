package Thread;

public class SayHello extends Thread {
    String country;
    public SayHello(String country){
        this.country = country;
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello " + country);
        }
    }
}