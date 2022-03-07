package Thread;

public class _Thread extends Thread{
    public void run(){ // Thread is automatically implemented by Thread
        for(int i = 0; i < 3000; i++){
            System.out.println("_Thread "+"["+i+"] "+getName());
        }
    }
}
