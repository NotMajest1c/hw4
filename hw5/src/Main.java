public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("circle perimeter: " + circle.calculatePerimeter());
        System.out.println("circle area: " + circle.calculateArea());

        Triangle triangle = new Triangle(3,4,5);
        System.out.println("triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("triangle area: " + triangle.calculateArea());

        Square square = new Square(6);
        System.out.println("square perimeter: " + square.calculatePerimeter());
        System.out.println("square area: " + square.calculateArea());


        Phone samsung = new Samsung();
        samsung.takePicture();
        samsung.printColor();

        Phone iphone = new Iphone();
        iphone.takePicture();
        iphone.printColor();


    }
}