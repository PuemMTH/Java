package Lib;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        System.out.println("[ Cat Created ]");
    }

    public void print() { // Override
        System.out.println("Cat : " + this.getName());
    }

    public void greets() {
        System.out.println("Meow Meow !!!");
    }

}
