package sk.akademiasovy.point;

public class Triangle implements InterfaceTriangle{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA(){
        return b.getDistanceFromOtherPoint(c);

    }

    public double getSideB(){
        return a.getDistanceFromOtherPoint(c);
    }

    public double getSideC(){
        return b.getDistanceFromOtherPoint(a);
    }
    public double getPerimeter(){
        return getSideA()+getSideB()+getSideC();
    }

    @Override
    public boolean getArea() {
        return false;
    }


    public boolean isEquilateral(){
            if(getSideA()==getSideB())
                return true;
            else if (getSideB()== getSideC())
                return true;
            else
                return false;

        }

        public boolean isIsosceles(){
            return (getSideA() == getSideB()|| getSideA()==getSideC()||getSideB()==getSideC());

        }



    }

