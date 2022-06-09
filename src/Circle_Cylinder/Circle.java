package Circle_Cylinder;

public class Circle {
    double radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
    return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){ return 2*Math.PI*this.radius;}
}
