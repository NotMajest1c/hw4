public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double sumSides = (side1 + side2 + side3) / 2;
        return Math.sqrt(sumSides * (sumSides - side1) * (sumSides - side2) * (sumSides - side3));
    }
}
