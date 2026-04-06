import java.util.*;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack<Character> stack = new Stack<>();

        // process string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        // convert stack to string
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        System.out.println(sb.toString());

        sc.close();
    }
}