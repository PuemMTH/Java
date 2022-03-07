import Thread.*;

public class Main{
    public static void main(String[] args){
        // SayHello thai = new SayHello("Thailand");
        // SayHello eng = new SayHello("England");
        // try {
        //     thai.start(); // start thai thread
        //     // thai.join();
        //     eng.start(); // start eng thread
        //     // thai.setPriority(10); // set priority thai thread
        //     // eng.setPriority(1); // set priority eng thread
        // }catch(Exception e){

        // }
        // for (int i = 0; i < 100; i++) // Main thread
        //     System.out.println("Hello " + "Japan");
        
        // Data tmp = new Data();
        // Producer p = new Producer(tmp);
        // Consumer c = new Consumer(tmp);

        Data tmp = new Data();
        Producer p = new Producer(tmp);
        Consumer c = new Consumer(tmp);
        p.start();
        c.start();
        
        
    }
}