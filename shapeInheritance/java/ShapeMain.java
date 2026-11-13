import java.util.List;

public class ShapeMain {
    private static void printArea(Shape shape) {
        System.out.println("The area of this '" + shape.getClass().getName() + "' shape is:\t\t" + shape.area());
    }

    private static void printPerimeter(Shape shape) {
        System.out.println("The perimeter of this '" + shape.getClass().getName() + "' shape is:\t" + shape.perimeter());
    }

    public static void main(String[] args) {
        Shape rect = new Rectangle(3, 4);
        Shape triangle = new Triangle(3, 4, 5);

        List<Shape> myShapes = List.of(rect, triangle);
        for (Shape shape : myShapes) {
            printArea(shape);
            printPerimeter(shape);
        }
    }
}
