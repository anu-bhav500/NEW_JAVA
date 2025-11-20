package MOCKTEST;
/*You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

Example 1:
Input: flowerbed = 5 1 0 0 0 1 1  first element is size of array , last element is no. of tree wants to plant 
Output: true

Example 2:
Input: flowerbed = 5 1 0 0 0 1 2 
Output: false
 
Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length */

import java.util.*;
public class CanFlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] parts = input.split(" ");

        int size = Integer.parseInt(parts[0]);
        int[] flowerbed = new int[size];

        for (int i = 0; i < size; i++) {
            flowerbed[i] = Integer.parseInt(parts[i + 1]);
        }

        int n = Integer.parseInt(parts[size + 1]);
        System.out.println(canPlaceFlowers(flowerbed, n));

        sc.close();
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) return true;
                }
            }
        }
        return false;
    }
}


