import MoveablePoint.*;
import Lib.*;
public class Main {
    public static void main(String[] args) {

        // Package Lib
        // Dog Bob = new Dog("Bob");
        // Bob.print();
        // Bob.greets();

        // Cat Tom = new Cat("Tom");
        // Tom.print();
        // Tom.greets();

        // Tiger Jack = new Tiger("Jack",4);
        // Jack.print();
        // Jack.greets();
        // Jack.attack(Bob);

        // package MoveablePoint
        MoveablePoint A = new MoveablePoint(0, 0, 10, 15);
        System.out.println(A.toString());
        A.forward();
        A.forward();
        System.out.println(A.toString());

        MoveablePoint B = new MoveablePoint(100, 120, 5, 12);
        System.out.println(B.toString()); 
        B.backward();
        B.backward();
        System.out.println(B.toString());

        // System.out.printf("Distance: " + "%.2f", A.Distance(B));
        System.out.println("Distance: " + A.Distance(B));
    }
}