package LeetCode;

public class NumIslands {

    public int numIslands(char[][] grid) {

        boolean visited[][] = new boolean[grid.length][grid[0].length];

        //  HashSet<String> hashSet = new HashSet<>();

        int count = 0;
        for (int r= 0; r < grid.length; r++){
            for (int c = 0; c < grid[r].length; c++){
                if (explore(grid, r,c, visited) == true) count += 1;
            }
        }
        return count;
    }

    boolean explore(char[][] grid, int r, int c, boolean[][] visited){

        boolean rowInbounds = ((0 <= r ) && (r < grid.length));
        boolean colInbounds = ((0 <= c ) && (c < grid[0].length));

        if (!rowInbounds || !colInbounds) return false;

        //   String s = Integer.toString(r) + ',' + Integer.toString(c);

        if (visited[r][c] == true ) return false;

        visited[r][c] = true;

        //  if (hashSet.contains(s)) return false;

        //   hashSet.add(s);

        if (grid[r][c] == '0') return false;


        explore(grid, r-1, c, visited);
        explore(grid, r+1, c, visited);
        explore(grid, r, c+1, visited);
        explore(grid, r, c-1, visited);

        return true;
    }
}