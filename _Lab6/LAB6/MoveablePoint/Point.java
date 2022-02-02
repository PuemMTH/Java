package MoveablePoint;
public class Point {
    protected double x;
    protected double y;

    public Point() {
        new Point(0, 0);
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double Distance(Point p) {
        double value = Math.sqrt(Math.pow((p.getX() - this.x), 2) 
                              + (Math.pow((p.getY() - this.y), 2)));
        return value;
    }
    public double Distance(double x, double y) {
        return Distance(new Point(x, y));
    }
    public double Distance(){
        return Distance(new Point(0, 0));
    }
    public String toString() {
        String ans = "";
        ans += "( " + this.x + ", " + this.y + " )";
        return ans;
    }
    public double[] getXY() {
        double[] xy = {this.x, this.y};
        return xy;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
