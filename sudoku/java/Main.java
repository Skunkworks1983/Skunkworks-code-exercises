public class Main
{
    public static void main(String[] args)
    {
        // You can test your Sudoku code here.
        Sudoku sudoku = new Sudoku();
        sudoku.set(1, 1, 1);
        if(sudoku.get(1, 1) != 1)
        {
            System.out.println("Tried to set cell (1, 1) to 1, but get(1, 1) returns " + sudoku.get(1, 1));
        }
        
        System.out.println(sudoku);
    }
}
