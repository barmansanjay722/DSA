package org.example.recursion;

public class RecurstionProblem_1 {
    public static void main(String[] args) {
//        System.out.println(fabonacci(6));
//        System.out.println(nCr(5,3));

        System.out.println(josephus(3,2));
    }

    // fabonacci number
    static int fabonacci(int n) {
        if(n == 1 || n == 0)
            return n;
        return fabonacci(n-1) + fabonacci(n-2);
    }
    // O(2n)



    // nCr problem
    static int nCr(int n, int r) {
        if(n == r || r == 0) return 1;
        return nCr(n-1,r-1) + nCr(n-1, r);
    }


    // josephus problem
    static int josephus(int n , int k) {
        if(n == 1) return 0;
        return (josephus(n-1, k) + k) % n;
    }

}
