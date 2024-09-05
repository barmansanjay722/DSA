package org.example.backtracking;

import java.util.ArrayList;

public class PermuteOfArray {
    public static void main(String[] args) {
        ArrayList<int[]> ans = new ArrayList<>();

        int a[] = {1,2,3};
        permute(a,0,a.length-1,ans);

        System.out.println("for array type return");
        for(int[] arr : ans) {
            printArray(arr);
        }
    }
    static void permute(int a[], int l, int r, ArrayList<int[]> ans) {
        if(l == r) {
            printArray(a);

            // for array print
            int[] b = new int[a.length];
            for(int i=0;i<a.length;i++) {
                b[i] = a[i];
            }
            ans.add(b);

            return;
        }
        for(int i=l;i<=r;i++) {
            swap(a,i,l);
            permute(a,l+1,r,ans);   // backtracking
            swap(a,i,l);
        }
    }

    private static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArray(int a[]) {
        for(int e: a) {
            System.out.print(e);
        }
        System.out.println();
    }
}
