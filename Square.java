public class Square implements Shape {
    private float side;

    public Square(float side) {
        this.side = side;
    }
    @Override
    public void area() {
        float area = side * side;
        System.out.println("area of a square with side " + side +" is " + area);
    }
}
