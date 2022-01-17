package game;

public class unit {
    private String name;
    private double hp;
    private double atk;

    public unit(String name, double hp, double atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }
    // getter setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHp() {
        return hp;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    public double getAtk() {
        return atk;
    }
    public void setAtk(double atk) {
        this.atk = atk;
    }
    // method
    public void attack(unit enemy) {
        enemy.setHp(enemy.getHp() - this.atk);
        System.out.println(this.name + " attacked " + enemy.getName() + " and " + enemy.getName() + " lost " + this.atk + " hp.");
    }

}
