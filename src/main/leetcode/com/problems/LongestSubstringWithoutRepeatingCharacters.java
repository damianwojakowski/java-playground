package leetcode.com.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> charactersFound = new HashMap<>();

        int longestSubstringLength = 0;
        int index = 0;
        int stringLength = s.length();

        while (index < stringLength) {
            char currentChar = s.charAt(index);

            if (charactersFound.containsKey(currentChar)) {
                int currentSubstring = charactersFound.size();
                longestSubstringLength = Math.max(currentSubstring, longestSubstringLength);

                index = charactersFound.get(currentChar) + 1;

                charactersFound.clear();
            } else {
                charactersFound.put(currentChar, index);
                index++;
            }
        }

        int currentSubstring = charactersFound.size();
        longestSubstringLength = Math.max(currentSubstring, longestSubstringLength);

        return longestSubstringLength;
    }

    public static int lengthOfLongestSubstringOptimized(String s) {
        Map<Character, Integer> charactersFound = new HashMap<>();

        int longestSubstringLength = 0;
        int index = 0;
        int stringLength = s.length();

        while (index < stringLength) {
            char currentChar = s.charAt(index);

            if (charactersFound.containsKey(currentChar)) {
                int currentSubstring = charactersFound.size();
                longestSubstringLength = Math.max(currentSubstring, longestSubstringLength);

                index = charactersFound.get(currentChar) + 1;

                charactersFound.clear();
            } else {
                charactersFound.put(currentChar, index);
                index++;
            }
        }

        int currentSubstring = charactersFound.size();
        longestSubstringLength = Math.max(currentSubstring, longestSubstringLength);

        return longestSubstringLength;
    }
}
