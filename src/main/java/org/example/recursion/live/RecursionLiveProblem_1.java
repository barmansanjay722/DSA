package org.example.recursion.live;

public class RecursionLiveProblem_1 {
    public static void main(String[] args) {
//        System.out.println(power(2,16));
        System.out.println(fastPower(2, 16));
//        System.out.println(matrixPath(3,3));
    }


    // power                 // leanear time complex
    static double power(int a, int b) {
        if(b == 0) return 1;
        return a * power(a, b-1);
    }

    // fast power            // on log time complex
    static double fastPower(double a, int b) {
        if (b == 0) return 1;
        if(b < 0) return fastPower(1/a, Math.abs(b));
        if(b % 2 == 0) {
            return fastPower(a * a , b/2);
        }
        else {
            return fastPower(a, b-1);
        }
    }


    // Matrix Path problem    // O(2^n)
    static int matrixPath(int n, int m) {
        if(n == 1 || m == 1) return 1;
        return matrixPath(n-1, m) + matrixPath(n, m-1);
    }

}
