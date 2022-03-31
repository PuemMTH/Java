package Class;

public class cat extends animal{
    // Attributes
    private int lag;

    public cat(String name, int age, int lag) {
        super(name, age);
        this.lag = lag;
    }
    public cat() {
        super();
        this.lag = 0;
    }

    public int getLag() {
        return lag;
    }
    public void setLag(int lag) {
        this.lag = lag;
    }

}
