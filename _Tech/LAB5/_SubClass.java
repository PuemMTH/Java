import SubClass._ClassSuper;

public class _SubClass extends _ClassSuper {

    protected double gpa;

    public _SubClass() {
        super();
        this.gpa = 0;
    }
    public _SubClass(String name, int age, double gpa) {
        // super(name, age);
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    public String toString() {
        return "Child -> " + "name is " + this.getName() + " and his age is " + this.getAge() + " and his gpa is " + this.gpa;
    }

    public double getGpa() {
        return this.gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
