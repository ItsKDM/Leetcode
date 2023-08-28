package Medium.String;

class LongestRepeatingCharacterReplacement{
    public int characterReplacememnt(String s, int k){
        int n = s.length();
        int[] charCount = new int[26];
        int largestCount = 0, beg = 0, maxlen = 0;

        for(int end = 0; end<n; end++){
            charCount[s.charAt(end) - 'A']++;
            largestCount = Math.max(largestCount, charCount[s.charAt(end) - 'A']);

            if(end-beg+1 - largestCount > k){
                charCount[s.charAt(beg) - 'A']--;
                beg++;
            }
            maxlen = Math.max(maxlen, end-beg+1);
        }


        return maxlen;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        String s = "AABABBA";
        int k = 1;

        int result = solution.characterReplacememnt(s, k);
        System.out.println(result);
    }
}