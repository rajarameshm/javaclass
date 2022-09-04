public class Rectangle implements Shape {
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void area() {
        int area = length * width;
        System.out.println("are of a rectangle with length " + length + " width " + width + " is " + area);
    }

}
