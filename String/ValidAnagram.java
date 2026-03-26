import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        // lowercase + remove spaces (optional)
        s = s.toLowerCase().replaceAll("\\s", "");
        t = t.toLowerCase().replaceAll("\\s", "");

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        int[] count = new int[26];  // sirf a-z ke liye

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // index 0-25
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
        sc.close();
    }
}