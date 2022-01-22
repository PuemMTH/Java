import game.unit;
// unit
// - name (String)
// - hp (double)
// - atk (double)
// + constructor(String, double, double)
// + attack(unit)
// + getter setter

public class _main {
    public static void main(String[] args) {
        System.out.println("Ha ha ha I'm Jommarn.");
        
        unit Jommarn = new unit("Jommarn",100,10.5);
        unit Hero = new unit("Hero",100,9.7);

        Hero.attack(Jommarn);
        Jommarn.attack(Hero);
        Hero.attack(Jommarn);

        System.out.println("Jommarn's hp is " + Jommarn.getHp() + " hp.");
        System.out.println("Hero's hp is " + Hero.getHp() + " hp.");
    }
}
//