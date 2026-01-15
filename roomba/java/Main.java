public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.print();
        grid.sleep();

        cleanFloor(grid);

        System.exit(grid.allClean() ? 0 : 1);
    }

    static int step = 0;

    public static void cleanFloor(Grid grid) {
        while (true) {
            grid.robotClean();
            grid.robotMoveSouth();
        }
    }
}