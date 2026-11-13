import java.util.List;

public class ShapeMain {
    private static void printArea(Shape shape) {
        System.out.println("The area of this '" + shape.getClass().getName() + "' shape is:\t\t" + shape.area());
    }

    private static void printPerimeter(Shape shape) {
        System.out.println("The perimeter of this '" + shape.getClass().getName() + "' shape is:\t" + shape.perimeter());
    }

    public static void main(String[] args) {
        // This is a rectangle of height 3 and length 4
        Shape rect = new Rectangle(3, 4);

        // This is a triangle with sides of length 3, 4, and 5.
        Shape triangle = new Triangle(3, 4, 5);

        List<Shape> myShapes = List.of(rect, triangle);
        for (Shape shape : myShapes) {
            printArea(shape);
            printPerimeter(shape);
        }
    }
}
