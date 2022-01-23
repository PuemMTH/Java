package Motor;
public class Car{
    // attributes
    String name;
    double speed;
    double acc;

    // constructor
    public Car(String name, double acc){
        this.name = name;
        this.speed = 0;
        this.acc = acc;
    }

    // method
    public void speed_up(double acc){
        this.acc = acc;
        this.speed += acc;
    }
    public void speed_down(double acc){
        this.acc = acc;
        this.speed = this.speed / 2;
    }
    public void crash(Car crash){
        crash.setSpeed(this.speed);
    }

    // getter setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getAcc(){
        return acc;
    }
    public void setAcc(double acc){
        this.acc = acc;
    }
}