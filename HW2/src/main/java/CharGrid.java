// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

    private boolean isPlus(int row, int col) {
        char ch = grid[row][col];
        if(ch == ' '){
            return false;
        }
        int l = 0, r = 0, u = 0, d = 0;
        for (int i=row; i<grid.length; i++) {
            if(grid[i][col]==ch) {
                d += 1;
            } else {break;}
        }
        for( int i = row; i >=0; i--) {
            if(grid[i][col]== ch) {
                u += 1;
            }
        }
        for( int j = col; j >=0; j--) {
            if(grid[row][j]==ch) {
                l += 1;
            }
        }
        for( int j = col; j <grid[row].length; j++) {
            if(grid[row][j]== ch) {
                r += 1;
            }
        }
        return (l == r && u == d && r == u);

    }
	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int max_x = 0, max_y = 0;
        int min_x = 100, min_y = 100;

        boolean flag = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == ch) {
                    flag = true;
                    max_x = Math.max(max_x, j+1);
                    max_y = Math.max(max_y, i+1);
                    min_x = Math.min(min_x, j);
                    min_y = Math.min(min_y, i);
                }
            }
        }
        if (flag) {
            return (max_x-min_x)*(max_y-min_y);
        } else {
            return 0;
        }
         // YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
        if(grid.length < 3 || grid[0].length < 3) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(isPlus(i, j)) {
                    count ++;
                }
            }
        }
        return count;
        // YOUR CODE HERE
	}
}
