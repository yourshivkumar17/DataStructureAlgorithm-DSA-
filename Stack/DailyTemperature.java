import java.util.*;
public class DailyTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temperature = new int[n];
        for(int i=0; i<n; i++) {
            temperature[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            while(!stack.isEmpty() && temperature[i] > temperature[stack.peek()]) {
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        for(int i=0; i<n; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}