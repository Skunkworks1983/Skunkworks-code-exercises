public class Triangle implements Shape {
    double side0Length;
    double side1Length;
    double side2Length;

    public Triangle(double side0Length, double side1Length, double side2Length) {
        this.side0Length = side0Length;
        this.side1Length = side1Length;
        this.side2Length = side2Length;
    }

    // Heron's formula
    public double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - side0Length) * (s - side1Length) * (s - side2Length));
    }

    public double perimeter() {
        return side0Length + side1Length + side2Length;
    }
}
