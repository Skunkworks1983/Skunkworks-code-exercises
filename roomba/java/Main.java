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
        cleanDfs(grid);
        System.exit(grid.allClean() ? 0 : 1);
    }

    public static void cleanDfs(Grid grid) {
        grid.robotClean();
        Location robotLocation = grid.robotLocation();
        Location south = new Location(robotLocation.x, robotLocation.y + 1);
        Location north = new Location(robotLocation.x, robotLocation.y - 1);
        Location east = new Location(robotLocation.x + 1, robotLocation.y);
        Location west = new Location(robotLocation.x - 1, robotLocation.y);

        if (!grid.isClean(south.x, south.y) && grid.robotMoveSouth()) {
            cleanDfs(grid);
            grid.robotMoveNorth();
        }
        if (!grid.isClean(north.x, north.y) && grid.robotMoveNorth()) {
            cleanDfs(grid);
            grid.robotMoveSouth();
        }
        if (!grid.isClean(east.x, east.y) && grid.robotMoveEast()) {
            cleanDfs(grid);
            grid.robotMoveWest();
        }
        if (!grid.isClean(west.x, west.y) && grid.robotMoveWest()) {
            cleanDfs(grid);
            grid.robotMoveEast();
        }
    }
}