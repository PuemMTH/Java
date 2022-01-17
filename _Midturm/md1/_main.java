import game.unit;

public class _main {
    public static void main(String[] args) {
        System.out.println("Ha ha ha I'm Jommarn.");
        
        unit Jommarn = new unit("Jommarn",100,10);
        unit Hero = new unit("Hero",100,10);
        Hero.attack(Jommarn);
        System.out.println("Jommarn's hp is " + Jommarn.getHp() + " hp.");
    }
}