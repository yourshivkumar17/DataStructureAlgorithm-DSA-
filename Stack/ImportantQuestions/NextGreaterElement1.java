import java.util.*;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = -1;

            for (int j = 0; j < m; j++) {
                if (b[j] == a[i]) {
                    for (int k = j + 1; k < m; k++) {
                        if (b[k] > a[i]) {
                            res[i] = b[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}