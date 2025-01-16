package org.example.backtracking;

public class GenerateParenthesis {
    public static void main(String[] args) {     // O(2^n)     sc -> O(n)
        int n = 2;
        generateParenteses(n,"",0,0,0);
    }

    static void generateParenteses(int n, String cur, int i, int open, int close) {
        if(i == 2*n) {
            System.out.println(cur);
            return;
        }
        if(open < n) {
            cur = cur + "(";
            generateParenteses(n,cur,i+1,open+1,close);
            cur = cur.substring(0,cur.length()-1);    // backtracking
        }
        if(close < open) {
            cur = cur + ")";
            generateParenteses(n,cur,i+1,open,close+1);
            cur = cur.substring(0,cur.length()-1);    // backtracking
        }
    }
}
