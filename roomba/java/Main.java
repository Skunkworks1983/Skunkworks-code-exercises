public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(20, 20);
        grid.print();
        grid.sleep();

        cleanFloor(grid);

        System.exit(grid.allClean() ? 0 : 1);
    }

    //what dis do
    public static void cleanFloor(Grid grid) {
        while (true) {
            grid.robotClean();
            grid.robotMoveSouth();
        }
    }
}