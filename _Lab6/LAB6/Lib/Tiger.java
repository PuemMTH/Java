package Lib;

public class Tiger extends Cat {

    protected int fang;
    public Tiger(String name, int fang) {
        super(name);
        this.fang = fang;
        System.out.println("[ Tiger Created ]");
    }
    public void print() {
        System.out.println("Tiger : " + this.getName() + " have " + this.fang + " fangs.");
    }
    public void attack(Animal enemy) {
        System.out.println(this.name + " Attack to " + enemy.getName() + " with " + this.fang + " fangs.");
    }
    public void greets() {
        System.out.println("Roar Roar Roar !!!");
    }
    public int getFang(){
        return this.fang;
    }
    public void setFang(int fang){
        this.fang = fang;
    }
}
