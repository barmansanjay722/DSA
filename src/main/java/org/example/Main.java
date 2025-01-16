package org.example;

public class Main {
    public static void main(String[] args) {

    }

    static boolean sodokuSolver(int a[][], int row, int col) {
        if(row == 9) return true;
        if(col == 9) {
            return sodokuSolver(a,row+1,0);
        }
        if(a[row][col] !=0) {
            return sodokuSolver(a,row,col+1);
        }
        for(int i=1;i<=9;i++) {
            if(isSafeThere(a,row,col,i)) {
                a[row][col] = i;
                if(sodokuSolver(a,row,col+1)) return true;
                a[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafeThere(int[][] a, int row, int col, int num) {

        for(int i=1;i<=9;i++) {
            if(a[row][i] == num) return false;
            if(a[i][col] == num) return false;
        }

        int quatrow = row / 3;
        int quatcol = col / 3;

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                int cellRow = 3*quatrow+i;
                int cellCol = 3*quatcol+j;
                if(a[cellRow][cellCol] == num) return false;
            }
        }

        return false;
    }
}