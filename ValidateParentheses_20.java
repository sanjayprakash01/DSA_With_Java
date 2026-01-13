public class ValidateParentheses_20 {
    boolean isValid(String s) {
        char arr[] = new char[s.length()];
        int count = 0;        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);System.out.println(c+ "___CCC");
            if (count == 0) {System.out.println("Push_______1__"+c);
                arr[count] = c;
                count++;System.out.println(count + "---------------");
                continue;
            }
            if (count > 0 && checkParentheses(c) == arr[count - 1] && checkParentheses(c) != '1') {
                arr[count--] = '0';System.out.println(checkParentheses(c)+"__POP__"+c);
                continue;
            } else if (checkParentheses(c) == '0') {
                arr[count++] = c;System.out.println("Push_______0__"+c);
                continue;
            } else if (c == ']' || c == '}' || c == ')') {
                return false;
            }
        }
        System.out.println(count+ ":::::::::::::::");
        return count == 0;
    }

    char checkParentheses(char c) {
        switch(c) {
            case '}': return '{';
            case ']': return '[';
            case ')': return '(';
            case '{': return '0';
            case '[': return '0';
            case '(': return '0';
            default: return '1';
        }
    }
}
