import java.util.*;
public class BaseballGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ops = new String[n];
        for(int i=0; i<n; i++) {
            ops[i] = sc.next();
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++) {
            if(ops[i].equals("+")) {
                int last = stack.peek();
                int secondLast = stack.get(stack.size() - 2);
                stack.push(last+secondLast);
            } else if(ops[i].equals("D")) {
                stack.push(2*stack.peek());
            }else if(ops[i].equals("C")) {
                stack.pop();
            }else {
                stack.push(Integer.parseInt(ops[i]));
            }
        } 
        int sum =0;
        for(int x:stack) {
            sum += x;
        }
        System.out.print(sum);
    }
    
}
