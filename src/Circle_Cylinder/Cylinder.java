package Circle_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(int radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea()*2 + super.getPerimeter()*this.height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }
}