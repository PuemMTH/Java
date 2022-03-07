package Thread;

public class _Runnable implements Runnable{
    public void run(){ // Runnable is automatically implemented by Thread
        for(int i = 0; i < 3000; i++){
            System.out.println("_Runnable "+"["+i+"] "+Thread.currentThread().getName());
        }
    }
}
