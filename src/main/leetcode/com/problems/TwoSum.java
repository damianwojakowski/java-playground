package leetcode.com.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int numsLength = nums.length;
        int nextYValue = 1;

        for (int x = 0; x < numsLength; x++) {
            for (int y = nextYValue; y < numsLength; y++) {
                if (nums[x] + nums[y] == target) {
                    return new int[]{x, y};
                }
            }
            nextYValue++;
        }

        throw new IllegalArgumentException("No Solution");
    }

    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int lookingFor = target - nums[i];

            if (map.containsKey(lookingFor)) {
                return new int[]{map.get(lookingFor), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No Solution");
    }
}
