package Easy.String;

class ValidPalindrome {

    public boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }

        int head = 0, tail = s.length()-1;

        char cHead, cTail;

        while(head <= tail){
            cHead = s.charAt(head);
            cTail = s.charAt(tail);

            if(!Character.isLetterOrDigit(cHead)){
                head++;
            } else if(!Character.isLetterOrDigit(cTail)){
                tail--;
            } else{
                if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)){
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";

        Boolean result = solution.isPalindrome(s);

        System.out.println(result);
    }
}