import java.util.HashSet;
import java.util.Random;

public class Grid {
    private int xSize;
    private int ySize;

    private HashSet<Location> wallLocations = new HashSet<Location>();
    private HashSet<Location> cleanLocations = new HashSet<Location>();

    private Location robotLocation = null;

    public Grid(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
        placeRandomWalls();

        // Place the robot at the first available spot (that doesn't have a wall).
        for (int y = 0; y < ySize && robotLocation == null; ++y) {
            for (int x = 0; x < xSize && robotLocation == null; ++x) {
                if (!isWall(x, y)) {
                    robotLocation = new Location(x, y);
                }
            }
        }
    }

    public Location robotLocation() {
        return robotLocation;
    }

    // Cleans the location where the robot currently is.
    public void robotClean() {
        cleanLocations.add(robotLocation);
    }

    // Move the robot south. Returns true if this was a valid move and
    // the robot moved. Returns false otherwise.
    public boolean robotMoveSouth() {
        int newX = robotLocation.x;
        int newY = robotLocation.y + 1;
        if (!robotCanMoveTo(newX, newY)) {
            return false;
        }
        robotLocation = new Location(newX, newY);
        return true;
    }

    // Moves the robot up in the grid. Returns true if this was a valid move and
    // the robot moved. Returns false otherwise.
    public boolean robotMoveNorth() {
        int newX = robotLocation.x;
        int newY = robotLocation.y - 1;
        if (!robotCanMoveTo(newX, newY)) {
            return false;
        }
        robotLocation = new Location(newX, newY);
        return true;
    }

    // Moves the robot right in the grid. Returns true if this was a valid move and
    // the robot moved. Returns false otherwise.
    public boolean robotMoveEast() {
        int newX = robotLocation.x + 1;
        int newY = robotLocation.y;
        if (!robotCanMoveTo(newX, newY)) {
            return false;
        }
        robotLocation = new Location(newX, newY);
        return true;
    }

    // Moves the robot left in the grid. Returns true if this was a valid move and
    // the robot moved. Returns false otherwise.
    public boolean robotMoveWest() {
        int newX = robotLocation.x - 1;
        int newY = robotLocation.y;
        if (!robotCanMoveTo(newX, newY)) {
            return false;
        }
        robotLocation = new Location(newX, newY);
        return true;
    }

    // Returns true if this x,y position is a valid place for the robot to move.
    // A position is valid if it is not in a wall and is within the sides of the grid.
    public boolean robotCanMoveTo(int x, int y) {
        if (isWall(x, y) || x < 0 || x >= xSize || y < 0 || y >= ySize) {
            return false;
        }
        return true;
    }

    // Returns true if the entire grid, excluding walls, has been cleaned.
    public boolean allClean() {
        for (int y = 0; y < ySize; ++y) {
            for (int x = 0; x < xSize; ++x) {
                if (!isWall(x, y) && !isClean(x, y)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWall(int x, int y) {
        return wallLocations.contains(new Location(x, y));
    }

    public boolean isClean(int x, int y) {
        return cleanLocations.contains(new Location(x, y));
    }

    public void print() {
        for (int y = 0; y < ySize; ++y) {
            for (int x = 0; x < xSize; ++x) {
                if (isWall(x, y)) {
                    System.out.print('\u25A0');
                } else if (new Location(x, y).equals(robotLocation)) {
                    System.out.print('r');
                } else if (isClean(x, y)) {
                    System.out.print('c');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private void placeRandomWalls() {
        Random random = new Random();
        for (int x = 0; x < xSize; ++x) {
            for (int y = 0; y < ySize; ++y) {
                // Create walls with a 1/6 chance.
                if ((x > 1 || y > 1) && random.nextInt(6) == 0) {
                    wallLocations.add(new Location(x, y));
                }
            }
        }
    }
}