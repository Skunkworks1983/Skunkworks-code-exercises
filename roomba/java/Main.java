public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.print();
        grid.sleep();
        while (!grid.allClean()) {
            moveRobot(grid);
        }
    }

    static int step = 0;

    public static void moveRobot(Grid grid) {
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