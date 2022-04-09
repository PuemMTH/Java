public class Point {

    protected double x ;
    protected double y ;

    public Point(double x,double y){
        this.x = x ;
        this.y = y ;
    }
    public Point(){
        new Point(0,0);
    }
    
    public void setXY(double x,double y){
        this.x = x ;
        this.y = y ;
    }
    public double[] getXY(){
        double tmp[] = {this.x,this.y};
        return tmp ;
    }
    public String toString(){
        String ans = "("+this.x+","+this.y+")";
        return ans;
    }
    public double getX(){
        return this.x ;
    }
    public void setX(double x){
        this.x = x ;
    }
    public double getY(){
        return this.y ;
    }
    public void setY(double y){
        this.y = y ;
    }
    
}