

public class Data {
    char ch;
    boolean flag = true;

    synchronized public void write(char ch) {
        if(flag == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("write: " + ch);
        this.ch = ch;
        flag = false;
        notifyAll();
    }
    
    synchronized public char read() {
        if(flag == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
        System.out.println("read: " + ch);
        notifyAll();
        return this.ch;
    }

}

class Producer extends Thread {
    Data val;

    public Producer(Data val) {
        this.val = val;
    }

    public void run() {
        for (int i = 0; i < 5 ; i++) {
            int rand = (int) (Math.random() * 10);
            char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
            val.write(ch[rand]);
        }
    }
}

class Consumer extends Thread {
    Data val;

    public Consumer(Data val) {
        this.val = val;
    }

    public void run() {
        for (int i = 0; i < 5 ; i++) {
            char ch = val.read();
            System.out.println("Consumer: " + ch);
        }
    }
}