import SubClass._ClassSuper;

public class Main {
    public static void main(String[] args) {
        _SubClass Jam2 = new _SubClass("Jam2", 40, 3.2);
        // people class
        _ClassSuper Jam = new _ClassSuper("Jam", 20);
        _ClassSuper Bond = new _ClassSuper("Bond", 35);
        System.out.println(Jam.toString());
        System.out.println(Bond.toString());

        // Studen class extends people class
        System.out.println(Jam2.toString());
        // Jam2.setName("Jam2");
        // Jam2.setAge(20);
        // System.out.println("Child -> " + "Jam2's name is " + Jam2.getName() + " and his age is " + Jam2.getAge() + " and his gpa is " + Jam2.getGpa());

        // print out the name and age of Jam2 and Bond2
        // System.out.println("Jam2's name is " + Jam2.getName() + " and his age is " + Jam2.getAge());
        // System.out.println("Bond2's name is " + Bond2.getName() + " and his age is " + Bond2.getAge());
    }
}

// class Test{
//     public int x;
    
//     public Test(){ // default constructor

//     }

//     public Test(int x){ // Overloading constructor
//         this.x = x;
//     }

//     public int getX(){
//         return this.x;
//     }
//     public void setX(int x){
//         this.x = x;
//     }
// }
