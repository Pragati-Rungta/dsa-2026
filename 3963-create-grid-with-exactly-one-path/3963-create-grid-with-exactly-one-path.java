class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        char[] row = new char[n];

        for (int j = 0; j < n; j++){
            row[j] = '#';
        }
        for (int i = 0; i < m; i++){
            grid[i] = new String(row);
        }
        char[] firstRow = grid[0].toCharArray();
        for (int j = 0; j < n; j++){
            firstRow[j] = '.';
        }
        grid[0] = new String(firstRow);
        for (int i = 0; i < m; i++){
            char[] currentRow = grid[i].toCharArray();
            currentRow[n - 1] = '.';
            grid[i] = new String(currentRow);
        }
             return grid;
    }
}