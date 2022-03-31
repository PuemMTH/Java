package Class;

public class animal {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public animal() {
        this.name = "";
        this.age = 0;
    }

    // Methods
    public String Greets() {
        return "Hello, my name is " + this.name + " and I am " + this.age + " years old.";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
