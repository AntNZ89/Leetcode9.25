package problems;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0 ; i < s.length() ; i++){
            if (isOpen(s.charAt(i))){
                stack.push(s.charAt(i));

                if (i == s.length()-1 && !stack.isEmpty()){
                    return false;
                }

            }
            else if (!isOpen(s.charAt(i))){

                if (stack.isEmpty()){
                    return false;
                }
                else if (s.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                }
                else if (s.charAt(i) == ']' && stack.peek() == '['){
                    stack.pop();
                }
                else if (s.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()){
            return false;
        }

        return true;

    }


    public static boolean isOpen(char c){
        return c == '(' || c == '{' || c == '[';
    }

}
