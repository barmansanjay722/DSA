package org.example.backtracking;

public class KinghtTour {            // O(k^2^n)
    public static void main(String[] args) {

        int n = 5;
        int a[][]  = knightsTour(5);
        for(int i=0; i<n; i++) {
            for (int j=0;j<n;j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static int[][] knightsTour(int n) {
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j] = -1;
            }
        }
        a[0][0] = 0;
        int moveX[] = {2,1,-1,-2,-2,-1,1,2};
        int moveY[] = {1,2,2,1,-1,-2,-2,-1};

        knightsTourHelper(n, a, moveX, moveY, 0,0,1);
        return a;
    }

    static boolean knightsTourHelper(int n, int a[][], int moveX[], int moveY[], int curX, int curY,int step) {

        if(step == n*n) return true;
        for(int i=0;i<8;i++) {
            int nextX = curX + moveX[i];
            int nextY = curY + moveY[i];
            if(isValid(n, a, nextX, nextY)) {
                a[nextX][nextY] = step;
                boolean isTourStepCompltedbyGoingThere =
                        knightsTourHelper(n, a, moveX,moveY, nextX, nextY, step+1);
                if(isTourStepCompltedbyGoingThere) {
                    return true;
                }else {
                    a[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }

    static boolean isValid(int n, int a[][], int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < n && a[x][y] == -1;
    }
}
