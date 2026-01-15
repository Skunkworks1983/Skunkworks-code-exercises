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
            int stepType = step % 4;
            switch (stepType) {
                case 0:
                    grid.robotMoveSouth();
                    break;
                case 1:
                    grid.robotMoveEast();
                    break;
                case 2:
                    grid.robotMoveNorth();
                    break;
                case 3:
                    grid.robotMoveWest();
                    break;
            }
            ++step;
            grid.robotClean();
        }
    }
}