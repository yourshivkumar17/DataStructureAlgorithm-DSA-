import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        s = s.toLowerCase();
        t = t.toLowerCase();
        s = s.replaceAll("\\s", "");
        t = t.replaceAll("\\s", "");

        if(s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        int[] count = new int[256];
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i=0; i<256; i++) {
            if(count[i] != 0) {
                System.out.println("false");
                return;
            }
        }
         System.out.println("true");
        sc.close();
    }
}