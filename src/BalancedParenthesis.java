import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

    boolean checkBalancedParenthesis(String s) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            char str = s.charAt(i);

            if (str == '[' || str == '{' || str == '(') {
                deque.addFirst(str);
            } else if (str == ']') {
                if (deque.isEmpty() || deque.removeFirst() != '[')
                    return false;
            } else if (str == ')') {
                if (deque.isEmpty() || deque.removeFirst() != '(')
                    return false;
            } else if (str == '}') {
                if (deque.isEmpty() || deque.removeFirst() != '{')
                    return false;
            }
        }
        if (deque.isEmpty()) {
            return true;
        } else
            return false;
    }
}
