package stack.and.queue;

import java.util.HashMap;

public class MultiBracketValidation <T> {

    public static boolean multiBracketValidation(String input) {

        stack<Character> stack = new stack();

        for (int i = 0; i < input.length(); i++) {
            char brackets = input.charAt(i);

            if (brackets == '(' || brackets == '{' || brackets == '[') {
                stack.push(brackets);
            } else {
                if (brackets == ')') {
                    if (!stack.isEmpty()) {
                        if (stack.peek().equals('(')) {
                            stack.pop();
                        } else {
                            return false;
                        }

                    } else {
                        return false;
                    }
                } else if (brackets == ']') {
                    if (!stack.isEmpty()) {
                        if (stack.peek().equals('[')) {
                            stack.pop();
                        } else {
                            return false;
                        }

                    } else {
                        return false;
                    }
                } else if (brackets == '}') {
                    if (!stack.isEmpty()) {
                        if (stack.peek().equals('{')) {
                            stack.pop();
                        } else {
                            return false;
                        }

                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}

