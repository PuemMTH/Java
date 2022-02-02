package MoveablePoint;

public class MoveablePoint extends Point{
    private double xSpeed;
    private double ySpeed;

    public MoveablePoint() {
        this.xSpeed = 0;
        this.ySpeed = 0;
    }
    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public void forward() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
    }
    public void backward() {
        this.x -= this.xSpeed;
        this.y -= this.ySpeed;
    }
    
    public String toString() {
        String ans = "";
        ans += "Point: " + super.toString() + "\n";
        ans += "Speed: " + this.xSpeed + ", " + this.ySpeed + "\n";
        return ans;
    }

    public double[] getXYSpeed() {
        double[] xySpeed = {this.xSpeed, this.ySpeed};
        return xySpeed;
    }
    public void setXYSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getXSpeed() {
        return this.xSpeed;
    }
    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }
    public double getYSpeed() {
        return this.ySpeed;
    }
    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
}