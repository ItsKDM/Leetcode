package Easy.String;

class LengthOfLastWord{
    public int lengthofLastWord(String s){
        int l = 0;
        int i = s.length() - 1;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        while(i >= 0 && s.charAt(i) != ' '){
            l++;
            i--;
        }
        return l;
    }

    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        String s = "Hello World";

        int result = solution.lengthofLastWord(s);

        System.out.println("Length of Last Word is: " + result);
    }
}