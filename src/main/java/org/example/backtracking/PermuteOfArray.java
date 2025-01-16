package org.example.backtracking;

public class PermuteOfArray {
    public static void main(String[] args) {                        //O(n! * n)

        int a[] = {1,2,3};
        permute(a,0,a.length-1);
    }
    static void permute(int a[], int l, int r) {
        if(l == r) {
            printArray(a);
            return;
        }
        for(int i=l;i<=r;i++) {
            swap(a,i,l);
            permute(a,l+1,r);
            swap(a,i,l);                // backtracking
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
