package org.example.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {

        int board[][] = {{1,3,4,5,7,7,7,7,6},
                          {3,1,3,5,7,9,2,0,1}};
        sodukusolver(board,0,0);
        for(int a[] : board) {
            for(int e: a) {
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }

    static boolean sodukusolver(int a[][], int row, int col) {
        if(row == 9) return true;
        if(col == 9) return sodukusolver(a,row+1,0);
        if(a[row][col] != 0) return sodukusolver(a,row,col+1);

        for(int i=1;i<=9;i++) {
            if(isSafeSoduku(a, row, col, i)) {
                a[row][col] = i;
                if(sodukusolver(a,row,col+1)) return true;
                a[row][col] = 0;    // backtrack
            }
        }
        return false;
    }

    private static boolean isSafeSoduku(int[][] a, int row, int col, int num) {
        for(int i=0;i<9;i++) {
            if(a[row][i] == num) {
                return false;
            }
            if(a[i][col] == num) {
                return false;
            }
        }
        int gridrow = row / 3;
        int gridcol = row / 3;

        for(int i=0; i< 3;i++) {
            for(int j=0;j<3;j++) {

            }
        }
        return false;
    }

}