package Easy.String;

class RomanToInteger {
    public int romanToInt(String s) {

        int number = 0;
        int answer = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M':
                    number = 1000;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'I':
                    number = 1;
                    break;
            }

            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();

        String s = "M";

        int result = solution.romanToInt(s);

        System.out.println("Roman numeral: " + s);
        System.out.println("Integer equivalent: " + result);

    }
}