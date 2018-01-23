package sk.akademiasovy.point;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b){
        this.a=a;
        this.b=b;
    }
    public Line(int xa,int xb,int ya, int yb){
        a=new Point(xa,ya);
        this.b=new Point(xb,yb);
    }

    public double getLength(){
        return a.getDistanceFromOtherPoint(b);    //prevzate
    }

    public Point getMiddlePointOfLine(){ return new Point (a.getX()+b.getX())/2,(a.getY()+b.getY())/2); }

    public boolean isParallelToTheAxisX(){
    return a.getY()==b.getY();
    }

    public boolean isParallelToTheAxisY(){
    return a.getX()==b.getX();
    }
}
