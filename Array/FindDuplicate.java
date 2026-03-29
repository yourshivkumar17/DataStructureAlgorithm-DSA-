import java.util.*;
public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } 
        for(int i=0; i<n; i++) {
            boolean found = false;

            for(int j=0; j<i; j++) {
                if(arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if(found)
                System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}