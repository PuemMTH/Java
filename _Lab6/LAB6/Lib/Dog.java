package Lib;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
        System.out.println("[ Dog Created ]");
    }
    public void print() { // Override
        System.out.println("Dog : " + this.name);
    }
    public void greets() {
        System.out.println("Woof Woof !!!");
    }
    public void checkHand() {
        System.out.println("Dog CheckHand.");
    }
}
