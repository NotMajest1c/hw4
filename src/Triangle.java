public class Triangle extends GeometricShape {
    private double height;

    public Triangle(double lengthOfEachSide, double height) {
        super(3, lengthOfEachSide);
        this.height = height;
        setArea(calculateArea());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        setArea(calculateArea());
    }

    @Override
    public double getArea() {
        return calculateArea();
    }
    @Override
    public String toString() {
        return "A triangle with " + getNumberOfSides() + " sides, of length: " + getLengthOfEachSide() + ", height: " + height + ", and area: " + getArea();
    }

    private double calculateArea() {
        return 0.5 * getLengthOfEachSide() * height;
    }
}
