package leetcode.com;

import leetcode.com.problems.LongestSubstringWithoutRepeatingCharacters;
import leetcode.com.problems.MaxNumberOfBalloons;
import leetcode.com.problems.TwoSum;

public class LeetCodeProblems {

    public void init() {
        System.out.println("# LeetCode Problems");

        MaxNumberOfBalloons.maxNumberOfBalloons("nlaebolko");
        TwoSum.twoSum(new int[]{2, 3, 5}, 5);
        TwoSum.twoSumOptimized(new int[]{2, 1, 5, 4}, 5);
        int length = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" ");

        System.out.println("Length: " + length);
    }
}
