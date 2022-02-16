public class Point {

    private double x;
    private double y;
    
    public Point(double x,double y)
    {
        this.x = x
        ;
        this.y = y ;
    }
    public Point(){
        new Point(0,0);
    }

    public double Distance(Point des){

        double value = Math.sqrt( (des.x-this.x)*(des.x-this.x) 
                                + (des.y-this.y)*(des.y-this.y)  );
        return value ;
    }
    public double Distance(double x,double y){
        return Distance(new Point(x,y)) ;
    }
    public double Distance(){
        return Distance(0,0) ; 
    }


    public String toString(){
        return "("+this.x+","+this.y+")";
    }

    public void setXY(double x,double y){
        this.x = x ;
        this.y = y ;
    }

    public double[] getXY(){

        double tmp[] = new double[2];
        tmp[0] = this.x ;
        tmp[1] = this.y ;
        return tmp ;
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
