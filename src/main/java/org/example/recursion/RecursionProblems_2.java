package org.example.recursion;

// Recursion Using String
public class RecursionProblems_2 {

    public static void main(String[] args) {
//        System.out.println(isPalindrome("aba"));
//        System.out.println(countOccurence("aba","ababbabac"));
        printAllSubsets("abc");
    }


    // palindrome of string check

    static boolean isPalindrome(String s) {
        return isPalindromeHelper(s,0, s.length()-1);
    }

    static boolean isPalindromeHelper(String s, int l, int r) {
        if( l >= r) return true;

        if(s.charAt(l) == s.charAt(r)) {
            return isPalindromeHelper(s,l+1, r-1);
        }else {
            return false;
        }
    }


    // count occurence of String in another String

    static int countOccurence(String t, String s) {
        return countOccurenceHelper(t,s,0);
    }

    // O(n)
    static int countOccurenceHelper(String t, String s, int i) {
        if(i+t.length() > s.length())
            return 0;

        int subStringAnswer = countOccurenceHelper(t, s, i+1);
        boolean doStartingMatch = s.substring(i, i+t.length() ).equals(t);
        if(doStartingMatch)
            return subStringAnswer + 1;
        else
            return subStringAnswer;
    }


    // print all subsets of a given String
     // O(2n)
    static void printAllSubsets(String s) {
        printAllSubsetsHelper(s,0, "");
    }
    static void printAllSubsetsHelper(String s, int i, String cur) {
        if(i == s.length()) {
            System.out.println(cur);
            return;
        }
        printAllSubsetsHelper(s,i+1,cur+s.charAt(i));
        printAllSubsetsHelper(s, i+1, cur);
    }
}
