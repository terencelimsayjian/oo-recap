public class Circle {
    private final double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * (radius * radius);
    }

    public double getPerimeter(){
        return 2 * PI * radius;
    }

}
