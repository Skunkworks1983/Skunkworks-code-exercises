public class Rectangle implements Shape {
    double side0Length;
    double side1Length;

    public Rectangle(double side0Length, double side1Length) {
        this.side0Length = side0Length;
        this.side1Length = side1Length;
    }

    // Heron's formula
    public double area() {
        return side0Length * side1Length;
    }

    public double perimeter() {
        return 2.0 * side0Length + 2.0 * side1Length;
    }
}
