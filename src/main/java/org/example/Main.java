package org.example;

public class Main {
    public static void main(String[] args) {
    }

    static int matrixPath(int n, int m) {
        if(n == 1 || m == 1) return 1;
        return matrixPath(n-1, m) + matrixPath(n, m-1);
    }
}
