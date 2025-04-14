package ss6_inheritance.bai_tap.cycle_cylinder;

public class Cylinder extends Circle {
    private double h;
    Cylinder(double r,double h){
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double volume(){
        return super.getPI()*super.getR()*super.getR()*this.h;
    }

    @Override
    public double getArea(){
        return super.getArea()*2+2*super.getPI()*super.getR()*this.getH();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "r=" + super.getR() +
                "h=" + h +
                '}';
    }
}
