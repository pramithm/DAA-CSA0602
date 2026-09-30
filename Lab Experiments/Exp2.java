import java.util.*;

public class Exp2 {

    static boolean exists(int[] arr, int x) {

        for (int value : arr) {
            if (value == x) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums1 = new int[n];

        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] nums2 = new int[m];

        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        int answer1 = 0;
        int answer2 = 0;

        for (int i = 0; i < n; i++) {
            if (exists(nums2, nums1[i])) {
                answer1++;
            }
        }

        for (int i = 0; i < m; i++) {
            if (exists(nums1, nums2[i])) {
                answer2++;
            }
        }

        System.out.println("[" + answer1 + ", " + answer2 + "]");

        sc.close();
    }
}