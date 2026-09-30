import java.util.*;

public class Exp3 {

    static long sumOfSquares(int[] nums) {

        int n = nums.length;
        long result = 0;

        for (int i = 0; i < n; i++) {

            HashSet<Integer> distinct = new HashSet<>();

            for (int j = i; j < n; j++) {

                distinct.add(nums[j]);

                int count = distinct.size();

                result += (long) count * count;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(sumOfSquares(nums));

        sc.close();
    }
}