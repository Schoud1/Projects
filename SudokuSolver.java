


import java.awt.Point;
import java.util.Stack;

public class SudokuSolver {
// non-recursive, stack-based, backtracking solver of sudoku puzzles
    
    int[][] grid;
    Stack<Point> stack;  // Recall Point objects wrap two ints into a single object
                         // Check the Java API for more information on the Point class...
    
    public SudokuSolver(int[][] grid) { 
        // Insert code here...
        // Hint: Make sure to make a defensive copy of the grid.
        this.grid = new int[SIZE][SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				this.grid[i][j] = grid[i][j];
			}
		
		}
		
	}
    
    
    private boolean isInRow(int num, int row) {
        // Insert code here...
        for (int i = 0; i < SIZE; i++)
			if (grid[row][i] == num){
				return true;
			}
		return false;
	
	
    }
    
    private boolean isInCol(int num, int col) {
        // Insert code here...
        for (int i = 0; i < SIZE; i++)
			if (grid[i][col] == num){
				return true;
			}
		return false;
	}
    
    
    private boolean isInBox(int row, int col, int num) {
        // Insert code here...
        int r = ((row/3)*3);
		int c = ((col/3)*3);
		
		for (int i = r; i < r + 3; i++)
			for (int j = c; j < c + 3; j++)
				if (grid[i][j] == num){
					return true;
				}
		return false;
	}
    
    
    private Point nextBlank() {
        // returns coordinates of next blank in grid
        // if there is no remaining blank in grid, return null
        // Insert code here...
        
        Point point = new Point();
        
        for (int row = 0; row < SIZE; row++) {
         for (int col = 0; col < SIZE; col++) {
          
          if (grid[row][col] == 0) {
              
              point.x = row;
              point.y = col;
              
             return point; 
          }
          else {
              return null;
          }
              
         }     
    }
    }

    private boolean safeToPutNumInPos(int row, int col, int num) {
        // Insert code here...
        return !isInRow(num, row)  &&  !isInCol(num, col)  &&  !isInBox(row, col, num);
    }
    
    private void printStack() {
        // Not necessary, but useful for debugging...   
        for (Point p : this.stack) {
            System.out.println(p);
        }
    }
    
    // Insert additional methods here, as desired
    
    public boolean solve() {
        // Insert code here...
        for (int row = 0; row < SIZE; row++) {
         for (int col = 0; col < SIZE; col++) {
          
          if (grid[row][col] == 0) {
            
            for (int num = 1; num <= SIZE; num++) {
              if (isOk(row, col, num)) {
                
                grid[row][col] = num;

                if (solve()) { 
                  return true;
                } else { 
                  grid[row][col] = 0;
                }
             }
            }

            return false; 
           }
          }
         }

         return true; 
	
    }
    
    public void printGrid() {
        // Prints this.grid - needed in main(), also useful for debugging...
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) 
                System.out.print(this.grid[row][col] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] solvableGrid = {{0,3,9,0,0,0,7,0,0},
                                {0,0,0,7,0,0,1,0,0},
                                {6,0,0,0,8,0,0,0,4},
                                {8,0,4,0,0,7,0,0,6},
                                {0,0,0,8,0,0,4,0,0},
                                {0,5,0,2,0,6,8,1,0},
                                {0,0,0,0,0,0,0,7,0},
                                {5,8,0,0,0,3,9,4,0},
                                {7,2,3,4,0,8,6,0,0}}; 

        int[][] unsolvableGrid = {{3,1,6,5,7,8,4,2,0},
                                  {5,2,0,0,0,0,0,0,0},
                                  {0,8,7,0,0,0,0,3,1},
                                  {0,0,3,0,1,0,0,8,0},
                                  {9,0,0,8,6,3,0,0,5},
                                  {0,5,0,0,9,0,6,0,0},
                                  {1,3,0,0,0,0,2,5,0},
                                  {0,0,0,0,0,0,0,7,4},
                                  {0,0,5,2,0,6,3,0,0}};
        
        System.out.println("Testing solvable puzzle...\n");
        SudokuSolver sudokuSolver = new SudokuSolver(solvableGrid);
        if (sudokuSolver.solve())
            sudokuSolver.printGrid();
        else {
            System.out.println("No solution exists");
        }
        
        System.out.println("=================\n");
        
        System.out.println("Testing unsolvable puzzle...\n");
        sudokuSolver = new SudokuSolver(unsolvableGrid);
        if (sudokuSolver.solve())
            sudokuSolver.printGrid();
        else {
            System.out.println("No solution exists");
        }
    }
}
