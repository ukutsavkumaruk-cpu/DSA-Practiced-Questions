package Arrays;
import java.util.Arrays;

public class Chocolate_Distribution_Problem {
    public static int findMinDiff(int[] arr, int m) {
        int ans = 0, i = 0;
        int n = arr.length, min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        while(i<= n-m)
        {
            ans = arr[i+m-1] - arr[i];
            if (ans<=min) min = ans;
            i++;
        }

        return min;
    }
    public static void main(String[] args) {
            int[] arr = {4,2,6,5,9,1,7};
            int s = 3;
            int sol = findMinDiff(arr,s);
            System.out.print(sol);
    }
}
// Approach:
//        1. Sort the array in ascending order.
//        2. Consider every possible group (window) of `m` consecutive packets.
//        3. For each group, calculate the difference between the maximum and minimum chocolates.
//        4. Keep track of the minimum difference among all groups.
//        5. Return the minimum difference.
// Time Complexity : O(n log n)
// Space complexity: O(1)