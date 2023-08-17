package Easy.String;

import java.util.Arrays;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String s = "";

        if (strs == null || strs.length == 0)
            return s;

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;

        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
            break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};

        String result = solution.longestCommonPrefix(strs);

        System.out.println("\"" + result + "\"");
        
    }
}