import java.util.*;

public class Exp4 {

    static long countPairs(int[] nums, int k) {

        int n = nums.length;
        long count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j] &&
                    (i * j) % k == 0) {

                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(countPairs(nums, k));

        sc.close();
    }
}