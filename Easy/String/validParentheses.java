package Easy.String;

import java.util.Stack;

class ValidParentheses{
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);

            if(a=='(' || a=='{' || a=='[') st.push(a);

            else if(st.isEmpty()) return false;

            else if(a==')' && st.pop() != '(') return false;
            else if(a=='}' && st.pop() != '{') return false;
            else if(a==']' && st.pop() != '[') return false;
        }
        return st.empty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        String s = "(]";
        Boolean result = solution.isValid(s);
        System.out.println(result);

    }
}