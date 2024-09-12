package org.example.backtracking.live;

import java.util.ArrayList;

public class SubscequnceArray {
    public static void main(String[] args) {
       /* int a[] = {4, 5, 6};
        ArrayList<ArrayList<Integer>> ans = subsequences(a);
        for (ArrayList<Integer> e : ans) {
            System.out.println(e);
        }*/


    }

    // subsequence of array
    static ArrayList<ArrayList<Integer>> subsequences(int a[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        subsequesceHelper(a, ans, 0, new ArrayList<>());
        return ans;
    }

    static void subsequesceHelper(int a[], ArrayList<ArrayList<Integer>> ans, int index, ArrayList<Integer> cur) {

        ArrayList<Integer> curCopy = new ArrayList<>(cur);
        ans.add(curCopy);

        for (int i = index; i < a.length; i++) {

            if(i > index && a[i] == a[i-1]) continue;

            cur.add(a[i]);
            subsequesceHelper(a, ans, i + 1, cur);
            cur.remove(cur.size() - 1);    // backtrack
        }
    }


    // combination Sun problem
    public static ArrayList<ArrayList<Integer>> combinationSum(int a[],int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combinationSumHelper(a, ans, 0, sum,new ArrayList<>());
        return ans;
    }

    private static void combinationSumHelper(int[] a, ArrayList<ArrayList<Integer>> ans,
                                             int index,int sum, ArrayList<Integer> cur) {

        if(sum == 0) {
            ArrayList<Integer> curCompy = new ArrayList<>(cur);
            ans.add(curCompy);
            return;
        }

        for(int i=index; i<a.length;i++) {
            if(a[i] > sum) return;
            if(i > index && a[i] == a[i-1]) continue;

            cur.add(a[i]);
            combinationSumHelper(a,ans,i+1,sum-a[i], cur);
            cur.remove(cur.size()-1);    //backtrack
        }
    }
}
