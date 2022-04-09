public class Point3D extends Point {
    // Attributes
    private double z;

    // Constructors
    public Point3D() {
        super();
        this.z = 0;
    }
    // Overloaded Constructor
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double[] getXYZ() {
        double tmp[] = {this.x, this.y, this.z};
        return tmp;
    }
    public void setXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        String ans = "(" + this.x + "," + this.y + "," + this.z + ")";
        return ans;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

}
