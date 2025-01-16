package org.example.backtracking;

import java.util.ArrayList;

public class SmartKeyped {
    public static void main(String[] args) {
        String input = "23";
        System.out.println(smartKeypad(input));
    }

    static ArrayList<String> smartKeypad(String input) {
        String map[] = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "wxyz"
        };
        ArrayList<String> ans = new ArrayList<>();
        smartKeypadHelper(input, map, 0, ans, "");
        return ans;
    }

    static void smartKeypadHelper(String input, String map[], int index, ArrayList<String> ans, String cur) {
        if (index == input.length()) {
            ans.add(cur);
            return;
        }
        int keypadNumber = input.charAt(index) - '0';
        String keypadString = map[keypadNumber];

        for (int i = 0; i < keypadString.length(); i++) {
            cur = cur + keypadString.charAt(i);
            smartKeypadHelper(input, map, index + 1, ans, cur);
            cur = cur.substring(0, cur.length() - 1);    // backtracking


            // this can be done without backtracking also here is how
//            smartKeypadHelper(input, map, index + 1, ans, cur + keypadString.charAt(i));
        }
    }
}
