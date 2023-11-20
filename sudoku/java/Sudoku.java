// Fill in the methods in the Sudoku class below. Each method has a comment explaining what it should do.
public class Sudoku
{
    // Construct a Sudoku with all cells empty.
    public Sudoku()
    {
    
    }
    
    // Return the value of the cell specified by row and col (short for "column").
    public int get(int row, int col)
    {
        return 0;
    }
    
    // Set the value of the cell specified by row and col.
    public void set(int value, int row, int col)
    {
    
    }
    
    // Check if this Sudoku is following the rules, i.e. no duplicate numbers in any row, column, or sub-grid.
    // Return true if no rules are broken and false otherwise.
    public boolean isValid()
    {
        return false;
    }
    
    // Check if this Sudoku is solved, meaning that every row, column, and sub-grid contains one of each number 1-9.
    // Return true if the puzzle is solved and false otherwise.
    public boolean isSolved()
    {
        return false;
    }
    
    // Pretty-print the Sudoku grid. Write out the numbers in each cell with a space between each column, a linebreak
    // ('\n') between each row, and pipes ('|') and dashes ('-') separating each subgrid. Surround with a border made of
    // dashes and pipes. Blank cells should be represented with a space, not a 0. For example:
    //    -------------------------
    //    | 1     |   2   |     3 |
    //    |       |       |       |
    //    |       |       |       |
    //    -------------------------
    //    |       |       |       |
    //    | 4     |   5   |     6 |
    //    |       |       |       |
    //    -------------------------
    //    |       |       |       |
    //    |       |       |       |
    //    | 7     |   8   |     9 |
    //    -------------------------
    // Return a string with this format.
    // Note: you don't need to actually print out the string with println() in this method, just return it.
    @Override
    public String toString()
    {
        return "TBD";
    }
}
