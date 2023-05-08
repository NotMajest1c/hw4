public class GeometricShape implements Cloneable {
    private int numberOfSides;
    private double lengthOfEachSide;
    private double area;

    public GeometricShape(int numberOfSides, double lengthOfEachSide) {
        this.numberOfSides = numberOfSides;
        this.lengthOfEachSide = lengthOfEachSide;
        this.setArea(calculateArea());
    }

    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public double getLengthOfEachSide() {
        return this.lengthOfEachSide;
    }

    public double getArea() {
        return this.area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return "A shape with " + this.numberOfSides + " sides, each of length " + this.lengthOfEachSide + ", and area " + this.area;
    }

    @Override
    public GeometricShape clone() throws CloneNotSupportedException {
        return (GeometricShape) super.clone();
    }

    private double calculateArea() {
        double apothem = this.lengthOfEachSide / (2 * Math.tan(Math.PI / this.numberOfSides));
        return 0.5 * this.numberOfSides * this.lengthOfEachSide * apothem;
    }
}
