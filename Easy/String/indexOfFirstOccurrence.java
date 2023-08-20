package Easy.String;

class IndexOfFirstOccurence{
    public int strStr(String haystack, String needle){
        if(haystack.length() < needle.length()) return -1;

        for(int i = 0; i<=haystack.length() - needle.length(); i++){
            int j = 0;
            while(j<needle.length() && haystack.charAt(i+j) == needle.charAt(j))
            j++;
            if(j==needle.length()) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        IndexOfFirstOccurence solution = new IndexOfFirstOccurence();
        String haystack = "leetcode";
        String needle = "leeto";

        int result = solution.strStr(haystack, needle);
        System.out.println(result);

    }
}