public class landparimeter {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        int r = grid.length;
        int c = grid[0].length;
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    p += 4;
                    if (i > 0 && grid[i-1][j] == 1) {
                        p -= 2;
                    }
                    if (j > 0 && grid[i][j-1] == 1) {
                        p -= 2;
                    }
                }
            }
        }
        
        return p;
    }

    public static void main(String[] args) {
        landparimeter s = new landparimeter();
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(s.islandPerimeter(grid));
    }
}
