package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] ans = Series(5);
        for (int e : ans) {
            System.out.print(e + " ");
        }
    }

    static int[] Series(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ans.add(fabonacci(i));
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    static int fabonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fabonacci(n - 1) + fabonacci(n - 2);
    }
}
