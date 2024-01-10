import java.util.HashMap;
import java.util.Map;

public class numMoveByOnePlace {
    public static int maxOperations(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap1 = new HashMap<>();
        Map<Integer, Integer> countMap2 = new HashMap<>();

        // Count occurrences in nums1
        for (int num : nums1) {
            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
        }

        // Count occurrences in nums2
        for (int num : nums2) {
            countMap2.put(num, countMap2.getOrDefault(num, 0) + 1);
        }

        int maxSize = 0;

        // Iterate through elements in both arrays
        for (int num : countMap1.keySet()) {
            if (countMap2.containsKey(num)) {
                // Find the minimum count in both arrays
                int minCount = Math.min(countMap1.get(num), countMap2.get(num));
                maxSize += minCount;
            }
        }

        return maxSize;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 2};
        int[] nums2 = {1, 1, 1, 1};
        System.out.println("Output 1: " + maxOperations(nums1, nums2));

        int[] nums3 = {1, 2, 3, 4, 5, 6};
        int[] nums4 = {2, 3, 2, 3, 2, 3};
        System.out.println("Output 2: " + maxOperations(nums3, nums4));

        int[] nums5 = {1, 1, 2, 2, 3, 3};
        int[] nums6 = {4, 4, 5, 5, 6, 6};
        System.out.println("Output 3: " + maxOperations(nums5, nums6));
    }
}