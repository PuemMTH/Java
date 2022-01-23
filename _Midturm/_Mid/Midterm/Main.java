import Motor.Car;

public class Main {
    public static void main(String[] args) {
        Car A = new Car("Honda", 70);
        System.out.println(A.getName() + " car created , Speed = "+ A.getSpeed());
        Car B = new Car("Yamaha", 80);
        System.out.println(B.getName() + " car created , Speed = "+ B.getSpeed());
        
        A.speed_up(70);
        System.out.println(A.getName() + " car speed up , Speed = "+ A.getSpeed());
        A.speed_up(70);
        System.out.println(A.getName() + " car speed up , Speed = "+ A.getSpeed());
        A.speed_down(70);
        System.out.println(A.getName() + " car speed down , Speed = "+ A.getSpeed());

        A.crash(B);
        System.out.println();
        System.out.println(A.getName() + " Crash to " + B.getName());
        System.out.println(A.getName() + "speed = " + A.getSpeed() + " and "+ B.getName() + " speed = " + B.getSpeed());
    }
}
