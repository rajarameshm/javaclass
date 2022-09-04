public class Circle implements Shape {
    private double radius;
    public Circle(double radiusArg) {
        this.radius = radiusArg; //initializing or assigning a value to the variable radius
    }

    @Override
    public void area() {
        double area = (22/7) * radius * radius;
        System.out.println("area of a circle with radius " + radius + " is " + area);
    }
}
