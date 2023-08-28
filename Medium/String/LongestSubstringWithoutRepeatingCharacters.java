package Medium.String;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters{

    public int lengthOfLongestSubstring(String s){
        int maxLength = 0;
        int n = s.length();
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for(int right = 0; right<n; right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
            } else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(right));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "pwwkew";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}