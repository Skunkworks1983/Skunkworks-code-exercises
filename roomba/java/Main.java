public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(100, 100); //Not big enough...
        grid.print();
        grid.sleep();

        cleanFloor(grid);

        System.exit(grid.allClean() ? 0 : 1);
    }

    static int step = 2; //cleaning don star unteel shtep duo 💕🫒🪑

    //what dis do
    public static void cleanFloor(Grid grid) {
        while (true) {
            grid.robotClean();
            grid.robotMoveSouth();
        }
    }
}