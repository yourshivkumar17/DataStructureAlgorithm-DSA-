import java.util.*;
public class ValidPerenthesis {
    public static boolean isValid(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()","").replace("{}","").replace("[]","");
        }
        return s.isEmpty();
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = isValid(s);

        if(res)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
