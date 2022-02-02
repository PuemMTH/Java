package SubClass;

public class _ClassSuper {
    protected String name;
    protected int age;
    // protected String address;

    public _ClassSuper() {
        this.age = 0;
        this.name = "";
    }

    public _ClassSuper(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Super " + "name is " + this.name + " and his age is " + this.age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}
