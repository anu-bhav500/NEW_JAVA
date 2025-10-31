package ArrayAll;
/* QUESTION:
Given an integer array nums and an integer k, return the number of pairs (i, j)
where i < j such that [nums[i] - nums[j]] == k.
INPUT
↓
12211
OUTPUT 4  */
  import java.util.*;
public class ArrDiffEqualK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" ");
        sc.close();

        int n = input.length;
        int k = Integer.parseInt(input[n - 1]); // last element is k

        int[] nums = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // HashMap to store frequency of numbers
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            // For each num, check if (num + k) or (num - k) already seen
            if (map.containsKey(num + k))
                count += map.get(num + k);
            if (map.containsKey(num - k))
                count += map.get(num - k);

            // Store frequency
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(count);
    }
}

