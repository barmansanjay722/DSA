package org.example.recursion;

public class LearnRecurstionBasics {
    public static void main(String[] args) {
        /*fun(5);
        System.out.println("-----------------");
        fun2(5);*/
        System.out.println(sumOfN(5));
    }

    // sum of n natural numbers
    static int sumOfN(int n) {
        if(n == 1)
            return 1;
        return sumOfN(n-1) + n;
    }


    // example learing of recursion
    static void fun(int n ) {
        if(n > 0) {
            System.out.println(n);
            fun(n-1);
        }
    }

    static void fun2(int n) {
        if(n > 0) {
            fun2(n-1);
            System.out.println(n);
        }
    }


}
